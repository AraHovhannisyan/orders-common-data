package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceOverrideDTO {

    @JsonProperty("item_id")
    private String itemId;

    @JsonProperty("context_type")
    private String contextType;

    @JsonProperty("context_value")
    private String contextValue;

    private String _id;
    private String name;
    private BigDecimal price;

}
