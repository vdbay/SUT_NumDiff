import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class NumberDifferenceTest {
    private CalcNUmberDifference sut;

    /**
     * Setup = inisiasi sebelum test dijalankan, preparation object
     * --> pay attention to keep components and test cases small,
     * --> the trade-off seems acceptable.
     * --> implicit setup can be used to deine the fixture common for all tests.
     * --> Small in-line and delegate setup statements may supplement ..
     *     the speciic preconditions on per-test basis.
     * */
    @Before
    public void setUp() throws Exception {
        sut = new CalcNUmberDifference();
    }

    //P1-1 Range N Tidak Valid Batas Bawah
    @Test
    public void testInputNBilLuarRangeBatasBawah_01() {
        // (1) setup (arrange, build)
        int jumlahDeretBil;
        boolean actual, expected;
        jumlahDeretBil = 0; // bukan berada pada range 1-10
        expected = false;

        // (2) exercise (act, operate)
        actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    //P1-2 Range N Tidak Valid Batas Atas
    @Test
    public void testInputNBilLuarRangeBatasAtas_01() {
        // (1) setup (arrange, build)
        int jumlahDeretBil;
        boolean actual, expected;
        jumlahDeretBil = 11; // bukan berada pada range 1-10
        expected = false;

        // (2) exercise (act, operate)
        actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    //P2-1 Group 1 Batas Bawah
    @Test
    public void testGroup1BatasBawah_01(){
        int selisih=1;
        String actual, expected;
        expected="Difference : 1\nGroup 1, Small Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P2-2 Group 1 Batas Bawah
    @Test
    public void testGroup1BatasBawah_02(){
        int selisih=2;
        String actual, expected;
        expected="Difference : 2\nGroup 1, Small Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P2-3 Group 1 Batas Atas
    @Test
    public void testGroup1BatasAtas_01(){
        int selisih=9;
        String actual, expected;
        expected="Difference : 9\nGroup 1, Small Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P2-4 Group 1 Batas Atas
    @Test
    public void testGroup1BatasAtas_02(){
        int selisih=10;
        String actual, expected;
        expected="Difference : 10\nGroup 1, Small Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P3-1 Group 2 Batas Bawah
    @Test
    public void testGroup2BatasBawah_01(){
        int selisih=11;
        String actual, expected;
        expected="Difference : 11\nGroup 2, Medium Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P3-2 Group 2 Batas Bawah
    @Test
    public void testGroup2BatasBawah_02(){
        int selisih=12;
        String actual, expected;
        expected="Difference : 12\nGroup 2, Medium Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P3-3 Group 2 Batas Atas
    @Test
    public void testGroup2BatasAtas_01(){
        int selisih=49;
        String actual, expected;
        expected="Difference : 49\nGroup 2, Medium Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P3-4 Group 2 Batas Atas
    @Test
    public void testGroup2BatasAtas_02(){
        int selisih=50;
        String actual, expected;
        expected="Difference : 50\nGroup 2, Medium Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P4-1 Group 3 Batas Bawah
    @Test
    public void testGroup3BatasBawah_01(){
        int selisih=51;
        String actual, expected;
        expected="Difference : 51\nGroup 3, Large Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P4-2 Group 3 Batas Bawah
    @Test
    public void testGroup3BatasBawah_02(){
        int selisih=52;
        String actual, expected;
        expected="Difference : 52\nGroup 3, Large Difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P5 No Group 0x Loop
    @Test
    public void testNoGroup(){
        int selisih=0;
        String actual, expected;
        expected="Difference : 0\nNon group, There's no difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }

    //P6 No Group 1x Loop
    @Test
    public void testNoGroup(){
        int selisih=0;
        String actual, expected;
        expected="Difference : 0\nNon group, There's no difference";

        actual=sut.groupingDifference(selisih);

        assertEquals(expected,actual);
    }
/////////////////////////////////////////////////////



}
