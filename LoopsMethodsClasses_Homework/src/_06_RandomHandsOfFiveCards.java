//Write a program to generate n random hands of 5 different cards form a standard suit of 52 cards

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOfFiveCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String[] faceCards = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K", "A" };
		String[] suitCards = { "\u2663", "\u2666", "\u2665", "\u2660" };
		ArrayList<String> card = new ArrayList<String>();

		for (int s1 = 0; s1 < suitCards.length; s1++) {
			for (int i1 = 0; i1 < faceCards.length; i1++) {
				card.add(faceCards[i1] + suitCards[s1]);
			}
		}
		Random rnd = new Random();

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(card.get(rnd.nextInt(card.size())));
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}

//
// Scanner input = new Scanner(System.in);
// System.out.print("Input number of hand: ");
// int hand = input.nextInt();
// String[] face = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10",
// "J", "Q", "K", "A" };
// String[] suit = new String[] { "♣", "♦", "♥", "♠" };
// Random rnd = new Random();
//
// for (int i = 0; i < hand; i++) {
// for (int j = 0; j < 5; j++) {
// String card = face[rnd.nextInt(13)] + suit[rnd.nextInt(4)];
// System.out.printf("%4s", card);
// }
// System.out.println();
// }
// }
// }
