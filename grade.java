
import java.util.*;
 public class grade {
public static void main(String[] args) {
    

    Scanner sc= new Scanner (System.in);
    System.out.println("enter any number");
    int a = sc.nextInt();
    
    double percentage=a/100.0;  
   
if (percentage>=0.90) {
    System.out.println(" Grade A");
}
else if (percentage>=0.80) {
    System.out.println("Grade B"); 
}
else if (percentage>=0.70) {
    System.out.println("Grade c"); 
}  
else if (percentage>=0.60) {
    System.out.println("Grade D");
}  
else if (percentage<0.40) {
    System.out.println("grade F");
}  
 }
 }