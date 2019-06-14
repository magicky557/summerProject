import java.util.Scanner;

public class prg11 {
    public static void main(String[] args) {
        int choice;
        double val;
        double res;
        do {
            System.out.println("1. Inches to cm\n2. Degrees to Fahrenheit\n3. Miles to KM\n4. Quit");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a Value");
                    Scanner inch = new Scanner(System.in);
                    val = inch.nextDouble();
                    res = val * 2.54;
                    System.out.println(res);
                    break;
                case 2:
                    System.out.println("Enter a Value");
                    Scanner deg = new Scanner(System.in);
                    val = deg.nextDouble();
                    res = (val * 9/5)+32;
                    System.out.println(res);
                    break;
                case 3:
                    System.out.println("Enter a Value");
                    Scanner mile = new Scanner(System.in);
                    val = mile.nextDouble();
                    res = val * 1.609;
                    System.out.println(res);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } while (choice != 4);
    }
}
