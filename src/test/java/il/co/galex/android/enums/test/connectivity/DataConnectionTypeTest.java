package il.co.galex.android.enums.test.connectivity;

import il.co.galex.android.enums.connectivity.DataConnectionType;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * DataConnectionType Test
 * @author Alexander Gherschon
 */
public class DataConnectionTypeTest {

    @Test
    public void getValue() {

        assertEquals(DataConnectionType.MOBILE.get(), 0);
        assertEquals(DataConnectionType.WIFI.get(), 1);
        assertEquals(DataConnectionType.MOBILE_MMS.get(), 2);
        assertEquals(DataConnectionType.MOBILE_SUPL.get(), 3);
        assertEquals(DataConnectionType.MOBILE_DUN.get(), 4);
        assertEquals(DataConnectionType.MOBILE_HIPRI.get(), 5);
        assertEquals(DataConnectionType.WIMAX.get(), 6);
        assertEquals(DataConnectionType.BLUETOOTH.get(), 7);
        assertEquals(DataConnectionType.DUMMY.get(), 8);
        assertEquals(DataConnectionType.ETHERNET.get(), 9);
        assertEquals(DataConnectionType.VPN.get(), 17);
        assertEquals(DataConnectionType.UNKNOWN.get(), -1);
    }

    @Test
    public void getByValueOrdinal() {

        assertEquals(DataConnectionType.MOBILE, DataConnectionType.get(0));
        assertEquals(DataConnectionType.WIFI, DataConnectionType.get(1));
        assertEquals(DataConnectionType.MOBILE_MMS, DataConnectionType.get(2));
        assertEquals(DataConnectionType.MOBILE_SUPL, DataConnectionType.get(3));
        assertEquals(DataConnectionType.MOBILE_DUN, DataConnectionType.get(4));
        assertEquals(DataConnectionType.MOBILE_HIPRI, DataConnectionType.get(5));
        assertEquals(DataConnectionType.WIMAX, DataConnectionType.get(6));
        assertEquals(DataConnectionType.BLUETOOTH, DataConnectionType.get(7));
        assertEquals(DataConnectionType.DUMMY, DataConnectionType.get(8));
        assertEquals(DataConnectionType.ETHERNET, DataConnectionType.get(9));
        assertEquals(DataConnectionType.VPN, DataConnectionType.get(17));
        assertEquals(DataConnectionType.UNKNOWN, DataConnectionType.get(-1));
    }

    @Test
    public void getByName() {

        assertEquals(DataConnectionType.MOBILE, DataConnectionType.get("Mobile"));
        assertEquals(DataConnectionType.WIFI, DataConnectionType.get("WiFi"));
        assertEquals(DataConnectionType.MOBILE_MMS, DataConnectionType.get("Mobile_Mms"));
        assertEquals(DataConnectionType.MOBILE_SUPL, DataConnectionType.get("Mobile_Supl"));
        assertEquals(DataConnectionType.MOBILE_DUN, DataConnectionType.get("Mobile_Dun"));
        assertEquals(DataConnectionType.MOBILE_HIPRI, DataConnectionType.get("Mobile_HIPRI"));
        assertEquals(DataConnectionType.WIMAX, DataConnectionType.get("WIMAX"));
        assertEquals(DataConnectionType.BLUETOOTH, DataConnectionType.get("bluetooth"));
        assertEquals(DataConnectionType.DUMMY, DataConnectionType.get("Dummy"));
        assertEquals(DataConnectionType.ETHERNET, DataConnectionType.get("ETHERNET"));
        assertEquals(DataConnectionType.VPN, DataConnectionType.get("VPN"));
        assertEquals(DataConnectionType.UNKNOWN, DataConnectionType.get("unknown"));
    }

    @Test
    public void getUnknown() {

        assertEquals(DataConnectionType.UNKNOWN, DataConnectionType.get("trolololooo"));
        assertEquals(DataConnectionType.UNKNOWN, DataConnectionType.get(Integer.MAX_VALUE));
        assertEquals(DataConnectionType.UNKNOWN, DataConnectionType.get(666));
    }
}