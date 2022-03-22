package PUNTO1;

public class punto1{
    
    public static void main(String[] args) {
        
        int productos [] = {2351, 1282, 2668, 2931, 5123};
        float precio[] = {5700, 3900, 1200, 40000, 7300};
        int cantidad[] = {1, 2, 7, 3, 9};
        int mayor = (int) precio[0]; 
        int Mayor = (int) cantidad[0]; 
        float Vtotal = 0;
        float aux = 0;
        int aux2 = 0;
        int Valdia = 0;
        for (int i=0; i<productos.length; i++){
            System.out.println("EL producto con indentificaion "+productos[i]);
            System.out.println("Tiene un precio de "+precio[i]+" Y se vendieron "+cantidad[i]);
            System.out.println(" ");
            
            Vtotal = (precio[i]*cantidad[i]) + aux;
            aux = Vtotal;
            
            Valdia = (int) (cantidad[i]+ aux2);
            aux2 = Valdia;     
        } 
        
        for (int x=0; x<precio.length; x++){
            if (precio[x]>mayor){
                mayor = (int) precio[x];
            }
            
        }
        for (int y=0; y<cantidad.length; y++){
            if (cantidad[y]> Mayor){
                Mayor = (int) cantidad[y];
            }
            
        }
        System.out.println("Total de productos vendidos al dia: "+Valdia);
        System.out.println(" ");
        System.out.println("La venta en total es: "+Vtotal);
        System.out.println(" ");
        System.out.println("El producto mas vendido: "+Mayor);
        System.out.println(" ");
        System.out.println("El producto con mayor precio: "+mayor);
     
    }
}
