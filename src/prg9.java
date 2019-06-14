import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class prg9 {
    public static void main(String[] args) {
        LinkedList<Float> marks = new LinkedList<>();
        float mark;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter Mark #" + i);
            Scanner in = new Scanner(System.in);
            mark = in.nextFloat();
            marks.add(mark);
        }
        Collections.sort(marks);
        System.out.println("Marks sorted smalled to Highest: " + marks);
        System.out.println("Highest Mark: " + marks.getLast());
        System.out.println("Lowest Mark: " + marks.getFirst());
    }
}
