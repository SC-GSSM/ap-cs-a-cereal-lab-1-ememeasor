/**
 * Cereal.java
 *
 * @author – Your name
 * @author – Class period
 *
 */
public class Cereal
{
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups
    private String name;
    private int calories;
    private int fiber;
    private int carbs;
    private int cups; 

    // constructor that creates a cereal object
    public Cereal(String a, int b, int c, int d, int e){
        name=a;
        calories=b;
        fiber=c;
        carbs=d;
        cups=e;
    }
    

    // accessor methods for each instance variable
    public String getName(){
        return name;
    }

     public int getCalories(){
        return calories;
    }

    public int getFiber(){
        return fiber;
    }

    public int getCarbs(){
        return carbs;
    }

    public int getCups(){
        return cups;
    }




    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */
       public String toString(){
        return getName + "has " + getCalories + " calories, " + getFiber + " fiber, " + getCarbs + " carbohydrates, "+ getCups + " cups per serving.";
       }

}


