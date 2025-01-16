import javax.swing.JOptionPane;
//Clase calculadora para hacer operaciones matematicas basicas
public class Calc
{
    private int num1;
    private int num2;

    public Calc(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    /*public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    } */
    public int suma()
    {
        return num1 + num2;
    }

    public void resta()
    {
        final int resultado = num1 - num2;
        JOptionPane.showMessageDialog(null,"El resultado de la resta entre " + num1 + " y " + num2 + " es: " + resultado);
    }
    public void multiplicar()
    {
        final int resultado = num1 * num2;
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion entre " + num1 + " y " + num2 + " es: " + resultado);
    }
    public void dividir()
    {
        final int resultado = num1 / num2;
        JOptionPane.showMessageDialog(null,"El cociente de la division entre " + num1 + " y " + num2 + " es: " + resultado + " y el resto es " + num1 % num2);
    }

}

