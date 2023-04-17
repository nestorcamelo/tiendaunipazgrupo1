
public class Televisor extends ProductoElectronico {
    private double tamanoPantalla;

    public Televisor(int codigo, String sistemaOperativo, String marca, String modelo, double precio, double tamanoPantalla) {
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
    public String mostrarTelevisores() {
       return "CODIGO:"+codigo+". MARCA:"+marca + ". MODELO: " + modelo + ". SISTEMA O.(" + sistemaOperativo + ") - $" + precio+" PANTALLA:"+tamanoPantalla+"P";
    }
}
