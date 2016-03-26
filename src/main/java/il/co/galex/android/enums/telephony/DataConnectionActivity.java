package il.co.galex.android.enums.telephony;

/**
 * Enum representation of the "DATA_ACTIVITY_" constants in TelephonyManager:
 *
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#DATA_ACTIVITY_NONE">DATA_ACTIVITY_NONE</a>
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#DATA_ACTIVITY_IN">DATA_ACTIVITY_IN</a>
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#DATA_ACTIVITY_OUT">DATA_ACTIVITY_OUT</a>
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#DATA_ACTIVITY_INOUT">DATA_ACTIVITY_INOUT</a>
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#DATA_ACTIVITY_DORMANT">DATA_ACTIVITY_DORMANT</a>
 *
 * @author Alexander Gherschon
 */
public enum DataConnectionActivity {

    NONE(0),
    IN(1),
    OUT(2),
    INOUT(3),
    DORMANT(4),
    UNKNOWN(-1);

    private final int value;

    DataConnectionActivity(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public static DataConnectionActivity get(int value){

        for (DataConnectionActivity dataConnectionActivity : values()) {
            if(dataConnectionActivity.ordinal() == value) return dataConnectionActivity;
        }
        return UNKNOWN;
    }

    public static DataConnectionActivity get(String name){

        for (DataConnectionActivity dataConnectionActivity : values()) {
            if(name != null && dataConnectionActivity.name().toLowerCase().equals(name.toLowerCase())) return dataConnectionActivity;
        }
        return UNKNOWN;
    }

}
