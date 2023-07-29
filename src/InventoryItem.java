/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sofia
 */
public class InventoryItem {
    private String name;
    
    
    public InventoryItem(String nam){
       name=nam;
       
    }
 public InventoryItem(){
     
 }
    
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    
    @Override
    public String toString(){
        
        
        
        
        return getClass().getSimpleName()+" : " +name;
        
    }
    
}
