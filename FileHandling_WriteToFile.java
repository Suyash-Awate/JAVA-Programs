import java.io.FileWriter;
import java.util.*;
import java.io.IOException;  // Import the IOException class to handle errors

class FileHandling_WriteToFile
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name");
        String str = sobj.nextLine();

        try
        {
            FileWriter fobj = new FileWriter(str);

            System.out.println("Enter data you want to write :");
            String arr = sobj.nextLine();

            fobj.write(arr);
            fobj.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}