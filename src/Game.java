import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c1 = "test";
		Random r = new Random();

		int c = r.nextInt(2) ;

		if (c == 0) {
		
		c1 = "rock";
		}
		if (c == 1) {
		
		c1 = "sissor";
		}
		if (c == 2) {
	
		c1 = "paper";
		}
		Scanner game = new Scanner(System.in);

		System.out.println("please enter r for rock s for sissor p for paper");

		char y = game.next().charAt(0);
		System.out.println("Computer Generates\n 0===>>rock\n" + " 1===>>sissor\n" + " 2==>>paper \n");
		System.out.println("computer played **" + c +"**" + "or"+ "**"+ c1 + "**" + " " + "you played " + "**" + y + "**");

		if ((c == 1 && y == 'p') || (c == 2 && y == 'r') || (c == 0 && y == 's')) {
			System.out.println("compter won");
		}

		else if ((c == 0 && y == 'p') || (c == 1 && y == 'r') || (c == 2 && y == 's')) {
			System.out.println("you won");
		}

		else if ((c == 0 && y == 'r') || (c == 1 && y == 's') || (c == 2 && y == 'p')) {
			System.out.println("its a draw");
		}

		else {
			System.out.println("please enter a correct letter");
		}
	}

}
