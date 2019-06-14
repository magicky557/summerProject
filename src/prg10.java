import java.util.Scanner;

public class prg10 {
    public static void main(String[] args) {
        int inp;
        do{
            System.out.println("Input a twos compliment decimal number");
            Scanner in = new Scanner(System.in);
            inp = in.nextInt();
            if ((inp >= -128)&&(inp<=127)) {
                System.out.println("IN RANGE");
            } else {
                System.out.println("OVERFLOW");
            }
        } while (inp != 0);
    }
}
