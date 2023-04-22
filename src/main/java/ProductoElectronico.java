
public class ProductoElectronico {
    public int codigo;
    public String sistemaOperativo;
    public String marca;
    public String modelo;
    public double precio;
   
    public ProductoElectronico(int codigo, String sistemaOperativo, String marca, String modelo, double precio) {
        this.codigo = codigo;
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
   
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

   // @Override
    public String mostrarProductos() {
        return "CODIGO: "+codigo+" MARCA: "+marca + "  MODELO: " + modelo + "  SISTEMA O. : (" + sistemaOperativo + ") - PRECIO: $" + precio;
    }
    
   
}


