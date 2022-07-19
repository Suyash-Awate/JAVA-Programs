import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class FileHandling_ReadFile
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name");
        String str = sobj.nextLine();
        
        try
        {
            File fobj = new File(str);

            Scanner robj = new Scanner(fobj);
            while(robj.hasNextLine())
            {
              String data = robj.nextLine();
             System.out.println(data);
            }
            robj.close();
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("An error occurres");
            e.printStackTrace();
        }
    }
}