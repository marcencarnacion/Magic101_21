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
        Dragon timothy = new Dragon (false, "Blue", 25, 2);
        Golem marcos = new Golem(false, "Gray", "earth", 20);
        Golem oscar = new Golem(false, "Black", "fire", 30);
        Sorcerer ruben = new Sorcerer(80, 95, "magic wand");
        Sorcerer jose = new Sorcerer(90, 85, "sword");

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
        Enemies[] myEnemies = {kyle, gerome, pablo, timothy, marcos, oscar};
        for(int i = 0; i < myEnemies.length;i++)
        {
            System.out.println(myEnemies[i]);
        }
        System.out.println(ruben.toString());
        ruben.attack();
        System.out.println(jose.toString());
        jose.gainIntelligence();

        //Static counts with appropriate labels
        System.out.println();
        Goblin.goblinAmount();
        Dragon.dragonAmount();
        Golem.golemAmount();
        Sorcerer.sorcererAmount();
    }
}//end driver
