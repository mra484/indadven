import java.util.Random;
public class Board {
	private int rows;
	private int cols;
	private Cave[][] map;

	public Board(int rows, int cols){
		this.rows = rows;
		this.cols = cols;

		map = new Cave[rows][cols];
		
		for(int y = 0 ; y < cols ; y++)
		{
			for(int x = 0 ; x < rows ; x++)
			{
				map[x][y] = new Cave(x,y);
			}
		}		
	}
	
	public Cave getCave(int r, int c){
		return map[r][c];
	}
	
	public boolean ok(int r, int c){
		if(r >= 0 && r <= rows-1 && c <= cols-1 && c >= 0)
			return true;
		
		return false;
	}
	
	public Cave getUnoccupiedOpenLocation(){
		int x = 0, y = 0;
		boolean check = false;
		Random generator = new Random();
		
		while( check == false){
			x = generator.nextInt(rows);
			y = generator.nextInt(cols);
		
			check = !(map[x][y].isOccupied());
			if( check == true)
				check = map[x][y].isOpen();
		}
		
		return map[x][y];
	}
	
	
}
