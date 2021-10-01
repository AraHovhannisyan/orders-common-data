package co.orders.common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.Valid;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MenuUpdateDTO extends ChangeRequestDTO {

    @Valid
    private UpdateData data;

    @Data
    @AllArgsConstructor
    public static class UpdateData {
        @Valid
        private MenuDTO menu;
    }

}
