public class Producto {
    private int id;
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;

    public Producto(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = generarCodigo(nombre, marca);
    }

    private String generarCodigo(String nombre, String marca) {
        String letras = nombre.substring(0, 3).toUpperCase() + marca.substring(0, 2).toUpperCase();
        int numero = (int)(Math.random() * 900) + 100; // número aleatorio de 3 cifras
        return letras + numero;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public double getPrecio() { return precio; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "ID: " + id + " | Código: " + codigo + " | Nombre: " + nombre + " | Marca: " + marca + " | Precio: $" + precio;
    }
}
