
package start;

import java.util.Scanner;

public class Size extends Coffe {
 public  Scanner jr = new Scanner(System.in);
public int SS;
 @Override //This is overriding 
void Coffes(){
  System.out.println("The Size of your coffe \n 1. Small \n 2.Medium \n 3.Large"); 
    this.SS=jr.nextInt(); // Use "This" Keyword In here 
  
  switch (SS) {
        
        case 1:
            System.out.println("You Select Small");           
              int A=1;
            break;
            
            case 2:
                 System.out.println("You Select Medium");
              
            break;
            
            case 3:
            System.out.println("You Select large");
            break;
            
           
            
        default:
            System.out.println("You Select Wrong Choosice");
  }
  }
}  



