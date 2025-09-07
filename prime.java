
import java.util.*;
public class prime {
    public static void himalay(int a){
int count=0,i,r;

 for(i=1;i<=a;i++){
 if (a%i==0) {
    count++;
  }
}
if (count==2) {
    System.out.println("prime number");
}
else{
    System.out.println("not prime");
}
}
public static void main(String[]args){
   System.out.println("enter any number");
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 himalay(a);
}
}
