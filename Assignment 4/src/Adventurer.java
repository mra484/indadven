/**@author Mark Andrews
 *COP 3330-0001, 16257
 *
 * Class for managing the Adventurer's attributes 
 */


public class Adventurer extends Character{
	private String name = "Adventurer";
	
	 public Adventurer(Cave initLoc){
		 super(initLoc);
	 }
	 
	 //sets cave as marked if it was a teleport
	 public boolean modifyCave(Cave loc){
		 if( loc.isTeleport() ){
			 loc.setMarked(true);
			 return true;
		 }
		 return false;
	 }
	 
	 //returns a message when the Adventure modifies a cave
	 public String describeModification(){	 
		 
		 return String.format("%s discovered and marked a teleporter!", name);
	 }
	 
	 //checks if the new location is occupied or blocked before moving
	 public boolean move(Cave to){
		 if( !(to.isOccupied()) && !(to.isBlocked()) ){
			 super.move(to);
			 return true;
		 }
		 
		 return false;
	 }
	 
	 //returns the name of the character
	 public String getName(){
		 
		 return name;
	 }
}
