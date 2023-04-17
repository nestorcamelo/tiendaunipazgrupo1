
public class Celular extends ProductoElectronico{
    public String operador;

    public Celular(int codigo, String sistemaOperativo, String marca, String modelo, double precio, String operador) {
        super(codigo, sistemaOperativo, marca, modelo, precio);
        this.operador = operador;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getOperador() {
        return operador;
    }

    //@Override
    public String mostrarCelulares() {
        
        return "CODIGO:"+codigo+". MARCA:"+marca + ". MODELO: " + modelo + ". SISTEMA O.(" + sistemaOperativo + ") - $" + precio+" OPERADOR:"+operador;
    }
}
