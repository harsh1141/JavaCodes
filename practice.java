   import java.util.Scanner;
import java.util.*;
 public class practice {

    // Scanner sc= new Scanner (System.in);
    // System.out.println("enter any number");
    // int a = sc.nextInt();
    
//     double percentage=a/100.0;  
   
// if (percentage>=0.90) {
//     System.out.println(" Grade A");
// }
// else if (percentage>=0.80) {
//     System.out.println("Grade B"); 
// }
// else if (percentage>=0.70) {
//     System.out.println("Grade c"); 
// }  
// else if (percentage>=0.60) {
//     System.out.println("Grade D");
// }  
// else if (percentage<0.40) {
//     System.out.println("grade F");
// }  



// int a,b,r,s=0;
// Scanner what=new Scanner(System.in);
// System.out.println("enter any number");
// a=what.nextInt();
// b=a;
// while (a>0) {
//     r=a%10;
//     s=s*10+r;
//     a=a/10;
// }
// if (b==s) 
//     {
//     System.out.println("palindrome");
// }
// else{
//     System.out.println("not palindrome");
// }

//armstrong with function
// public static void harsh( int a){
// int b,r,s=0;
// b=a;
//  while (a>0) {
//      r=a%10;
//      s=(r*r*r)+s;
//      a=a/10;
//  }
//  if (b==s) {
//        System.out.println("armstrong number");
//  }
//  else{
//      System.out.println("not armstrong");
//  }
// }
// public static void main(String []args){
//   Scanner sc=new Scanner(System.in);
//   System.out.println("enter a nmumber");
//  int a=sc.nextInt();
 
//   harsh(a);
// }


//prime number with function
// public static void himalay(int a){
// int count=0,i,r;

//  for(i=1;i<=a;i++){
//  if (a%i==0) {
//     count++;
//   }
// }
// if (count==2) {
//     System.out.println("prime number");
// }
// else{
//     System.out.println("not prime");
// }
// }
// public static void main(String[]args){
//    System.out.println("enter any number");
//  Scanner sc=new Scanner(System.in);
//  int a=sc.nextInt();
//  himalay(a);
// }


// int a,r;
// System.out.println("enter any number");
// Scanner sc=new Scanner(System.in);
// a=sc.nextInt();
// while (a>0) {
//     r=a%10;
//     System.out.println("reversed order is:  "+r);
//     a=a/10;  
// }

// public static void hero(int a){
// int r,sum=0;
 
//  while (a>0) {
//     r=a%10;
//     sum=sum+r;
//     a=a/10;
//  }
//   System.out.println(sum);
// }
// public static void main(String []args){
//   System.out.println("enter any number");
//  Scanner sc=new Scanner(System.in);
//   int a=sc.nextInt();
//  hero(a);
  
public static void gf(int a){
  int count=0;
  while (a>0) {
  //  r=a%10;
  count++;
   a=a/10;
  
  }
  System.out.println(count);
}
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any number");
  int a=sc.nextInt();
  gf(a);
}



// }

//     System.out.println(" not a right choice");
// }
// for loop
//  for(int i=1;i<=10;i++){
//       System.out.println(i);
//   }
//while loop
//  int i=1;
//  while (i<=10) {
//      System.out.println(i);
//     i=i+1;
//  }
//do while loop
//  int i=1;
//  do{
//      System.out.println(i);
//      i= i+1;
//  }while(i<=10);

//  int age;
//  System.out.println("enter any age");
//  Scanner sc=new Scanner(System.in);
//  int age=sc.nextInt();  
//  if (age>=18) {
//   System.out.println("eligible for voting");
//  }
//  else{
//   System.out.println("not eligible");
//  }
// public static void taukif(){
    
//   for(int i=1;i<21;i++)
//   if (i%2==0) {
//     System.out.println();
//     System.out.println(i + " even");
  
//   }
//   else{
//     System.out.println();
//     System.out.println(i + " odd");
//   }
// }
// public static void main(String[] args) {
//   taukif();
// }

// star pattern
// public static void main(String[] args) {
//    int i,j;
//    for(i=1;i<=4;i++){
//       for(j=1;j<=i;j++){
  
// System.out.print("*");
//    }   
   
//    System.out.println();
//     }

// }
// }

// star pattern
// public static void main(String[] args) {
//    int i,j;
//    for(i=4;i>=1;i--){
//       for(j=1;j<=i;j++){
  
// System.out.print("*");
//    }   
   
//    System.out.println();
//     }

// }
// }

//star pattern
// public static void main(String[] args) {
//    int i,j;
//    for(i=1;i<=4;i++){
//       for(j=1;j<=i;j++){
  
// System.out.print("*");
//    }   
   
//    System.out.println();
//     }

//    for(i=4;i>=1;i--){
//       for(j=1;j<=i;j++){
  
// System.out.print("*");
//    }   
   
//    System.out.println();
//     }

// }
// }

//star pattern
// public static void main(String[] args) {
//    int i,j,k;
//    for(i=1;i<=4;i++){
//       for(j=3;j>=i;j--){
//       System.out.print(" ");
//       }
//       for(k=1;k<=i;k++){
//          System.out.print("*");
//       }
//       System.out.println();
//    }
// }
//  }

//star pattern
// public static void main(String[] args) {
//    int i,j,k;
//    for(i=1;i<=4;i++){
//       for(j=2;j<=i;j++){
//          System.out.print(" ");
//       }
//       for(k=4;k>=i;k--){
//          System.out.print("*");
         
//       }
//       System.out.println();
//    }
// }
//  }

//star pattern
// public static void main(String[] args) {
//    int i,j,k;
//    for(i=1;i<=4;i++){
//       for(j=4;j>=i;j--){
//          System.out.print(" ");
//       }
//       for(k=1;k<=i;k++){
//          System.out.print(" *");
//       }
//       System.out.println();
//    }
// }
//  }
//star pattern
// public static void main(String[] args) {
//    int i,j,k;
//    for(i=4;i>=1;i--){
//        for(j=1;j<=4-i;j++){
//          System.out.print(" ");
//        }
//        for(k=1;k<=i;k++){
//          System.out.print(" *");
//        }
//        System.out.println();
//    }
// }
//  }
//star pattern
// public static void main(String[] args) {
//    int i,j;
//    for(i=0;i<5;i++){
// for(j=0;j<5;j++){
//    if (i==j || i+j==5-1) {
//       System.out.print("*");
//    }
//    else{
//       System.out.print(" ");
//    }
// }
// System.out.println();
//    }
// }
//  }


//star pattern
// public static void main(String[] args) {
//    int i,j;
//    for(i=1;i<=4;i++){
//       for(j=1;j<=4;j++){
//          //System.out.print("*");
//          if (i>=2&&i<=3&&j>=2&&j<=3) {
//             System.out.print(" ");
//          }
//          else{
//             System.out.print("*");
//          }
//       }
//       System.out.println();
//    }
// }
//  }
 }











 


    
