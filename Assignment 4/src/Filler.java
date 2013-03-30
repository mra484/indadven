public class Filler extends Character{
	private String name = "Filler";
	
	public Filler(Cave initLoc){
		super(initLoc);
	//Attempt to modify the cave at the given location. Fillers modify a cave by filling in a pit.
		
		
		
	}
	
	public boolean modifyCave(Cave loc){
		if( loc.isPit() ){
			 loc.setMarked(true);
			 loc.makeOpen();
			 return true;
			 
		 }
		
			
		return false;
	}
	
	public String describeModification(){
		
	
		return String.format("%s it was a pit, it was filled in", name);
	}

	public boolean move(Cave to){
	//Override of the move method from the Character class. This method checks to see if the 
	//Filler can actually move to this new location. If so, it should make a call to the move 
	//method in the super class (which actually performs the move). If not, simply return false.	
		
		 if( !(to.isOccupied()) && !(to.isBlocked()) ){
			 location = to;
			 return true;
		 }
		 
		 return false;
		
	
	//Returns:
		//True if the Filler can move in this new spot, false otherwise.	
		
		
		
	}
	
	public String getName(){
		
		
		
		
		return name;
	}
		
	

}
