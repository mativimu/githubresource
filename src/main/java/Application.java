package main.java;

import java.util.List;

import io.github.cdimascio.dotenv.Dotenv;
import main.java.bean.ItemBean;
import main.java.bean.RepositoryBean;
import main.java.util.DotenvLoader;
import main.java.util.GithubResource;
import main.java.util.HttpsMethods;

public class Application {
    
	private static final Dotenv env = DotenvLoader.newInstance();

	private static final String TOKEN = env.get("github.token");
	private static final String URL = env.get("generic.url");
	private static final  String REPOSITORIES_URL = env.get("github.repositories.url");

	public static void main(String[] args) {
		try {
					
			GithubResource.sendRequest(URL, HttpsMethods.GET.name(), TOKEN);

			RepositoryBean repositorio = GithubResource
					.getRepositories(REPOSITORIES_URL, TOKEN).get(1);

			String contentUrl = repositorio.getContentsUrl().substring(0, repositorio.getContentsUrl().length() - 7);
			System.out.println(contentUrl);
			
			List<ItemBean> contentRepo = GithubResource.getItems(contentUrl, TOKEN);
			System.out.println("--------------------------------------");
			for (ItemBean item : contentRepo) {
				System.out.println("" + "item name " + item.getName());
				if (item.getName().equals("pom.xml")) {
					GithubResource.getPomFile(item.getDownloadUrl(), TOKEN);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}