
public class Laptop extends ProductoElectronico {
    public double tamanoPantalla;
    public String discoduro;

    public Laptop(int codigo, String sistemaOperativo, String marca, String modelo, double precio, double tamanoPantalla,
            String discoduro) {
        super(codigo, sistemaOperativo, marca, modelo, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.discoduro = discoduro;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public String getDiscoduro() {
        return discoduro;
    }
    

    //@Override
    public String mostrarLaptop() {
        return "CODIGO:"+codigo+". MARCA:"+marca + ".  MODELO: " + modelo + ".  SISTEMA O.(" + sistemaOperativo + ") -  $" + precio+"  PANTALLA:"+tamanoPantalla+" P"
                +"  DISCO DURO: "+discoduro;
    }
}
