import java.util.Scanner;

public class prg4 {
    public static void main(String[] args) {
        double mass, acc;
        System.out.println("Input Mass");
        Scanner in = new Scanner(System.in);
        mass = in.nextDouble();
        System.out.println("Input Acceleration");
        Scanner in2 = new Scanner(System.in);
        acc = in2.nextDouble();

        double F = mass * acc;
        System.out.println("Answer is: " + F + "N");
    }
}
