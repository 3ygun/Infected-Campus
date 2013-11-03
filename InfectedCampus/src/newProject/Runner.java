package newProject;
import components.simplewriter.*;

public class Runner {
	private SimpleWriter out;
	private User survivor;
	private CampusGrid OSU;

//----------------------------------------------------------------------------------------------------------------
//  Constructor
//----------------------------------------------------------------------------------------------------------------
	    Runner() {
	    	System.out.println("Made it to Runner!");
	    	
	        //this.out = new SimpleWriter1L();
	        survivor = new User();
	        OSU = new CampusGrid();

	        //out.print(survivor.getName());

	        while (this.survivor.isAlive()) {
	            int move = this.survivor.getNextMove();
	            switch (move) {
	                case 1:	this.run();
	                    	 break;
	                case 2:	this.attack();
	                    	 break;
	                case 3:	this.alert();
	                		 break;
	                case 4: this.search();
	                    	 break;
	            }
	        }
	    }

//----------------------------------------------------------------------------------------------------------------
//  Private Methods
//----------------------------------------------------------------------------------------------------------------
	    private void run() {
	        int move2 = this.survivor.getNextMove();
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

	    private void attack() {
	        int move3 = this.survivor.getNextMove();
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

	    private void alert() {
	        int move4 = this.survivor.getNextMove();
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

	    private void search() {
	        int move5 = this.survivor.getNextMove();
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


