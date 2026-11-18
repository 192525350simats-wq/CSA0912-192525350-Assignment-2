public class Task02 {
 public static void main(String[] args){
  int[] slotsPerFloor={3,2,4}; String[][] slots=new String[slotsPerFloor.length][];
  for(int f=0;f<slots.length;f++) slots[f]=new String[slotsPerFloor[f]];
  int minutes=61; double hourlyRate=20.0; int billableHours=(minutes+59)/60; double fee=billableHours*hourlyRate;
  System.out.println("Representation: jagged String[][]");
  for(int f=0;f<slots.length;f++) System.out.println("Floor "+f+" slots="+slots[f].length);
  System.out.println("minutes="+minutes+", billableHours="+billableHours+", fee=Rs "+fee);
  System.out.println("Wrong integer division: 61 / 60 = "+(minutes/60)+" (undercharges)");
  System.out.println("Correct ceiling: (minutes + 59) / 60 = "+billableHours);
  System.out.println("Search time O(total slots); storage O(total slots)");
 }
}