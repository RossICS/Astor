/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alphaorder;
import java.util.Scanner;

 /**
  * Determines the alphabetical order of two strings.
  */
 public class AlphaOrder {

	public static void main(String[] args) {
		String word1, word2;
		Scanner input = new Scanner (System.in);
				
		System.out.print("Enter a word: ");
		word1 = input.nextLine();
		System.out.print("Enter a second word: ");
		word2 = input.nextLine();
		input.close();
		
		if (word1.compareToIgnoreCase(word2) == 0) {
			System.out.println("Words are equal.");
		} else if (word1.compareToIgnoreCase(word2) < 0) {
			System.out.println("In alphabetical order: " + word1 + " " + word2);
		} else {
			System.out.println("In alphabetical order: " + word2 + " " + word1);
		}
	}

}
