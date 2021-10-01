package co.orders.common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Set;

@Data
public class AvailabilityDTO {

    @JsonProperty("regular_hours")
    private Set<RegularHoursDTO> regularHours;

    @JsonProperty("special_hours")
    private Set<SpecialHoursDTO> specialHours;

    private String id;
    private String name;
    private String type;
    private String description;

}
