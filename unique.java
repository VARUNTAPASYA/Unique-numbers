//import java.util.Scanner;
 import java.util.*;
 public class unique {
     public static void main (String[] args) {
          int arr[] = {1,3,5,3,6,6,4,3,8,3,3,1,1,2,3,3};
           int n = arr.length;
          int i,j;
          Arrays.sort(arr);
           for (i = 0; i < n; i++) {
              for (j = i+1; j < n; j++){
              if(arr[i]==arr[j])
              i++;
              }
              System.out.print( arr[i]+" ");
              }
           }
       }
 
