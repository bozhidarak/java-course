package task2;

import java.util.Arrays;

public class WeatherForecast {

    public static int[] getsWarmerIn(int[] temperatures) {
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length - 1; i++) {
            int j = i + 1;
            while (temperatures[i] >= temperatures[j]) {
                if (j + 1 == temperatures.length) {
                    j = 0;
                    break;
                }
                j++;
            }
            if (j == 0) res[i] = 0;
            else res[i] = j - i;
        }
        return res;
    }


    public static void main(String[] args){

        System.out.printf("%s%n", Arrays.toString(getsWarmerIn(new int[]{2,3,4})));
        System.out.printf("%s%n", Arrays.toString(getsWarmerIn(new int[]{3,4,5,1,-1,2,6,3})));
        System.out.printf("%s%n", Arrays.toString(getsWarmerIn(new int[]{3,4,5,6})));
        System.out.printf("%s", Arrays.toString(getsWarmerIn(new int[]{3,6,9})));
    }
}
