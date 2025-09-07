import java.util.*;
public class countdigits {
    public static void java(int a){
  int count=0;
  while (a>0) {
  
  count++;
   a=a/10;
  
  }
  System.out.println(count);
}
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any number");
  int a=sc.nextInt();
  java(a);
}
}
