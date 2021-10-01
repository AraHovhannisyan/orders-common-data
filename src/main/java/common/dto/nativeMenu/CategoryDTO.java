package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CategoryDTO {

    @Valid
    List<MenuItemDTO> items;

    @Valid
    private List<String> tags;

    @Valid
    private Set<AvailabilityDTO> schedules;

    @NotBlank
    @JsonProperty("external_id")
    private String externalId;

    @NotBlank
    @EqualsAndHashCode.Include
    private String name;

    @JsonProperty("created_by_user")
    private Boolean createdByUser;

    @JsonProperty("menu_id")
    private String menuId;

    @JsonProperty("is_active")
    private Boolean isActive;

    @EqualsAndHashCode.Include
    private String id;

    private Integer ordinal;
    private String description;
    private LocalDateTime created;
    private LocalDateTime updated;
    private List<Changes> changes;

    public void addItem(MenuItemDTO item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }

}
