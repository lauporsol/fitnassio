
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
    "codecov",
    "faker",
    "jest"
})
public class DevDependencies {

    @JsonProperty("codecov")
    private String codecov;
    @JsonProperty("faker")
    private String faker;
    @JsonProperty("jest")
    private String jest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("codecov")
    public String getCodecov() {
        return codecov;
    }

    @JsonProperty("codecov")
    public void setCodecov(String codecov) {
        this.codecov = codecov;
    }

    @JsonProperty("faker")
    public String getFaker() {
        return faker;
    }

    @JsonProperty("faker")
    public void setFaker(String faker) {
        this.faker = faker;
    }

    @JsonProperty("jest")
    public String getJest() {
        return jest;
    }

    @JsonProperty("jest")
    public void setJest(String jest) {
        this.jest = jest;
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
