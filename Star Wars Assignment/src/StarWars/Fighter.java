/**
 * Created by lhallock on 2/13/2017.
 */
package StarWars;
public class Fighter implements Cloneable{
    /*
    This class accepts all of the variables for creating
    a starwars Fighter.
     */

    //first name of the Fighter
    private String firstname;

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    //last name of the Fighter
    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //age of the Fighter
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //gender of the Fighter
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //The Fighter's taunt
    private String taunt;

    public String getTaunt() {
        return taunt;
    }

    public void setTaunt(String taunt) {
        this.taunt = taunt;
    }


    //a blank Force Object
    private Force input = new Force();
    public Force Getforce() {return input;}
    public void Setforce (Force force) {this.input = force;}





    //This is an empty constructor for creating a Fighter
    public Fighter() {
    }

    //This is a constructor that accepts the first and last name of a Fighter
    public Fighter(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //This constructor accepts the first name, last name, and an object that
    //will be the force of the Fighter
    public Fighter(String firstname, String lastname, Force obj) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.input = input;
    }

    //This constructor is for Rey and Yoda because they don't have last names even though
    //it is Rey Skywalker!
    public Fighter(String firstname, Force force, int age, String gender, String taunt) {
        this.firstname = firstname;
        this.age = age;
        this.gender = gender;
        this.taunt = taunt;
        this.input = force;
        lastname = "";
    }

    //This constructor accepts all instances
    public Fighter(String firstname, String lastname, Force force, int age, String gender, String taunt) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.taunt = taunt;
        this.input = force;
    }





    //Makes a Fighter taunt another Fighter
    public static String TauntOpponent(Fighter p1) {
        StringBuilder output = new StringBuilder();
        output.append(p1.getTaunt());
        return output.toString();
    }




    //Compares what would happen if two Fighter fought
    public static String FightEachother(Fighter c1, Fighter c2) {

        //what happens if the Fighters are on the same side
        String c1Side = c1.Getforce().getSide();
        String c2Side = c2.Getforce().getSide();
        int c1Strength = c1.Getforce().getStrength();
        int c2Strength = c2.Getforce().getStrength();

        StringBuilder output = new StringBuilder();

        if (c1Side.equalsIgnoreCase(c2Side)) {
            if (c1Strength > c2Strength) {
                output.append(c1.getFirstName() + c1.getLastname() + " is stronger in the " + c1Side
                        + " side of the force than " + c2.getFirstName() +" "+ c2.getLastname() + ".");
                return output.toString();
            } else
                output.append(c2.getFirstName() + c2.getLastname() + " is stronger in the " + c1Side
                        + " side of the force than " + c1.getFirstName() + " "+ c1.getLastname() + ".");
            return output.toString();
        }


        //what happens if the Fighter are on opposite sides of the force and fight
        if (c1Strength > c2Strength) {
            output.append(c1.getFirstName() + " " + c1.getLastname() + " fights " + c2.getFirstName() + " " + c2.getLastname()
                    + " and " + c1.getFirstName() + " " + c1.getLastname() + " wins! " + c1.getFirstName() + " " + c1.getLastname()
                    + " gloats: " + c1.taunt);
            return output.toString();
        }
        if (c2Strength > c1Strength) {
            output.append(c1.getFirstName() + " " + c1.getLastname() + " fights " + c2.getFirstName() + " " + c2.getLastname()
                    + " and " + c2.getFirstName() + " " + c2.getLastname() + " wins! " + c2.getFirstName() + " " + c2.getLastname()
                    + " gloats: " + c2.taunt);
            return output.toString();
        }


        //if they are on opposite sides of the force and are equal in power
        else if(c1Strength==c2Strength){
            output.append(c1.getFirstName() + " " + c1.getLastname() + " and " + c2.getFirstName() + " " + c2.getLastname()
                    + " fought but neither could get the high ground.");
            return output.toString();}

        return output.toString();

    }




    //A clone method to make a copy of a Fighter
    public Fighter clone() {
        try {
            return (Fighter)super.clone();
        }
        catch (CloneNotSupportedException e) {
            // This should never happen
        }
        return null;
    }


}


