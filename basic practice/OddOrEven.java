/*
public class OddOrEven{
    public static void main(String[] args){
        int num = 5;

        if (num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
*/

// Displaying Even numbers from 0 to 10
public class OddOrEven{
    public static void main(String[] args){
        System.out.println("The Even numbers from 0 to 10 are:");
        for(int i=0; i<=10; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}