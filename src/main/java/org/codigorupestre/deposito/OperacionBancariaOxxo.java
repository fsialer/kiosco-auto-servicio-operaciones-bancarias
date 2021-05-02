package org.codigorupestre.deposito;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class OperacionBancariaOxxo {
	
	private static final Logger LOG= Logger.getLogger(OperacionBancariaOxxo.class.getName());
	private String numeroTarjeta;
	private BigDecimal monto;
	
	public void depositar() {
		LOG.info("Se realizo el DEPOSITO de forma exitosa.");
		LOG.info("Numero de tarjeta: "+this.numeroTarjeta);
		LOG.info("Monto: "+this.monto);
	}
	
	public OperacionBancariaOxxo(String numeroTarjeta,BigDecimal monto) {
		this.numeroTarjeta=numeroTarjeta;
		this.monto=monto;
	}
	
	public void retirar() {
		LOG.info("Se realizo el RETIRO de forma exitosa.");
		LOG.info("Numero de tarjeta: "+this.numeroTarjeta);
		LOG.info("Monto: "+this.monto);
	}

}
