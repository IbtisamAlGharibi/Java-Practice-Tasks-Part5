public class Task8 {
    public static void main(String[] args){
        int small=1;
        int big=5;
        int goal =8;

        int result =makeChocolate(small,big,goal);
        System.out.println(result);

    }

    public static int  makeChocolate(int small, int big, int goal){

        int bigUsed = Math.min(big, goal / 5);
        int remaining = goal - (bigUsed * 5);


        if (small >= remaining) {
            return remaining;
        } else {
            return -1;
        }
    }
}
