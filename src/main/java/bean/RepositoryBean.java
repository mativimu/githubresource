package main.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor(force=true)
@JsonIgnoreProperties({"permissions"})
public class RepositoryBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @JsonProperty("id")
    public final int id;
    @JsonProperty("node_id")
    public final String nodeId;
    @JsonProperty("name")
    public final String name;
    @JsonProperty("full_name")
    public final String fullName;
    @JsonProperty("private")
    public final boolean myprivate;
    @JsonProperty("owner")
    public final RepositoryOwnerBean owner;
    @JsonProperty("html_url")
    public final String htmlUrl;
    @JsonProperty("description")
    public final String description;
    @JsonProperty("fork")
    public final boolean fork;
    @JsonProperty("url")
    public final String url;
    @JsonProperty("forks_url")
    public final String forksUrl;
    @JsonProperty("keys_url")
    public final String keysUrl;
    @JsonProperty("collaborators_url")
    public final String collaboratorsUrl;
    @JsonProperty("teams_url")
    public final String teamsUrl;
    @JsonProperty("hooks_url")
    public final String hooksUrl;
    @JsonProperty("issue_events_url")
    public final String issueEventsUrl;
    @JsonProperty("events_url")
    public final String eventsUrl;
    @JsonProperty("assignees_url")
    public final String assigneesUrl;
    @JsonProperty("branches_url")
    public final String branchesUrl;
    @JsonProperty("tags_url")
    public final String tagsUrl;
    @JsonProperty("blobs_url")
    public final String blobsUrl;
    @JsonProperty("git_tags_url")
    public final String gitTagsUrl;
    @JsonProperty("git_refs_url")
    public final String gitRefsUrl;
    @JsonProperty("trees_url")
    public final String treesUrl;
    @JsonProperty("statuses_url")
    public final String statusesUrl;
    @JsonProperty("languages_url")
    public final String languagesUrl;
    @JsonProperty("stargazers_url")
    public final String stargazersUrl;
    @JsonProperty("contributors_url")
    public final String contributorsUrl;
    @JsonProperty("subscribers_url")
    public final String subscribersUrl;
    @JsonProperty("subscription_url")
    public final String subscriptionUrl;
    @JsonProperty("commits_url")
    public final String commitsUrl;
    @JsonProperty("git_commits_url")
    public final String gitCommitsUrl;
    @JsonProperty("comments_url")
    public final String commentsUrl;
    @JsonProperty("issue_comment_url")
    public final String issueCommentUrl;
    @JsonProperty("contents_url")
    public final String contentsUrl;
    @JsonProperty("compare_url")
    public final String compareUrl;
    @JsonProperty("merges_url")
    public final String mergesUrl;
    @JsonProperty("archive_url")
    public final String archiveUrl;
    @JsonProperty("downloads_url")
    public final String downloadsUrl;
    @JsonProperty("issues_url")
    public final String issuesUrl;
    @JsonProperty("pulls_url")
    public final String pullsUrl;
    @JsonProperty("milestones_url")
    public final String milestonesUrl;
    @JsonProperty("notifications_url")
    public final String notificationsUrl;
    @JsonProperty("labels_url")
    public final String labelsUrl;
    @JsonProperty("releases_url")
    public final String releasesUrl;
    @JsonProperty("deployments_url")
    public final String deploymentsUrl;
    @JsonProperty("created_at")
    public final Date createdAt;
    @JsonProperty("updated_at")
    public final Date updatedAt;
    @JsonProperty("pushed_at")
    public final Date pushedAt;
    @JsonProperty("git_url")
    public final String gitUrl;
    @JsonProperty("ssh_url")
    public final String sshUrl;
    @JsonProperty("clone_url")
    public final String cloneUrl;
    @JsonProperty("svn_url")
    public final String svnUrl;
    @JsonProperty("homepage")
    public final String homepage;
    @JsonProperty("size")
    public final int size;
    @JsonProperty("stargazers_count")
    public final int stargazersCount;
    @JsonProperty("watchers_count")
    public final int watchersCount;
    @JsonProperty("language")
    public final String language;
    @JsonProperty("has_issues")
    public final boolean hasIssues;
    @JsonProperty("has_projects")
    public final boolean hasProjects;
    @JsonProperty("has_downloads")
    public final boolean hasDownloads;
    @JsonProperty("has_wiki")
    public final boolean hasWiki;
    @JsonProperty("has_pages")
    public final boolean hasPages;
    @JsonProperty("has_discussions")
    public final boolean hasDiscussions;
    @JsonProperty("forks_count")
    public final int forksCount;
    @JsonProperty("mirror_url")
    public final Object mirrorUrl = null;
    @JsonProperty("archived")
    public final boolean archived;
    @JsonProperty("disabled")
    public final boolean disabled;
    @JsonProperty("open_issues_count")
    public final int openIssuesCount;
    @JsonProperty("license")
    public final Object license = null;
    @JsonProperty("allow_forking")
    public final boolean allowForking;
    @JsonProperty("is_template")
    public final boolean isTemplate;
    @JsonProperty("web_commit_signoff_required")
    public final boolean webCommitSignoffRequired;
    @JsonProperty("topics")
    protected final List<Object> topics = null;
    @JsonProperty("visibility")
    public final String visibility;
    @JsonProperty("forks")
    public final int forks;
    @JsonProperty("open_issues")
    public final int openIssues;
    @JsonProperty("watchers")
    public final int watchers;
    @JsonProperty("default_branch")
    public final String defaultBranch;
}