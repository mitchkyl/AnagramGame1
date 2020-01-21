package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author Megha Patel 
 * 
 * @modifier: Kyle Mitchell
 * ID:991575442
 * Date edited: 1/20/20
 */
import java.util.*;

public class Update_Card_Trick {

    private static int num2;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        Random r = new Random();
        int num;
        // int num2;

        for (int i = 0; i < magicHand.length; i++) {
            num = 1 + r.nextInt(13);
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue(num);

            
            //sets the suit from 0 - 3. 
              num2 = 1+ r.nextInt(3);
            c.setSuit(Card.SUITS[((num2))]);
    

            switch (num) {

                case 11:

                    System.out.println("Jack");
                    break;

                case 12:
                    System.out.println("Queen");
                    break;

                case 13:
                    System.out.println("King");
                    
                    break;
                    
                case 1: 
                    System.out.println("Ace");

                default:
                    System.out.println(num);
                    break;

            }
            
            
        }

     System.out.println("This is the Magic Hand?: " +Arrays.toString(magicHand));
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }

}
