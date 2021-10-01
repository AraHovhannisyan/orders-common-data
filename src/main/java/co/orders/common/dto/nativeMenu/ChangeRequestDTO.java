package co.orders.common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
public abstract class ChangeRequestDTO {

    @JsonProperty(value = "type")
    private String itemType;

    private String action;

    @NotBlank
    private String businessId;
    private String businessLocationId;

    @NotBlank
    private String menuId;

    @NotBlank
    @JsonProperty(value = "location_id")
    private String menuLocationId;

    @NotBlank
    private String provider;

    @JsonProperty(value = "created")
    private LocalDateTime createdAt;

}
