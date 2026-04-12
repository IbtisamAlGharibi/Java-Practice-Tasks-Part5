public class Task5 {
    public static void main(String[] args){
        int a =1;
        int b = 2;
        int c = 3;

        int result = roundSum(a,b,c);
        System.out.println(result);
    }

    public static int roundSum(int a, int b ,int c){

        return round10(a) + round10(b)+ round10(c);
    }

    public static int round10(int num){

        int lastDigit= num / 10;

        if (lastDigit >= 5){

            return Math.round(num);
        }else {

            return (int) Math.floor(num);
        }


    }
}
