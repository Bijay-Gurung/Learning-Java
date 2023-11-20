public class booleanConcept{
    public static void main(String[] args){
        boolean isMomoTasty = true;
        boolean isRaining = false;
        System.out.println(isMomoTasty);
        System.out.println(isRaining);

        int a = 50;
        int b = 10;
        System.out.println(a>b);
        System.out.println(a == 50);
        System.out.println(a == 10);

        int myAge = 19;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        // if statement
        if (myAge >= votingAge){
            System.out.println("I am Eligible for Voting.");
        }
        else{
            System.out.println("I am not Eligible for Voting.");
        }

        // Short Hand if statement
        int x = 20;
        String result = (x%2 == 0) ? "It is Even." : "It is Odd.";
        System.out.println(result);
    }
}