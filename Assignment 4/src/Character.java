/*Class for managing the location and movement of characters
 */

public abstract class Character implements CaveWorker {
	
	
//Class to store information about a general game character. Implements the 
//CaveWorker class which defines special operations on a cave, depending on the type of character.
	
	protected Cave location;
	//The Cave that this character is occupying.
	
	public Character(Cave initLoc){
	//Construct a new character at the initial location. Marks this location as occupied.
		location = initLoc;
	}
		
	public Cave getLocation(){
	//Get the Cave this character is occupying.
				
		return location;
	}
	
	
	
	public boolean move(Cave to){
	//Move this character from his/her current location to the new location. Marks the old spot 
	//as unoccupied and the new spot as occupied. Assumes that new location can be moved to by this character.
		
		location.setOccupied(false);
		location = to;
		location.setOccupied(true);
		
		return true;
	}
	
	public abstract String getName();
		

}
