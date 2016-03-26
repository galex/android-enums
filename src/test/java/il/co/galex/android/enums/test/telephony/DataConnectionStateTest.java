package il.co.galex.android.enums.test.telephony;

import il.co.galex.android.enums.telephony.DataConnectionState;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Data Connection State Test
 * @author Alexander Gherschon
 */
public class DataConnectionStateTest {

    @Test
    public void getValue() {

        assertEquals(DataConnectionState.DISCONNECTED.get(), 0);
        assertEquals(DataConnectionState.CONNECTING.get(), 1);
        assertEquals(DataConnectionState.CONNECTED.get(), 2);
        assertEquals(DataConnectionState.SUSPENDED.get(), 3);
        assertEquals(DataConnectionState.UNKNOWN.get(), -1);
    }

    @Test
    public void getByOrdinal() {

        assertEquals(DataConnectionState.DISCONNECTED, DataConnectionState.get(0));
        assertEquals(DataConnectionState.CONNECTING, DataConnectionState.get(1));
        assertEquals(DataConnectionState.CONNECTED, DataConnectionState.get(2));
        assertEquals(DataConnectionState.SUSPENDED, DataConnectionState.get(3));
        assertEquals(DataConnectionState.UNKNOWN, DataConnectionState.get(-1));
    }

    @Test
    public void getByName() {

        assertEquals(DataConnectionState.DISCONNECTED, DataConnectionState.get("disconnected"));
        assertEquals(DataConnectionState.CONNECTING, DataConnectionState.get("CONNECTING"));
        assertEquals(DataConnectionState.CONNECTED, DataConnectionState.get("CONNECTEd"));
        assertEquals(DataConnectionState.SUSPENDED, DataConnectionState.get("SUSPENDED"));
        assertEquals(DataConnectionState.UNKNOWN, DataConnectionState.get("Unknown"));
    }

    @Test
    public void getUnknown() {

        assertEquals(DataConnectionState.UNKNOWN, DataConnectionState.get("trolololooo"));
        assertEquals(DataConnectionState.UNKNOWN, DataConnectionState.get(Integer.MAX_VALUE));
        assertEquals(DataConnectionState.UNKNOWN, DataConnectionState.get(666));
    }
}