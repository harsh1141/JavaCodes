import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        int r,i;
       int arr[]=new int[5];
       int nums[]= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        for( i=0;i<5;i++){
         arr[i]=sc.nextInt();
        }
        int x=0;
        System.out.println("reverse");
      for(int j=arr.length-1;j>=0;j--){
        nums[x++]=arr[j];
      }
      System.out.println("reversed");
      for(int k=0;k<5;k++){
        System.out.println(nums[k]);
      }
    }
}
