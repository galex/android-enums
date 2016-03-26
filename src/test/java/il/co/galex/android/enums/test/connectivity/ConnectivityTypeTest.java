package il.co.galex.android.enums.test.connectivity;

import il.co.galex.android.enums.connectivity.ConnectivityType;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ConnectivityType Test
 * @author Alexander Gherschon
 */
public class ConnectivityTypeTest {

    @Test
    public void getValue() {

        assertEquals(ConnectivityType.MOBILE.get(), 0);
        assertEquals(ConnectivityType.WIFI.get(), 1);
        assertEquals(ConnectivityType.MOBILE_MMS.get(), 2);
        assertEquals(ConnectivityType.MOBILE_SUPL.get(), 3);
        assertEquals(ConnectivityType.MOBILE_DUN.get(), 4);
        assertEquals(ConnectivityType.MOBILE_HIPRI.get(), 5);
        assertEquals(ConnectivityType.WIMAX.get(), 6);
        assertEquals(ConnectivityType.BLUETOOTH.get(), 7);
        assertEquals(ConnectivityType.DUMMY.get(), 8);
        assertEquals(ConnectivityType.ETHERNET.get(), 9);
        assertEquals(ConnectivityType.VPN.get(), 17);
        assertEquals(ConnectivityType.UNKNOWN.get(), -1);
    }

    @Test
    public void getByValueOrdinal() {

        assertEquals(ConnectivityType.MOBILE, ConnectivityType.get(0));
        assertEquals(ConnectivityType.WIFI, ConnectivityType.get(1));
        assertEquals(ConnectivityType.MOBILE_MMS, ConnectivityType.get(2));
        assertEquals(ConnectivityType.MOBILE_SUPL, ConnectivityType.get(3));
        assertEquals(ConnectivityType.MOBILE_DUN, ConnectivityType.get(4));
        assertEquals(ConnectivityType.MOBILE_HIPRI, ConnectivityType.get(5));
        assertEquals(ConnectivityType.WIMAX, ConnectivityType.get(6));
        assertEquals(ConnectivityType.BLUETOOTH, ConnectivityType.get(7));
        assertEquals(ConnectivityType.DUMMY, ConnectivityType.get(8));
        assertEquals(ConnectivityType.ETHERNET, ConnectivityType.get(9));
        assertEquals(ConnectivityType.VPN, ConnectivityType.get(17));
        assertEquals(ConnectivityType.UNKNOWN, ConnectivityType.get(-1));
    }

    @Test
    public void getByName() {

        assertEquals(ConnectivityType.MOBILE, ConnectivityType.get("Mobile"));
        assertEquals(ConnectivityType.WIFI, ConnectivityType.get("WiFi"));
        assertEquals(ConnectivityType.MOBILE_MMS, ConnectivityType.get("Mobile_Mms"));
        assertEquals(ConnectivityType.MOBILE_SUPL, ConnectivityType.get("Mobile_Supl"));
        assertEquals(ConnectivityType.MOBILE_DUN, ConnectivityType.get("Mobile_Dun"));
        assertEquals(ConnectivityType.MOBILE_HIPRI, ConnectivityType.get("Mobile_HIPRI"));
        assertEquals(ConnectivityType.WIMAX, ConnectivityType.get("WIMAX"));
        assertEquals(ConnectivityType.BLUETOOTH, ConnectivityType.get("bluetooth"));
        assertEquals(ConnectivityType.DUMMY, ConnectivityType.get("Dummy"));
        assertEquals(ConnectivityType.ETHERNET, ConnectivityType.get("ETHERNET"));
        assertEquals(ConnectivityType.VPN, ConnectivityType.get("VPN"));
        assertEquals(ConnectivityType.UNKNOWN, ConnectivityType.get("unknown"));
    }

    @Test
    public void getUnknown() {

        assertEquals(ConnectivityType.UNKNOWN, ConnectivityType.get("trolololooo"));
        assertEquals(ConnectivityType.UNKNOWN, ConnectivityType.get(Integer.MAX_VALUE));
        assertEquals(ConnectivityType.UNKNOWN, ConnectivityType.get(666));
    }
}