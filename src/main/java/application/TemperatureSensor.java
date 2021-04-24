package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean onStatus;
    
    public TemperatureSensor() {
        this.onStatus = false;
    }
    
    @Override
    public boolean isOn() {
        return onStatus;
    }

    @Override
    public void setOn() {
        onStatus = true;
    }

    @Override
    public void setOff() {
        onStatus = false;
    }

    @Override
    public int read() {
        if (onStatus == true) {
            return new Random().nextInt(61)-30;
        } else {
            throw new IllegalStateException("Temperature sensor is off");
        }
    }

}