import java.util.*;
public class Task01 {
 static class Vehicle { String regNo,type; long entryTime; Vehicle(String r,String t,long e){regNo=r;type=t;entryTime=e;} }
 public static void main(String[] a){
  Vehicle v=new Vehicle("TN01AB1111","CAR",1731900000L);
  System.out.println("Candidate classes: ParkingFacility, Floor, ParkingSlot, Vehicle, ParkingTicket, User, ParkingPass");
  System.out.println("Vehicle object: "+v.regNo+", type="+v.type+", entry="+v.entryTime);
  System.out.println("Inputs: registration, vehicle type, user/pass, entry and exit time");
  System.out.println("Outputs: allocated slot, ticket number, duration and fee");
  System.out.println("Rules: one vehicle per slot; unique ticket IDs; release only occupied slots");
  System.out.println("Alternative parallel arrays: linear search O(n), attribute addition updates another array");
  System.out.println("Object list: linear search O(n), add attribute to Vehicle class once");
 }
}