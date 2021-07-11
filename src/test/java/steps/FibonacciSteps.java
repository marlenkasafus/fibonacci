package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fibonacci.Fibonacci;
import org.junit.Assert;

public class FibonacciSteps {

    private Fibonacci fibonacci;
    private Integer valorFibonacci;
    private String errorEsperado;

    @Given("que deseo conocer los valores fibonacci")
    public void queDeseoConocerLosValoresFibonacci() {
        fibonacci = new Fibonacci();

    }

    @When("ingreso la posicion {int}")
    public void obtenerValorFibonacci(Integer valorIngresado) {
        valorFibonacci = fibonacci.obtenerValor(valorIngresado);
    }

    @Then("retorna el valor {int}")
    public void retornaElValor(Integer valorEsperado) {
        Assert.assertEquals(valorEsperado, valorFibonacci);
    }


}
