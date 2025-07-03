package ExportadorDatos.fabrica;


import ExportadorDatos.exportador.Exportador;
import ExportadorDatos.exportador.Html;

public class FabricaHtml extends FabricaExportador {
    public Exportador crearExportador() {
        return new Html();
    }
}