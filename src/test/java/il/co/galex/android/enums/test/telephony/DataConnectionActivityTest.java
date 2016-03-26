package il.co.galex.android.enums.test.telephony;

import il.co.galex.android.enums.telephony.DataConnectionActivity;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Data Activity Test
 * @author Alexander Gherschon
 */
public class DataConnectionActivityTest {

    @Test
    public void getValue() {

        assertEquals(DataConnectionActivity.NONE.get(), 0);
        assertEquals(DataConnectionActivity.IN.get(), 1);
        assertEquals(DataConnectionActivity.OUT.get(), 2);
        assertEquals(DataConnectionActivity.INOUT.get(), 3);
        assertEquals(DataConnectionActivity.DORMANT.get(), 4);
        assertEquals(DataConnectionActivity.UNKNOWN.get(), -1);
    }

    @Test
    public void getByOrdinal() {

        assertEquals(DataConnectionActivity.NONE, DataConnectionActivity.get(0));
        assertEquals(DataConnectionActivity.IN, DataConnectionActivity.get(1));
        assertEquals(DataConnectionActivity.OUT, DataConnectionActivity.get(2));
        assertEquals(DataConnectionActivity.INOUT, DataConnectionActivity.get(3));
        assertEquals(DataConnectionActivity.DORMANT, DataConnectionActivity.get(4));
        assertEquals(DataConnectionActivity.UNKNOWN, DataConnectionActivity.get(-1));
    }

    @Test
    public void getByName() {

        assertEquals(DataConnectionActivity.NONE, DataConnectionActivity.get("none"));
        assertEquals(DataConnectionActivity.IN, DataConnectionActivity.get("IN"));
        assertEquals(DataConnectionActivity.OUT, DataConnectionActivity.get("oUT"));
        assertEquals(DataConnectionActivity.INOUT, DataConnectionActivity.get("inout"));
        assertEquals(DataConnectionActivity.DORMANT, DataConnectionActivity.get("DORMANT"));
        assertEquals(DataConnectionActivity.UNKNOWN, DataConnectionActivity.get("Unknown"));
    }

    @Test
    public void getUnknown() {

        assertEquals(DataConnectionActivity.UNKNOWN, DataConnectionActivity.get("trolololooo"));
        assertEquals(DataConnectionActivity.UNKNOWN, DataConnectionActivity.get(Integer.MAX_VALUE));
        assertEquals(DataConnectionActivity.UNKNOWN, DataConnectionActivity.get(666));
    }
}