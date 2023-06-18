public class Main {
    public static void main(String[] args) {

    Catalogo miCatalogo = new Catalogo();
    miCatalogo.llenarCatalogo();
    miCatalogo.agregarProducto(new Libro("Marcel", "Moyse", "De la Sonorite Art et Technique", 120));
    miCatalogo.agregarProducto(new Pelicula("The Shawshank Redemption", "Tim", "Robbins", "Frank", "Darabont", 45));
    miCatalogo.mostrarCatalogo();
    miCatalogo.eliminarProducto(4);
    miCatalogo.mostrarCatalogo();
    miCatalogo.buscarTitulo("Braindead");
    miCatalogo.buscarTitulo("JoJo's Bizarre Adventure");
    miCatalogo.buscarTitulo("Forrest Gump");
    miCatalogo.buscarPersona(new Persona("Dante", "Alighieri"));



    }
}
