import java.util.ArrayList;
public class Composición {
    private String titulo;
    private int duracionMin;
    private int duracionSeg;
    private String genero;
    private String fechaRegistro;
    private String fechaEstreno;

    private ArrayList<String> interpretes;
    private ArrayList<Solicitud> solicitudes;


    public Composición(String titulo, int duracionMin, int duracionSeg,
                       String genero, String fechaRegistro, String fechaEstreno) {
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.duracionSeg = duracionSeg;
        this.genero = genero;
        this.fechaRegistro = fechaRegistro;
        this.fechaEstreno = fechaEstreno;


        interpretes = new ArrayList<>();
        solicitudes = new ArrayList<>();


    }
    public void agregarInterprete(String nombre){
        interpretes.add(nombre);
    }
    public void agregarSolicitud(Solicitud s){
        solicitudes.add(s);
        interpretes.add(s.getNombreInterprete());
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }
    @Override
    public String toString() {
        return "Composición{" +
                "titulo='" + titulo + '\'' +
                ", duracionMin=" + duracionMin +
                ", duracionSeg=" + duracionSeg +
                ", genero='" + genero + '\'' +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                ", fechaEstreno='" + fechaEstreno + '\'' +
                '}';
    }
}
