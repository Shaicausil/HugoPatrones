package ExportadorDatos.exportador;

public class Json implements Exportador {
    public void exportar(String datos) {
        System.out.println("Exportando datos a JSON: " + datos);
    }
}