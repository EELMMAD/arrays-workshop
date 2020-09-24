package se.lexicon.elmira.data;

import java.util.Arrays;

public class NamesStorage { //class starts

    private static String[] names = new String[0];

    /**
     *
     * @param fullName String fullName
     * @return true if fount
     */
    public static boolean nameExists(final String fullName){  //methods starts
        boolean exists = false;
       for (String name : names){    //for Loop starts
           if(name.equalsIgnoreCase(fullName)){   //if statement starts
               exists = true;
               break;     //Breaks out of a Loop or a switch.
           }  //if statement ends
       }//for Loops ends
        return exists;
    }// method ends

    /**
     *
     * @param fullName String representing a full name, <b>Not null</b>
     * @return true if name was added, false if param was was null or existed in the array
     */

    public static boolean add(final String fullName){
     if(fullName == null){
         return false;
     }
     if(nameExists(fullName)){
         return false;
     }
     names = Arrays.copyOf(names, names.length + 1);
     names[names.length - 1] = fullName;
     return true;
    }




    /**
     * Empties the array by overwriting it with a new empty array
     */
    public static void clear(){
        names = new String[0];
    }
}// class ends


