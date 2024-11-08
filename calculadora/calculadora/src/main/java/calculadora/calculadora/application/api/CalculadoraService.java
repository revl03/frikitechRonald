package calculadora.calculadora.application.api;

import calculadora.calculadora.domain.Resultado;

import javax.xml.transform.Result;

public interface CalculadoraService {
    Resultado calcular(String num1, String num2, String operacion) throws Exception;
    double suma(String num1, String num2)throws Exception;
    double multiplicacion(String num1, String num2) throws Exception;
    double division(String num1, String num2) throws Exception;
    double resta(String num1, String num2) throws Exception;
    boolean comprobarNumeros(String num1, String num2) throws Exception;
}
