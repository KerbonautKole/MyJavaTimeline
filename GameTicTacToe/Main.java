import java.util.Scanner ;

public class Main {
	static int p1x;
	static int p1y;
	static int p2x;
	static int p2y;
	static int turn = 0;
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		Boolean game = true;
		System.out.println("Welcome to Tic-Tac-Toe");
		while (game) {
			turn = 0;
			drawBoard();
			checkWin();
			turn = 1;
			inputCoords();
			convertCoords();
			updateBoard();
			System.out.println("------------------------------------------------");
			drawBoard();
			checkWin();
			turn = 2;
			inputCoords();
			convertCoords();
			updateBoard();
			System.out.println("------------------------------------------------");
		}
//		System.out.print(p1x + p2x + p1y + p2y);
//		System.out.print(p1x + ", ");
//		System.out.print(p1y + ", ");
//		System.out.print(p2x + ", ");
//		System.out.print(p2y);
		
	}
	static void drawBoard() {
		for (int i = 0; i < Board.grid.length; i++) {
			for (int j = 0; j < Board.grid[i].length; j++) {
				System.out.print(Board.grid[i][j]);
			}
			System.out.println();
		}
	}
	static void inputCoords() {
	
		if (turn == 1) {
			System.out.print("Player 1 X: ");
			p1x = scanner.nextInt();
			System.out.print("Player 1 Y: ");
			p1y = scanner.nextInt();
			
		}
		if (turn == 2) {
			System.out.print("Player 2 X: ");
			p2x = scanner.nextInt();
			System.out.print("Player 2 Y: ");
			p2y = scanner.nextInt();
			
		}
		
	}
	static void convertCoords() {
		if (p1x == 1) {
			p1x = 1;
		} else if (p1x == 2) {
			p1x = 3;
		} else if (p1x == 3) {
			p1x = 5;
		}
		
		if (p2x == 1) {
			p2x = 1;
		} else if (p2x == 2) {
			p2x = 3;
		} else if (p2x == 3) {
			p2x = 5;
		}
		
		if (p1y == 1) {
			p1y = 1;
		} else if (p1y == 2) {
			p1y = 3;
		} else if (p1y == 3) {
			p1y = 5;
		}
		
		if (p2y == 1) {
			p2y = 1;
		} else if (p2y == 2) {
			p2y = 3;
		} else if (p2y == 3) {
			p2y = 5;
		}
		
	}
	static void updateBoard() {
		if (turn == 1) {
			if (Board.grid[p1y][p1x] != 'X') {
				Board.grid[p1y][p1x] = 'X';
			} else {
				System.out.println("X already placed there. Restart the game.");
			}
		}
		if (turn == 2) {
			if (Board.grid[p2y][p2x] != 'O') {
				Board.grid[p2y][p2x] = 'O';
			} else {
				System.out.println("O already placed there. Restart the game.");
			}
		}
	}
	static void checkWin() {
		for (int i = 1; i <= 5; i += 2) {
			//horiz
			if (Board.grid[i][1] != ' ' && Board.grid[i][1] == Board.grid[i][3] && Board.grid[i][1] == Board.grid[i][5]) {
				System.out.println(Board.grid[i][1] + " wins!");
				System.exit(0);
			}
			//vert
			if (Board.grid[1][i] != ' ' && Board.grid[1][i] == Board.grid[3][i] && Board.grid[1][i] == Board.grid[5][i]) {
				System.out.println(Board.grid[1][i] + " wins!");
				System.exit(0);
			}
			//neg diag
			if(Board.grid[1][1] != ' ' && Board.grid[1][1] == Board.grid[3][3] && Board.grid[1][1] == Board.grid[5][5]) {
				System.out.println(Board.grid[1][1] + " wins!");
				System.exit(0);
			}
			//pos diag
			if(Board.grid[5][1] != ' ' && Board.grid[5][1] == Board.grid[3][3] && Board.grid[5][1] == Board.grid[1][5]) {
				System.out.println(Board.grid[5][1] + " wins!");
				System.exit(0);
			}
		}
	}
}