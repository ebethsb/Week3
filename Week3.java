package wk3;

import java.util.ArrayList;
import java.util.Arrays;

public class Week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		System.out.println(ages[ages.length - 1] - ages[0]);
		int[] newArray = { 3, 9, 23, 64, 2, 8, 28, 93, 13 };
		System.out.println(newArray[newArray.length - 1] - newArray[0]);

		int length = newArray.length;
		int sum = 0;
		for (int i = 0; i < newArray.length; i++) {
			sum += newArray[i];

		}
		double ave = sum / length;
		System.out.println(ave);

		String[] names = new String[] { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int countedLength = 0;
		for (String word : names) {
			countedLength += word.length();
		}
		System.out.println(countedLength / names.length);

		for (int i = 0; i < names.length; i++) {
			System.out.println(
					names[0] + " " + names[1] + " " + names[2] + " " + names[3] + " " + names[4] + " " + names[5]);

			int[] nameLengths = new int[names.length];
			for (int i1 = 0; i1 < names.length; i1++) {
				nameLengths[i1] = names[i1].length();
			}
			System.out.println(Arrays.toString(nameLengths));

		   
			   
			   
			
				
				

			}

		}
	}

}
