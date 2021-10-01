package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
public class SpecialHoursDTO {

    @JsonProperty("is_active")
    private Boolean isActive;

    @JsonProperty("time_intervals")
    private Set<TimeIntervalDTO> timeIntervals;

    private LocalDateTime date;

}
