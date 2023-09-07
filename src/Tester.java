/**
JavaDoc exercise
* @author Giovanni
* The Tester class is used to test the WordGames class.
* create a WordGames object
* print the addHelloWord method and the getFullName method
 */
public class Tester {
public static void main(String[]args ){
    WordGames wordObj=new WordGames(); //here we create a WordGames object
    //here we print addHelloWord by adding the word "World" to the method----es .addHelloWord("World")
    System.out.println(wordObj.addHelloWord("World"));
    //here the console returns to us: Hello World
    //and here at the end we print getFullName adding our name and surname---- es .getFullName("Giovanni","Cassano")
    System.out.println(wordObj.getFullName("Giovanni","Cassano"));
    //here the console returns to us: Giovanni Cassano
}
}
