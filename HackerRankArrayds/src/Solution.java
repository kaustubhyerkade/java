import java.awt.*;
import java.util.*;

class Solution{

    public static void main(String args[])
    {
     
    Scanner sc =new Scanner(System.in);
    int len = sc.nextInt();
    int[] array = new int[len];

    for(int i=0;i<len;i++)
    {
       array[i]=sc.nextInt();   
    }

    for(int j=len-1;j>=0;j--)
    {
        System.out.print(array[j]+" ");
    }


    }   


}