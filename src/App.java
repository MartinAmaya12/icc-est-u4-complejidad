
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidadEstudiantes = 30000000;
        int cantidad = 1_000_000;   //formas de represntar cantidades en java
        
        List<Estudiante> estudiantes = Generador.generarListado(cantidadEstudiantes);

        for(Estudiante est: estudiantes){
            System.out.println(est.nombre);
        }

    }
}
