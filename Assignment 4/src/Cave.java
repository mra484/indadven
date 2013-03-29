import java.util.Random;
public class Cave {
	public static enum CaveType { OPEN, BLOCKED, PIT, TELEPORT;
	
	}
	
	private int row;
	private int col;
	private CaveType state;
	private boolean occupied = false;
	private boolean marked = false;
	private int openRate = 50;
	private int blockedRate = 70;
	private int pitRate = 90;
	private int Teleport = 100;
	
		
	public Cave(int r, int c){
		row = r;
		col = c;
		
		int random;
		Random generator = new Random();
		
		random = generator.nextInt(100);
		
		if( random <= openRate){
			state = CaveType.OPEN;
		}else if ( random <= blockedRate){
			state = CaveType.BLOCKED;
		} else
			state = (random <= pitRate ? CaveType.PIT : CaveType.TELEPORT);	
		
		if( row == 0 && col == 0)
			state = CaveType.OPEN;
		
	}
	
	public int getRow(){
		
		return row;
	}
	
	public int getCol(){
		
		return col;
	}
	
	public void setOccupied(boolean set){
		occupied = set;
		
	}
	
	public boolean isOccupied(){
		
		
		return occupied;
	}
	
	public void setMarked(boolean set){
		marked = set;
		
		
	}
	
	public boolean isMarked(){
		
		
		return marked;
	}
	
	
	public void makeOpen(){
		state = CaveType.OPEN;
		
	}
	
	public boolean isOpen(){
		if( state == CaveType.OPEN)
			return true;
		
		return false;
	}
	
	public void makeBlocked(){
		state = CaveType.BLOCKED;
		
	}
	
	public boolean isBlocked(){
		if( state == CaveType.BLOCKED)
			return true;
		
		return false;
	}
	
	
	public void makePit(){
		state = CaveType.PIT;
		
	}
	
	
	public boolean isPit(){
		if( state == CaveType.PIT)
			return true;
		
		return false;
	}
	
	
	public void makeTeleport(){
		state = CaveType.TELEPORT;
		
	}
	
	
	public boolean isTeleport(){
		if( state == CaveType.TELEPORT)
			return true;		
		
		return false;
	}
	
}