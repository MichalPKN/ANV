/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv1;

/**
 *
 * @author michal.pokorny
 */
public final class CafeConfig {
    private static CafeConfig instance;
    private String name;
    
    private CafeConfig(String name){
        this.name = name;
    }
    
    public static CafeConfig getInstance(String name){
        CafeConfig result = instance;
        if (result != null){
            return result;
        }
        synchronized(CafeConfig.class){
            if (instance == null){
                instance = new CafeConfig(name);
            }
            return instance;
        }
    }
    
    public String getCafeName(){
        return name;
    }
}
