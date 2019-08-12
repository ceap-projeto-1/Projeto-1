import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Loja extends JPanel{
	
	ImageIcon raze = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\razer.jpg");
	ImageIcon prod0 = new ImageIcon("E:\\Wendell\\Java\\Interface gráfica\\4SIT\\mouse.png");
	JLabel lbraze = new JLabel(raze);
	
	JLabel lbprod0 = new JLabel(prod0);
	JLabel lbprod0pri = new JLabel("R$299,99");
	JLabel lbprod0name = new JLabel("Mouse Tecnologico 2.0");
	JTextArea taprod0 = new JTextArea(10,10);

	JLabel lbprod1 = new JLabel(prod0);
	JLabel lbprod1pri = new JLabel("R$299,99");
	JLabel lbprod1name = new JLabel("Mouse Tecnologico 2.0");
	JTextArea taprod1 = new JTextArea(10,10);
	
	JButton[] botao = new JButton[8];
	public Loja() {
		InicializarComponentes();
		DefinirEventos();
	}
	public void InicializarComponentes() {
		setLayout(new BorderLayout());
		JPanel jpprodutos = new JPanel(new GridLayout(3,3,3,3));
		JPanel jpprod[] = new JPanel[8];
		for(int i = 0; i < 8;i++) {
			jpprod[i] = new JPanel(null);
		}
		jpprodutos.setBackground(Color.black);
		//West
		JPanel jpwest = new JPanel();
		jpwest.setBackground(Color.black);
		jpwest.add(lbraze);
		
		//Produto 1
		lbprod0name.setBounds(130,20,150,20);
		
		lbprod0pri.setBounds(180,165,100,20);
		
		lbprod0.setBounds(20,20,100,100);
		
		taprod0.setEditable(false);
		taprod0.setText("Produto");
		taprod0.setBounds(130,50,175,100);
		
		
		jpprod[0].add(lbprod0);
		jpprod[0].add(lbprod0name);
		jpprod[0].add(lbprod0pri);
		jpprod[0].add(taprod0);
		jpprod[0].setBackground(new Color(33,240,30));

		//Produto 2
		lbprod1name.setBounds(130,20,150,20);
		
		lbprod1pri.setBounds(180,165,100,20);
		
		lbprod1.setBounds(20,20,100,100);
		
		taprod1.setEditable(false);
		taprod1.setText("Produto");
		taprod1.setBounds(130,50,175,100);
		
		
		jpprod[1].add(lbprod1);
		jpprod[1].add(lbprod1name);
		jpprod[1].add(lbprod1pri);
		jpprod[1].add(taprod1);
		jpprod[1].setBackground(new Color(33,240,30));

		jpprodutos.add(jpprod[0]);
		jpprodutos.add(jpprod[1]);
		for(int i = 0; i < 7; i++) {
			botao[i] = new JButton("a");
			jpprodutos.add(botao[i]);
		}
		
		add(jpprodutos,"Center");
		add(jpwest,"West");
	}
	public void DefinirEventos() {
		
	}
	public static void main(String args[]) {
		JFrame frame = new JFrame("Catálogo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Loja());
		frame.setBounds(100,0,1250,750);
		frame.setVisible(true);
	}
}
