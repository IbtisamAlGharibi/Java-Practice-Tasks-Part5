public class Task1 {
    public static void main(String[] args){
    int small = 1;
    int big = 5;
    int goal = 8;
    boolean result = makeBricks(small, big, goal);
    System.out.println(result);

    }

    public static boolean makeBricks(int small,int big, int goal){

            int bigBricks = goal / 5;

            int bricksUsed = Math.min(big, bigBricks);

            int remaining = goal - (bricksUsed * 5);

            return small >= remaining;



    }
}
