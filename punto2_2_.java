package PUNTO2;

import java.util.Scanner;

public class punto2_2_ {
    public void recibo(){
        Scanner leer = new Scanner(System.in);
        int salir;
        double saldoinicial;               
        double abono;               
        double deducciones;               
        double limitecred;               
                
        System.out.println("\nIntroduzca el numero de cuenta del cliente o 0 (cero) para terminar: \n");   
        salir = leer.nextInt();
                               
        while(0 != salir){
        
            System.out.println("\nIntroduzca el saldo inicial del mes: \n");           
            saldoinicial = leer.nextDouble();              
                
            System.out.println("\nIntroduzca el total de abonos del mes: \n");       
            abono = leer.nextDouble();
            System.out.println("\nIntroduzca el total de deducciones aplicadas a la cuenta del cliente en el mes: \n");        
            deducciones = leer.nextDouble();              
                
            System.out.println("\nIntroduzca el limite de credito permitido: \n");      
            limitecred = leer.nextDouble();              
                    
            double x = Retorna(saldoinicial, abono, deducciones);           
            if( x - limitecred > 0)
                System.out.println("\nEl credito se ha excedido.\n");                         
        } 
    }           
    public double Retorna( double saldoini, double pagos, double cargos){           
        return saldoini + pagos - cargos;
    }
    
}
