package game;

public class Launcher  {
	public static void main(String[] args) {
		//create a new game with thread
		Game game1= new Game ( "Tetris-1");
		game1.start();
		Game game2= new Game ( "Tetris-1");

		game2.start();

	}
}
