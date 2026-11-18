import java.util.*;
abstract class V { private final String reg; V(String r){reg=r;} abstract double fee(int minutes); public String toString(){return getClass().getSimpleName()+"["+reg+"]";} public boolean equals(Object o){return o instanceof V && reg.equals(((V)o).reg);} public int hashCode(){return reg.hashCode();}}
class Bike extends V {Bike(String r){super(r);}@Override double fee(int m){return ((m+59)/60)*10.0;}}
class Sedan extends V {Sedan(String r){super(r);}@Override double fee(int m){return ((m+59)/60)*30.0;}}
public class Task07 {public static void main(String[] a){V b=new Bike("TN01AA"),c=new Sedan("TN02BB");System.out.println(b+" fee Rs "+b.fee(61));System.out.println(c+" fee Rs "+c.fee(61));System.out.println("Same registration objects equal? "+new Sedan("TN02BB").equals(new Bike("TN02BB")));}}
