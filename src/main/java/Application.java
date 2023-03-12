package main;

import java.util.List;

import main.dto.ItemBean;
import main.dto.RepositoryBean;
import main.util.GithubResource;

public class Application {
    
	public static void main(String[] args) {
		try {
			String token = "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";
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