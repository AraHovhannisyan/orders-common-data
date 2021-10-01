package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "native_menu")
public class NativeMenuDTO {

    private String menuType;
    @NotBlank
    private String provider;
    @Valid
    private BusinessDTO business;
    private LocalDateTime created;
    @Valid
    private MenuDTO menu;

    @JsonProperty("business_id")
    private  String businessId;

}