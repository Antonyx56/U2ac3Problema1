public class Solicitud {
    private String nombreInterprete;
    private String fechaSolicitud;
    private String fechaAutorizacion;
    private String companiaGrabacion;

    public Solicitud(String nombreInterprete, String fechaSolicitud, String fechaAutorizacion, String companiaGrabacion) {
        this.nombreInterprete = nombreInterprete;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaAutorizacion = fechaAutorizacion;
        this.companiaGrabacion = companiaGrabacion;
    }

    public String getNombreInterprete() {
        return nombreInterprete;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public String getFechaAutorizacion() {
        return fechaAutorizacion;
    }


    public void setNombreInterprete(String nombreInterprete) {
        this.nombreInterprete = nombreInterprete;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public void setFechaAutorizacion(String fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public void setCompaniaGrabacion(String companiaGrabacion) {
        this.companiaGrabacion = companiaGrabacion;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "nombreInterprete='" + nombreInterprete + '\'' +
                ", fechaSolicitud='" + fechaSolicitud + '\'' +
                ", fechaAutorizacion='" + fechaAutorizacion + '\'' +
                ", companiaGrabacion='" + companiaGrabacion + '\'' +
                '}';
    }
}
