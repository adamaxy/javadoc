/**
 * JavaDoc exercise
 * @author Giovanni
 *  The WordGames class provides methods for playing with words.
 *  Contains methods for adding 'Hello' in front of a word and
 *  concatenating name and surname to form a full name.
 */
public class WordGames {
    /**
     * with this string we are going to tell the method to add the word "Hello "
     * in front of a word of our choice which we will add later by calling this method.
     * @param wordHere this will be the word that goes after "Hello ".
     * @return A string with "Hello" followed by the input word.
     */
    public String addHelloWord(String wordHere){
        return "Hello "+wordHere;
    }

    /**
     *with this string we will tell the method to concatenate
     * two strings (first name and surname) and create only one (our fullname )
     * @param name
     * @param surname
     * @return a string with full name obtained by concatenating name and surname
     */
    public String getFullName(String name,String surname){
        return name+" "+surname;
    }
}
