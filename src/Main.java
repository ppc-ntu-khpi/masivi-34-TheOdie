package domain;

public class Main {
    public static int Calc(int[] array1) {
        int[] array = {15, 10, 47, 5, 10, 28};
          int sum = 0;
          for( int num : array) {
              sum = sum + num;
          }
        return sum;
    }
}
