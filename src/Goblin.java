public class Goblin extends Enemies
{
    //Instance Variables
    private int numClaws;
    private String personality;
    public static int numGoblins;

    //Constructor
    public Goblin (boolean hasClaws, String color, int numClaws, String personality)
    {
        super(hasClaws, color);
        this.numClaws = numClaws;
        this.personality = personality;
        numGoblins++;
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
    public static void goblinAmount()
    {
        System.out.println("In total, there are " + numGoblins + " goblins.");
    }
    public void isGoblin()
    {
        if (numClaws < 2)
        {
            System.out.println("Because this goblin has less than 2 claws, this is not a real goblin.");
        }
        else
        {
            System.out.println("Because this goblin has the correct number of claws, this is a real goblin.");
        }
    }

    //toString
    public String toString()
    {
        String output = "\nThis Goblin has " + numClaws + " claws and is " + personality + ".";
        output  += "\n" + super.toString();
        return output;
    }
}//end Goblin class
