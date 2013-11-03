package newProject;

import components.random.*;

public class CampusGrid {
	private static Build grid;
	private static Random rnd;
	private static int myCord;
	//private static final int[][] gridCords = new int[10][5];	*9  and *4
	
	CampusGrid() {
		rnd = new Random1L();
		genCordHackaThon();
		/*
		 * for (int x=0; x<10; x++) {
			for (int y=0; y<5; y++) {
				gridCords[x][y] = x * 10 + y;
			}
		}
		*/
		
		//this.grid = new Build();
	}
	
	public String getCord() {
		return (""+(char)((int)(myCord/10)+65)+""+(myCord%10+1));
	}
	
	public void dispLocation() {
		switch (myCord) {
			case 32:	D3Grid d3Grid = new D3Grid();
						this.grid = new Build(d3Grid);
						break;
			case 42:	E3Grid e3Grid = new E3Grid();
						this.grid = new Build(e3Grid);
						break;
		}
				
		
				
	}

	
	
//------------------------------------------------------------------------------------------------------------------------------------------
//	PRIVATE METHODS
//------------------------------------------------------------------------------------------------------------------------------------------
	private static void genCord() {
		myCord = ((int)(rnd.nextDouble()*9)*10) + (int)(rnd.nextDouble()*4);
	}
	
	private static void genCordHackaThon() {
		if (5 > (int)(rnd.nextDouble()*10))
			myCord = 32;
		else
			myCord = 42;		
	}
}
