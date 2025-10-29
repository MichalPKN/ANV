package Cafe;

/**
 *
 * @author michal.pokorny
 */
public class main {

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
        
        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().sugar().build();
        
        System.out.println(customDrink +" in "+CafeConfig.getInstance("").getCafeName());
        
        OrderSubject order = new OrderSubject();
        EmployeeObserver barista = new EmployeeObserver("Barista");
        order.addObserver(barista);
        EmployeeObserver waiter = new EmployeeObserver("Waiter");
        order.addObserver(waiter);
        String msg = customDrink + " in " + CafeConfig.getInstance("").getCafeName();
        order.notifyAll(msg);
        
        OrderSubject payment = new OrderSubject();
        payment.addObserver(waiter);
        
        Checkout checkout = new Checkout(new CreditCardPayment());
        payment.notifyAll(checkout.processPayment(150, 4));
        checkout.setStrategy(new CashPayment());
        payment.notifyAll(checkout.processPayment(100, 2));

    }

}
