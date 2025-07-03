package MediosDepago.fabrica;


import MediosDepago.pagos.MedioDePago;
import MediosDepago.pagos.Tarjeta;

public class FabricaTarjeta extends FabricaPago {
    public MedioDePago crearPago() {
        return new Tarjeta();
    }
}