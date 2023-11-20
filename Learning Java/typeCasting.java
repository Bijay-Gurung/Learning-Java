// Type casting -> Assigning a value of one primitive data type to another data type
// Widening Casting (automatically) - converting a smaller type to a large type
// byte -> short -> char -> int -> long -> float -> double

public class typeCasting{
    public static void main(String[] args){
        int num = 50;
        double decimalnum = num;
        System.out.println(num);
        System.out.println(decimalnum);
        
    // Narrowing Casting (manually) - converting a large type to a small type
    // double -> float -> long -> int -> char -> short -> byte
    double num2 = 60;
    int intnum = (int) num2;
    System.out.println(num2);
    System.out.println(intnum);
    }
}