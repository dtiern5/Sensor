package application;

import java.util.ArrayList;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        sensors.get(0).setOff();
    }

    @Override
    public int read() {
        if (this.isOn() == false || sensors.isEmpty()) {
            throw new IllegalStateException("Can't read unless all sensors are on");
        }
        int sum = 0;
        int count = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
            count++;
        }
        return sum / count;

    }

}
