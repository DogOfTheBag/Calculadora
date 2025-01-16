// import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args)
    {
        String text1 = JOptionPane.showInputDialog("Introduce el primer numero");
        String text2 = JOptionPane.showInputDialog("Introduce el segundo numero");
        int a = Integer.parseInt(text1);
        int b = Integer.parseInt(text2);

        Calc c1 = new Calc(a,b);

        JOptionPane.showMessageDialog(null,"El resultado de la suma entre " + a + " y " + b + " es: "+ c1.suma());

        c1.resta();

        c1.multiplicar();

        c1.dividir();
            
    }
}
   





        /* String text1 = JOptionPane.showInputDialog("Introduce el primer numero");
        String text2 = JOptionPane.showInputDialog("Introduce el segundo numero");
        int num1 = Integer.parseInt(text1);
        int num2 = Integer.parseInt(text2);
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + "es: " + resultado); */