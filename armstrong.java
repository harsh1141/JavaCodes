import java.util.*;
public class armstrong {

  
public static void harsh( int a){
int b,r,s=0;
b=a;
 while (a>0) {
     r=a%10;
     s=(r*r*r)+s;
     a=a/10;
 }
 if (b==s) {
       System.out.println("armstrong number");
 }
 else{
     System.out.println("not armstrong");
 }
}
public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a nmumber");
 int a=sc.nextInt();
 
  harsh(a);
}
}    

