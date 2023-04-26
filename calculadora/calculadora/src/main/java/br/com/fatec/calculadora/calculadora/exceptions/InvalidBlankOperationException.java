package br.com.fatec.calculadora.calculadora.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidBlankOperationException extends RuntimeException{
    private static final long serialVersionID = 1L;
    public InvalidBlankOperationException(String exception){
        super(exception);
    }
}
