
package endomondo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "version",
    "description",
    "main",
    "scripts",
    "keywords",
    "repository",
    "author",
    "license",
    "bugs",
    "homepage",
    "dependencies",
    "devDependencies",
    "jest"
})
public class Endomondo {

    @JsonProperty("name")
    private String name;
    @JsonProperty("version")
    private String version;
    @JsonProperty("description")
    private String description;
    @JsonProperty("main")
    private String main;

    @JsonProperty("keywords")
    private List<String> keywords = null;
    @JsonProperty("repository")
    private Repository repository;
    @JsonProperty("author")
    private String author;
    @JsonProperty("license")
    private String license;
    @JsonProperty("bugs")
    private Bugs bugs;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("dependencies")
    private Dependencies dependencies;
    @JsonProperty("devDependencies")
    private DevDependencies devDependencies;
  
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("main")
    public String getMain() {
        return main;
    }

    @JsonProperty("main")
    public void setMain(String main) {
        this.main = main;
    }



    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("repository")
    public Repository getRepository() {
        return repository;
    }

    @JsonProperty("repository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    @JsonProperty("bugs")
    public Bugs getBugs() {
        return bugs;
    }

    @JsonProperty("bugs")
    public void setBugs(Bugs bugs) {
        this.bugs = bugs;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @JsonProperty("dependencies")
    public Dependencies getDependencies() {
        return dependencies;
    }

    @JsonProperty("dependencies")
    public void setDependencies(Dependencies dependencies) {
        this.dependencies = dependencies;
    }

    @JsonProperty("devDependencies")
    public DevDependencies getDevDependencies() {
        return devDependencies;
    }

    @JsonProperty("devDependencies")
    public void setDevDependencies(DevDependencies devDependencies) {
        this.devDependencies = devDependencies;
    }

 

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

   

}
