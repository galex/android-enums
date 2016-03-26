package il.co.galex.android.enums.test.telephony;

import il.co.galex.android.enums.telephony.DataActivity;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Data Activity Test
 * @author Alexander Gherschon
 */
public class DataActivityTest {

    @Test
    public void getValue() {

        assertEquals(DataActivity.NONE.get(), 0);
        assertEquals(DataActivity.IN.get(), 1);
        assertEquals(DataActivity.OUT.get(), 2);
        assertEquals(DataActivity.INOUT.get(), 3);
        assertEquals(DataActivity.DORMANT.get(), 4);
        assertEquals(DataActivity.UNKNOWN.get(), -1);
    }

    @Test
    public void getByOrdinal() {

        assertEquals(DataActivity.NONE, DataActivity.get(0));
        assertEquals(DataActivity.IN, DataActivity.get(1));
        assertEquals(DataActivity.OUT, DataActivity.get(2));
        assertEquals(DataActivity.INOUT, DataActivity.get(3));
        assertEquals(DataActivity.DORMANT, DataActivity.get(4));
        assertEquals(DataActivity.UNKNOWN, DataActivity.get(-1));
    }

    @Test
    public void getByName() {

        assertEquals(DataActivity.NONE, DataActivity.get("none"));
        assertEquals(DataActivity.IN, DataActivity.get("IN"));
        assertEquals(DataActivity.OUT, DataActivity.get("oUT"));
        assertEquals(DataActivity.INOUT, DataActivity.get("inout"));
        assertEquals(DataActivity.DORMANT, DataActivity.get("DORMANT"));
        assertEquals(DataActivity.UNKNOWN, DataActivity.get("Unknown"));
    }

    @Test
    public void getUnknown() {

        assertEquals(DataActivity.UNKNOWN, DataActivity.get("trolololooo"));
        assertEquals(DataActivity.UNKNOWN, DataActivity.get(Integer.MAX_VALUE));
        assertEquals(DataActivity.UNKNOWN, DataActivity.get(666));
    }
}