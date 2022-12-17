
package Model;

public class funcoes_DAO {
    public static void mais(){
        String teste = View.Calculadora_GUI.valor1.getText();
        int num1 = Integer.parseInt(teste);
        String teste2 = View.Calculadora_GUI.valor2.getText();
        int num2 = Integer.parseInt(teste2);
        int resultado1 = num1+num2;
        
        View.Calculadora_GUI.resultado_txt.setText(String.valueOf(resultado1));
    }
public static void menos(){
        String teste = View.Calculadora_GUI.valor1.getText();
        int num1 = Integer.parseInt(teste);
        String teste2 = View.Calculadora_GUI.valor2.getText();
        int num2 = Integer.parseInt(teste2);
        int resultado1 = num1-num2;
        
        View.Calculadora_GUI.resultado_txt.setText(String.valueOf(resultado1));
    }
public static void dividido(){
        String teste = View.Calculadora_GUI.valor1.getText();
        double num1 = Double.parseDouble(teste);
        String teste2 = View.Calculadora_GUI.valor2.getText();
        double num2 = Double.parseDouble(teste2);
        double resultado1 = num1/num2;
        
        View.Calculadora_GUI.resultado_txt.setText(String.valueOf(resultado1));
    }
public static void vezes(){
        String teste = View.Calculadora_GUI.valor1.getText();
        int num1 = Integer.parseInt(teste);
        String teste2 = View.Calculadora_GUI.valor2.getText();
        int num2 = Integer.parseInt(teste2);
        int resultado1 = num1*num2;
        
        View.Calculadora_GUI.resultado_txt.setText(String.valueOf(resultado1));
    }
}
