import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prg8 {
    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int input;
        for (int i = 0; i < 10; i++) {
            System.out.println("Input value #" + (i+1));
            Scanner in = new Scanner(System.in);
            input = in.nextInt();

            if ((input % 2) == 0) {
                even.add(input);
            } else {
                odd.add(input);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        System.out.println("Even: ");
        System.out.println("\t" + even);
        System.out.println("Odd: ");
        System.out.println("\t" + odd);
    }
}
