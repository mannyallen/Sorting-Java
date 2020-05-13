import java.util.*;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Double> randNumberList= new ArrayList<Double>(); //<-- makes ArrayList
        
        for(int i=0;i<100;i++) { //<-- For Loop
            randNumberList.add(i, (Math.floor(Math.random()*100)));
        }
        Collections.sort(randNumberList); // <-- Repeats through loop and compares and contrasts info from loop
        System.out.println(randNumberList);

        Collections.sort(randNumberList, Collections.reverseOrder()); // <-- This one does the same but in reverse order
        System.out.println(randNumberList);
    }
}