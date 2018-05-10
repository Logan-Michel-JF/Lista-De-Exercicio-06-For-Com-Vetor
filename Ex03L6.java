import javax.swing.JOptionPane;

public class Ex03L6 {

	public static void main(String[] args) {

		int registro = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos Registros Deseja Armazenar: "));
		double preco[] = new double[registro];
		double somaPrecos = 0;
		for(int i = 0; i < registro; i++){
			preco[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Preço: "));
			
		}
		for(int i = 0; i < preco.length; i++){
			JOptionPane.showMessageDialog(null, "Preço: " + preco[i]);
		}
		
		for(int i = 0; i < preco.length; i++){
			somaPrecos = somaPrecos + preco[i];
		}
		JOptionPane.showMessageDialog(null, "Soma total dos Preços: " + somaPrecos);
	}

}
