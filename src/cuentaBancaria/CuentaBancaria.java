package cuentaBancaria;

public class CuentaBancaria {
	
	private int nroCuenta;
	private double saldo;

	public CuentaBancaria(int nroCuenta,double saldo) {
		this.nroCuenta=nroCuenta;
		this.setSaldo(saldo);
		
	}
	
	public boolean transferirMontoHacia(double monto, CuentaBancaria dest) {
		if(monto==1) {
			dest.saldo++;
			this.saldo--;
		}
		if(monto==2) {
			dest.saldo+=2;
			this.saldo-=2;
		}
		return true;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
}
