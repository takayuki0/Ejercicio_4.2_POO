import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Producto> productos;

    public Catalogo() {
        productos = new ArrayList();
    }

    public void llenarCatalogo() {

        productos.add(new Libro("Sun", "Tzu", "El Arte de la Gerra", 25));
        productos.add(new Libro("Robert", "Kiyosaki", "Padre Rico Padre Pobre", 30));
        productos.add(new Libro("Robin", "S. Sharma", "El Club de las 5 de la Mañana", 40));
        productos.add(new Pelicula("Braindead", "Timothy", "Balme", "Peter", "Jackson", 45));
        productos.add(new Pelicula("The Lord of the Ring", "Elijah", "Wood", "Peter", "Jackson", 60));
        productos.add(new Pelicula("Forrest Gump", "Tom", "Hanks", "Robert", "Zemeckis", 65));
    }

    public void mostrarCatalogo() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    //A continuación esta clase deberá tener los siguientes métodos
    //Agrega el Producto p al catálogo.
    public void agregarProducto(Producto p) {
        System.out.println("El producto ha sido agregado con éxito al catalogo.");
        productos.add(p);
    }

    //Elimina el producto cuyo identificador único es id.
    public void eliminarProducto(Integer id) {
        System.out.println("El Producto " + (id) + " ha sido eliminado con éxito!" +
                "\n________________________________________________________________");
        productos.remove(id - 1);
    }

    //Devuelve, contenidos en un Catalogo, a todos los Productos cuyo título es titulo.
    public void buscarTitulo(String titulo) {
        int contador = 0;
        for (Producto producto : productos) {
            if (producto.getTituloProducto().equals(titulo)) {
                System.out.println("Titulo Encontrado:\n" + producto.toString());
            } else {
                contador++;
            }
        }
        if (contador == productos.size()) {
            System.out.println("El título: " + titulo + " no se encuentra disponible" +
                    "\n________________________________________________________________");
        }
    }

    //Devuelve, contenidos en un Catalogo, a todos los Productos cuyo autor, director o protagonista, según sea el caso, es p.
    public void buscarPersona(Persona p) {
        int contador = 0;
        for (Producto producto : productos) {
            if (producto.equals(p)) {
                System.out.println("Producto/s que coinciden con tu busqueda: ");
                System.out.println(producto);
            } else {
                contador++;
            }
        }
        if (contador == productos.size()) {
            System.out.println(("El nombre no coincide con ningún producto del catalogo" +
                    "\n________________________________________________________________").toUpperCase());
        }
    }
}