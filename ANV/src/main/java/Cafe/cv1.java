package Cafe;

/**
 *
 * @author michal.pokorny
 */
public class cv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeConfig cafe = CafeConfig.getInstance("kavarna1");
        CafeConfig secondCafe = CafeConfig.getInstance("cafe2");
        System.out.println(cafe.getCafeName());
        System.out.println(secondCafe.getCafeName());
        System.out.println(CafeConfig.getInstance("cukrarna3").getCafeName());
        
        System.out.println(DrinkFactory.createDrink("tea").serve() + " in " + CafeConfig.getInstance("").getCafeName());
        System.out.println(DrinkFactory.createDrink("lemonade").serve() + " in " + CafeConfig.getInstance("").getCafeName());
        
    }

}
