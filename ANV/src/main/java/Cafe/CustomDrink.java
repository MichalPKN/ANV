/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafe;

/**
 *
 * @author michal.pokorny
 */
public class CustomDrink {
    private String base;
    private boolean milk;
    private boolean sugar;
    private boolean caramel;
    
    public static class Builder {
        private String base;
        private boolean milk = false;
        private boolean sugar = false;
        private boolean caramel = false;
        
        public Builder(String name){
            this.base = name;
        }
        
        public Builder milk(){
            this.milk = true;
            return this;
        }
        
        public Builder sugar(){
            this.sugar = true;
            return this;
        }
        
        public Builder caramel(){
            this.caramel = true;
            return this;
        }
        
        public CustomDrink build(){
            return new CustomDrink(this);
        }
    }
    
    private CustomDrink(Builder B){
        this.base = B.base;
        this.milk = B.milk;
        this.sugar = B.sugar;
        this.caramel = B.caramel;
    }
    
    @Override
    public String toString(){
        return DrinkFactory.createDrink(base).serve()
            + (milk ? ", milk" : "")
            + (sugar ? ", sugar" : "")
            + (caramel ? ", caramel" : "");
    }
    
}
