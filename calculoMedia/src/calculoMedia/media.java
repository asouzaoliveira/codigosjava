package calculoMedia;

import javax.swing.JOptionPane;

public class media {

	public static void main(String[] args) {
		
		 String nota1 = JOptionPane.showInputDialog("Insira nota 1");
		 String nota2 = JOptionPane.showInputDialog("Insira nota 2");
		 String nota3 = JOptionPane.showInputDialog("Insira nota 3");
		 String nota4 = JOptionPane.showInputDialog("Insira nota 4");
		 
		 double dNota1 = Double.parseDouble(nota1);
		 double dNota2 = Double.parseDouble(nota2);
		 double dNota3 = Double.parseDouble(nota3);
		 double dNota4 = Double.parseDouble(nota4);
		 
		 double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		 
		 /* MEDIA PARA APROVAÇÃO É 70 */
		 
		 if (media >=50) {
			 if(media >=70) {
				 JOptionPane.showMessageDialog(null, " Aluno aprovado com média : " + media);
			 }else {
				 JOptionPane.showMessageDialog(null,"Aluno em recuperação com média : " + media);
			 }
			 
			
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado com media : " + media);
			
		}
		 
		 JOptionPane.showMessageDialog(null, "A média é : " + media);
	}

}
