public class Task7 {
    public static void main(String[] args){
        int a =1;
        int b=13;
        int c=5;
        int result = luckySum(a,b,c);
        System.out.println(result);

    }

    public static int luckySum(int a, int b,int c){
        if (a==13){
            return b+c;
        } else if (b==13) {
            return a+c;

        } else if (c==13) {
            return a+b;

        }
return a +b+c;
    }

}
