public class Dragon extends Enemies
{
    //Instance Variables
    private int wingLength;
    private int numWings;
    public static int numDragons;

    //Constructors
    public Dragon (boolean hasClaws, String color, int wingLength, int numWings)
    {
        super(hasClaws, color);
        this.wingLength = wingLength;
        this.numWings = numWings;
        numDragons++;
    }
    public Dragon(boolean hasClaws, String color, int wingLength)
    {
        super(hasClaws, color);
        this.wingLength = wingLength;
        this.numWings = 0;
    }

    //Getters and Setters
    public int getWingLength()
    {
        return wingLength;
    }
    public void setWingLength(int wingLength)
    {
        this.wingLength = wingLength;
    }
    public int getNumWings()
    {
        return numWings;
    }
    public void setNumWings(int numWings)
    {
        this.numWings = numWings;
    }

    //Brain Methods
    public static void dragonAmount()
    {
        System.out.println("In total, there are " + numDragons + " dragons.");
    }
    //toString
    public String toString()
    {
        String output = "\nThis Dragon has " + numWings + " wings. Wing length (feet): " + wingLength;
        output += "\n" + super.toString();
        return output;
    }
}//end Dragon class
