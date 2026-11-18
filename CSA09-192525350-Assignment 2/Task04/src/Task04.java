class ParkingTicket {
 private final int ticketNo; private final String regNo; private final int floor,slot;
 ParkingTicket(){this(1001,"UNKNOWN",0,0);}
 ParkingTicket(int ticketNo,String regNo){this(ticketNo,regNo,0,0);}
 ParkingTicket(int ticketNo,String regNo,int floor,int slot){if(regNo==null||regNo.isBlank())throw new IllegalArgumentException("Registration required");this.ticketNo=ticketNo;this.regNo=regNo;this.floor=floor;this.slot=slot;}
 public String toString(){return "Ticket#"+ticketNo+" "+regNo+" at ["+floor+","+slot+"]";}
}
public class Task04 { public static void main(String[] args){ ParkingTicket a=new ParkingTicket(); ParkingTicket b=new ParkingTicket(1002,"TN01AB1111"); ParkingTicket c=new ParkingTicket(1003,"TN02CD2222",1,4); System.out.println(a);System.out.println(b);System.out.println(c);System.out.println("Constructor chaining: all overloads call the full constructor");System.out.println("Objects live on heap; local references live in stack frames"); }}
