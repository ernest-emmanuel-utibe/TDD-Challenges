package aircondition;

public class AirCondition {

    private boolean airConditionTurnedOn;
    private boolean airConditionTurnedOff;
    private int increaseAirConditionTemperature;
    private int decreaseAirConditionTemperature;


    public boolean isAirConditionTurnedOn() {
        return airConditionTurnedOn;
    }

    public void setAirConditionTurnedOn(boolean airConditionTurnedOn) {
        this.airConditionTurnedOn = airConditionTurnedOn;
    }

    public boolean isAirConditionTurnedOff() {
        return airConditionTurnedOff;
    }

    public void setAirConditionTurnedOff(boolean airConditionTurnedOff) {
        this.airConditionTurnedOff = airConditionTurnedOff;
    }

    public int getIncreaseAirConditionTemperature() {
        return increaseAirConditionTemperature;
    }

    public void setIncreaseAirConditionTemperature(int increaseAirConditionTemperature) {
        this.increaseAirConditionTemperature = increaseAirConditionTemperature;
    }

    public int getDecreaseAirConditionTemperature() {
        return decreaseAirConditionTemperature;
    }

    public void setDecreaseAirConditionTemperature(int decreaseAirConditionTemperature) {
        this.decreaseAirConditionTemperature = decreaseAirConditionTemperature;
    }
}
