package se.lexicon.elmira;

import se.lexicon.elmira.data.NamesStorage;

public class App
{
    public static void main( String[] args )
    {
       boolean added = NamesStorage.add("Erik Svensson");
        if(added){
            System.out.println("A name was added");
        }

        added = NamesStorage.add("Erik Svensson");
        if(added){
            System.out.println("A name was added");
        }else {
            System.out.println("Name already exists");
        }
        System.out.println(NamesStorage.add(null));
    }
}
