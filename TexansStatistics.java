/*
 * @Title: TexansStatistics
 * @Purpose: To get familiar with single dimensional arrays
 * @Author: Zamzow, Avery
 * @Date:4/3/15
 * @Version: 1.0
 */
import java.util.Scanner;
public class TexansStatistics {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		final int Array_Size = 8;

		int[] TexansScore = new int[Array_Size];
		int[] OpponentScore = new int[Array_Size];
	
		System.out.println("Enter a series of " + TexansScore.length + " scores that the texans scored");
		for (int index = 0; index < TexansScore.length; index++) {
			System.out.println("Enter score " + (index + 1) + ": ");
			TexansScore[index] = sc.nextInt();
		}
		System.out.println("Enter a series of " + OpponentScore.length + " scores that the opponents scored");
		for (int index1 = 0; index1 < OpponentScore.length; index1++) {
			System.out.println("Enter score " + (index1 + 1) + ": ");
			OpponentScore[index1] = sc.nextInt();
		}
		//compare the scores and see who won
		int win = 0 ;
		for (int index1 = 0; index1 < OpponentScore.length; index1++) {
			if (TexansScore[index1] > OpponentScore[index1]) {
				win++;
			}
		}
		System.out.println("Winning Percentage is :" + (100*((double)win/TexansScore.length)) + "%");
	 	 
		int highest = TexansScore[0];
		int gameNumber = 0;
		for (int index1 = 0; index1 < (TexansScore.length); index1++) {
			if (TexansScore[index1] > highest){
				highest = TexansScore[index1];
				gameNumber = index1;
			}
		}
		System.out.println("Highest Houston Texans Score was " + highest + " in the game # " + (gameNumber+1));
		
		int highestCombinedScores = TexansScore[0] + OpponentScore[0];
		int gameNumber1 = 0;
		for (int index1 = 0; index1 < (TexansScore.length) ; index1++) {
			if (TexansScore[index1] + OpponentScore[index1] > highestCombinedScores){
				highestCombinedScores = TexansScore[index1] + OpponentScore[index1];
				gameNumber1 = index1;
			}
		}
		System.out.println("The total score of the highest scored game was " + highestCombinedScores + " in the game # " + (gameNumber1+1));
	}//end of main	
}// end of class
