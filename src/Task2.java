public class Task2 {
    public static void main(String[] args){
        int a =2;
        int b = 4;
        int c = 6;
        int result = noTeenSum( a,  b ,  c);
        System.out.println(result);

    }

    public static int noTeenSum(int a, int b, int c){
            return fixTeen( a) + fixTeen(b)+ fixTeen(c);


    }

    public static int fixTeen(int n){
        if (n > 13 && n <19 ){

            if (n==15 || n == 16){
                return 0;
            }
        }
            return n;
    }
}
