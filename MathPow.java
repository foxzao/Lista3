import javax.swing.JOptionPane;
public class MathPow{
   public static void main (String [] args){
      
      double base = Double.parseDouble(JOptionPane.showInputDialog("Insira um n�mero inteiro: "));
      double resultado = Math.pow(base,2);
      
      JOptionPane.showMessageDialog(null, "O quadrado da base �: " + resultado); 
   }
}