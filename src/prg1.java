import java.util.Scanner;

public class prg1 {
    public static void main(String[] args) {
        String name, surname, eMail;
        int telNum, dobDay, dobMonth, dobYear;

        System.out.println("Input Name");
        name = readString();
        System.out.println("Input Surname");
        surname = readString();
        System.out.println("Input Telephone Number");
        telNum = readInt();
        System.out.println("Input Year of birth");
        dobYear = readInt();
        System.out.println("Input Month of birth (1-12)");
        dobMonth = readInt();
        System.out.println("Input Day of birth");
        dobDay = readInt();
        System.out.println("Input Email Address");
        eMail = readString();

            System.out.println("\nName: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Birthday(dd/MM/YYYY): " + dobDay + "/" + dobMonth + "/" + dobYear);
            System.out.println("Telephone Number: " + telNum);
            System.out.println("Email Address: " + eMail);

    }

    private static String readString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static int readInt() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
