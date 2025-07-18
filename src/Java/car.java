package Java;

public class car {

    int speed = 20  ;
    void move ()
    {
        System.out.println("care speed is " + speed + "km/hr");
    }
class vehicle extends car {
        String model1 ;
String brand = "peugeut" ;
    @Override
    void move() {
        System.out.println(model1 + "is driving at " + speed + "km/hr");
        System.out.println("car brand is " + brand );
    }
}
}
