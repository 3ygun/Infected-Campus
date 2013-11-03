package newProject;
import components.random.Random;

public class Uncleans {
    private static Random rnd;
    private static int xBound;
    private static int yBound;
    private static int[][] uncleanCount = new int[xBound][yBound];
    private static int[][] damage = new int[xBound][yBound];

    Uncleans() {
        xBound = 2;
        yBound = 1;

        int x, y;

        for (int i = 3 * xBound * yBound; i > 0; i--) {
            x = (int) (rnd.nextDouble() * xBound);
            y = (int) (rnd.nextDouble() * yBound);
            uncleanCount[x][y]++;
        }

        for (int a = 0; a < xBound; a++) {
            for (int b = 0; b < yBound; b++) {
                damage[a][b] = 0;
            }
        }
    }

    public static void weaken(int x, int coord) {
        int b = coord % 10;
        int a = coord / 10;

        if (x == 1) {
            damage[a][b] += 10;
        } else if (x == 2) {
            damage[a][b] += 7;
        } else if (x == 3) {
            damage[a][b] += 4;
        } else {
            damage[a][b] += 1;
        }

        if (damage[a][b] >= 20) {
            uncleanCount[a][b] = 0;
        }
    }

    public static int escape(int coord) {
        int odds = 0;
        int b = coord % 10;
        int a = coord / 10;

        if (damage[a][b] < 2) {
            odds = 1;
        } else if (damage[a][b] < 5) {
            odds = 2;
        } else if (damage[a][b] < 8) {
            odds = 3;
        } else {
            odds = 4;
        }

        return odds;
    }

    public int numRemaining() {
        int remaining = 0;
        for (int a = 0; a < xBound; a++) {
            for (int b = 0; b < yBound; b++) {
                remaining++;
            }
        }
        return remaining;
    }
}