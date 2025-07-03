package MediosDepago;

import MediosDepago.fabrica.FabricaBono;
import MediosDepago.fabrica.FabricaPago;
import MediosDepago.fabrica.FabricaTarjeta;
import MediosDepago.fabrica.FabricaTransferencia;

public class TiendaDePagos {
    public static void main(String[] args) {
        FabricaPago fabrica;

        fabrica = new FabricaTarjeta();
        fabrica.pagar();

        fabrica = new FabricaTransferencia();
        fabrica.pagar();

        fabrica = new FabricaBono();
        fabrica.pagar();
    }
}