package calculadora.calculadora.application.api;

import calculadora.calculadora.domain.Resultado;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraImpl implements CalculadoraService{

    @Override
    public Resultado calcular(String num1, String num2, String operacion) throws Exception {
        String result="";
        if(comprobarNumeros(num1, num2)){
            switch (operacion){
                case "+":
                    result="El total de la suma de: "+num1+" + "+ num2+" es: "+suma(num1,num2);
                    break;
                case "-":
                    result="El total de la resta de: "+num1+" - "+ num2+" es: "+resta(num1,num2);
                    break;
                case "*":
                    result="El total de la multiplicación de: "+num1+" * "+ num2+" es: "+multiplicacion(num1,num2);
                    break;
                case "/":
                    result="El total de la división de: "+num1+" / "+ num2+" es: "+division(num1,num2);
                    break;
                default:
                    result="Error operación no permitida";

            }

        }
        return new Resultado(result);
    }

    @Override
    public double suma(String num1, String num2) throws Exception {
        double total;
        total=Double.valueOf(num1)+Double.valueOf(num2);
        return total;
    }

    @Override
    public double multiplicacion(String num1, String num2) throws Exception {
        double total;
        total=Double.valueOf(num1)*Double.valueOf(num2);
        return total;
    }

    @Override
    public double division(String num1, String num2) throws Exception {
        double total;
        total=Double.valueOf(num1)/Double.valueOf(num2);
        return total;
    }

    @Override
    public double resta(String num1, String num2) throws Exception {
        double total;
        total=Double.valueOf(num1)-Double.valueOf(num2);
        return total;
    }

    @Override
    public boolean comprobarNumeros(String num1, String num2) throws Exception {
        if (!num1.matches("\\d+") || !num2.matches("\\d+")) {
            return false;
        }
        return true;
    }
}
