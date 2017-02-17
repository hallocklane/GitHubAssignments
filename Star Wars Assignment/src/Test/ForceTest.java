package Test;

import StarWars.Fighter;
import StarWars.Force;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lhallock on 2/16/2017.
 */
public class ForceTest {

    //Tests the influence method using Asajj Ventress and Dan
    @Test
    public void influence() {
        System.out.println("influence");
        Force AsajjForce = new Force(87, "Dark");
        Fighter AsajjVentress = new Fighter("Asajj", "Ventress",AsajjForce,30, "F","I have 2 lighstabers, fear me");
        String target = "Dan";
        String expResult = "Asajj Ventress ensures Dan these aren't the droids they're looking for.";
        String result = Force.Influence(AsajjVentress,"Dan");
        assertEquals(result,expResult);
    }

    //Tests the moveObject method with Asajj Ventress and rock
    @Test
    public void moveObject() throws Exception {
        System.out.println("moveObject");
        Force AsajjForce = new Force(87, "Dark");
        Fighter AsajjVentress = new Fighter("Asajj", "Ventress",AsajjForce,30, "F","I have 2 lighstabers, fear me");
        String target = "rock";
        String expResult = "Asajj Ventress flings rock across the room!";
        String result = Force.MoveObject(AsajjVentress,target);
        assertEquals(result,expResult);

    }


    //@Test
    //public Force clone()  {
    //    return null;
    //}

}