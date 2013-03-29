
public class Adventurer extends Character{
	private String name = "Adventurer";
	
	 public Adventurer(Cave initLoc){
		 super(initLoc);
		 
		 
	 }
	 
	 public boolean modifyCave(Cave loc){
		 if( loc.isTeleport() ){
			 loc.setMarked(true);
			 return true;
		 }
		 return false;
	 }
	 
	 
	 public String describeModification(){
		 
		 
		 return String.format("%s discovered and marked a teleporter!", name);
	 }
	 
	 public boolean move(Cave to){
		 if( !(to.isOccupied()) && !(to.isBlocked()) ){
			 location = to;
			 return true;
		 }
		 
		 return false;
	 }
	 
	 
	 public String getName(){
		 
		 
		 return name;
	 }
}
