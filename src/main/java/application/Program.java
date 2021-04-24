package application;

public class Program {

    public static void main(String[] args) {
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new StandardSensor(3));
        ka.addSensor(new StandardSensor(7));
        System.out.println(ka.readings());

    }

}
