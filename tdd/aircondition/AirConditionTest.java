package aircondition;

import org.junit.jupiter.api.*;

class AirConditionTest {
    AirCondition test = new AirCondition();

    @BeforeEach
    void setUp() {

    }

    @Test
    public void testThatTheAirConditionIsTurnedOn() {

        Assertions.assertFalse(test.isAirConditionTurnedOn());
    }

    @Test
    public void testThatTheAirConditionIsTurnedOff() {
        Assertions.assertFalse(test.isAirConditionTurnedOn());

        Assertions.assertFalse(test.isAirConditionTurnedOff(), "true");
    }

    @Test
    public void testThatTheAirConditionCanIncreaseTemperatureInARoom() {
        Assertions.assertFalse(test.isAirConditionTurnedOn());

        test.setIncreaseAirConditionTemperature(17);
        Assertions.assertEquals(17, test.getIncreaseAirConditionTemperature());
    }

    @Test
    public void testThatTheAirConditionCanDecreaseTemperatureInARoom() {
        Assertions.assertFalse(test.isAirConditionTurnedOn());

        test.setDecreaseAirConditionTemperature(16);
        Assertions.assertEquals(16, test.getDecreaseAirConditionTemperature());
    }
}