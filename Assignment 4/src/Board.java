
public class Board {

	public Board(int rows, int cols){
		
		
	}
	
	public Cave getCave(int r, int c){
		Cave tempCave = new Cave(r, c);
		
		return tempCave;
	}
	
	public boolean ok(int r, int c){
		
		
		return true;
	}
	
	public Cave getUnoccupiedOpenLocation(){
		Cave tempCave = new Cave(1,1);
		
		return tempCave;
	}
	
	
}
