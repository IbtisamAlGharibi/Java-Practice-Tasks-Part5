public class Task3 {
    public static void main(String[] args){
        int a =15;
        int b = 10;
        int result = blackjack(a, b);
        System.out.println(result);

    }

    public static int blackjack(int a, int b){
        if (a <= 21 && b <= 21){

            if (a > b){
              System.out.println(a);
          }else {
              System.out.println(b);
          }

        } else if (a <= 21) {
            return a;
        } else if (b <= 21) {
            return b;
        }
        return 0;
    }
}
