import java.io.*;
import java.util.*;

public class Solution {
public static void countSort(int array[],int n){
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++)
    {
        if (array[i] < min)
        {
            min = array[i];
        }
        if (array[i] > max)
        {
            max = array[i];
        }
    }
    int[] counts = new int[max - min + 1];
    for (int i = 0; i < array.length; i++)
    {
        counts[array[i] - min]++;
    }

    int k = 0;
    for (int j = min; j <=max; j++)
    {
        for (int i = 0; i < counts[j - min]; i++)
        {
            array[k++] = j;
        }
    }
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        countSort(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
