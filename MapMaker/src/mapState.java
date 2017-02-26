import java.util.Observer;
import java.util.Observable;

public class mapState extends Observable implements Observer {
	
	// Map variables
	private final int temp_DEFAULT_SIZE = 15;
	private MapGrid mapGrid;

	public mapState(){
		mapGrid = new MapGrid(temp_DEFAULT_SIZE);
	}
	
	public MapGrid getMapGrid(){
		return mapGrid;
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
