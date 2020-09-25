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
    }
}
