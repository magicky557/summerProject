import java.util.Scanner;

public class prg2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int total = 0;
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Input value " + (i + 1));
            Scanner in = new Scanner(System.in);
            num[i] = in.nextInt();
            total += num[i];
        }
        double avg = total / 5;
        System.out.println("Sum of Elements: " + total);
        System.out.println("Average of Elements: " + avg);
    }
}
