/**
 * Created by emeka on 4/17/16.
 */

import java.util.Set;
import java.util.HashSet;

public class SetType {


    public static Set<Integer> myNunberList = new HashSet<Integer>();
    public static Set<String> myNameList = new HashSet<String>();

    public static void main (String[] agrs){

        myNameList.add("emeka");
        myNameList.add("emeka");
        myNameList.add("jhvdfjvmdf");
        myNameList.add("jhefehjrfehrer");
        myNameList.add("hvkjfhgvjhfgjhefehjrfehrer");

        myNunberList.add(1);
        myNunberList.add(4);
        myNunberList.add(2);
        myNunberList.add(1);

        System.out.println(myNameList.size());
        System.out.println(myNunberList.size());
    }



}
