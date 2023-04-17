

import java.util.Scanner;
import javax.swing.JOptionPane;
public class tiendaElectronica {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codigo=0;
        String sistemaOperativo;
        String marca;
        String modelo;
        double precio;
        String operador;
        double tamanoPantalla;
        int tipo =0;

        Laptop lap[] = new Laptop[3];
        Televisor tele[] = new Televisor[3];
        
         tipo = Integer.parseInt(JOptionPane.showInputDialog("Seleccione tipo de producto a agregar al inventario: 1) Celular. 2)Laptop. 3)Televisor. "));
        if(tipo==1){
            //System.out.println(cel[0].mostrarCelulares());
           int can = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos celulares agregaras al inventario?"));
           Celular cel[] = new Celular[can];
           for(int i=0;i<cel.length;i++){
              
               codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo celular "+(i + 1)));
               sistemaOperativo = JOptionPane.showInputDialog("Sistema operativo celular"+(i + 1));
               marca = JOptionPane.showInputDialog("Marca: celular"+(i + 1));
               modelo = JOptionPane.showInputDialog("Modelo: celular"+(i + 1));
               precio = Double.parseDouble(JOptionPane.showInputDialog(null," Precio: "+(i + 1)));
               operador = JOptionPane.showInputDialog("Operador celular"+(i + 1));
            //JOptionPane.showInputDialog("datos: "+codigo+" "+sistemaOperativo+" "+marca+" "+modelo+" "+precio+" "+operador);
               cel[i] = new Celular(codigo,sistemaOperativo,marca,modelo,precio,operador);
               JOptionPane.showMessageDialog(null,"Celular # "+(i + 1)+"Agregado con exito");
           }
           JOptionPane.showMessageDialog(null,cel[0].mostrarCelulares()+"\n"+cel[1].mostrarCelulares());
        }
        
        
        
        
        
        
        
 }
}