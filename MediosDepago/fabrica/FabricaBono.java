package MediosDepago.fabrica;


import MediosDepago.pagos.Bono;
import MediosDepago.pagos.MedioDePago;

public class FabricaBono extends FabricaPago {
    public MedioDePago crearPago() {
        return new Bono();
    }
}
