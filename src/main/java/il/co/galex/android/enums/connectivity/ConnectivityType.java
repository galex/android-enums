package il.co.galex.android.enums.connectivity;

/**
 * Enum representation of the "TYPE_" constants in ConnectivityManager:
 *
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_MOBILE">TYPE_MOBILE</a>
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_WIFI">TYPE_WIFI</a>
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_MOBILE_MMS">TYPE_MOBILE_MMS</a>
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_MOBILE_SUPL">TYPE_MOBILE_SUPL</a>
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_MOBILE_DUN">TYPE_MOBILE_DUN</a>
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_MOBILE_HIPRI">TYPE_MOBILE_HIPRI</a>
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_WIMAX">TYPE_WIMAX</a>
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_DUMMY">TYPE_DUMMY</a>
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_ETHERNET">TYPE_ETHERNET</a>
 * - <a href="http://developer.android.com/reference/android/net/ConnectivityManager.html#TYPE_VPN">TYPE_VPN</a>
 *
 * @author Alexander Gherschon
 */
public enum ConnectivityType {

    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    VPN(17),
    UNKNOWN(-1);

    private final int value;

    ConnectivityType(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public static ConnectivityType get(int value){

        for (ConnectivityType connectivityType : values()) {
            if(connectivityType.get() == value) return connectivityType;
        }
        return UNKNOWN;
    }

    public static ConnectivityType get(String name){

        for (ConnectivityType connectivityType : values()) {
            if(name != null && connectivityType.name().toLowerCase().equals(name.toLowerCase())) return connectivityType;
        }
        return UNKNOWN;
    }
}
