package br.com.fatec.calculadora.calculadora.controller;

import br.com.fatec.calculadora.calculadora.exceptions.InvalidBlankOperationException;
import br.com.fatec.calculadora.calculadora.exceptions.InvalidNumberOperationException;
import br.com.fatec.calculadora.calculadora.model.Calculator;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    @RequestMapping(value = "sum/{n1}/{n2}", method = RequestMethod.GET)
    public float sum(@PathVariable("n1")String n1, @PathVariable("n2")String n2){
        if(!isNumeric(n1) || !isNumeric(n2)){
            throw new InvalidNumberOperationException("Please, set valid numeric values!");
        }
        if(!isNull(n1) || !isNull(n2)){
            throw new InvalidBlankOperationException("Please, set any caracter for the calculator");
        }
        return Calculator.sum(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "minus/{n1}/{n2}", method = RequestMethod.GET)
    public float minus(@PathVariable("n1")String n1, @PathVariable("n2")String n2){
        if(!isNumeric(n1) || !isNumeric(n2)){
            throw new InvalidNumberOperationException("Please, set valid numeric values!");
        }
        if(!isNull(n1) || !isNull(n2)){
            throw new InvalidBlankOperationException("Please, set any caracter for the calculator");
        }
        return Calculator.minus(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "multiplication/{n1}/{n2}", method = RequestMethod.GET)
    public float multiplication(@PathVariable("n1")String n1, @PathVariable("n2")String n2){
        if(!isNumeric(n1) || !isNumeric(n2)){
            throw new InvalidNumberOperationException("Please, set valid numeric values!");
        }
        if(!isNull(n1) || !isNull(n2)){
            throw new InvalidBlankOperationException("Please, set any caracter for the calculator");
        }
        return Calculator.multiplication(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    @RequestMapping(value = "division/{n1}/{n2}", method = RequestMethod.GET)
    public float division(@PathVariable("n1")String n1, @PathVariable("n2")String n2){
        if(!isNumeric(n1) || !isNumeric(n2)){
            throw new InvalidNumberOperationException("Please, set valid numeric values!");
        }
        if(!isNull(n1) || !isNull(n2)){
            throw new InvalidBlankOperationException("Please, set any caracter for the calculator");
        }
        return Calculator.division(Float.parseFloat(n1), Float.parseFloat(n2));
    }

    public boolean isNumeric(String value) {
        try {
            Float.parseFloat(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isNull(String value){
        if(value.isBlank() || value.isEmpty()){
            return false;
        }else{
            return false;
        }
    }
}
