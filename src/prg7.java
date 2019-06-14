import java.util.Scanner;

public class prg7 {
    public static void main(String[] args) {
        float[] mark = new float[10];
        int i;
        float total = 0;
        int passes = 0;
        int fails = 0;
        for(i = 0; i < 10; i++) {
            System.out.println("Enter Grade #" + (i+1));
            Scanner in = new Scanner(System.in);
            mark[i] = in.nextFloat();
            total += mark[i];
            System.out.println(isPass(mark[i]));
            if (isPass(mark[i]).equals("Passed.")) {
                passes++;
            } else {
                fails++;
            }
        }
        double avg = total / 10;
        System.out.println("Average: " + avg);
        System.out.println("Passes: " + passes);
        System.out.println("Fails: " + fails);
    }

    private static String isPass(float x) {
        if (x >= 50) {
            return "Passed.";
        }
        return "Failed.";
    }
}