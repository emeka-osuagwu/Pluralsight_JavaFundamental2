/**
 * Created by emeka on 4/17/16.
 */
import java.util.Map;
import collectionp.Pages;
import java.util.HashMap;

public class MapType {

    public static Map<Integer, Pages> pagesMap = new HashMap<Integer, Pages>();
    public static int pageNumber = 1;

    public static void printPages (int n){
        while (n > 0){
            pagesMap.put(pageNumber, new Pages("this  is the page number : " + pageNumber));
            pageNumber++;
            n--;

        }

    }

    public static void outputPage(int num){
        System.out.println(pagesMap.get(num).pageName());
    }

    public static void main(String[] args){
        printPages(5);
        outputPage(5);
    }


}


