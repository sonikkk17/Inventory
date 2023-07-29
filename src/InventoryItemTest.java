
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sofia
 */
public class InventoryItemTest {

  
public InventoryItemTest(){
    InventoryItem[] itemArray = new InventoryItem[50];
    
   
    Scanner scan=new Scanner(System.in);
   
 
 String name,type,input;
     int number,index;
     name=type="";
     number=index=0;
       
     
       
       do{
         System.out.println("Enter type,name and shelf life/shipping weight(in pounds)");
         input=scan.nextLine();
         if(input.equals("stop")){
             break;
         }else {
             String array[]=input.split(" ");
             type=array[0];
             name=array[1];
              if(type.equals("food")){
               itemArray[index] =  new FoodItem(name,Integer.parseInt(array[2]));
              }else { itemArray[index]=new HouseholdItem(name,Integer.parseInt(array[2]));
              }
            
         }
         
            
         
         index++;
     }while(!name.equalsIgnoreCase("stop"));
     for(int i=0;i<index;i++){
         System.out.println(itemArray[i]+"\n--------------------------------");
     }
     
     
     
 

}
        
    

          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new InventoryItemTest();
        
    

   
    }
}
    
        
