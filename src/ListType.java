/**
 * Created by emeka on 4/17/16.
 */
import java.util.List;
import collectionp.Pages;
import java.util.ArrayList;

public class ListType{

    protected static List<Pages> pages = new ArrayList<Pages>();

    public static void printPage (int n){

        while (n > 0){
            System.out.println(n);
            pages.add(new Pages("this is the page name " + n));
            n--;
        };

    }

    public static void pageNames(){
        for (Pages currentPage: pages){
            System.out.println(currentPage.pageName());
        }
    }

    public static void main (String[] args){
        printPage(4);
        pageNames();
    }

}
