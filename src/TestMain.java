package TestMain;

import domain.Main;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        int[] array1 = {15, 10, 47, 5, 10, 28};
        System.out.println(Arrays.toString(array1));
        System.out.println(Main.Calc(array1));
    }
}