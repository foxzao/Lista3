import javax.swing.JOptionPane;
public class AreaRetangulo{
   public static void main (String [] args){
      
      double base = Double.parseDouble(JOptionPane.showInputDialog("Insira a medida da base: "));
      double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a medida da altura: "));
      
      JOptionPane.showMessageDialog(null, "A medida da área é: " + base*altura);
   }
}