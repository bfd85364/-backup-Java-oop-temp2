/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysizecompare;
import java.util.*;
public class ArraySizeCompare {
    public static void main(String[] args) {
        int n;
        Scanner kb=new Scanner (System.in);
        System.out.println("Enter the size of the array");
         n=kb.nextInt();
         int[] myarr= new int[n];
         System.out.println("enter the elements of array");
         for(int i=0; i<n; i++)
          myarr[i]=kb.nextInt();
       System.out.println("the max value is:" + max(myarr));
        for(int i=n; i>0; i--)
            //if using min//
            myarr[i]=kb.nextInt();
        System.out.println("ther min value is:" + min(myarr));
    }
    public static int max(int[]arr){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    } //if using max//
    public static int min(int[]arr){
        int min=arr.length;
        for(int i=arr.length; i>0; i--){
            if(arr[i]<min)
                min=arr[i];
        }
    return min;
}
}
