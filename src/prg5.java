import java.util.Scanner;

public class prg5 {
    public static void main(String[] args) {
        double mass, volume, density;
        System.out.println("Enter Mass");
        Scanner m = new Scanner(System.in);
        mass = m.nextDouble();
        System.out.println("Enter Volume");
        Scanner v = new Scanner(System.in);
        volume = v.nextDouble();
        density =  mass / volume;
        System.out.println("Density: " + density);
    }
}
