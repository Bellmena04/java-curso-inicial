public class Color {

    public enum Colores {
        Rojo, Verde, Morado
    }

    public static void main(String[] args) {
       
        Colores miColorFavorito = Colores.Morado;

       
        System.out.println("Mi color favorito es " + miColorFavorito);
    }
}
