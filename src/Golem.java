public class Golem extends Enemies
{
    //Instance Variables
    private String elementType;
    private int height;

    //Constructors
    public Golem (boolean hasClaws, String color, String elementType, int height)
    {
        super(hasClaws, color);
        this.elementType = elementType;
        this.height = height;
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
    //Brain Methods

    //toString
    public String toString()
    {

        String output = "\nThis Golem is a " + elementType + " type and is " +
                height + " meters tall.";
        output += "\n" + super.toString();
        return output;
    }
}//end Golem class
