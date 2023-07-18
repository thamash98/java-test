public class problem1 {
    //for-loop
    /*public static void sum(int[] arr){
        int sum = 0;
        for (int i = 0;i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum : "+sum);
    }
    */

    //while-loop
    /*public static void sum(int[] arr){
        int sum = 0;
        int i = 0;
        while (i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println("Sum : "+sum);
    }*/

    public static int sum(int[] arr, int N){
        if(N <= 0) {
            return 0;
        }
           return (sum(arr, N-1)+arr[N-1]);
    }
}
