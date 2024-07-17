public class Color {
    // Enumeración de colores
    public enum Colores {
        Rojo, Verde, Morado
    }

    public static void main(String[] args) {
        // Uso del enum para almacenar un color favorito
        Colores miColorFavorito = Colores.Morado;

        // Imprimir el color favorito
        System.out.println("Mi color favorito es " + miColorFavorito);
    }
}
