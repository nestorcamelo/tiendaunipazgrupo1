
public class Laptop extends ProductoElectronico {
    public double tamanoPantalla;

    public Laptop(int codigo, String sistemaOperativo, String marca, String modelo, double precio, double tamanoPantalla) {
        super(codigo, sistemaOperativo, marca, modelo, precio);
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    //@Override
    public String mostrarLaptop() {
        return "CODIGO:"+codigo+". MARCA:"+marca + ". MODELO: " + modelo + ". SISTEMA O.(" + sistemaOperativo + ") - $" + precio+" PANTALLA:"+tamanoPantalla+"P";
    }
}
