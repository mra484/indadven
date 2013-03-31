/**@author Mark Andrews
 *COP 3330-0001, 16257
 * 
 * Class for managing the state of each cave object
 */

import java.util.Random;
public class Cave {
	public static enum CaveType { OPEN, BLOCKED, PIT, TELEPORT }
	
	private int row;
	private int col;
	private CaveType state;
	private boolean occupied = false;
	private boolean marked = false;
	private int openRate = 50;
	private int blockedRate = 70;
	private int pitRate = 90;
	
		
	public Cave(int r, int c){
		row = r;
		col = c;
		
		int random;
		Random generator = new Random();
		
		random = generator.nextInt(100);
		
		//determines what type of tile the cave will be based on the instance variables
		if( random <= openRate){
			state = CaveType.OPEN;
		}else if ( random <= blockedRate){
			state = CaveType.BLOCKED;
		} else
			state = (random <= pitRate ? CaveType.PIT : CaveType.TELEPORT);	
		
		//makes sure that adventurer's initial position is open and occupied and the treasure's position is open
		if( row == 0 && col == 0){
			state = CaveType.OPEN;
			occupied = true;
		} else if ( row == 9 && col == 9)
			state = CaveType.OPEN;
		
		
		
	}
	
	//returns the row the cave object occupies
	public int getRow(){
		
		return row;
	}
	
	//returns the column the cave object occupies
	public int getCol(){
		
		return col;
	}
	
	//Changes the occupied variable based on the argument it receives
	public void setOccupied(boolean set){
		
		occupied = set;		
	}
	
	//Returns true if the cave is occupied, false otherwise
	public boolean isOccupied(){
			
		return occupied;
	}
	
	//changes whether the cave is marked based on the argument it receives
	public void setMarked(boolean set){
		
		marked = set;
	}

	//returns true if the cave is marked, false otherwise
	public boolean isMarked(){		
		
		return marked;
	}
	
	//changes the cave's state to open
	public void makeOpen(){
		state = CaveType.OPEN;
		
	}
	
	//returns true if the cave is open, false otherwise
	public boolean isOpen(){
		if( state == CaveType.OPEN)
			return true;
		
		return false;
	}
	
	//changes the cave's state to blocked
	public void makeBlocked(){
		state = CaveType.BLOCKED;
		
	}
	
	//returns true if the cave is blocked, false otherwise
	public boolean isBlocked(){
		if( state == CaveType.BLOCKED)
			return true;
		
		return false;
	}
	
	//changes the cave's state to pit
	public void makePit(){
		state = CaveType.PIT;
		
	}
	
	//returns true if the cave is a pit, false otherwise
	public boolean isPit(){
		if( state == CaveType.PIT)
			return true;
		
		return false;
	}
	
	//changes the cave's state to teleport
	public void makeTeleport(){
		state = CaveType.TELEPORT;
		
	}
	
	//returns true if the cave is a teleport, false otherwise
	public boolean isTeleport(){
		if( state == CaveType.TELEPORT)
			return true;		
		
		return false;
	}
	
}