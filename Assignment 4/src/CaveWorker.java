public interface CaveWorker {

	//Method making modifications to a given cave if this worker can modify this type of cave.
	boolean modifyCave(Cave loc);
	
	//Give a description of the type of modification made.
	String describeModification();
		
}
