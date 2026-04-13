public class Task6 {
    public static void main(String[] args){
        int a =2;
        int b =4;
        int c =6;

        boolean result = evenlySpaced(a,b,c);
        System.out.println(result);
    }
    public static boolean  evenlySpaced(int a, int b, int c){
        int diff1 = b-a;
        int diff2 = c-b;

        if (diff1 == diff2){
            return true;
        }
        return false;
    }

}

