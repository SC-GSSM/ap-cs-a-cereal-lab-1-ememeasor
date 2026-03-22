import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CerealRunner
{
    // create a private instance variable to store an ArrayList of Cereal objects
     private ArrayList<Ceral> cerals;

    public CerealRunner(String fileName)
    {
        // instantiate the ArrayList
        cerals= new Arraylist<Ceral>();

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
                int calories= data[1];
                int fiber=data[2];
                int carbohydrates=data[3];
                int cups=data[4];
                // create a new Cereal object, and add it to the ArrayList
                Ceral a = new Ceral(name, calories, fiber, carbohydrates, cups);
                cerals.add(a);
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

