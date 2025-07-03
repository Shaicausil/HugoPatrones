package ExportadorDatos;

import ExportadorDatos.fabrica.FabricaExportador;
import ExportadorDatos.fabrica.FabricaHtml;
import ExportadorDatos.fabrica.FabricaJson;
import ExportadorDatos.fabrica.FabricaXml;

public class MainExportador {

    public static void main(String[] args) {
        FabricaExportador fabrica;

        fabrica = new FabricaJson();
        fabrica.exportarDatos("{nombre:'Juan', edad:30}");

        fabrica = new FabricaXml();
        fabrica.exportarDatos("<persona><nombre>Juan</nombre></persona>");

        fabrica = new FabricaHtml();
        fabrica.exportarDatos("<h1>Título</h1>");
    }
}
