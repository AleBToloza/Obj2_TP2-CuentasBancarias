package CuentasBancariasTest;

import CuentasBancarias.cuentaSueldo;

public class TestCuentasBancarias {        
	public static void main(String[] args) {
		
		cuentaSueldo cuentaSueldoGutierrez = new cuentaSueldo();
		
		System.out.println("SaldoDiponible: " + cuentaSueldoGutierrez.consultaSaldo());
		System.out.println("SaldoDepositadoCorrectamente: " + cuentaSueldoGutierrez.depositarDineroEnCuenta(3000));
		System.out.println("SaldoExtraidoCorrectamente: " + cuentaSueldoGutierrez.extraerDineroEnCuenta(3000));
		System.out.println("SaldoExtraidoCorrectamente: " + cuentaSueldoGutierrez.extraerDineroEnCuenta(3000));
		System.out.println("SaldoDepositadoCorrectamente: " + cuentaSueldoGutierrez.depositarDineroEnCuenta(3000));
		System.out.println("SaldoDiponible: " + cuentaSueldoGutierrez.consultaSaldo());
	}
}
