package MediosDepago.fabrica;



import MediosDepago.pagos.MedioDePago;

public abstract class FabricaPago {
    public void pagar() {
        MedioDePago pago = crearPago();
        pago.procesarPago();
    }

    public abstract MedioDePago crearPago();
}
