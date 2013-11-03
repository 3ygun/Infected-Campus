package newProject;
import components.simplewriter.*;

public class Runner {
	SimpleWriter out;
	User survivor;
	CampusGrid OSU;
	
//----------------------------------------------------------------------------------------------------------------
//	Constructor
//----------------------------------------------------------------------------------------------------------------
	Runner () {
		out = new SimpleWriter1L();
		survivor = new User();
		OSU = new CampusGrid();
		
		//out.print(survivor.getName());
		
		while (survivor.isAlive()) {
            	int move = survivor.getNextMove();

            	switch (move) {
                		case 1:	nCaseOne();
                    			break;
                		case 2:	nCaseTwo();
                    			break;
                		case 3:	nCaseThree();
                				break;
                		case 4:	nCaseFour();
                    			break;
            }
        }		
	}
	
//----------------------------------------------------------------------------------------------------------------
//	Private Methods
//----------------------------------------------------------------------------------------------------------------
	private void nCaseOne() {
		int move2 = survivor.getNextMove();
		switch (move2) {
			case 1:
    				break;
			case 2:
    				break;
			case 3:
    				break;
			case 4:
    				break;
		}
	}
	
	private void nCaseTwo() {
		int move3 = survivor.getNextMove();
		switch (move3) {
			case 1:
    				break;
			case 2:
    				break;
			case 3:
    				break;
			case 4:
    				break;
		}
	}
	
	private void nCaseThree() {
		int move4 = survivor.getNextMove();
		switch (move4) {
			case 1:
    				break;
			case 2:
					break;
			case 3:
					break;
			case 4:
					break;
		}
	}
	
	private void nCaseFour() {
		int move5 = survivor.getNextMove();
        switch (move5) {
            case 1:
                	break;
            case 2:
                	break;
            case 3:
                	break;
            case 4:
                	break;
        }
	}
}

