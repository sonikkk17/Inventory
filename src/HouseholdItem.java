/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sofia
 */
public class HouseholdItem extends InventoryItem {
    private int shippingCost;
    private int weight;
    public static final int COST_PER_POUND=5;
    
    
    public HouseholdItem(String name){
        super(name);
    }
    public HouseholdItem( String name,int weight){
       super(name);
       this.weight=weight;
       
    }
    
    public int calcShippingCost(){
        shippingCost=COST_PER_POUND*weight;
        return shippingCost;
    }
    @Override
    public String toString(){ 
        
        return super.toString()+"\nWeightin pounds : "+weight+"\nShipping cost :"+this.calcShippingCost();
        
    }
}
