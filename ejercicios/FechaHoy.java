import java.time.LocalDate;

public class FechaHoy {
    public static void main(String[] args) {
        LocalDate fechaHoy = LocalDate.now();
        System.out.println("La fecha de hoy es: " + fechaHoy);
    }
}