package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
public class RegularHoursDTO {

    @Valid
    @JsonProperty("time_intervals")
    private Set<TimeIntervalDTO> timeIntervals;

    @JsonProperty("day_of_week")
    private String dayOfWeek;

    @JsonProperty("is_active")
    private Boolean isActive;

    @JsonProperty("is_24_hours")
    private Boolean is24hours;

    private String name;

}