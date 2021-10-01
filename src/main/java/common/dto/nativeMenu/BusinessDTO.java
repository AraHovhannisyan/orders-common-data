package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
@Builder
public class BusinessDTO {

    @JsonProperty(value = "businessId")
    @NotBlank
    private String id;
    @NotNull
    private String businessName;
    private Boolean createdByUser;

    @Valid
    @JsonProperty(value = "location_id")
    private LocationDTO businessLocation;
    private List<String> tags;
    @JsonProperty(value = "availability")
    private List<AvailabilityDTO> schedules;

}
