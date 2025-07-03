package ExportadorDatos.fabrica;


import ExportadorDatos.exportador.Exportador;
import ExportadorDatos.exportador.Xml;

public class FabricaXml extends FabricaExportador {
    public Exportador crearExportador() {
        return new Xml();
    }
}