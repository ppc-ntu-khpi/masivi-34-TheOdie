package test;

import java.util.Arrays;
import domain.Main;

public class MainTest {
	
	public static void main(String[] args) {
		
		int array[][] = {
						{6,8,10}, 
						{3,4,5}
						};
		
		for(int[] i:array) {
			System.out.println(Arrays.toString(i));
		}
		
        Main calc = new Main();
        System.out.println("Sum of array elements = " + calc.Calculate(array));
	}
}
