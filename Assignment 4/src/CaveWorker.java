//Gregory Young
//COP 3330 0001
//CaveWorker Class


/*Interface for giving characters the ability to make modifications to the cave
 */

public interface CaveWorker {

	//Method making modifications to a given cave if this worker can modify this type of cave.
	boolean modifyCave(Cave loc);
	
	//Give a description of the type of modification made.
	String describeModification();
		
}
