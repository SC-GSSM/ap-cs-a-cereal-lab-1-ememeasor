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
    private double calories;
    private double fiber;
    private double carbs;
    private double cups; 

    // constructor that creates a cereal object
    public Cereal(String a, double b, double c, double d, double e){
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

     public double getCalories(){
        return calories;
    }

    public double getFiber(){
        return fiber;
    }

    public double getCarbs(){
        return carbs;
    }

    public double getCups(){
        return cups;
    }




    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */
       public String toString(){
        return "Cereal: " + getName() + "has " + getCalories() + " calories, " + getFiber() + " grams of fiber, " + getCarbs() + " grams of carbohydrates, and  "+ getCups() + " cups per serving.";
       }

}


