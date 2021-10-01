package common.dto.nativeMenu;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MappingDTO {

    private Mapping mapping;

    @Data
    public static class Mapping {
        private MenuMapping menu;
    }

    @Data
    public static class MenuMapping {
        @JsonProperty("external_id")
        private String externalId;
        @JsonProperty("native_id")
        private String nativeId;
        private List<CategoryMapping> category;
    }

    @Data
    public static class CategoryMapping {
        @JsonProperty("external_id")
        private String externalId;
        @JsonProperty("native_id")
        private String nativeId;
        @JsonProperty("menu_item")
        private List<MenuItemMapping> menuItem;
    }

    @Data
    public static class MenuItemMapping {
        @JsonProperty("external_id")
        private String externalId;
        @JsonProperty("native_id")
        private String nativeId;
        @JsonProperty("mod_group")
        private List<ModifierGroupMapping> modGroup;
    }

    @Data
    public static class ModifierGroupMapping {
        @JsonProperty("external_id")
        private String externalId;
        @JsonProperty("native_id")
        private String nativeId;
        private List<ModifierMapping> modifier;
    }

    @Data
    public static class ModifierMapping {
        @JsonProperty("external_id")
        private String externalId;
        @JsonProperty("native_id")
        private String nativeId;
    }

}