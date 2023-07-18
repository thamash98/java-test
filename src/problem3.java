public class problem3 {
    public static void findFibonacciSeries(int num){
        int fN=0,sN=1;
        int tN=fN+sN;
        System.out.print("0, 1, 1, ");
        while(tN<num){
            fN=sN;
            sN=tN;
            tN=fN+sN;
            if(tN<num){
                System.out.print(tN+", ");
            }
        }
    }
}
