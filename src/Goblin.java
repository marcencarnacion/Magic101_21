public class Goblin extends Enemies
{
    //Instance Variables
    private int numClaws;
    private String personality;

    //Constructor
    public Goblin (boolean hasClaws, String color, int numClaws, String personality)
    {
        super(hasClaws, color);
        this.numClaws = numClaws;
        this.personality = personality;
    }
    public Goblin (boolean hasClaws, String color, int numClaws)
    {
        super(hasClaws, color);
        this.numClaws = numClaws;
        this.personality = "dull";
    }

    //Getters and Setters
    //This returns (gets)
    public int getNumClaws()
    {
        return numClaws;
    }
    //This sets
    public void setNumClaws(int numClaws)
    {
        this.numClaws = numClaws;
    }
    //This returns (gets)
    public String getPersonality()
    {
        return personality;
    }
    //This sets
    public void setPersonality(String personality)
    {
        this.personality = personality;
    }

    //Brain Methods

    //toString
    public String toString()
    {
        String output = "\nThis Goblin has " + numClaws + " claws and is " + personality + ".";
        output  += "\n" + super.toString();
        return output;
    }
}//end Goblin class
