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
public enum DataActivity {

    NONE(0),
    IN(1),
    OUT(2),
    INOUT(3),
    DORMANT(4),
    UNKNOWN(-1);

    private final int value;

    DataActivity(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public static DataActivity get(int value){

        for (DataActivity dataActivity : values()) {
            if(dataActivity.ordinal() == value) return dataActivity;
        }
        return UNKNOWN;
    }

    public static DataActivity get(String name){

        for (DataActivity dataActivity : values()) {
            if(name != null && dataActivity.name().toLowerCase().equals(name.toLowerCase())) return dataActivity;
        }
        return UNKNOWN;
    }

}
