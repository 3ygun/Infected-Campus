package newProject;
import java.util.ArrayList;
import components.random.Random;
import components.random.Random1L;

public class Items {
    private static ArrayList<String> items = new ArrayList<String>();

    public ArrayList<String> Items(int num) {
        Random rnd = new Random1L();
        for (int i = 0; i < num; i++) {
            int foo = (int) (rnd.nextDouble() * 100);
            if (foo >= 0 && foo < 35) {
                items.add("gloves");
            } else if (foo >= 35 && foo < 65) {
                items.add("bat");
            } else if (foo >= 65 && foo < 85) {
                items.add("knife");
            } else if (foo >= 85 && foo < 95) {
                items.add("gun");
            } else {
                items.add("cure");
            }
        }
        return items;
    }
}