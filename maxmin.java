public class maxmin {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int arr[]={1,23,34,5,3,6};
        for(int i=0;i<6;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
            if (arr[i]<min) {
               min=arr[i];
            }
        }
        System.out.println("max value is"+max);
        System.out.println("minimum array is"+min);
    }
}
