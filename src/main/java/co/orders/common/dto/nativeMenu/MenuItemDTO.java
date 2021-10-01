package co.orders.common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class MenuItemDTO {

    @Valid
    @JsonProperty(value = "option_groups")
    private List<OptionGroupDTO> optionGroups;

    @Valid
    private Set<AvailabilityDTO> schedules;

    @Valid
    @JsonProperty("price_overrides")
    private List<PriceOverrideDTO> priceOverrideDTOS;

    @Valid
    private List<String> tags;

    @NotBlank
    @JsonProperty("external_id")
    private String externalId;

    @NotBlank
    @JsonProperty(value = "name")
    private String name;

    @NotNull
    @JsonProperty("price_currency")
    private String priceCurrency;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal price;

    @JsonProperty("photo_url")
    private String photoUrl;

    @JsonProperty("is_available")
    private Boolean isAvailable;

    @JsonProperty(value = "is_modifier_free")
    private Boolean isModifierFree;

    @JsonProperty("sort_index")
    private Integer sortIndex;

    @JsonProperty("created_by_user")
    private Boolean createdByUser;

    @JsonProperty("is_one_price")
    private Boolean isOnePrice;

    @JsonProperty("primary_category")
    private String primaryCategory;

    @JsonProperty("tax_rate")
    private BigDecimal taxRate;

    private String id;
    private String carbs;
    private String calories;
    private String proteins;
    private String description;
    private LocalDateTime created;
    private LocalDateTime updated;
    private List<Changes> changes;

    public void addOptionGroup(OptionGroupDTO optionGroup) {
        if (optionGroups == null) {
            optionGroups = new ArrayList<>();
        }
        optionGroups.add(optionGroup);
    }

}
