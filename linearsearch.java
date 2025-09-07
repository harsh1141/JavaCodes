import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
int target=3;
         int arr[]=new int[5];
   Scanner sc=new Scanner(System.in);
   System.out.println("enter array elements");

   for(int i=0;i<5;i++){
 arr[i]=sc.nextInt(); 
   }
   for(int i=0;i<5;i++){
    if (arr[i]==target) {
    System.out.println("yes");
   }
   else{
    System.out.println("");
   }
   }
  
    }
}
