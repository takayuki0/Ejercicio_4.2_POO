public abstract class Producto {

    private String tituloProducto;
    private float precioProducto;
    private final Integer productoId;
    private static Integer ID = 1;

    public Producto(String tituloProducto, float precioProducto) {
        this.tituloProducto = tituloProducto;
        this.precioProducto = precioProducto;
        productoId = ID;
        ID++;
    }

    public String getTituloProducto() {
        return tituloProducto;
    }

    public void setTituloProducto(String tituloProducto) {
        this.tituloProducto = tituloProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getProductoId() {
        return productoId;
    }
}