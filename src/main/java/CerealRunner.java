import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CerealRunner
{
    // create a private instance variable to store an ArrayList of Cereal objects
     private ArrayList<Cereal> cereals;

    public CerealRunner(String fileName)
    {
        // instantiate the ArrayList
        cereals= new ArrayList<Cereal>();

        try
        {
            FileReader fileRdr = new FileReader(fileName);
            Scanner scan = new Scanner(fileRdr);
            while(scan.hasNext())
            {
                String myStr = scan.nextLine();

                //use the split method to parse the data into an array of
                //String objects
                String[] data = myStr.split(",");

                // go through each String array element and save it
                //   into the appropriate variable which will be used to
                //   create a Cereal object
                String name= data[0];
                int calories= Integer.parseInt(data[1]);
                int fiber=Integer.parseInt(data[2]);
                int carbohydrates=Integer.parseInt(data[3]);
                int cups=Integer.parseInt(data[4]);
                // create a new Cereal object, and add it to the ArrayList
                Cereal a = new Cereal(name, calories, fiber, carbohydrates, cups);
                cereals.add(a);
            }
            scan.close();


        } catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        int numCereals = cereals.size();
        System.out.println(numCereals + " records created.");
    }

    public static void main(String[] args)
    {
        String fileName = "src/data/cerealSubset.csv";
        CerealRunner cr = new CerealRunner(fileName);
    }

}

