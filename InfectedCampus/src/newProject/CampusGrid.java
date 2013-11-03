package newProject;

import components.random.*;

public class CampusGrid {
	private static Build grid;
	private static Random rnd;
	private static int myCoord;
	//private static final int[][] gridCords = new int[10][5];	*9  and *4
	
	
//----------------------------------------------------------------------------------------------------------------
//	Constructors
//----------------------------------------------------------------------------------------------------------------
	CampusGrid() {
		rnd = new Random1L();
		genCoordHackaThon();
		/*
		 * for (int x=0; x<10; x++) {
			for (int y=0; y<5; y++) {
				gridCords[x][y] = x * 10 + y;
			}
		}
		*/
		
		//this.grid = new Build();
	}

//----------------------------------------------------------------------------------------------------------------
//	Public Methods
//----------------------------------------------------------------------------------------------------------------
	public static int getCoord() {
		return myCoord;
	}
	
	public static String getCharCoord() {
		return (""+(char)((int)(myCoord/10)+65)+""+(myCoord%10+1));
	}
	
	public static void changeCord(int direction) {
		switch (direction) {
			case 0:		myCoord = getCoord()-1;
						 break;
			case 1:		myCoord = getCoord()+10;
						 break;
			case 2:		myCoord = getCoord()+1;
						 break;
			case 3:		myCoord = getCoord()-10;
						 break;
		}			
	}
	
	public static void dispLocation() {
		switch (myCoord) {
			case 32:	D3Grid d3Grid = new D3Grid();
						grid = new Build(d3Grid);
						break;
			case 42:	E3Grid e3Grid = new E3Grid();
						grid = new Build(e3Grid);
						break;
		}				
	}

	
	
//----------------------------------------------------------------------------------------------------------------
//	PRIVATE METHODS
//----------------------------------------------------------------------------------------------------------------
	private static void genCoord() {
		myCoord = ((int)(rnd.nextDouble()*9)*10) + (int)(rnd.nextDouble()*4);
	}
	
	private static void genCoordHackaThon() {
		if (5 > (int)(rnd.nextDouble()*10))
			myCoord = 32;
		else
			myCoord = 42;		
	}
}
