package il.co.galex.android.enums.telephony;

/**
 * Enum representation of the "CALL_STATE_" constants in TelephonyManager:
 *
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#CALL_STATE_IDLE">CALL_STATE_IDLE</a>
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#CALL_STATE_RINGING">CALL_STATE_RINGING</a>
 * - <a href="http://developer.android.com/reference/android/telephony/TelephonyManager.html#CALL_STATE_OFFHOOK">CALL_STATE_OFFHOOK</a>
 *
 * @author Alexander Gherschon
 */
public enum DeviceCallState {

    IDLE(0),
    RINGING(1),
    OFFHOOK(2),
    UNKNOWN(-1); // our addition for constants we know nothing about

    private final int value;

    DeviceCallState(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public static DeviceCallState get(int value){

        for (DeviceCallState deviceCallState : values()) {
            if(deviceCallState.ordinal() == value) return deviceCallState;
        }
        return UNKNOWN;
    }

    public static DeviceCallState get(String name){

        for (DeviceCallState deviceCallState : values()) {
            if(name != null && deviceCallState.name().toLowerCase().equals(name.toLowerCase())) return deviceCallState;
        }
        return UNKNOWN;
    }
}
