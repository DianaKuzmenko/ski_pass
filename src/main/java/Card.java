/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
import BankOfCards.*;

public class Card {
    //protected int id;
    //protected TypeOfDays typeOfDays;
    //protected PeriodTicketWork periodTicketWork;
    //protected int credits;
    protected boolean access;
    protected TypeOfDays spec;

    public Card (Card id, TypeOfDays typeOfCard,TypeOfDays term, TypeOfDays credits, boolean access ){
        this.id = id;
        this.access = True;
        this.spec = new TypeOfDays(TypeOfDays, TypeOfDays.Weekdays.NumberOfDays, TypeOfDays.Weekdays.NumberOfRaising);

    }
    public int getId(){return id;}
    public TypeOfDays isType(){return TypeOfCard;}
    public TypeOfDays isTerm(){return term;}
    public TypeOfDays Credits(){return credits;}
    public boolean isAccess(){return access;}
}
