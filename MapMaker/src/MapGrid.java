import java.util.Observable;

public class MapGrid  extends Observable{
	public static int empty = 0;
	public static int rocks = 1;
	public static int sand = 2;
	int [][] board;
	
	public MapGrid(int size){
		this.board = new int[size][size];
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y <board[x].length; y++){
				board[x][y] = empty;
			}
		}
	}
	
	public int getLocation(int x, int y){
		return board[x][y];
	}
	
	public int getGridSize(){
		return board.length;
	}
	
	public void clearGrid(){
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y <board[x].length; y++){
				board[x][y] = empty;
			}
		}
		setChanged();
		notifyObservers();
	}
	

}
