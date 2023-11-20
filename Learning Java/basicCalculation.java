public class basicCalculation{ // class name should match with file name
    public static void main(String[] args){
        System.out.println(2+3); // Addition
        System.out.println(3-2); // Subtraction
        System.out.println(3*2); // Multiplication
        System.out.println(10/2); // Division

        //With variable
        int num1 = 5;
        int num2 = 3;
        int result;
        result = num1 + num2;
        System.out.println(result);

        // changing the value of num1 from 5 to 3 and num2 from 3 to 2
        num1 = 3;
        num2 = 2;
        result = num1 + num2;
        System.out.println(result);

        // to make the variable constant (unchangeable) there's a module called final
        final int num = 11;
        System.out.println(num);

        // Declaring one value to multiple variable
        int x,y,z; 
        x = y = z = 20;
        System.out.println(x+y+z);
    }
}