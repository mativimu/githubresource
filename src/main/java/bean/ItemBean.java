package main.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value = {"_links"})
public class ItemBean implements Serializable {
    
    @JsonProperty("name")
    private String name;
    @JsonProperty("path")
    private String path;
    @JsonProperty("sha")
    private String sha;
    @JsonProperty("size")
    private int size;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("git_url")
    private String gitUrl;
    @JsonProperty("download_url")
    private String downloadUrl;
    @JsonProperty("type")
    private String type;

}
