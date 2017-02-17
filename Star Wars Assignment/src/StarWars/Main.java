package StarWars;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {



        //Constructs the force for assaj ventress
        Force AsajjForce = new Force(87, "Dark");

        //Constructs the assajVentress object
        Fighter AsajjVentress = new Fighter("Asajj", "Ventress",AsajjForce,30, "F","I have 2 lighstabers, fear me");



        //Constructs force for Bariss Offee
        Force BarissForce = new Force(85, "Light");

        //Constructs the Bariss Offee object
        Fighter BarissOffee = new Fighter("Bariss","Offee", BarissForce, 30, "F", "I am the greatest");



        //Constructs Darth Vader's force
        Force VaderForce = new Force(100,"Dark");
        //Constructs the Darth Vader Fighter
        Fighter DarthVader = new Fighter("Darth","Vader",VaderForce,42,"M","No, I am your father!");


        //Constructs the force object for emperor palpatine
        Force EmperorForce = new Force(97,"Dark");
        //Constructs the Emperor Palpatine object
        Fighter EmperorPalpatine = new Fighter("Emperor","Palpatine",EmperorForce,82,"M","DO IT!");


        //Constructs the force for kylo ren
        Force KyloForce = new Force(95,"Dark");
        //Constructs the Kylo Ren fighter object
        Fighter KyloRen =  new Fighter("Kylo","Ren",KyloForce,20,"M","I definitely am not acting like an edgy teen");


        //Constructs luke's force
        Force LukeForce = new Force(97,"Light");
        //Constructs Luke as a fighter
        Fighter LukeSkywalker = new Fighter("Luke","Skywalker",LukeForce,19,"M","Like hitting the broadside of a moisture evaporator");


        //constructs obi wan's force
        Force ObiForce = new Force(85,"Light");
        //Constructs Obi Wan as a Fighter
        Fighter ObiWanKenobi = new Fighter("Obi Wan", "Kenobi",ObiForce,57,"M","Qui-Gon was right, those negotiations went quickly");


        //Constructs Leia's Force
        Force LeiaForce = new Force(75,"Light");
        //Constructs Leia as an Fighter object
        Fighter PrincessLeia = new Fighter("Princess","Leia",LeiaForce,19,"F","take that you scruffy-looking nerf herder *mic drop");


        //Constructs Rey's Force
        Force ReyForce = new Force(96,"Light");
        //Constructs Rey as Fighter object
        Fighter Rey = new Fighter("Rey",ReyForce,20,"F","I have literally never swung this stick before and I beat you");



        //Force of the storm trooper
        Force StormForce = new Force(1,"Dark");
        //Constructs a Storm trooper
        Fighter StormTrooper = new Fighter("Storm","Trooper",StormForce,25,"M","TRATIOR!");


        //Force Constructor for yoda
        Force YodaForce = new Force(99,"Light");
        //Constructs Yoda, the man the myth the legend
        Fighter Yoda = new Fighter("Yoda",YodaForce,896,"M","Defeated you have been");






        //All of the required fights
        System.out.println(Fighter.FightEachother(LukeSkywalker,DarthVader));
        System.out.println(Fighter.FightEachother(LukeSkywalker,Yoda));
        System.out.println(Fighter.FightEachother(LukeSkywalker,EmperorPalpatine));
        System.out.println(Fighter.FightEachother(BarissOffee,ObiWanKenobi));
        System.out.println(Fighter.FightEachother(Rey,KyloRen));
        System.out.println(Fighter.FightEachother(AsajjVentress,PrincessLeia));

        //The required use of move
        System.out.println(Force.MoveObject(Yoda,"His ex"));

        //The required uses of influence
        System.out.println(Force.Influence(ObiWanKenobi,"Watto"));
        System.out.println(Force.Influence(StormTrooper,"Sand, just straight up sand"));


        //First clone of the storm trooper
        Fighter StormTrooper2 = StormTrooper.clone();
        StormTrooper2.setTaunt("My hands aren't even in my gloves, they're just tucked into my suit!");
        System.out.println(StormTrooper2.getTaunt());

        //2nd clone of the storm trooper
        Fighter StormTrooper3 = StormTrooper.clone();
        StormTrooper3.setTaunt("We combed the desert Darth Helmet, we can't find Lone Starr.");
        System.out.println(StormTrooper3.getTaunt());

        //3rd clone of the storm trooper
        Fighter StormTrooper4 = StormTrooper.clone();
        StormTrooper4.setTaunt("Storm troopers are way better than those nerdy clone troopers.");
        System.out.println(StormTrooper4.getTaunt());

        //4th clone of the storm trooper
        Fighter StormTrooper5 = StormTrooper.clone();
        StormTrooper5.setTaunt("I wanna know, have you ever seen the rain *pause coming down on a sunny day!");
        System.out.println(StormTrooper5.getTaunt());



    }




}