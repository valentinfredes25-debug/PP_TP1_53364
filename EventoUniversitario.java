public class EventoUniversitario {

    //Atributos de cada instancia de eventouniversitario

    public final String id;
    private String titulo;
    private Double costoBase;
    private Boolean gratuito;

    //Atributo de la clase, compartido por todas las instancias

    private static int cantidadEventos;

    //contador para cantidad de eventos estatico
    static{
        cantidadEventos = 0;
    }

    //Constructor de evento
    public EventoUniversitario (String id, String titulo, Double costoBase, Boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        ++cantidadEventos;
    }

    //Constructor copia evento
    public EventoUniversitario (EventoUniversitario otroeventoUniversitario) {
        this.id = otroeventoUniversitario.id;
        this.titulo = otroeventoUniversitario.titulo;
        this. costoBase = otroeventoUniversitario.costoBase;
        this.gratuito = otroeventoUniversitario.gratuito;
        ++cantidadEventos;
    }

    //METODOS

    //calcular el costo estimado
    public double calcularCostoEstimado (){
        if (gratuito){
            return 0;
        }
        return costoBase;
    }

    //asignar sala
    //void asignarSala (Sala sala){

    //}

    //crear actividad
    //void crearActividad(int id, String titulo, int cupo)

    //mostrar datos
    void mostrarDatos () {
        System.out.println("Id: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Costo estimado: " + calcularCostoEstimado());
        System.out.println("Gratuito: " + gratuito);
        System.out.println("-------------------------------------");
    }

    //setters y getters

    //id
    public String getId(){
        return id;
    }

    //titulo
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    //costo base
    public void setCostoBase (Double costoBase){
        this.costoBase = costoBase;
    }
    public Double getCostoBase(){
        return costoBase;
    }

    //gratuito
    public void setGratuito(Boolean gratuito) {
        this.gratuito = gratuito;
    }
    public Boolean getGratuito(){
        return gratuito;
    }
    public static int getCantidadEventos(){
        return cantidadEventos;
    }

}


