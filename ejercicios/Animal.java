public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando.");
    }
}

public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Fido");
        miPerro.comer();
        miPerro.ladrar();
    }
}
