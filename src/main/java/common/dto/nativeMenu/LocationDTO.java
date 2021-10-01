package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocationDTO {

    @NotBlank
    private String id;

    private String address;

    private Boolean createdByUser;
    @NotBlank
    @Email
    private String email;
    private List<String> tags;

    @JsonProperty(value = "availability")
    private List<AvailabilityDTO> schedules;

}
