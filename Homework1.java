import java.math.BigInteger;
import java.util.Arrays;

public class Homework1 {

    public static void main(String[] args) {
        // тут можете тестировать ваш код

        convert(10);
        System.out.println(normalize(721));
        System.out.println(max(10, 12, -14));
        System.out.println(fact(12));
        System.out.println(fact(BigInteger.valueOf(30)));
        multiplTable();
        System.out.println(average(1, 2, 3, 4, 5, 6, 7));
        System.out.println(isMagicSquare(new int[][]{
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}}));
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 5})));
        System.out.println(Arrays.toString(sort(new int[]{2, 1, 45, 34, 12, 2})));
        System.out.println(Arrays.toString(removeExtra(new int[]{2, 1, 45, 2, 34, 1, 12, 2}, 2)));
    }

    // task 1
    static void convert(int arg) {
        System.out.println(Integer.toBinaryString(arg));
        System.out.println(Integer.toOctalString(arg));
        System.out.println(Integer.toHexString(arg));
    }


    // task 2
    static int normalize(int angle) {
        angle %= 360;
        angle += 360;
        angle %= 360;
        return angle;
    }


    // task 3
    static int max(int x, int y, int z) {
        if(x >= y && x >= z){
            return x;
        }else if(y >= x && y >= z){
            return y;
        }else{
            return z;
        }
    }


    // task 4
    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }else{
            int m = n * fact(n - 1);
            return m;
        }
    }


    // task 5
    static BigInteger fact(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) == 0 || n.compareTo(BigInteger.ZERO) == 0){
            return n;
        }else{
            return n.multiply(fact(n.subtract(BigInteger.valueOf(1))));
        }
    }

    // task 6
    static void multiplTable() {
        for(int i =0; i < 10; ++i){
            for(int j = 0; j < 10; ++j){
                System.out.print(i + " x " + j + " = " + (i*j) + "    ");
            }
            System.out.println("");
        }
    }


    // task 7
    static double average(int... nums) {
        int len = nums.length;
        if(len==0){
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < len; ++i){
            sum += nums[i];
        }
        return sum / len;
    }


    // task 8
    static boolean isMagicSquare(int[][] square) {
        boolean a = true;
        int rem = 0;
        int len = square.length;
        for(int i = 0; i < len; ++i){
            int sum = 0;
            for(int j = 0; j < len; ++j){
                sum += square [i][j];
            }
            if(rem == 0){
                rem = sum;
            }else if(rem != sum){
                return false;
            }
        }
        for(int i = 0; i < len; ++i){
            int sum = 0;
            for(int j = 0; j < len; ++j){
                sum += square [j][i];
            }
            if(rem != sum){
                return false;
            }
        }
        int sum = 0;
        for(int i = 0; i < len; ++i){
            sum += square[i][i];
        }if(rem != sum){
            return false;
        }
        sum = 0;
        for(int i = 0; i < len; ++i){
            sum += square[i][len - 1-i];
        }if(rem != sum){
            return false;
        }
        return a;
    }


    // task 9
    static int[] reverse(int[] arr) {
        int l = arr.length;
        int mid = (l+1)/2;
        for(int i = 0; i < mid; ++i){
            int temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        return arr;
    }


    // task 10
    static int[] sort(int[] arr) {
        boolean t = true;
        int len = arr.length;
        while(t){
            t = false;
            for(int i = 0; i < len-1; ++i){
                if(arr[i] > arr[i + 1]){
                    int r = arr[i + 1];
                    arr[i + 1]=arr[i];
                    arr[i] = r;
                    t = true;
                }
            }
        }
        return arr;
    }


    // task 11
    static int[] removeExtra(int[] arr, int n) {
        int len = arr.length;
        int k = 0;
        for(int i = 0; i < len; ++i){
            if(arr[i] != n){
                ++k;
            }
        }
        int[] res = new int[k];
        int m = 0;
        for(int i = 0; i < len; ++i){
            if(arr[i]!=n){
                res[m]=arr[i];
                ++m;
            }
        }
        return res;
    }
}
