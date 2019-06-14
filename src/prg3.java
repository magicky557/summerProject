import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
        double length, width, height;
        System.out.println("Input Length");
        Scanner l = new Scanner(System.in);
        length = l.nextDouble();
        System.out.println("Input Width");
        Scanner w = new Scanner(System.in);
        width = w.nextDouble();
        System.out.println("Input Height");
        Scanner h = new Scanner(System.in);
        height = h.nextDouble();

        double res = length * width * height;
        System.out.println("Area of room: " + res);
    }
}
