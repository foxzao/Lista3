import javax.swing.JOptionPane;
public class QuantosDiasViveu{
   public static void main (String [] args){
      
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira qual sua idade "));
      
      JOptionPane.showMessageDialog(null,"Você viveu " + idade*365 + " dias");
   }
}