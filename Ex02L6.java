import javax.swing.JOptionPane;

public class Ex02L6 {

	public static void main(String[] args) {

		int idade[] = new int[7];
		String texto = "";
		for (int i = 0; i < 7; i++) {
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Idade: "));
			texto = texto + idade[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, "Idades. \n" + texto);

	}

}
