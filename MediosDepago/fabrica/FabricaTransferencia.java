package MediosDepago.fabrica;


import MediosDepago.pagos.MedioDePago;
import MediosDepago.pagos.Transferencia;

public class FabricaTransferencia extends FabricaPago {
    public MedioDePago crearPago() {
        return new Transferencia();
    }
}