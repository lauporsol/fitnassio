
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
    "moment",
    "request-promise-native",
    "uuid"
})
public class Dependencies {

    @JsonProperty("moment")
    private String moment;
    @JsonProperty("request-promise-native")
    private String requestPromiseNative;
    @JsonProperty("uuid")
    private String uuid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("moment")
    public String getMoment() {
        return moment;
    }

    @JsonProperty("moment")
    public void setMoment(String moment) {
        this.moment = moment;
    }

    @JsonProperty("request-promise-native")
    public String getRequestPromiseNative() {
        return requestPromiseNative;
    }

    @JsonProperty("request-promise-native")
    public void setRequestPromiseNative(String requestPromiseNative) {
        this.requestPromiseNative = requestPromiseNative;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
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
