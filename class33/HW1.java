package com.syntax.class33;

import java.util.LinkedHashMap;
import java.util.Map;

public class HW1 {
    /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */
    public static void main (String[] args) {
        Map<Integer,String> building=new LinkedHashMap<> (  );
        building.put ( 1,"Google" );
        building.put ( 2,"Syntax" );
        building.put ( 4,"Ebay" );
        building.put ( 5,"Apple" );
        building.put ( 5,"PaneraBread" );
        building.put ( 1,"Dicks");
        building.put ( 7,"BestBuy" );
        System.out.println (building );
        building.replace ( 4,"Zales" );
        System.out.println (building );
        building.remove ( 7 );
        System.out.println (building );
    }
}
