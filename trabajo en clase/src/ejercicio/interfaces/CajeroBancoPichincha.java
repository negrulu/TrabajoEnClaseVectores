package ejercicio.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz{

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a Banco Pichincha");
		System.out.println("Por favor ingrese su tarjeta");
		
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su clave");
	}

	@Override
	public void solicitarTipoTranssaccion() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese que tipo de transaccion necesita");
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("ingrese el monto que va a retirar");
	}

	@Override
	public void validarSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Espere un momento");
		System.out.println("Se esta validando su saldo");
		System.out.println("Espere un momento");
		
		int saldo=200;
		int retiro=100;
		System.out.println("Usted tiene "+saldo+" seguro que desea retirar "+retiro);
		System.out.println("de su saldo total?");
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Su dinero esta siendo entregado");
	}

	@Override
	public void realizarTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Mientras se imprime el dinero");
		System.out.println("Se completara la transaccion");
	}

	@Override
	public void entregarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Se esta imprimiendo su recibo");
		System.out.println("Gracias por preferirnos");
		System.out.println("En confianza, siempre");
	}

}
