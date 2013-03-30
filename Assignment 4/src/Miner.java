
public class Miner extends Character {
	private String name = "Miner";
	
	public Miner(Cave initLoc){
		super(initLoc);
		
		
	}
	
	public boolean modifyCave(Cave loc){
		if( loc.isBlocked() ){
			 loc.makeOpen();
			 return true;
		 }
		 
		return false;
	}
	
	public String describeModification(){
		
		
		return String.format("%s it was a mine, it was mined open", name);
	}
	
	public boolean move(Cave to){
		 if( !(to.isOccupied()) ){
			 super.move(to);
			 return true;
		 }
		
		
		return false;
	}
	
	
	public String getName(){
		
		
		
		return name;
	}
	

	
	
}
