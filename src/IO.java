import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by emeka on 4/18/16.
 */
public class IO {

    public static void getFileText() {

        FileReader fileReader = null;
        BufferedReader bReader = null;
        String alltext = null;
        try
        {
            fileReader = new FileReader("/home/emeka/Desktop/file.txt");
            bReader = new BufferedReader(fileReader);
            String line = null;

            while( (line = bReader.readLine()) != null)
            {
                alltext += line = "\n";
            }

            System.out.println(alltext);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fileReader != null)
                try
                {
                    fileReader.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
        }


        System.out.println("ejherfver");

    }


    public static void main(String[] args){
        getFileText();
    }




}
