import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by AlanBi on 6/20/17.
 */
public class Calculator
{
    public static void main(String[] args) throws FileNotFoundException
    {
        add("test1in.txt", "test1out.txt");
    }

    public static void add(String fileIn, String fileOut) throws FileNotFoundException
    {
        Scanner in = new Scanner(new File(fileIn));

        int sum = 0;
        while(in.hasNextInt())
        {
            sum += in.nextInt();
        }

        PrintWriter out = new PrintWriter(fileOut);
        out.println(sum);
        out.close();
    }
}
