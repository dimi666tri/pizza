package dimmyPizzaria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pizzaria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizzaria frame = new pizzaria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public pizzaria() {
		
		setBackground(new Color(255, 255, 255));
		setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 12));
		setTitle("Dimmy Pizzaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 500);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 75, 45));
		contentPane.setBorder(BorderFactory.createLineBorder(Color.RED, 5));

		setContentPane(contentPane);
		
		JLabel lblIntro = new JLabel("Bem-vindo(a)s a pizzaria do Dimitri!");
		lblIntro.setForeground(Color.YELLOW);
		lblIntro.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 12));
		
		JLabel lblMiniIntro = new JLabel("sintam se a vontade para fazerem seu pedido");
		lblMiniIntro.setForeground(Color.ORANGE);
		lblMiniIntro.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 9));
		
		JLabel lblSelectSabor = new JLabel("Selecione os sabores de sua pizza! max. 3");
		lblSelectSabor.setForeground(Color.YELLOW);
		lblSelectSabor.setFont(new Font("Courier New", Font.ITALIC, 12));
		
		JCheckBox chckbxSabor = new JCheckBox("Alho e Oleo");
		chckbxSabor.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxSabor.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxSabor1 = new JCheckBox("Atum");
		chckbxSabor1.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxSabor1.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxSabor2 = new JCheckBox("Bancon e Cheddar");
		chckbxSabor2.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxSabor2.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxSabor3 = new JCheckBox("Calabresa");
		chckbxSabor3.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxSabor3.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxSabor4 = new JCheckBox("Frango com Catupiry");
		chckbxSabor4.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxSabor4.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxSabor5 = new JCheckBox("Portuguesa");
		chckbxSabor5.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxSabor5.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxSabor7 = new JCheckBox("Pepperoni");
		chckbxSabor7.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxSabor7.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxSabor8 = new JCheckBox("Quatro Queijos");
		chckbxSabor8.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxSabor8.setBackground(new Color(253, 75, 45));
		
		JCheckBox [] Sabores = {chckbxSabor,chckbxSabor1,chckbxSabor2,chckbxSabor3,chckbxSabor4,chckbxSabor5,chckbxSabor7,chckbxSabor8};
		for (JCheckBox Sabor : Sabores) {
			Sabor.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					int sSelect = 0;
					for (JCheckBox s: Sabores) {
						if (s.isSelected()) {
							sSelect++;
						}
					}
					if (sSelect > 3) {
						Sabor.setSelected(false);
						JOptionPane.showMessageDialog(null, "apenas 3 sabores!");
					}
				}
			});
		}
		
		JLabel lblSelectBorda = new JLabel("Você deseja borda ou não?");
		lblSelectBorda.setForeground(Color.YELLOW);
		lblSelectBorda.setFont(new Font("Courier New", Font.ITALIC, 12));
		
		JRadioButton rdbtncomBorda = new JRadioButton("Com Borda");
		rdbtncomBorda.setFont(new Font("Courier New", Font.ITALIC, 11));
		rdbtncomBorda.setBackground(new Color(253, 75, 45));
		
		JRadioButton rdbtnSemBorda = new JRadioButton("Sem Borda");
		rdbtnSemBorda.setFont(new Font("Courier New", Font.ITALIC, 11));
		rdbtnSemBorda.setBackground(new Color(253, 75, 45));
		
		JLabel lblSelectRecebimento = new JLabel("Como você deseja receber seu pedido?");
		lblSelectRecebimento.setForeground(Color.YELLOW);
		lblSelectRecebimento.setFont(new Font("Courier New", Font.ITALIC, 12));
		
		JComboBox<String> Entrega = new JComboBox<String>();
		Entrega.addItem("Tele Entrega");
		Entrega.addItem("Retirada");
		Entrega.addItem("no Local");
		
		Entrega.setFont(new Font("Courier New", Font.ITALIC, 11));
		
		JLabel lblSelectAdicionais = new JLabel("Selecione os adicionais desejados!");
		lblSelectAdicionais.setForeground(Color.YELLOW);
		lblSelectAdicionais.setFont(new Font("Courier New", Font.ITALIC, 12));
		
		JCheckBox chckbxAdicional = new JCheckBox("Queijo");
		chckbxAdicional.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxAdicional.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxAdicional2 = new JCheckBox("Bacon");
		chckbxAdicional2.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxAdicional2.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxAdicional3 = new JCheckBox("Catupiry");
		chckbxAdicional3.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxAdicional3.setBackground(new Color(253, 75, 45));
		
		JCheckBox chckbxAdicional4 = new JCheckBox("Gorgonzola");
		chckbxAdicional4.setFont(new Font("Courier New", Font.ITALIC, 11));
		chckbxAdicional4.setBackground(new Color(253, 75, 45));
		
		JCheckBox [] adicionais = {chckbxAdicional,chckbxAdicional2,chckbxAdicional3,chckbxSabor4};
		
		JLabel lblValor = new JLabel("");
		lblValor.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 11));
		
		JButton btnFinal = new JButton("Finalizar Pedido!");
		btnFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valorPizza = 0;
				for (JCheckBox s2 : Sabores) {
					if (s2.isSelected()) {
						valorPizza = valorPizza + 15;
					}
				} 
				
				if (rdbtncomBorda.isSelected()) {
					valorPizza= valorPizza + 5;
				}
				
				for (JCheckBox a : adicionais) {
					if (a.isSelected()) {
						valorPizza = valorPizza + 2;
					}
				}
				lblValor.setText("esse é o valor total da pizza: " + Integer.toString(valorPizza));
			}
		});
		btnFinal.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 11));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(151)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIntro)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(lblMiniIntro, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(chckbxSabor4, Alignment.LEADING)
								.addComponent(lblSelectSabor)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxSabor2)
										.addComponent(chckbxSabor1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxSabor3, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxSabor))
									.addPreferredGap(ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxSabor5, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxSabor7)
										.addComponent(chckbxSabor8))
									.addGap(69))
								.addComponent(lblSelectBorda, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSelectAdicionais, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(rdbtncomBorda)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(rdbtnSemBorda, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
									.addComponent(lblSelectRecebimento, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)))
							.addGap(74)))
					.addGap(762))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxAdicional4)
						.addComponent(chckbxAdicional3)
						.addComponent(chckbxAdicional2)
						.addComponent(chckbxAdicional)
						.addComponent(Entrega, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1522, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(281)
					.addComponent(lblValor)
					.addContainerGap(1382, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(185)
					.addComponent(btnFinal)
					.addContainerGap(1343, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIntro)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMiniIntro)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSelectSabor)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxSabor5)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxSabor7))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckbxSabor)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxSabor1)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckbxSabor8)
							.addGap(23))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckbxSabor2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxSabor3)
							.addPreferredGap(ComponentPlacement.UNRELATED)))
					.addComponent(chckbxSabor4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSelectBorda)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnSemBorda)
						.addComponent(rdbtncomBorda))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSelectRecebimento)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Entrega, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSelectAdicionais)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxAdicional)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxAdicional2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxAdicional3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxAdicional4)
					.addGap(7)
					.addComponent(btnFinal)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblValor)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
