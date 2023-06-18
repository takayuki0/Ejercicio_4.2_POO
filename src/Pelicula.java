public class Pelicula extends Producto {
    private Persona protagonistaPelicula;
    private Persona directorPelicula;

    public Pelicula(String tituloProducto, String nombreProtagonista, String apellidoProtagonista, String nombreDirector, String apellidoDirector, float precioProducto) {
        super(tituloProducto, precioProducto);
        protagonistaPelicula = new Persona(nombreProtagonista, apellidoProtagonista);
        directorPelicula = new Persona(nombreDirector, apellidoDirector);

    }

    public Persona getProtagonistaPelicula() {
        return protagonistaPelicula;
    }

    public void setProtagonistaPelicula(Persona protagonistaPelicula) {
        this.protagonistaPelicula = protagonistaPelicula;
    }

    public Persona getDirectorPelicula() {
        return directorPelicula;
    }

    public void setDirectorPelicula(Persona directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    public void esIgual(Persona p) {
        if (protagonistaPelicula.esIgual(p) || directorPelicula.esIgual(p)) {
            System.out.println("Los nombres son iguales.");
        } else {
            System.out.println("Los nombres no son iguales.");
        }
    }

    @Override
    public String toString() {
        return "\nPelícula: " + getTituloProducto() +
                "\nPelícula ID: " + getProductoId() +
                "\nProtagonista: " + protagonistaPelicula.getNombre() + " " + protagonistaPelicula.getApellido() +
                "\nDirector: " + directorPelicula.getNombre() + " " + directorPelicula.getApellido() +
                "\nPrecio €: " + getPrecioProducto() +
                "\n________________________________________________________________";
    }
}
