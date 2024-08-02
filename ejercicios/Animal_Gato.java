public class Gato extends Animal {
    private int vidasRestantes;

    public Gato(String nombre, int vidas) {
        super(nombre);
        this.vidasRestantes = vidas;
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println(nombre + " el gato come pescado.");
    }

    public int getVidasRestantes() {
        return vidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        this.vidasRestantes = vidasRestantes;
    }
}
