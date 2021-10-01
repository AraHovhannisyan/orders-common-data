package co.orders.common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class OptionGroupDTO {

    @Valid
    private List<MenuItemDTO> options;

    @Valid
    private List<String> tags;

    @NotBlank
    @JsonProperty("external_id")
    private String externalId;

    @NotBlank
    private String name;

    @JsonProperty("min_allowed")
    private Integer minAllowed;

    @JsonProperty("max_allowed")
    private Integer maxAllowed;

    @JsonProperty("created_by_user")
    private Boolean createdByUser;

    @JsonProperty("internal_name")
    private String internalName;

    @JsonProperty("is_one_price")
    private Boolean isOnePrice;

    @JsonProperty("free_allowed")
    private Boolean freeAllowed;

    @JsonProperty("business_id")
    private String businessId;

    @EqualsAndHashCode.Include
    private String id;

    private String description;
    private Integer ordinal;
    private LocalDateTime created;
    private LocalDateTime updated;
    private List<Changes> changes;

    public void addOption(MenuItemDTO option) {
        if (options == null) {
            options = new ArrayList<>();
        }
        options.add(option);
    }
}