class BaseVehicle { String reg; BaseVehicle(String r){reg=r;System.out.println("BaseVehicle constructor: "+r);} }
class Car extends BaseVehicle { Car(String r){super(r);System.out.println("Car constructor");} }
class ElectricCar extends Car { ElectricCar(String r){super(r);System.out.println("ElectricCar constructor");} }
class TwoWheeler extends BaseVehicle { TwoWheeler(String r){super(r);System.out.println("TwoWheeler constructor");} }
public class Task06 {public static void main(String[] args){System.out.println("Hierarchy: Vehicle -> Car -> ElectricCar; Vehicle -> TwoWheeler");new ElectricCar("TN03EV1234");}}
