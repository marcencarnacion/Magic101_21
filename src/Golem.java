public class Golem extends Enemies
{
    //enum used for the Golem class
    enum element {fire, water, earth, air}
    //Instance Variables
    private String elementType;
    private int height;
    private element List;
    public static int numGolems;

    //Constructors
    public Golem (boolean hasClaws, String color, String elementType, int height)
    {
        super(hasClaws, color);
        this.elementType = elementType;
        this.height = height;
        numGolems++;
    }
    public Golem (boolean hasClaws, String color)
    {
        super(hasClaws, color);
        this.elementType = "none";
        this.height = 0;
    }

    //Getters and Setters
    public String getElementType()
    {
        return elementType;
    }
    public void setElementType(String elementType)
    {
        this.elementType = elementType;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }

    //Brain Method
    public static void elementList()
    {
        for(Golem.element List: Golem.element.values())
        {
            System.out.println(List);
        }
    }
    public static void golemAmount()
    {
        System.out.println("In total, there are " + numGolems + " golems.");
    }

    public void isGolem()
    {
        if (height < 30)
        {
            System.out.println("Because this golem is less than 30 meters, this is not a real golem");
        }
        else
            System.out.println("Because this golem is the correct height, this is a real golem");
    }
    //toString
    public String toString()
    {

        String output = "\nThis Golem is a " + elementType + " type and is " +
                height + " meters tall.";
        output += "\n" + super.toString();
        return output;
    }
}//end Golem class
