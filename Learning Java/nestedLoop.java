public class nestedLoop{
    public static void main(String[] args){
        // Nested for loop
        // Outer Loop
        /*
        for(int i=0; i<=2; i++){
            System.out.println("Fruits");
            // Inner Loop
            for(int j=0; j<=3; j++){
                String[] fruits = {"Apple","Banana","Cherry"};
                System.out.println(fruits[j]);
            }
        }
        */
       
       /*
       for(int i=1; i<=2; i++){
        System.out.println("Outer ");
        
        for(int j=1; j<=3; j++){
            System.out.println("Inner " + j);
        }
       }
       */

      // For-Each Loop
      /*
      String[] fruits = {"Apple","Banana","cherry"};
      for(String i: fruits){
        System.out.println(i);
      }
      */

     // Break
     /*
     for (int i=0; i<= 10; i++){
        if(i == 6){
            break;
        }
        System.out.println(i);
     }
     */

    // Continue
    for (int i=0; i <= 10; i++){
        if(i == 6){
            continue;
        }
        System.out.println(i);
    }
    }
}