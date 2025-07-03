package ExportadorDatos.fabrica;


import ExportadorDatos.exportador.Json;
import ExportadorDatos.exportador.Exportador;


public class FabricaJson extends FabricaExportador {
    public Exportador crearExportador() {
        return new Json();
    }
}