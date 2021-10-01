package common.dto.nativeMenu;

import lombok.Data;

import java.util.List;

@Data
public class MenuLocationDTO {

    private String id;
    private String address;
    private String email;
    private List<TagDTO> tags;
    private Boolean createdByUser;
    private List<AvailabilityDTO> availability;

}
