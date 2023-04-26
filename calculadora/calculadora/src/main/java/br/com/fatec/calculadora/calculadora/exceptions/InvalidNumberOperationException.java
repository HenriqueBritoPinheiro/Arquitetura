package br.com.fatec.calculadora.calculadora.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidNumberOperationException extends RuntimeException{
    private static final long serialVersionID = 1L;

    public InvalidNumberOperationException(String exception){
        super(exception);
    }

}
