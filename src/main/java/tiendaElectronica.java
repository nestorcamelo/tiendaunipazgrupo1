

import java.util.Scanner;
import javax.swing.JOptionPane;
public class tiendaElectronica {
   
public static int miMetodo(ProductoElectronico[] carrito, int indice) {
    
    Laptop lap[] = new Laptop[2];
        lap[0]= new Laptop(432,"Window 10","Lenovo","Gaming 34cG",989,15.5,"549 GB SDD");
        lap[1]= new Laptop(585,"Window 11","HP","Optimous prime RX",1399,16.5,"1250 GB SDD");
        
        Televisor tele[] = new Televisor[2];
        tele[0] = new Televisor(357,"WebOS","LG","Pro F5G",699,59);
        tele[1] = new Televisor(743,"Tizen","Samsung","Sam RE8",899,79);
        
        Celular celu[] = new Celular[2];
        celu[0] = new Celular(267,"Android 12.5","Samsung","S20 PLUS",799,"Claro");
        celu[1] = new Celular(684,"iOS 16.5","Apple","Iphone 11",989,"Claro");
        
      // ProductoElectronico[] carrito = new ProductoElectronico[6];
            int prod=1;
           // int indice = 0;
            
        while(prod!=0){
            prod = Integer.parseInt(JOptionPane.showInputDialog("***CATALOGO***        Carrito["+indice+"]\n"
                    + "\nCELULARES\n"
            +celu[0].mostrarCelulares()+"\n"
            +celu[1].mostrarCelulares()+"\n"
            +"\nLAPTOPS\n"
            +lap[0].mostrarLaptop()+"\n"
            +lap[1].mostrarLaptop()+"\n"
            +"\nTELEVISORES\n"
            +tele[0].mostrarTelevisores()+"\n"
            +tele[1].mostrarTelevisores()+"\n"
            +"\n***ESCRIBE EL CODIGO DEL PRODUCTO QUE DESEA AGREGAR AL CARRITO.***\n"
                    + "- Si desea ver su carrito escribe el numero 0"));
        
        
           
        for (int i = 0; i < celu.length; i++) {
          if (celu[i].getCodigo() == prod) {
             carrito[indice] = celu[i];
             indice++;
             JOptionPane.showMessageDialog(null, "Celular: ["+celu[i].getModelo()+"] Agregado al carrito");
              break; // Si se encuentra el objeto, salimos del bucle
          }
        }
        for (int i = 0; i < tele.length; i++) {
          if (tele[i].getCodigo() == prod) {
             carrito[indice] = tele[i];
             indice++;
             JOptionPane.showMessageDialog(null, "Televisor: ["+tele[i].getModelo()+"] Agregado al carrito");
              break; // Si se encuentra el objeto, salimos del bucle
            }
        }
        for (int i = 0; i < lap.length; i++) {
          if (lap[i].getCodigo() == prod) {
             carrito[indice] = lap[i];
             indice++;
             JOptionPane.showMessageDialog(null, "Laptop: ["+lap[i].getModelo()+"] Agregado al carrito");
              break; // Si se encuentra el objeto, salimos del bucle
              
            }
        }
       
       }
       
       return indice;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        ProductoElectronico[] carrito = new ProductoElectronico[6];
        int indice = 0;
       
           int ca=3;
           miMetodo(carrito,indice);
         
           while(ca>2){
               
               double subtotal=0;
           double total=0;
           double iva=0;
           int contador =0;
            String result="";
            for(int i = 0; i < carrito.length && carrito[i] != null; i++){
                contador++;
               result+= carrito[i].mostrarProductos() + "\n\n";
               subtotal =subtotal+carrito[i].getPrecio();
              }
            iva=subtotal*0.19;
            total = iva + subtotal;
            ca = Integer.parseInt(JOptionPane.showInputDialog(null,"**CARRITO**\n\n"+result+""
                    + "IVA: 19%     SUBTOTAL: "+subtotal+"   TOTAL PAGAR: "+String.format("%.1f", total)+""
                   + "\n\n\n- Escribe 1 si desea agregar mas productos al carrito.\n"
                   + "- Escribe 2 para proceder con el pago."
                   + "\n- Si desea elimiar un producto del carrito, escribe el codigo del producto."));
            
            if(ca==2){
                JOptionPane.showMessageDialog(null,"**FACTURA No 7363**\n\n"+result+""
                    + "IVA: 19%     SUBTOTAL: "+subtotal+"   TOTAL PAGAR: "+String.format("%.1f", total)+""
                            + "\n\n ***GRACIAS POR SU COMPRA***");
            }else if(ca==1){
                ca=3;
                System.out.println("Valor indice: "+contador);
                miMetodo(carrito,contador);
                
            }else if(ca!=0 && ca!=1 && ca!=2){
                // buscar el índice del dato a eliminar
              int indexAEliminar = -1;
                  for (int i = 0; i < carrito.length && carrito[i] != null; i++) {
                    if (carrito[i].getCodigo() == ca) {
                      indexAEliminar = i;
                        break;
                           }
                      }
                  
                  if (indexAEliminar != -1) { // si el dato a eliminar existe en el arreglo
                          // mover los elementos hacia arriba
                          contador--;
                    for (int i = indexAEliminar; i < carrito.length - 1; i++) {
                      carrito[i] = carrito[i + 1];
                     }
                    carrito[carrito.length - 1] = null; // asignamos null a la última fila para eliminar el dato sobrante
                   }
             }
            

           }
           
           
          // JOptionPane.showMessageDialog(null,cel[0].mostrarCelulares()+"\n"+cel[1].mostrarCelulares());
           
        
        
        
        
        
        
        
        
        
        
        
 }
}