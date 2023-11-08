import SingletonPattern.CandyMaker;
import SingletonPattern.SingletonPattern;

public class SingletonPatternHT {
    public static void main(String[] args) {
        CandyMaker candymaker = SingletonPattern.getInstance();

        System.out.println(candymaker);

        CandyMaker candymaker1 =  SingletonPattern.getInstance();

        System.out.println(candymaker1);

        if(candymaker.equals(candymaker1))
        {
            System.out.println("Both Ref. are Equal !!");
        }

    }
}
