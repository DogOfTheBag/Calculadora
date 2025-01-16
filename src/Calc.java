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
    public int suma()
    {
        return num1 + num2;
    }

    public int resta()
    {
        return num1 - num2;
    }
    public int multiplicar()
    {
        return num1 * num2;
    }
    public int dividir()
    {
        return num1 / num2;
    }

}

