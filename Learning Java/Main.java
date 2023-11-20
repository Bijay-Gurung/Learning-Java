public class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
    System.out.println("I am Learning Java");
    System.out.println("It is awesome");
    System.out.println("Println method prints in the new line");
    System.out.print("Print method prints in the same line");
    System.out.print("see");
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);

    //Declaring Variable and String Concatenation
    String name = "Bijay";
    String lastname = "Gurung";
    int age = 19;
    System.out.println("My name is " + name +"." + " I am " + age + " years old.");
    System.out.println(name.concat(" ").concat(lastname));

    // String method
    System.out.println(name.length()); // length method
    System.out.println(name.toUpperCase()); // Uppercase method
    System.out.println(name.toLowerCase()); // Lowercase method
    
    // indexOf method
    String txt = "A moment of calm";
    System.out.println(txt.indexOf("moment"));

    // special Characters
    // backslash escape character (\) turns special characters into string characters
    System.out.println("It\'s Alright.");
    System.out.println("My name is \"Bijay Gurung\".");
    System.out.println("\"A moment of Calm\"");

    // double backslash \\ insert single backslash in a string
    // \n = new line, \r = Carriage Return, \t = tab, \b = Backspace, \f = Form Feed
  }
}