/**
 * Created by emeka on 4/17/16.
 */
public class Exception {

    public static int printNum(int n) {
        if (n < 0)
            throw new IllegalArgumentException("The number can be lower than 0");
        else
            return n;
    }

    public static void main(String[] arg){

        try
        {
            System.out.println(printNum(-1));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("You ans is ");
        }

    }
}
