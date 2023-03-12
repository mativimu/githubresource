package main.java;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import main.java.bean.ItemBean;
import main.java.bean.RepositoryBean;
import main.java.util.GithubResource;

public class Application {
    
	public static void main(String[] args) {
		try {
			String tokenProperty = new String(Files.readAllBytes(Paths.get("src/main/resources/properties")));
			String token = tokenProperty.substring(13, tokenProperty.length());

			GithubResource.sendRequest("https://api.github.com/repos/mativimu/eventsapp-service/contents", "GET", token);
			RepositoryBean repositorio = GithubResource
					.getRepositories("https://api.github.com/users/mativimu/repos", token).get(1);

			String contentUrl = repositorio.getContentsUrl().substring(0, repositorio.getContentsUrl().length() - 7);
			System.out.println(contentUrl);
			
			List<ItemBean> contentRepo = GithubResource.getItems(contentUrl, token);
			System.out.println("--------------------------------------");
			for (ItemBean item : contentRepo) {
				System.out.println("" + "item name " + item.getName());
				if (item.getName().equals("pom.xml")) {
					GithubResource.getPomFile(item.getDownloadUrl(), token);
				}
			}
		} catch (Exception e) {
			System.out.println("Error at task method");
		}
	}
}