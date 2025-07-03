package ExportadorDatos.exportador;


public class Xml implements Exportador {
    public void exportar(String datos) {
        System.out.println("Exportando datos a XML: " + datos);
    }

}