package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode(exclude = {"provider", "created", "changes"})
public class CreateMenuDTO {

    @Valid
    private MenuDTO menu;

    @NotBlank
    @JsonProperty("business_id")
    private String businessId;

    @JsonProperty("menu_type")
    private String menuType;

    private String provider;
    private LocalDateTime created;
    private List<Changes> changes;

}