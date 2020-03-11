import javax.swing.JOptionPane;
public class SomaDoComprimento{
   public static void main (String [] args){
   
   String um = JOptionPane.showInputDialog("Insira a primeira palavra: ");
   String dois = JOptionPane.showInputDialog("Insira a segunda palavra: ");
   String tres = JOptionPane.showInputDialog("Insira a terceira palavra: ");
   
   int soma = um.length() + dois.length() + tres.length();
   
   JOptionPane.showMessageDialog(null, "O comprimento é: " + soma);
   }
}