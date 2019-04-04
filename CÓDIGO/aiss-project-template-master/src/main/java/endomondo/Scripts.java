
package endomondo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "start",
    "example",
    "test",
    "test:dev",
    "test:int",
    "test:cov",
    "push",
    "deploy:major",
    "deploy:minor",
    "deploy:patch",
    "deploy:push",
    "preversion"
})
public class Scripts {

    @JsonProperty("start")
    private String start;
    @JsonProperty("example")
    private String example;
    @JsonProperty("test")
    private String test;
    @JsonProperty("test:dev")
    private String testDev;
    @JsonProperty("test:int")
    private String testInt;
    @JsonProperty("test:cov")
    private String testCov;
    @JsonProperty("push")
    private String push;
    @JsonProperty("deploy:major")
    private String deployMajor;
    @JsonProperty("deploy:minor")
    private String deployMinor;
    @JsonProperty("deploy:patch")
    private String deployPatch;
    @JsonProperty("deploy:push")
    private String deployPush;
    @JsonProperty("preversion")
    private String preversion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
    }

    @JsonProperty("example")
    public String getExample() {
        return example;
    }

    @JsonProperty("example")
    public void setExample(String example) {
        this.example = example;
    }

    @JsonProperty("test")
    public String getTest() {
        return test;
    }

    @JsonProperty("test")
    public void setTest(String test) {
        this.test = test;
    }

    @JsonProperty("test:dev")
    public String getTestDev() {
        return testDev;
    }

    @JsonProperty("test:dev")
    public void setTestDev(String testDev) {
        this.testDev = testDev;
    }

    @JsonProperty("test:int")
    public String getTestInt() {
        return testInt;
    }

    @JsonProperty("test:int")
    public void setTestInt(String testInt) {
        this.testInt = testInt;
    }

    @JsonProperty("test:cov")
    public String getTestCov() {
        return testCov;
    }

    @JsonProperty("test:cov")
    public void setTestCov(String testCov) {
        this.testCov = testCov;
    }

    @JsonProperty("push")
    public String getPush() {
        return push;
    }

    @JsonProperty("push")
    public void setPush(String push) {
        this.push = push;
    }

    @JsonProperty("deploy:major")
    public String getDeployMajor() {
        return deployMajor;
    }

    @JsonProperty("deploy:major")
    public void setDeployMajor(String deployMajor) {
        this.deployMajor = deployMajor;
    }

    @JsonProperty("deploy:minor")
    public String getDeployMinor() {
        return deployMinor;
    }

    @JsonProperty("deploy:minor")
    public void setDeployMinor(String deployMinor) {
        this.deployMinor = deployMinor;
    }

    @JsonProperty("deploy:patch")
    public String getDeployPatch() {
        return deployPatch;
    }

    @JsonProperty("deploy:patch")
    public void setDeployPatch(String deployPatch) {
        this.deployPatch = deployPatch;
    }

    @JsonProperty("deploy:push")
    public String getDeployPush() {
        return deployPush;
    }

    @JsonProperty("deploy:push")
    public void setDeployPush(String deployPush) {
        this.deployPush = deployPush;
    }

    @JsonProperty("preversion")
    public String getPreversion() {
        return preversion;
    }

    @JsonProperty("preversion")
    public void setPreversion(String preversion) {
        this.preversion = preversion;
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
