package parking.app;
import parking.model.ParkingSlot;import parking.service.ParkingService;
public class Main {public static void main(String[] args){ParkingSlot slot=new ParkingSlot(0,5);ParkingService service=new ParkingService();System.out.println("Park accepted: "+service.park(slot,"TN10XY1234"));System.out.println(slot);System.out.println("Second vehicle accepted: "+service.park(slot,"TN11ZZ9999"));System.out.println("Exit accepted: "+service.leave(slot));System.out.println("Exit again: "+service.leave(slot));}}
