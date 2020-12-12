package com.syntax.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    /*
  Create a map of Best Buy store. Place
  item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
  Retrieve all keys and values from a Best Buy map using EntrySet.
   */
    public static void main (String[] args) {
        Map<Integer, String> bestBuy = new LinkedHashMap<> ( );
        bestBuy.put ( 7664847, "Printer" );
        bestBuy.put ( 7879885, "TV" );
        bestBuy.put ( 8547221, "ElectricGrill" );
        bestBuy.put ( 1458790, "Monitor" );
        bestBuy.put ( 2366587, "Xbox" );

        // Set<Map.Entry<Integer,String>> set = bestBuy.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = bestBuy.entrySet ( ).iterator ( );

        while (iterator.hasNext ( )) {
            Map.Entry<Integer, String> next = iterator.next ( );
            System.out.println ( next.getKey ( ) + ":" + next.getValue ( ) );

        }
    }}
