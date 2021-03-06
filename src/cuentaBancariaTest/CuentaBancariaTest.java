package cuentaBancariaTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.CuentaBancaria;

public class CuentaBancariaTest {

	CuentaBancaria cuenta1=new CuentaBancaria(101,10);
	CuentaBancaria cuenta2=new CuentaBancaria(102,5);
	boolean resultTransaccion;
	@Test
	public void testTransferirMontoHacia() {
		cuenta1.transferirMontoHacia(1,cuenta2);
		Assert.assertEquals(6, cuenta2.getSaldo(),0);
		Assert.assertEquals(9, cuenta1.getSaldo(),0);
		
		cuenta1.transferirMontoHacia(2, cuenta2);
		Assert.assertEquals(8, cuenta2.getSaldo(),0);
		Assert.assertEquals(7, cuenta1.getSaldo(),0);
		
		resultTransaccion=cuenta1.transferirMontoHacia(10, cuenta2);
		Assert.assertEquals(false,resultTransaccion );
		
		resultTransaccion=cuenta1.transferirMontoHacia(-5, cuenta2);
		Assert.assertEquals(false,resultTransaccion );
	}

}
