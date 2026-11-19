public class App {
    public static void main(String[] args) {
        //creamos eventos
        EventoUniversitario eventouni1 = new EventoUniversitario("1", "clase jueves", 500.0, false);
        EventoUniversitario eventouni2 = new EventoUniversitario("2" , "clase sabado" , 250.0, false );
        EventoUniversitario eventouni3 = new EventoUniversitario("4", "clase domingo", 00.0 , true);
        //eventos copia
        EventoUniversitario eventouni4 = new EventoUniversitario(eventouni1);
        EventoUniversitario eventouni5 = new EventoUniversitario(eventouni2);
        EventoUniversitario eventouni6 = new EventoUniversitario(eventouni3);
        //mostramos datos
        System.out.println("DATOS DEL EVENTO 1");
        eventouni1.mostrarDatos();

        System.out.println("DATOS DEL EVENTO 2");
        eventouni2.mostrarDatos();

        System.out.println("DATOS DEL EVENTO 3");
        eventouni3.mostrarDatos();

        System.out.println("DATOS DEL EVENTO 4");
        eventouni4.mostrarDatos();

        System.out.println("DATOS DEL EVENTO 5");
        eventouni5.mostrarDatos();

        System.out.println("DATOS DEL EVENTO 6");
        eventouni6.mostrarDatos();

        System.out.println("Cantidad total de eventos: " + EventoUniversitario.getCantidadEventos());
    }
}