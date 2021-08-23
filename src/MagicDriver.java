public class MagicDriver
{
    //Enum used for the golem
    enum element {fire, water, earth, air}
    public static void main(String[]args)
    {
    Golem.elementList();


        //Creating comments from the classes
        Goblin kyle = new Goblin(true, "Brown",5, "aggressive");
        Goblin gerome = new Goblin(false, "Green", 0, "calm");
        Dragon pablo = new Dragon(true, "Red", 20, 2);
        Golem marcos = new Golem(false, "Gray", "earth", 20);

        //Utilizing the getters and setters of the Goblin class
        System.out.print("(Using Getters and Setters)");
        System.out.println(kyle.toString());
        kyle.setNumClaws(7);
        System.out.println("Now Kyle has " + kyle.getNumClaws() + " claws.");

        //Utilizing the getters and setters of the Enemies class
        System.out.print("\n(Using Getters and Setters)");
        System.out.println(gerome.toString());
        gerome.setHasClaws(true);
        gerome.setColor("blue");
        System.out.println("Now Gerome is " + kyle.getHasClaws() + " for claws.");
        System.out.println("Now Gerome is " + gerome.getColor());

        //Creating an array of objects and printing them out
        Enemies[] myEnemies = {kyle, gerome, marcos, pablo};
        for(int i = 0; i < myEnemies.length;i++)
        {
            System.out.println(myEnemies[i]);
        }
    }
}//end driver
