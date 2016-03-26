package il.co.galex.android.enums.test.telephony;

import il.co.galex.android.enums.telephony.DeviceCallState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Call State Test
 * @author Alexander Gherschon
 */
public class DeviceCallStateTest {

    @Test
    public void getValue() {

        assertEquals(DeviceCallState.IDLE.get(), 0);
        assertEquals(DeviceCallState.RINGING.get(), 1);
        assertEquals(DeviceCallState.OFFHOOK.get(), 2);
        assertEquals(DeviceCallState.UNKNOWN.get(), -1);
    }

    @Test
    public void getByOrdinal() {

        assertEquals(DeviceCallState.IDLE, DeviceCallState.get(0));
        assertEquals(DeviceCallState.RINGING, DeviceCallState.get(1));
        assertEquals(DeviceCallState.OFFHOOK, DeviceCallState.get(2));
        assertEquals(DeviceCallState.UNKNOWN, DeviceCallState.get(-1));
    }

    @Test
    public void getByName() {

        assertEquals(DeviceCallState.IDLE, DeviceCallState.get("IDLE"));
        assertEquals(DeviceCallState.RINGING, DeviceCallState.get("ringing"));
        assertEquals(DeviceCallState.OFFHOOK, DeviceCallState.get("OffHook"));
        assertEquals(DeviceCallState.UNKNOWN, DeviceCallState.get("Unknown"));
    }

    @Test
    public void getUnknown() {

        assertEquals(DeviceCallState.UNKNOWN, DeviceCallState.get("trolololooo"));
        assertEquals(DeviceCallState.UNKNOWN, DeviceCallState.get(Integer.MAX_VALUE));
        assertEquals(DeviceCallState.UNKNOWN, DeviceCallState.get(666));
    }
}