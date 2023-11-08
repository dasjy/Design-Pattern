import BuilderDesignPattern.BiCycle;

public class BuilderPatternHT
{
    public static void main(String [] args)
    {
        System.out.println("BiCycle - 1:");
        //All Features
        BiCycle cycle=new BiCycle.Builder().seats(2).gears(2).stands(1).carrier(1).build();

        System.out.println("Total no of seats :"+cycle.getSeats());
        System.out.println("Total no of gears :"+cycle.getGears());
        System.out.println("Total no of stands :"+cycle.getStands());
        System.out.println("Total no of carrier :"+cycle.getCarrier());

        //Choose few Features
        System.out.println("BiCycle - 2:");
        BiCycle cycle2=new BiCycle.Builder().seats(2).gears(2).stands(1).build();

        System.out.println("Total no of seats :"+cycle2.getSeats());
        System.out.println("Total no of gears :"+cycle2.getGears());
        System.out.println("Total no of stands :"+cycle2.getStands());
        System.out.println("Total no of carrier :"+cycle2.getCarrier());

    }

}
