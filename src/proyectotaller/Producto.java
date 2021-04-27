package proyectotaller;

public class Producto {

    private int codigo;
    private String nombre;
    private String telefono;
    private String marca;
    private String modelo; 
    private String placa;
    private String color;
    private String problema;
    private Object ano;
    
     public Producto() {
         
         
         
    } 
    public Producto(int codigo, String nombre, String telefono, String marca, String modelo, String placa, String color, String problema) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.problema = problema;
    }

 



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
  
}
