
package start;

import java.util.Scanner;


public class Coffe extends Start {

    
Scanner jr = new Scanner (System.in);
public int Co;


void Coffes(){

    System.out.println("Choose your Coffe \n 1. Esspreso \n 2.Trukish Coffe \n 3.Arabic Coffe \n 4.Americano");
    
this.Co = jr.nextInt(); // Use "This" Keyword In here 
    
    switch (Co) {
        
        case 1:
            System.out.println("You Select Esspreso");
            Size AA = new Size();
            AA.Coffes();
            break;
            
            case 2:
            System.out.println("You Select Trukish Coffe");
            Size BB = new Size();
            BB.Coffes();
            break;
            
            case 3:
            System.out.println("You Select Arabic Coffe");
            Size CC = new Size();
            CC.Coffes();
            break;
            
            case 4:
            System.out.println("You Select Americano");
            Size DD = new Size();
            DD.Coffes();
            break;
            
            
        default:
            System.out.println("You Select Wrong Chooice");
    }
    
}


}
 




