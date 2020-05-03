package domain;

public class Main {

	public int Calculate(int[][] array) {
		
		int summ=0;
		
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summ += array[i][j];
            }
        }
        
    return summ;
    }
	
}
