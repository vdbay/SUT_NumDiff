import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class NumberDifferenceTest {
    private CalcNUmberDifference sut;

    @Before
    public void setUp() throws Exception {
        sut = new CalcNUmberDifference();
    }

    //P1 Validate Range N - Outside Range
    @Test
    public void validateRange_Outside(){
        boolean actual, expected;
        int n;
        n=-1;
        expected=false;

        actual=sut.validateRangeInputMaxDeret(n);

        assertEquals(expected,actual);
    }

    //P2 Validate Group 1 - Double Loop
    @Test
    public void validateGroup_1DoubleLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=2;
        deret.add(1);
        deret.add(2);

        diffExpected=1;
        stringExpected="Difference : 1\nGroup 1, Small Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    //P3 Validate Group 1 - M Loop
    @Test
    public void validateGroup_1MLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=3;
        deret.add(1);
        deret.add(2);
        deret.add(3);

        diffExpected=2;
        stringExpected="Difference : 2\nGroup 1, Small Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    //P4 Validate Group 2 - Double Loop
    @Test
    public void validateGroup_2DoubleLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=2;
        deret.add(1);
        deret.add(12);

        diffExpected=11;
        stringExpected="Difference : 11\nGroup 2, Medium Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    //P5 Validate Group 2 - M Loop
    @Test
    public void validateGroup_2MLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=3;
        deret.add(1);
        deret.add(2);
        deret.add(12);

        diffExpected=11;
        stringExpected="Difference : 11\nGroup 2, Medium Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    //P6 Validate Group 3 - Double Loop
    @Test
    public void validateGroup_3DoubleLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=2;
        deret.add(1);
        deret.add(52);

        diffExpected=51;
        stringExpected="Difference : 51\nGroup 3, Large Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    //P7 Validate Group 3 - M Loop
    @Test
    public void validateGroup_3MLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=3;
        deret.add(1);
        deret.add(2);
        deret.add(52);

        diffExpected=51;
        stringExpected="Difference : 51\nGroup 3, Large Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    //P8 Validate No Group - Single Loop
    @Test
    public void validateNoGroup_SingleLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=1;
        deret.add(1);

        diffExpected=0;
        stringExpected="Difference : 0\nNon Group, There's no difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    //P9 Validate No Group - Double Loop
    @Test
    public void validateNoGroup_DoubleLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=2;
        deret.add(1);
        deret.add(1);

        diffExpected=0;
        stringExpected="Difference : 0\nNon Group, There's no difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    //P10 Validate No Group - M Loop
    @Test
    public void validateNoGroup_MLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=3;
        deret.add(1);
        deret.add(1);
        deret.add(1);

        diffExpected=0;
        stringExpected="Difference : 0\nNon Group, There's no difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    //P11 Validate No Group - n Loop
    @Test
    public void validateNoGroup_nLoop(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=10;
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);

        diffExpected=0;
        stringExpected="Difference : 0\nNon Group, There's no difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }
}
