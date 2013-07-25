import java.awt.Point;

public class Tetromino
{
	public Point position;
	public Tetribit[][] tetribits;
	
	public Tetromino()
	{
		position = new Point(4, -3);
		tetribits = new Tetribit[2][3];
		
		tetribits[0][0] = new Tetribit(0, 255, 0);
		tetribits[0][1] = new Tetribit(0, 255, 0);
		tetribits[1][1] = new Tetribit(0, 255, 0);
		tetribits[1][2] = new Tetribit(0, 255, 0);
	}
	
	public void drop()
	{
		position.y++;
	}
	
	public void shiftleft()
	{
		position.x--;
	}
	
	public void shiftright()
	{
		position.x++;
	}
}