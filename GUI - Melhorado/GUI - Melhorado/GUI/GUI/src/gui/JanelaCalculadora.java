package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaCalculadora extends JFrame {

	JTextField numero1;
	JTextField numero2;
	JTextField operador;
	JTextField resultado;
	
	JButton botaoSomar, botaoSubtrair, botaoMultiplicar, botaoDividir, botaoLimpar;
	
	double result = 0.0;
	
	public JanelaCalculadora() {
		
		super("Minha janela");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel painel = new JPanel();
		add(painel);
		
		JLabel label1 = new JLabel("Número 1");
		numero1 = new JTextField(10);
		painel.add(label1);
		painel.add(numero1);
		
		JLabel label3 = new JLabel("Número 2");
		numero2 = new JTextField(10);
		painel.add(label3);
		painel.add(numero2);
		
		
		//-- botões --\\
		botaoSomar = new JButton("Somar");
		painel.add(botaoSomar);

		botaoSubtrair = new JButton("Subtrair");
		painel.add(botaoSubtrair);
		
		botaoMultiplicar = new JButton("Multiplicar");
		painel.add(botaoMultiplicar);
		
		botaoDividir = new JButton("Dividir");
		painel.add(botaoDividir);
		
		JLabel label4 = new JLabel("Resultado");
		resultado = new JTextField(20);
		painel.add(label4);
		painel.add(resultado);
		
		botaoLimpar = new JButton("Limpar");
		painel.add(botaoLimpar);
		
		
		AcaoCalculadora calculadora = new AcaoCalculadora();
		botaoSomar.addActionListener(calculadora);
		botaoSubtrair.addActionListener(calculadora);
		botaoMultiplicar.addActionListener(calculadora);
		botaoDividir.addActionListener(calculadora);
		botaoLimpar.addActionListener(calculadora);
		
//		//-- funções dos botões --\\
//		botaoSomar.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				result = Double.valueOf(numero1.getText()) + Double.valueOf(numero2.getText());
//				resultado.setText(String.valueOf(result));
//			}
//		});
//		
//		botaoSubtrair.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				result = Double.valueOf(numero1.getText()) - Double.valueOf(numero2.getText());
//				resultado.setText(String.valueOf(result));
//			}
//		});
//
//		botaoMultiplicar.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				result = Double.valueOf(numero1.getText()) * Double.valueOf(numero2.getText());
//				resultado.setText(String.valueOf(result));
//			}
//		});
//
//		botaoDividir.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(Double.valueOf(numero2.getText()) != 0.0) {						
//					result = Double.valueOf(numero1.getText()) / Double.valueOf(numero2.getText());
//					resultado.setText(String.valueOf(result));
//				}else {
//					resultado.setText("Divisor = 0 / divisão invalida! ");
//				}	
//			}
//		});
//		
//		botaoLimpar.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				numero1.setText("");
//				numero2.setText("");
//				resultado.setText("");
//			}
//		});
		
//		Acao a = new Acao();
//		botaoCalcular.addActionListener(a);
//		Acao a = new Acao();
//		numero1.addActionListener(a);
//		numero2.addActionListener(a);
			
	}
	
	
	class AcaoCalculadora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Object botao = e.getSource(); 	//-- botão acionado
			
			if(botao == botaoSomar) {
				result = Double.valueOf(numero1.getText()) + Double.valueOf(numero2.getText());
				resultado.setText(String.valueOf(result));				
				
			}else if(botao == botaoSubtrair) {
				result = Double.valueOf(numero1.getText()) - Double.valueOf(numero2.getText());
				resultado.setText(String.valueOf(result));		
				
			}else if(botao == botaoMultiplicar) {				
				result = Double.valueOf(numero1.getText()) * Double.valueOf(numero2.getText());
				resultado.setText(String.valueOf(result));
				
			}else if(botao == botaoDividir) {
				if(Double.valueOf(numero2.getText()) != 0.0) {						
					result = Double.valueOf(numero1.getText()) / Double.valueOf(numero2.getText());
					resultado.setText(String.valueOf(result));
				}else {
					resultado.setText("Divisor = 0 / divisão invalida! ");
				}	
				
			}else if(botao == botaoLimpar) {				
				numero1.setText("");
				numero2.setText("");
				resultado.setText("");
			}
			
		}
		
	}
	
}