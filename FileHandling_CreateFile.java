import java.io.File;
import java.util.*;
import java.io.IOException;

class FileHandling_CreateFile
{    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name to create");
        String str = sobj.nextLine();

        try 
        {
            File fobj = new File(str);
            if(fobj.createNewFile())
            {
                System.out.println("File created : "+fobj.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }   
    }
}