package ExportadorDatos.fabrica;


import ExportadorDatos.exportador.Exportador;

public abstract class FabricaExportador {
    public void exportarDatos(String datos) {
        Exportador exportador = crearExportador();
        exportador.exportar(datos);
    }

    public abstract Exportador crearExportador();
}