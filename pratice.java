import java.util.*;

class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] s = input.split(",");

        int[] ele = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ele[i] = Integer.parseInt(s[i]);
        }

        int sum = 0;
        int num2 = 0;
        boolean found = false;

        for (int i = 0; i < ele.length; i++) {
            if (ele[i] == 5) {
                num2 = 5;
                i++;
                while (i < ele.length && ele[i] != 8) {
                    num2 = num2 * 10 + ele[i];
                    i++;
                }
                if (i < ele.length && ele[i] == 8) {
                    num2 = num2 * 10 + 8;
                    found = true;
                } else {
                    System.out.println("-1");
                    return;
                }
            } else {
                sum += ele[i];
            }
        }

        if (found)
            System.out.println(sum + num2);
        else
            System.out.println("-1");
    }
}
