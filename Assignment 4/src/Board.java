/**@author Mark Andrews
 *COP 3330-0001, 16257
 * 
 * This class is for generating a 2d array of cave objects, making sure moves are within the 
 * bounds of the 2d array, and finding an unoccupied space.
 */

import java.util.Random;
public class Board {
	private int rows;
	private int cols;
	private Cave[][] map;

	public Board(int rows, int cols){
		this.rows = rows;
		this.cols = cols;

		map = new Cave[rows][cols];
		
		//generates a cave object for every space on the map
		for(int y = 0 ; y < cols ; y++)
		{
			for(int x = 0 ; x < rows ; x++)
			{
				map[x][y] = new Cave(x,y);
			}
		}
		
	}
	
	//returns the cave object at the coordinates it receives
	public Cave getCave(int r, int c){
		return map[r][c];
	}
	
	
	//determines if a move is within the bounds of the 2d array
	public boolean ok(int r, int c){
		if(r >= 0 && r <= rows-1 && c <= cols-1 && c >= 0)
			return true;
		
		return false;
	}
	
	//finds an unoccupied spot on the board
	public Cave getUnoccupiedOpenLocation(){
		int x = 0, y = 0;
		boolean check = false;
		Random generator = new Random();
		
		while( check == false){
			x = generator.nextInt(rows);
			y = generator.nextInt(cols);
		
			//checks if a spot is occupied and open
			check = ( !(map[x][y].isOccupied() ) && ( map[x][y].isOpen() ) );
		}
		
		return map[x][y];
	}	
}
