public abstract class Enemies
{
    //Instance varibles
    private boolean hasClaws;
    private String color;

    ///Constructors
    public Enemies(boolean hasClaws, String color)
    {
        this.hasClaws = hasClaws;
        this.color = color;
    }
    public Enemies(String color)
    {
        this.color = color;
        this.hasClaws = false;
    }
    //Getters and Setters
    public boolean getHasClaws()
    {
        return hasClaws;
    }
    public void setHasClaws(boolean hasClaws)
    {
        this.hasClaws = hasClaws;
    }

    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    //toString
    @Override
    public String toString()
    {
        return "This enemy has claws? " + hasClaws + "\nColor: " + color;
    }
}
