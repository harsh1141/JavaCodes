public class star6 {
    public static void main(String[] args) {
   int i,j,k;
   for(i=4;i>=1;i--){
       for(j=1;j<=4-i;j++){
         System.out.print(" ");
       }
       for(k=1;k<=i;k++){
         System.out.print(" *");
       }
       System.out.println();
   }
}
}
