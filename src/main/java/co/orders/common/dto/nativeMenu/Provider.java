package co.orders.common.dto.nativeMenu;

public enum Provider {

    MASTER,
    POSTMATES,
    DOORDASH,
    GRUBHUB,
    UBER_EATS,
    WEBSITES;

    public static boolean contains(String providerName) {
        if(providerName != null) {
            providerName = providerName.toUpperCase();
            for (Provider provider:Provider.values()) {
                if(providerName.equals(provider.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

}