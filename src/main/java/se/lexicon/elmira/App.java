package se.lexicon.elmira;

import se.lexicon.elmira.data.NamesStorage;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {
        NamesStorage.add("Erik Svensson");
        NamesStorage.add("Erik Andersson");
        NamesStorage.add("Martin Svensson");

        String[] eriks = NamesStorage.findByFirstName("marTiN");
        System.out.println(Arrays.toString(eriks));

        String[] eriks1 = NamesStorage.findByLastName("svensson");
        System.out.println(Arrays.toString(eriks1));

        NamesStorage.remove("Erik Svensson");

        System.out.println(NamesStorage.nameExists("Erik Svensson"));
    }

}
