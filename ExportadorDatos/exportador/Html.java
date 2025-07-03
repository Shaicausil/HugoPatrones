package ExportadorDatos.exportador;



public class Html implements Exportador {
    public void exportar(String datos) {
        System.out.println("Exportando datos a HTML: " + datos);
    }
}
