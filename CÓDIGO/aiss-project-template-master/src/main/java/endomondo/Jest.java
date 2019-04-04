
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
    "testMatch",
    "testEnvironment",
    "automock"
})
public class Jest {

    @JsonProperty("testMatch")
    private List<String> testMatch = null;
    @JsonProperty("testEnvironment")
    private String testEnvironment;
    @JsonProperty("automock")
    private Boolean automock;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("testMatch")
    public List<String> getTestMatch() {
        return testMatch;
    }

    @JsonProperty("testMatch")
    public void setTestMatch(List<String> testMatch) {
        this.testMatch = testMatch;
    }

    @JsonProperty("testEnvironment")
    public String getTestEnvironment() {
        return testEnvironment;
    }

    @JsonProperty("testEnvironment")
    public void setTestEnvironment(String testEnvironment) {
        this.testEnvironment = testEnvironment;
    }

    @JsonProperty("automock")
    public Boolean getAutomock() {
        return automock;
    }

    @JsonProperty("automock")
    public void setAutomock(Boolean automock) {
        this.automock = automock;
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
