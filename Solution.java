import java.util.Scanner;

public class Solution {

public static void main(String args[]){ 
 Scanner scan = new Scanner (System.in);
 System.out.println("Enter an Element in List 1: ");
 int n=scan.nextInt();
 System.out.println("Enter All Element in List 1: ");
 int arr[]=new int[n];
for(int i=0; i<n; i++){
arr[i]=scan.nextInt();
}
System.out.println("Enter an Element in List 2: ");
int m=scan.nextInt();
System.out.println("Enter All Element in List 2: ");
 int arr1[]=new int[m];
 for(int j=0; j<m; j++){
     arr1[j]=scan.nextInt();
 }
 for(int i=0; i<n; i++){
     int j;
     for(j=0; j<m; j++)
         if(arr[i]==arr1[j])
            break;
         if(j==m && i==n)
             System.out.print(arr[i] + " "); 
             }
}     
}
