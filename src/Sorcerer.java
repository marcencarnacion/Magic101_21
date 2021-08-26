public class Sorcerer
{
    //Instance Variables
    private int damage;
    private int intelligence;
    private String weapon;
    public static int numSorcerers;

    //Constructors
    public Sorcerer (int damage, int intelligence, String weapon)
    {
        this.damage = damage;
        this.intelligence = intelligence;
        this.weapon = weapon;
        numSorcerers++;
    }
    public Sorcerer (int damage, int intelligence)
    {
        this.damage = damage;
        this.intelligence = intelligence;
        this.weapon = "none";
    }
    //Getters and Setters
    public int getDamage()
    {
        return damage;
    }
    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public String getWeapon(String weapon)
    {
        return weapon;
    }
    public void setWeapon(String weapon)
    {
       this.weapon = weapon;
    }
    //Brain Method
    public void attack()
    {
        damage = damage + 5;
        System.out.println(damage + "This socerer uses a " + weapon + " to defeat its enemies.");
    }
    public void gainIntelligence()
    {
        intelligence = intelligence + 10;
        System.out.println("This sorcerer is smart. They read books and their intelligence is now " + intelligence);
    }
    public static void sorcererAmount()
    {
        System.out.println("In total, there are " + numSorcerers + " sorcerers.");
    }
    //toString
    public String toString()
    {
        String output = "\nThis sorcerer has " + damage + " damage (out of a scale of 100).";
        output += "\nThis sorcerer has " + intelligence + " intelligence (out of a scale of 100).";
        output += "\nThis sorcerer has a " + weapon + " for a weapon.";
        return output;
    }
}
