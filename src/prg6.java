import java.util.Scanner;

public class prg6 {
    public static void main(String[] args) {
        int x, y, colorDepth;
        System.out.println("Input Horizontal Resolution");
        Scanner h = new Scanner(System.in);
        x = h.nextInt();
        System.out.println("Input Vertical Resolution");
        Scanner v = new Scanner(System.in);
        y = v.nextInt();
        System.out.println("Input Color Depth");
        Scanner cd = new Scanner(System.in);
        colorDepth = cd.nextInt();

        double fileSize = ((x*y) * colorDepth) / 1048576;

        System.out.println("Image Size: " + fileSize + "MB");
    }
}
