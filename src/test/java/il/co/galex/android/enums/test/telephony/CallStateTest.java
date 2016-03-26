package il.co.galex.android.enums.test.telephony;

import il.co.galex.android.enums.telephony.CallState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Call State Test
 * @author Alexander Gherschon
 */
public class CallStateTest {

    @Test
    public void getValue() {

        assertEquals(CallState.IDLE.get(), 0);
        assertEquals(CallState.RINGING.get(), 1);
        assertEquals(CallState.OFFHOOK.get(), 2);
        assertEquals(CallState.UNKNOWN.get(), -1);
    }

    @Test
    public void getByOrdinal() {

        assertEquals(CallState.IDLE, CallState.get(0));
        assertEquals(CallState.RINGING, CallState.get(1));
        assertEquals(CallState.OFFHOOK, CallState.get(2));
        assertEquals(CallState.UNKNOWN, CallState.get(-1));
    }

    @Test
    public void getByName() {

        assertEquals(CallState.IDLE, CallState.get("IDLE"));
        assertEquals(CallState.RINGING, CallState.get("ringing"));
        assertEquals(CallState.OFFHOOK, CallState.get("OffHook"));
        assertEquals(CallState.UNKNOWN, CallState.get("Unknown"));
    }

    @Test
    public void getUnknown() {

        assertEquals(CallState.UNKNOWN, CallState.get("trolololooo"));
        assertEquals(CallState.UNKNOWN, CallState.get(Integer.MAX_VALUE));
        assertEquals(CallState.UNKNOWN, CallState.get(666));
    }
}