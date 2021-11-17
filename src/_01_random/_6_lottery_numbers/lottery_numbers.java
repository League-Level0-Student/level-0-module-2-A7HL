/**
 * 
 */
/**
 * @author tjhl8
 *
 */
package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers {
	public static void main(String[] args) {
	//	int A = 0;
	//	Random R = new Random ();
		//A = R.nextInt(100);
	//	System.out.println(A);
		int[] lotteryNums = new int[6];
		for (int i =0; i < 6; i++) {
			int A = 0;
			Random R = new Random ();
			lotteryNums[i] = R.nextInt(100);
			System.out.println(A);
		}
	String lottery =
			String.format("%s ",lotteryNums[0]) +
			String.format("%s ",lotteryNums[1]) +
			String.format("%s ",lotteryNums[2]) +
			String.format("%s ",lotteryNums[3]) +
			String.format("%s ",lotteryNums[4]) +
			String.format("%s ",lotteryNums[5]);
	JOptionPane.showMessageDialog(null, lottery);
	}
}