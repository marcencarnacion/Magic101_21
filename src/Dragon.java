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
    public void isDragon()
    {
        if (numWings < 2)
        {
            System.out.println("Because this dragon has less than 2 wings, this is not a real dragon.");
        }
        else
            System.out.println("Because this dragon has the correct number of wings, this is a real dragon.");
    }
    //toString
    public String toString()
    {
        String output = "\nThis Dragon has " + numWings + " wing(s). Wing length (feet): " + wingLength;
        output += "\n" + super.toString();
        return output;
    }
}//end Dragon class
