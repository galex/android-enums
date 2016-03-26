package il.co.galex.android.enums.telephony;

/**
 * Enum representation of the "DATA_" constants in TelephonyManager:
 *
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#DATA_DISCONNECTED">DATA_DISCONNECTED</a>
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#DATA_CONNECTING">DATA_CONNECTING</a>
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#DATA_CONNECTED">DATA_CONNECTED</a>
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#DATA_SUSPENDED">DATA_SUSPENDED</a>
 *
 * @author Alexander Gherschon
 */
public enum DataConnectionState {

    DISCONNECTED(0),
    CONNECTING(1),
    CONNECTED(2),
    SUSPENDED(3),
    UNKNOWN(-1);

    private final int value;

    DataConnectionState(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public static DataConnectionState get(int value){

        for (DataConnectionState type : values()) {
            if(type.ordinal() == value) return type;
        }
        return UNKNOWN;
    }

    public static DataConnectionState get(String name){

        for (DataConnectionState type : values()) {
            if(name != null && type.name().toLowerCase().equals(name.toLowerCase())) return type;
        }
        return UNKNOWN;
    }
}
