package Calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaCalculadoraAtt extends JFrame {

	JTextField operando1;
	JTextField operando2;
	JTextField resultado;
	JButton adicao;
	JButton subtracao;
	JButton multiplicacao;
	JButton divisao;



	
	
	public JanelaCalculadoraAtt() {
		super("Minha janela");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel painel = new JPanel();
		add(painel);
		
		operando1 = new JTextField(10);
		painel.add(operando1);
		
		operando2 = new JTextField(10);
		painel.add(operando2);
		
		resultado = new JTextField(10);
		painel.add(resultado);
		
		
		
		adicao = new JButton ("Adicao");
		painel.add(adicao);
		adicao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		subtracao = new JButton ("Subtracao");
		painel.add(subtracao);
		
		multiplicacao = new JButton ("Multiplicacao");
		painel.add(multiplicacao);
		
		divisao = new JButton ("Divisao");
		painel.add(divisao);
		
		
		
		
		Acao a = new Acao();
		operando1.addActionListener(a);
		operando2.addActionListener(a);
			
	}
	
	// continuacao
	
	
	class Acao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			double soma = Double.valueOf(
					operando1.getText()) 
				+ Double.valueOf(operando2.getText());
			resultado.setText(String.valueOf(soma));
		}
	}
}
	

	
	
	

