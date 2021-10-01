package common.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExportOrderDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Status status;
    private State state;

    @JsonProperty("oco_external_id")
    private String ocoExternalId;

    private String beReadyTZ;
    private boolean isScheduled;
    private boolean notify;
    private boolean isActive;
    private boolean paid;
    private boolean failed;
    private boolean cashback;
    private boolean modified;
    private List<Object> orderHistory;
    private List<String> owner;
    private List<Business> business;

    @JsonProperty("_id")
    private String extId;

    private String quoteId;
    private List<Product> products;
    private Delivery delivery;
    private Charges charges;
    private String type;
    private String number;
    private String provider;
    private String paymentMethod;
    private ContactInfo contactInfo;

    @JsonProperty("__v")
    private Integer version;

    private String beReadyTime;
    private String specialInstructions;
    private String placedAt;
    private String createdAt;
    private String updatedAt;
    private String id;

    @Data
    public static class Delivery {
        private String address2;
        private String address1;
    }

    @Data
    public static class ContactInfo {
        private String address2;
        private String address1;
        private String name;
        private String phone;
    }

    @Data
    public static class Charges {
        private Double tax;
        private Double tip;
        private Double subTotal;
        private Double deliveryFee;
        private Double total;
        private Double discount;
    }

    @Data
    public static class Product {

        @JsonProperty("_id")
        private String id;
        private String name;
        private double price;
        private double total;
        private String instructions;
        private Integer quantity;
        private List<Modifier> modifier;
        private String notes;
        private String externalId;

    }

    @Data
    public static class Modifier {
        List<Item> list;
    }

    @Data
    public static class Item {
        private String id;
        private String name;
        private double price;
    }

    @Data
    public static class Role {

        @JsonProperty("_id")
        private String id;

        private String userId;
        private String role;
    }

    @Data
    public static class Timezone {

        @JsonProperty("_id")
        private String id;

        private Integer dstOffset;
        private String timeZoneId;
        private String timeZoneName;

        @JsonProperty("__v")
        private Integer version;

//        private String text;
    }

    @Data
    public static class Location {
        private double lat;
        private double lng;
    }

    @Data
    public static class Status {
        private String status;
        private String updatedAt;
        private String createdBy;
    }

    @Data
    public static class State {
        private String status;
        private String updatedAt;
        private String createdBy;
    }

    @Data
    public static class Business {
        private String companyName;
        private String brandName;
        private String cuisineType;
        private String address;
        private String address2;
        private AddressInfo addressInfo;
        private String email;
        private String phone;
        private String website;
        private Integer tax;
        private String avatar;
        private String about;
        private boolean isDemoMode;
        private boolean disabled;
        private boolean ignoreIssues;
        private boolean isActive;
        private boolean verified;
        private WorkingHours workingHours;
        private List<SpecialDate> specialDates;
        private Integer defaultPrepTime;
        private List<String> owner;
        private String restaurantMailbox;

        private String id;

        @JsonProperty("__v")
        private int version;

        @Data
        public static class SpecialDate {
            private String date;
            private boolean opened;
            private List<Hours> hours;
        }

        @JsonProperty("_id")
        private String extId;

        private Location location;
        private Timezone timezone;
        private List<Role> roles;
    }

    @Data
    public static class WorkingHours {
        private Sunday sun;
        private Monday mon;
        private Tuesday tue;
        private Wednesday wed;
        private Thursday thu;
        private Friday fri;
        private Saturday sat;
    }

    @Data
    public static class Sunday {
        private boolean opened;
        private List<Hours> hours;
    }

    @Data
    public static class Monday {
        private boolean opened;
        private List<Hours> hours;
    }

    @Data
    public static class Tuesday {
        private boolean opened;
        private List<Hours> hours;
    }

    @Data
    public static class Wednesday {
        private boolean opened;
        private List<Hours> hours;
    }

    @Data
    public static class Thursday {
        private boolean opened;
        private List<Hours> hours;
    }

    @Data
    public static class Friday {
        private boolean opened;
        private List<Hours> hours;
    }

    @Data
    public static class Saturday {
        private boolean opened;
        private List<Hours> hours;
    }

    @Data
    public static class Hours {
        private String start;
        private String end;
    }

    @Data
    public static class AddressInfo {
        private String city;
        private String state;
        private String zipCode;
    }
}