import java.util.*;
public class integers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        int maxN=0;
        for(int i=0;i<n;i++){
            ar.add(s.nextInt());
            maxN = Math.max(maxN,ar.get(i));
        }
        ArrayList<Integer> missedElse = new ArrayList<>();
        for (int i =0;i<=maxN;i++) {
            if(!ar.contains(i)) {
                 missedElse.add(i); }        
        }
        if(missedElse.size() != 0)System.out.println(missedElse.size() + "  numbers are missed. That are:" +missedElse);
        else System.out.println("No missing numbers");
        s.close();
    }
}
