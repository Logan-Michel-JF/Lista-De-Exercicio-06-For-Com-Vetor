import javax.swing.JOptionPane;

public class Ex04L6 {

	public static void main(String[] args) {
		
		int quantidade = 40;
		int tamanho[] = new int[quantidade];
		for(int i = 0; i < 40; i++){
			tamanho[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Tamanho da Camisa: "));
		}
		for(int i = 0; i < 40; i++){
			if(tamanho[i].equalsIgnoreCase("PP")){
				tamanho = tamanho + 1;
			}
		}
	}
}
