package CuentasBancarias;

public class cuentaSueldo {
	private  Integer saldoDisponible = 0;
	
	public Integer consultaSaldo() {
		Integer saldoEnCuenta = this.saldoDisponible;
		return saldoEnCuenta;
		}
	
	public Boolean depositarDineroEnCuenta(Integer dineroADepositar) {
		this.saldoDisponible += dineroADepositar;
		Boolean transaccionRealizada = true;
		return transaccionRealizada;
		}
	
	public Boolean extraerDineroEnCuenta(Integer dineroAExtraer) {
		Boolean transaccionRealizada = false;
		if (dineroAExtraer <= this.saldoDisponible) {
			this.saldoDisponible -= dineroAExtraer;
			transaccionRealizada = true;
		}
		return transaccionRealizada;
	}
}