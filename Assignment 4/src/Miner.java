//Gregory Young
//COP 3330 0001

//extends character
public class Miner extends Character {
	private String name = "Miner";
	//set the name
	
	//set the location 
	public Miner(Cave initLoc){
		super(initLoc);
		
		
	}
	
	//modifiy postition in cave
	public boolean modifyCave(Cave loc){
		if( loc.isBlocked() ){
			 loc.makeOpen();
			 return true;
		 }
		 
		return false;
	}
	
	//method to print string of whats happening
	public String describeModification(){
		
		
		return String.format("%s it was a mine, it was mined open", name);
	}
	
	//method to handle moving the character
	public boolean move(Cave to){
		 if( !(to.isOccupied()) ){
			 super.move(to);
			 return true;
		 }
		
		
		return false;
	}
	
	//method to retrieve the name
	public String getName(){
		
		
		
		return name;
	}
	

	
	
}
