package co.orders.common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(exclude = {"changes"})
public class MenuDTO {

    @Valid
    private List<CategoryDTO> categories;

    @Valid
    private List<String> tags;

    @Valid
    private Set<AvailabilityDTO> schedules;

    @NotBlank
    @JsonProperty("external_id")
    private String externalId;

    @NotBlank
    @JsonProperty("menu_name")
    private String menuName;

    @NotNull
    private Provider provider;

    @JsonProperty("business_id")
    private String businessId;

    @JsonProperty("created_by_user")
    private Boolean createdByUser;

    @JsonProperty(value = "location_id")
    private String locationId;

    private String id;
    private LocalDateTime created;
    private LocalDateTime updated;
    private List<Changes> changes;

}
