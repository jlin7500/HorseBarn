public class HorseRunner {
    public static void main(String[] args)
    {
        Horse horse1 = new Mustang("Secretariat", 12000);
        Horse horse2 = new Mustang("Dusty Trail",  22000);
        Horse horse3 = new Mustang("silver",12000);

        Horse[] horses = new Horse[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Dusty Train is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space " + barn.findHorseSpace("Dusty Trail"));

        Horse horse4 = new Thoroughbred("Nani",2000);
        Horse horse5 = new Mustang("Secretariat", 12000);
        Horse horse6 = new Mustang("Dusty Trail",  22000);

        Horse[] horses1 = new Horse[6];

        horses1[1] = horse4;
        horses1[3] = horse5;
        horses1[5] = horse6;
        HorseBarn barn1 = new HorseBarn(horses1);

        System.out.println(barn);
        System.out.println(" Dusty Train is in space: " + barn1.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space " + barn1.findHorseSpace("Dusty Trail"));
    }
}
