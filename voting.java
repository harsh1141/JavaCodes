import java.util.*;
public class voting {
    public static void main(String[] args) {
       int age;
 System.out.println("enter any age");
 Scanner sc=new Scanner(System.in);
  age=sc.nextInt();  
 if (age>=18) {
  System.out.println("eligible for voting");
 }
 else{
  System.out.println("not eligible");
 }  
    }

    
}
