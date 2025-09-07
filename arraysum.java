import java.util.*;
public class arraysum {
public static void main(String[] args) {
   
   int sum=0;
   int arr[]=new int[5];
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array elements");
  
   for(int i=0;i<5;i++){
arr[i]=sc.nextInt();
   }
   for(int i=0;i<5;i++){
    sum=sum+arr[i];
   }
   System.out.println(sum);
   
}
}
