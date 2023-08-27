package bike;

import bike.Bike;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class BikeTest {

    @Test
    public void testThatTheBikeIsOff() {
        Bike testingThatTheBikeIsOn = new Bike();
        assertTrue("true",testingThatTheBikeIsOn.setOn(true));

        Bike testingThatTheBikeIsOff = new Bike();
        assertTrue(testingThatTheBikeIsOff.isOf());
    }

    @Test
    public void testThatTheBikeIsOn() {
        Bike testingThatTheBikeIsOff = new Bike();
        assertTrue(testingThatTheBikeIsOff.setOf(true));

        Bike testingThatTheBikeIsOn = new Bike();
        assertTrue("true", testingThatTheBikeIsOn.isOn());
    }

    @Test
    public void testThatTheBikeCanAccelerateByOne() {
                Bike testingThatTheBikeCanAccelerateByOne = new Bike();
        assertEquals(16, testingThatTheBikeCanAccelerateByOne.getSpeed());
    }

    @Test
    public void testThatTheBikeCanDecelerateByOne() {
        Bike testingThatTheBikeCanAccelerateByOne = new Bike();
        assertEquals(16, testingThatTheBikeCanAccelerateByOne.getSpeed());

        Bike testingThatTheBikeCanDecreaseByOne = new Bike();
        assertEquals(15, testingThatTheBikeCanDecreaseByOne.decreaseSpeed());
    }


}