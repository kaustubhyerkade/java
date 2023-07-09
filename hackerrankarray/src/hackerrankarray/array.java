package hackerrankarray;

import java.util.*;


public class array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}