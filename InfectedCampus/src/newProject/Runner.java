package newProject;
import java.util.ArrayList;

import components.random.Random;
import components.random.Random1L;
import components.simplewriter.*;

public class Runner {
    SimpleWriter out;
    User survivor;
    CampusGrid OSU;
    int[] itemCount = new int[5];

//----------------------------------------------------------------------------------------------------------------
//  Constructor
//----------------------------------------------------------------------------------------------------------------
    Runner() {
        this.out = new SimpleWriter1L();
        this.survivor = new User();
        this.OSU = new CampusGrid();

        for (int i = 0; i < 5; i++) {
            this.itemCount[i] = 0;
        }

        //out.print(survivor.getName());

        while (this.survivor.isAlive()) {
            int move = this.survivor.getNextMove();

            switch (move) {
                case 1:
                    this.run();
                    break;
                case 2:
                    this.attack();
                    break;
                case 3:
                    ArrayList<String> newItems = this.search();
                    for (int x = 0; x < newItems.size(); x++) {
                        if (newItems.get(x).equals("gloves")) {
                            this.itemCount[0]++;
                        } else if (newItems.get(x).equals("bat")) {
                            this.itemCount[1]++;
                        } else if (newItems.get(x).equals("knife")) {
                            this.itemCount[2]++;
                        } else if (newItems.get(x).equals("gun")) {
                            this.itemCount[3]++;
                        } else {
                            this.itemCount[4]++;
                        }
                    }
                    break;
            }
        }
    }

//------------------------------------------------------------------------------
//  Private Methods
//------------------------------------------------------------------------------
    private void attack() {
        int itemUsed = this.survivor.getNextMove();
        switch (itemUsed) {
            case 1:
                this.itemCount[0]--;
                Uncleans.weaken(1, this.OSU.getCoord());
                break;
            case 2:
                this.itemCount[1]--;
                Uncleans.weaken(2, this.OSU.getCoord());
                break;
            case 3:
                this.itemCount[2]--;
                Uncleans.weaken(3, this.OSU.getCoord());
                break;
            case 4:
                this.itemCount[3]--;
                Uncleans.weaken(4, this.OSU.getCoord());
                break;
            case 5:
                this.itemCount[4]--;
                break;
            default:
                this.survivor.died();
                break;
        }
        int escapeOdds = Uncleans.escape(this.OSU.getCoord());
        int liveOrDie = (int) (this.rnd.nextDouble() * 10);
        switch (escapeOdds) {
            case 1:
                if (liveOrDie > 2) {
                    this.survivor.died();
                }
                break;
            case 2:
                if (liveOrDie > 4) {
                    this.survivor.died();
                }
                break;
            case 3:
                if (liveOrDie > 7) {
                    this.survivor.died();
                }
                break;
            case 4:
                if (liveOrDie > 9) {
                    this.survivor.died();
                }
                break;
        }
    }

    private void run() {
        int move3 = this.survivor.getNextMove();
        switch (move3) {
            case 1:
                this.OSU.changeCoord(0);
                break;
            case 2:
                this.OSU.changeCoord(1);
                break;
            case 3:
                this.OSU.changeCoord(2);
                break;
            case 4:
                this.OSU.changeCoord(3);
                break;
        }
    }

    private ArrayList<String> search() {
        Random rnd = new Random1L();

        int itemNum = (int) rnd.nextDouble() * 2;

        Items inventory = new Items();
        ArrayList<String> itemsFound = inventory.Items(itemNum);

        return itemsFound;
    }
}



