package day12;

public class Game_369 {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			int x = i / 10;
			int y = i % 10;
			
			if (y == 0) {
				if ((x == 3) | (x == 6)|(x == 9)) {
					System.out.println("짝");
				}else {
					System.out.println(i);
				}
				
			}else {
				if ((x == 3) | (x == 6)|(x == 9)) {
					if ((y == 3)|(y == 6)|(y == 9)){
						System.out.print("짝짝"+"	");
					}else {
				}
				
			}
			
		}

	}
}
