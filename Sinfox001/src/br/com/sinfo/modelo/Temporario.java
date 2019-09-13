package br.com.sinfo.modelo;

import java.util.Date;

public class Temporario extends Funcionario
{
	private Date dataFimDeContrato;

	public Date getDataFimDeContrato() {
		return dataFimDeContrato;
	}

	public void setDataFimDeContrato(Date dataFimDeContrato) {
		this.dataFimDeContrato = dataFimDeContrato;
	}
	
}
