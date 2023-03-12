package main.java.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.fasterxml.jackson.databind.ObjectMapper;

import main.java.bean.ItemBean;
import main.java.bean.RepositoryBean;

public class GithubResource {

	public static String sendRequest(String requestUrl, String method, String token) throws IOException {
		URL url = new URL(requestUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(method);
		connection.setRequestProperty("Authorization", "Bearer " + token);

		if (connection.getResponseCode() > 299) {
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
			String data;
			StringBuilder content = new StringBuilder();
			while ((data = in.readLine()) != null) {
				content.append(data);
			}
			in.close();

			System.out.println("Failed request " + content.toString());
			return "Failed request";
		} else {
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String data;
			StringBuilder content = new StringBuilder();
			while ((data = in.readLine()) != null) {
				content.append(data);
			}
			System.out.println("Successful request: " + content.toString());

			in.close();
			return content.toString();
		}
	}

	public static List<RepositoryBean> getRepositories(String url, String token) {
		try {
			String response = sendRequest(url, "GET", token);
			ObjectMapper mapper = new ObjectMapper();
			return Arrays.asList(mapper.readValue(response, RepositoryBean[].class));
		} catch (IOException e) {
			System.out.println("Incorrect url for repositories.");
			return new ArrayList<>();
		}
	}

	public static List<ItemBean> getItems(String url, String token) {
		try {
			String response = sendRequest(url, "GET", token);
			ObjectMapper mapper = new ObjectMapper();
			return Arrays.asList(mapper.readValue(response, ItemBean[].class));
		} catch (IOException e) {
			System.out.println("Incorrect url for content items");
			return new ArrayList<>();
		}
	}

	public static Document getPomFile(String url, String token) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			String pomContent = sendRequest(url, "GET", token);
			builder = factory.newDocumentBuilder();
			return builder.parse(new InputSource(new StringReader(pomContent)));
		} catch (Exception e) {
			System.out.println("Incorrect format, .xml is required. Check the download url.");
			return null;
		}
	}

}