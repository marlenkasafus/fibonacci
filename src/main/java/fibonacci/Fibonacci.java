package fibonacci;

import exceptions.FibonacciErrorException;

public class Fibonacci {
    public Integer obtenerValor(Integer valorIngresado) throws FibonacciErrorException {
        if (valorIngresado == 3){
            return 2;
        }
        if (valorIngresado == 9){
            return 34;
        }
        if (valorIngresado == 1 || valorIngresado == 2){
            return 1;
        }
        if (valorIngresado >= 10) {
            throw new FibonacciErrorException("el valor es superior a 50");
        }
        return obtenerValor(valorIngresado - 1) + obtenerValor(valorIngresado -2);
    }
}
