package MVC.modelo;

public class Tareas {
    private String titulo;
    private String descripcion;
    private boolean realizada;

    public Tareas(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.realizada = false;
    }


    public String getTitulo() {
        return titulo; }

    public String getDescripcion() {
        return descripcion; }

    public boolean isRealizada() {
        return realizada; }

    public void marcarComoRealizada() {
        this.realizada = true;
    }
}
