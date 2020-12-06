package com.syntax.class32;

import java.util.LinkedList;

public class CreditCardTester {
    public static void main (String[] args) {
        TDBank tdBank=new TDBank ( "credit",12000 );
        CityBank cityBank=new CityBank ( "debit","10/2020" );
        ChaseBank chaseBank=new ChaseBank ( "debit","small" );

        LinkedList<CreditCard> list=new LinkedList<> (  );
        list.add ( tdBank );
        list.add ( cityBank );
        list.add ( chaseBank );

        for(CreditCard element:list){
            element.colorOfCard ();
            element.typeOfCard ();
        }
        tdBank.limit ();
        cityBank.expitationDate ();
        chaseBank.size ();
    }
}
