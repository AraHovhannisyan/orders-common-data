package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
public class TimeIntervalDTO {

    private LocalTime start;
    private LocalTime end;

}
