public class MathClass{
    public static void main(String[] args){
        int x = 5;
        int y = 10;
        int z = 81;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.sqrt(z));
        int num = -10;
        System.out.println(Math.abs(num)); // returns absoute positive value of num
        // Random module
        System.out.println(Math.random()); // Returns the number between 0.0 and 1.0
        int randomNum = (int) (Math.random() * 100); // Returns the random number between 0 to 100
        System.out.println(randomNum);
    }
}