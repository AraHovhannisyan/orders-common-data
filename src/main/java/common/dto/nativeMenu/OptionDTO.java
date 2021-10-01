package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OptionDTO {

    private String id;
    private String priceCurrency;
    private List<TagDTO> tags;
    private BigDecimal price;
    private String name;
    private LocalDateTime created;
    private LocalDateTime updated;
    private AvailabilityDTO availability;

}
