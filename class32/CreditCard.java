package com.syntax.class32;

public abstract class CreditCard {
    /*
    Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
    Create 3 subclasses of a Card card.
    Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String creditCardType;
    CreditCard(String creditCardType){
        this.creditCardType=creditCardType;
    }
    abstract void colorOfCard ( );
    abstract void typeOfCard();
    public void welcome(){
        System.out.println ("WElcome to "+creditCardType );
    }
}
class TDBank extends CreditCard{

    int cardLimit;
    TDBank (String creditCardType,int cardLimit) {
        super ( creditCardType );
        this.cardLimit=cardLimit;
    }
    @Override
    void colorOfCard ( ) {
        System.out.println ("The color of the TDbank credit card is green" );
    }
    @Override
    void typeOfCard ( ) {
    }
    void limit(){
        System.out.println ("The limit on the TDBank credit card is "+cardLimit );
    }
}
class CityBank extends CreditCard {
    String expiration;
    CityBank (String creditCardType,String expiration) {
        super ( creditCardType );
        this.expiration=expiration;
    }
    @Override
    void colorOfCard ( ) {
        System.out.println ("The color of the CityBank credit card is Blue " );
    }
    @Override
    void typeOfCard ( ) {
        System.out.println ("The type of the CityBank credit card is "+creditCardType );
    }
    void expitationDate(){
        System.out.println ("The expiration date of the CityBank credit card "+expiration );
    }
}
class ChaseBank extends CreditCard{
    String sizeOfTheCard;
    ChaseBank (String creditCardType,String sizeOfTheCard) {
        super ( creditCardType );
        this.sizeOfTheCard=sizeOfTheCard;
    }
    @Override
    void colorOfCard ( ) {
        System.out.println ("The color of the ChaseBank credit card is White " );
    }
    @Override
    void typeOfCard ( ) {
        System.out.println ("The type of the ChaseBank credit card is "+creditCardType );
    }
    void size(){
        System.out.println ("The size of the ChaseBank credit card is "+creditCardType );
    }
}
