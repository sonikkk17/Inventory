
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sofia
 */
public class FoodItem extends InventoryItem {
   
    private DateTimeFormatter expiryDayFormat;
   private int shelfLife;
    
    public FoodItem(String name,int shelfLife){
        super(name);
        this.shelfLife=shelfLife;
     
    }
    public String calcExpiryDate(){
         this.expiryDayFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDateTime now =LocalDateTime.now();
         
       
       LocalDateTime expiryDay = now.plusDays(shelfLife);
        
     return expiryDay.format(expiryDayFormat);
    }
   
    @Override
    public String toString(){
        return super.toString()+"\nshelf Life : "+shelfLife+"\nRemove from shelf on : "+this.calcExpiryDate() ;
    }
    
}
