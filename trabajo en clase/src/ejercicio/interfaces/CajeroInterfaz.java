package ejercicio.interfaces;

public interface CajeroInterfaz {
	public void solicitarTarjeta(String numero);
	
	public void solicitarClave(String clave);
	
	public void solicitarTipoTranssaccion();
	
	public void solicitarMonto(int monto);
	
	public void validarSaldo();
	
	public void entregarDinero();
	
	public void realizarTransaccion();
	
	public void entregarRecibo();
	

}
