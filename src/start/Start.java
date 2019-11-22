
package start;

public class Start implements CoffeInterface{

 
    
    public static void main(String[] args) {
      
        
            
            Coffe jr = new Coffe();
            jr.Coffes();
            System.out.println("**********");
            Size Po = new Size();
            Po.Coffes();
        System.out.println("****************");
        Price LO = new Price();
        LO.Prices(); 
        
        Start F = new Start();
        CoffeInterface.Staff();
        CoffeInterface.version();
        CoffeInterface.Time();
        
        
    }
    
}
