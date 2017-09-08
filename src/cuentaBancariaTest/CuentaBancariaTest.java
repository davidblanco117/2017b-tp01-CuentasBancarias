package cuentaBancariaTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.CuentaBancaria;

public class CuentaBancariaTest {

	CuentaBancaria cuenta1=new CuentaBancaria(101,10);
	CuentaBancaria cuenta2=new CuentaBancaria(102,5);
	
	@Test
	public void testTransferirMontoHacia() {
		cuenta1.transferirMontoHacia(1,cuenta2);
		Assert.assertEquals(6, cuenta2.getSaldo(),0);
	}

}
