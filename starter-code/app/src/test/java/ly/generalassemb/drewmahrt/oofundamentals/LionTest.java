package ly.generalassemb.drewmahrt.oofundamentals;


import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by TuckingFypos on 7/13/16.
 */
public class LionTest {

    Lion testLion = new Lion(true);

    public void shouldMakeNoise() throws Exception{
        String expectedResult = "Roar!!!";
        String actualResult = testLion.makeNoise();
        assertEquals(expectedResult, actualResult);
    }

    public void shouldIsAlpha() throws Exception{
        boolean expectedResult = true;
        boolean actualResult = testLion.isAlpha();
        assertEquals(expectedResult, actualResult);
    }

    public void shouldGetLegs() throws Exception{
        int expectedResult = 4;
        int actualResult = testLion.getNumLegs();
        assertEquals(expectedResult, actualResult);
    }

    public void shouldGetTopSpeed() throws Exception{
        int expectedResult = 50;
        int actualResult = testLion.getTopSpeed();
        assertEquals(expectedResult, actualResult);
    }

    public void shouldGetEndangered() throws Exception{
        boolean expectedResult = false;
        boolean actualResult = testLion.isEndangered();
        assertEquals(expectedResult, actualResult);
    }

    public void shouldGetName() throws Exception{
        String expectedResult = "Lion";
        String actualResult = testLion.getName();
        assertEquals(expectedResult, actualResult);
    }
}
