public class DiaSemana {
    // Definición del enum fuera del método main
    public enum Dia {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    public static void main(String[] args) {
        // Uso del enum
        Dia diaActual = Dia.Miercoles;  // Aquí se utiliza "Dia" en lugar de "DiaSemana"

        switch(diaActual) {
            case Domingo:
                System.out.println("Hoy es domingo");
                break;
            case Lunes:
                System.out.println("Hoy es lunes");
                break;
            case Martes:
                System.out.println("Hoy es martes");
                break;
            case Miercoles:
                System.out.println("Hoy es miércoles");
                break;
            case Jueves:
                System.out.println("Hoy es jueves");
                break;
            case Viernes:
                System.out.println("Hoy es viernes");
                break;
            case Sabado:
                System.out.println("Hoy es sábado");
                break;
            default:
                System.out.println("Día no reconocido");
        }
    }
}
