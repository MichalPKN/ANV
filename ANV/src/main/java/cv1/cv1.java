package cv1;

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
        
    }

}
