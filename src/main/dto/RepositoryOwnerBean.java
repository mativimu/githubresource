package main.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force=true)
public class RepositoryOwnerBean implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@JsonProperty("login")
	private final String login;
	@JsonProperty("id")
	private final int id;
    @JsonProperty("node_id")
	private final String nodeId;
    @JsonProperty("avatar_url")
	private final String avatarUrl;
    @JsonProperty("gravatar_id")
	private final String gravatarId;
    @JsonProperty("url")
	private final String url;
    @JsonProperty("html_url")
	private final String htmlUrl;
    @JsonProperty("followers_url")
	private final String followersUrl;
    @JsonProperty("following_url")
	private final String followingUrl;
    @JsonProperty("gists_url")
	private final String gistsUrl;
    @JsonProperty("starred_url")
	private final String starredUrl;
    @JsonProperty("subscriptions_url")
	private final String subscriptionsUrl;
    @JsonProperty("organizations_url")
	private final String organizationsUrl;
    @JsonProperty("repos_url")
	private final String reposUrl;
    @JsonProperty("events_url")
	private final String eventsUrl;
    @JsonProperty("received_events_url")
	private final String receivedEventsUrl;
    @JsonProperty("type")
	private final String type;
    @JsonProperty("site_admin")
	private final boolean siteAdmin;
	
}