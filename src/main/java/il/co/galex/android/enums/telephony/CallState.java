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
public enum CallState {

    IDLE(0),
    RINGING(1),
    OFFHOOK(2),
    UNKNOWN(-1); // our addition for constants we know nothing about

    private final int value;

    CallState(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public static CallState get(int value){

        for (CallState callState : values()) {
            if(callState.ordinal() == value) return callState;
        }
        return UNKNOWN;
    }

    public static CallState get(String name){

        for (CallState callState : values()) {
            if(name != null && callState.name().toLowerCase().equals(name.toLowerCase())) return callState;
        }
        return UNKNOWN;
    }
}
