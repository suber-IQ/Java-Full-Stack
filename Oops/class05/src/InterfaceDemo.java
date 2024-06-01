
interface VechileInterface{
    public int calculateSpeed(); //public abstract
    int a = 10; //public static final
}

class Truck implements VechileInterface{
    @Override
    public int calculateSpeed() {
        return 60;
    }
}
class Car implements VechileInterface{
    @Override
    public int calculateSpeed() {
        return 80;
    }
}
class SportCar implements VechileInterface{
    @Override
    public int calculateSpeed() {
        return 180;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        VechileInterface sb = new SportCar();
        VechileInterface truck = new Truck();
        VechileInterface car = new Car();
        System.out.println("Speed of sport car = " + sb.calculateSpeed());
        System.out.println("Speed of truck = " + truck.calculateSpeed());
        System.out.println("Speed of car = " + car.calculateSpeed());
    }
}
