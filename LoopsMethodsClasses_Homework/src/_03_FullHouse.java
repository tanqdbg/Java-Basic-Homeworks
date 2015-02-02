// Write a program to generate and print all full houses and print their number
 
public class _03_FullHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] faceCards = { "2", "3", "4", "5", "6", "7", "8", "9","10","J", "Q", "K", "A"};
												 

		String[] suitCards = { "\u2663", "\u2666", "\u2665", "\u2660" };
int counter = 0;
		for (int i1 = 0; i1 < faceCards.length; i1++) {

			for (int s1 = 0; s1 < suitCards.length; s1++) {
				for (int s2 = s1+1; s2 < suitCards.length; s2++) {
					for (int s3 = s2+1; s3 < suitCards.length; s3++) {

						for (int i2 = 0; i2 < faceCards.length; i2++) {
							
							for (int k1 = 0; k1 < suitCards.length; k1++) {
								for (int k2 = k1+1; k2 < suitCards.length; k2++) {
									
									if (i1 != i2) {
										counter++;

										System.out.printf(
												"(%1$s%2$s %1$s%3$s %1$s%4$s ",
												faceCards[i1], suitCards[s1],suitCards[s2], suitCards[s3]);
																								
										System.out.printf(
												"%1$s%2$s %1$s%3$s) ",
												faceCards[i2], suitCards[k1],
												suitCards[k2]);
										System.out.println();

									}
								}
							}

						}
					}

				}
			}
		}
		System.out.println(counter);
	}
}
