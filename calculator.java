 import java.util.Scanner;
import java.util.*;
 public class calculator {

public static void main(String[] args) {
    

 Scanner sc = new Scanner(System.in);
  int a,b;
  
  
    int calc=sc.nextInt();
 switch (calc) {
   case 1:
     System.out.println("enter numbers to add:");
     a= sc.nextInt();
     b= sc.nextInt();
     System.out.println(a+b);
    break;
   case 2:
     System.out.println("enter numbers to substract:");
     a= sc.nextInt();
     b= sc.nextInt();
     System.out.println(a-b);
     break;
      
    case 3:
       System.out.println("enter numbers to multiply:");
       a= sc.nextInt();
       b= sc.nextInt();
   System.out.println(a*b);
   break;
    
     case 4:
     System.out.println("enter numbers to divide:");
     a= sc.nextInt();
     b= sc.nextInt();
     System.out.println(a/b);
     break;
 }   
}
 }

