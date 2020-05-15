package com.empregado.CrudEmpregado.rest;

public class EmpregadoNotFoundException extends RuntimeException{

	public EmpregadoNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmpregadoNotFoundException(String message) {
		super(message);
	}

	public EmpregadoNotFoundException(Throwable cause) {
		super(cause);
	}
	
	

}
