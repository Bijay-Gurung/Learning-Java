/*
public class arrays{
    public static void main(String[] args){
        String[] sports = {"Football", "Volleyball", "Basketball", "Tennis"};
        for(String i : sports){
            System.out.println(i);
        }
        System.out.println(sports[0]);

        sports[0] = "Mango"; // Change an Array Element
        System.out.println(sports[0]);

        int[] numbers = {1,2,3,4,5};
        for(int j : numbers){
            System.out.println(j);
        }
        // Array Length
        System.out.println(numbers.length);
    }
}
*/

// Looping Through an Array
public class arrays{
    public static void main(String[] args){
        // String[] Languages = {"English","Nepali","Hindi","Korean","Japanese"};
        /*
        for(String i : Languages){
            System.out.println(i);
        }
        */

       // For-Each Method
       /*
       for(int i=0; i < Languages.length;i++){
        System.out.println(Languages[i]);
       }
       */

      // Multidimensional Array
      // It is used when we want to store data in tabular form. like, a table with rows and columns.
      int [][] Num = {{1,2,3},{4,5,6}}; // Numbers is now an Array with 2 Arrays as it's elements
      // System.out.println(Num[1][0]); // Acess Elements

      // Change elements value
      /* Num[1][0] = 8;
      System.out.println(Num[1][0]); */

      // Loop Through A Multidimensional Array
      for(int i=0; i<Num.length; ++i){
        for(int j=0; j<Num[i].length; ++j){
            System.out.println(Num[i][j]);
        }
      }
    }
}