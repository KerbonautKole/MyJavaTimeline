public class main {
	public static void main(String[] args) {
		System.out.println("Map Test.");
		for (int i = 0; i < map.grid.length; i++) {
			for (int j = 0; j < map.grid[i].length; j++) {
				System.out.print(map.grid[i][j]);
			}
			System.out.println();
		}
	}
}