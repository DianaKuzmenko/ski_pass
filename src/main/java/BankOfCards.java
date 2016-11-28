/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public class BankOfCards {
    private Card[] card = new Card[10000];
    private int countOfCards = 0;

    public void addCard(Card id){
        checkTerm();
        checkCredits();
        checkAccess();
        card[countOfCards] = id;
        countOfCards ++;
    }

    public void checkTerm(){

    }
    public void checkCredits(){

    }
    public void checkAccess(){

    }
}
