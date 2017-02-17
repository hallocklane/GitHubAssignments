package Test;

import StarWars.Fighter;
import StarWars.Force;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lhallock on 2/16/2017.
 */
public class FighterTest {

    //Tests the tauntOpponent method using Asajj Ventress
    @Test
    public void tauntOpponent()  {
        System.out.println("tauntOpponent");
        Force AsajjForce = new Force(87, "Dark");
        Fighter AsajjVentress = new Fighter("Asajj", "Ventress",AsajjForce,30, "F","I have 2 lighstabers, fear me");
        String expResult = AsajjVentress.getTaunt();
        String result = AsajjVentress.getTaunt();
        assertEquals(result, expResult);


    }

    //Tests the fightEachother method using Asajj Ventress and Bariss Offee
    @Test
    public void fightEachother() throws Exception {
        System.out.println("fightEachother");
        Force AsajjForce = new Force(87, "Dark");
        Fighter AsajjVentress = new Fighter("Asajj", "Ventress",AsajjForce,30, "F","I have 2 lighstabers, fear me");

        Force BarissForce = new Force(85, "Light");
        Fighter BarissOffee = new Fighter("Bariss","Offee", BarissForce, 30, "F", "I am the greatest");

        String expResult = "Asajj Ventress fights Bariss Offee and Asajj Ventress wins! Asajj Ventress gloats: I have 2 lighstabers, fear me" ;
        String result = Fighter.FightEachother(AsajjVentress,BarissOffee);
        assertEquals(expResult,result);

    }

    //@Test
    //public Fighter clone()  {
    //    return null;
    //}

}