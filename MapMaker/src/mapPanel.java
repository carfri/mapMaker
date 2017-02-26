import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;


public class mapPanel extends JPanel implements Observer{
	private final int GRID_BOX_SIZE = 50;
	private MapGrid grid;
	
	public mapPanel(MapGrid grid){
		this.grid = grid;
		grid.addObserver(this);
		Dimension d = new Dimension(grid.getGridSize()*GRID_BOX_SIZE+1, grid.getGridSize()*GRID_BOX_SIZE+1);
		this.setMinimumSize(d);
		this.setPreferredSize(d);
		this.setBackground(Color.WHITE);
	}
	
	public int[] getGridPosition(int x, int y){
		int x_ = (int) Math.ceil(x / GRID_BOX_SIZE);
		int y_ = (int) Math.ceil(x / GRID_BOX_SIZE);
		int[] gridPos = new int[2];
		gridPos[0] = x_;
		gridPos[2] = y_;
		return gridPos;
	}

	@Override
	public void update(Observable o, Object arg) {
		this.repaint();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		paintGridSquare(g);
		paintRocks(g);
		paintSand(g);
	}
	
	private void paintGridSquare(Graphics g){
		int x = GRID_BOX_SIZE;
		int y = GRID_BOX_SIZE;
		g.setColor(Color.BLACK);
		for(int e = 0; e <= grid.getGridSize(); e++){
			g.drawLine(e * x, 0, e * x, grid.getGridSize() * y);
			g.drawLine(0, e * x, grid.getGridSize() * y, e * x);

		}
	}
	
	private void paintRocks(Graphics g){
		
	}
	
	private void paintSand(Graphics g){
		
	}
	
	

}
