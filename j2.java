import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for jagged array: ");
        int nr = sc.nextInt();

        int[][] ja = new int[nr][];

        for (int i = 0; i < nr; i++) {
            System.out.println("Enter the number of columns in row " + i + ": ");
            int nc = sc.nextInt();
            ja[i] = new int[nc];

            for (int j = 0; j < nc; j++) {
                System.out.println("Enter element at [" + i + "][" + j + "]: ");
                ja[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < ja.length; i++) {
            for (int j = 0; j < ja[i].length; j++) {
                System.out.print(ja[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}