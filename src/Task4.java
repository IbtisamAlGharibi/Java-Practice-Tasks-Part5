public class Task4 {
    public static void main(String[] args){
        int a = 1;
        int b= 2;
        int c = 3;

        int result = loneSum(a,b,c);
        System.out.println(result);
    }

    public static int loneSum(int a, int b, int c){
        int sum = a + b + c;
        if (a != b && b !=c ){
            return sum;

        }
        return 0;
    }


}
