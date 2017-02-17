package StarWars;

/**
 * Created by lhallock on 2/12/2017.
 */
public class Force implements Cloneable {



      //The strength of a Character's force ability
    private int Strength;
    public int getStrength() {return Strength;}
    public void setStrength(int strength) {Strength = strength;}

    //The side that the character is on
    private String side;
    public String getSide() {return side;}
    public void setSide(String side) {this.side = side;}

    //Blank constructor for force
    public Force(){}

    //constructs the force of a user accepting their ability and side
    public Force(int Strength, String side){
        this.Strength= Strength;
        this.side= side;
    }


    //Checks if a Fighter can influence another character
    public static String Influence(Fighter user, String target) {
        int power = user.Getforce().getStrength();
        StringBuilder output = new StringBuilder();


        if(power>=60){
            output.append(user.getFirstName()+" "+user.getLastname() + " ensures "+ target +" these " +
                    "aren't the droids they're looking for.");
        }
        else
            output.append(user.getFirstName()+" " + user.getLastname()+ " fails to influence "+ target+".");

        return output.toString();
    }


    //checks if a Fighter has strong enough force to move an object
    public static String MoveObject(Fighter mover, String target){
        int power = mover.Getforce().getStrength();
        StringBuilder output = new StringBuilder();


        if(power>=60){
            output.append(mover.getFirstName()+" "+mover.getLastname() + " flings "+ target +" across the room!");
        }
        else
            output.append(target+" is unmoved by "+mover.getFirstName()+" " + mover.getLastname()+".");

        return output.toString();
    }


    //A method for making a Force object identical to another Force object
    public Force clone() {
        try {
            return (Force)super.clone();
        }
        catch (CloneNotSupportedException e) {
            // This should never happen
        }
        return null;
    }


}
