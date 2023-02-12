 import java.util.Scanner;
 import java.util.*;
 public class unique {
     public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
         int a,arr[],n;
         int i,j;
         a=sc.nextInt();  
         arr=new int[a];
          n = arr.length;
          for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
          }
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
 
