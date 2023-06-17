import Servicios.PersonaServicio;
import Entidades.Persona;
import Excepciones.ExcepcionPersona;

public class App {
    public static void main(String[] args) throws NullPointerException, ExcepcionPersona {

        /*
         * Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
         * de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
         * con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
         */
        ///
        PersonaServicio servicio = new PersonaServicio();
        ///
        Persona p = null;
        try {
            servicio.esMayorDeEdad(p);

        } catch (NullPointerException e){
           System.out.println(e.getMessage());
        } finally {
            System.out.println("***");
        }
        

    //     Persona Andres = servicio.crearPersona();
    //     Persona Bere = servicio.crearPersona();
    //     Persona Juanca = servicio.crearPersona();
    //     Persona Mabel = servicio.crearPersona();
    //     ///
    //     boolean[] edades = new boolean[4];
    //     ///
    //     edades[0] = servicio.esMayorDeEdad(Andres);
    //     edades[1] = servicio.esMayorDeEdad(Bere);
    //     edades[2] = servicio.esMayorDeEdad(Juanca);
    //     edades[3] = servicio.esMayorDeEdad(Mabel);
    //     ///
    //     int[] IMCs = new int[4];
    //     IMCs[0] = servicio.calcularIMC(Andres);
    //     IMCs[1] = servicio.calcularIMC(Bere);
    //     IMCs[2] = servicio.calcularIMC(Juanca);
    //     IMCs[3] = servicio.calcularIMC(Mabel);
    //     ///
    //     System.out.println(Andres.toString());
    //     System.out.println(Bere.toString());
    //     System.out.println(Juanca.toString());
    //     System.out.println(Mabel.toString());
    //     ///
    //     System.out.println("El Array de booleanos: ");
    //     for (boolean i : edades) {

    //         System.out.print(" " + i);
    //     }
    //     System.out.println("");
    //     ///
    //     System.out.println("El Array de IMCs: ");
    //     for (int i : IMCs) {

    //         System.out.print(" " + i);
    //     }
    //     System.out.println("");
    //     ///
    //     double promedio = 0;
    //     for (boolean i : edades) {
    //         int contador = 0;
    //         if (i == true) {
    //             contador++;
    //         }
    //         promedio = (contador * 100) / edades.length;
    //     }
    //     System.out.println("Promedio mayores: " + promedio + "%");
    //     ///
    //     int contadorObesos = 0;
    //     int contadorNormales = 0;
    //     int contadorFlacos = 0;
    //     double promedioObesos = 0;
    //     double promedioNormales = 0;
    //     double promedioFlacos = 0;
    //     for (int i : IMCs) {
    //         if (i > 0) {
    //             contadorObesos++;
    //         }
    //         if (i == 0) {
    //             contadorNormales++;

    //         }
    //         if (i < 0) {
    //             contadorFlacos++;
    //         }
    //         promedioObesos = (contadorObesos * 100) / IMCs.length;
    //         promedioNormales = (contadorNormales * 100) / IMCs.length;
    //         promedioFlacos = (contadorFlacos * 100) / IMCs.length;
    //     }
    //     System.out.println("El promedio de Sobrepeso es de: " + promedioObesos + "%");
    //     System.out.println("El promedio de Normales es: " + promedioNormales + "%");
    //     System.out.println("El promedio de bajo peso es: " + promedioFlacos + "%");
    }
}
