package bike;

public class Bike {
    private int speed = 15;


    public int getSpeed() {
        return speed = speed + 1;
    }

    public boolean isOn() {
        return true;
    }

    public boolean setOn(boolean on) {
        boolean isOn;
        return isOn = on;
    }

    public boolean isOf() {
        return true;
    }

    public boolean setOf(boolean off) {
        boolean isOf;
        return isOf = off;
    }

    public int decreaseSpeed() {
//        speed =- speed;
        return speed;
    }
}
