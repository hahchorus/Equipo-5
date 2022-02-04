import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class Expendedora extends JFrame{

	int num1;
	String num2;
	int pago1;
	int pago2;
	String cambio1;

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	//creacion de eqiquetas de imagen (producto)
	JLabel original = new JLabel();
	JLabel limon = new JLabel();
	JLabel adobadas = new JLabel();
	JLabel crujientes = new JLabel();
	JLabel nacho = new JLabel();
	JLabel incognita = new JLabel();
	JLabel diablo = new JLabel();
	JLabel ed = new JLabel();
	JLabel chetos = new JLabel();
	JLabel azules = new JLabel();
	JLabel verdes = new JLabel();
	JLabel bolitas = new JLabel();
	JLabel produ = new JLabel();

	//Creacion de botones
	//Botones de codigo
	public JButton ba = new JButton("A");
	JButton bb = new JButton("B");
	JButton bc = new JButton("C");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton ok = new JButton("OK");
	JButton borrar = new JButton("BORRAR");

	//Creacion de botones con imagen
	JButton peso1 = new JButton();
	JButton peso2 = new JButton();
	JButton peso5 = new JButton();
	JButton peso10 = new JButton();
	JButton peso20 = new JButton();
	JButton peso50 = new JButton();
	JButton recoger = new JButton("RECOGER");
	JButton recoger2 = new JButton("RECOGER");
	JButton pagar = new JButton("PAGAR");

	//Creacion de los JTextField
	JTextField caja1 = new JTextField();
	JTextField caja2 = new JTextField();
	JTextField caja3 = new JTextField();
	JTextField caja5 = new JTextField();

	public Expendedora(){

		setTitle("Maquina Expendedora De Sabritas");//Titulo de la ventana

		//Modificacion de los paneles
		p1.setBackground(Color.BLACK);//Establece el color del panel
		p1.setLayout(null);//Desactiva el diseño por default
		add(p1);
		p2.setLayout(null);
		p1.add(p2);
		p2.setBounds(785, 450, 300, 150);
		p2.setBackground(Color.BLACK);

		//Creacion de etiquetas de titulos
		JLabel principal = new JLabel("MAQUINA EXPENDEDORA DE SABRITAS",SwingConstants.CENTER);
		JLabel codigo = new JLabel("CODIGO DEL PRODUCTO",SwingConstants.CENTER);
		JLabel entrega = new JLabel("RECOJA SU PRODUCTO",SwingConstants.CENTER);
		JLabel pago = new JLabel("INGRESE SU PAGO",SwingConstants.CENTER);
		JLabel cambio = new JLabel("RECOJA SU CAMBIO",SwingConstants.CENTER);
		JLabel signo = new JLabel("$",SwingConstants.CENTER);
		
		//Cambio de color de la fuente
		principal.setForeground(Color.white);
		codigo.setForeground(Color.white);
		entrega.setForeground(Color.white);
		pago.setForeground(Color.white);
		cambio.setForeground(Color.white);
		signo.setForeground(Color.white);

		//Avances Horus Inicia (termina 117)
		//Creacion de etiquetas (codigos y precios)
		JLabel codiOriginal = new JLabel("A1   $13",SwingConstants.CENTER);//Creacion de etiqueta y centrar texto
		JLabel codiLimon = new JLabel("A2   $13",SwingConstants.CENTER);
		JLabel codiAdobadas = new JLabel("A3   $13",SwingConstants.CENTER);
		JLabel codiCrujientes = new JLabel("A4   $13",SwingConstants.CENTER);
		JLabel codiNacho = new JLabel("B1   $11",SwingConstants.CENTER);
		JLabel codiIncognita = new JLabel("B2   $11",SwingConstants.CENTER);
		JLabel codiDiablo = new JLabel("B3   $11",SwingConstants.CENTER);
		JLabel codi3D = new JLabel("B4   $11",SwingConstants.CENTER);
		JLabel codiChetos = new JLabel("C1   $9",SwingConstants.CENTER);
		JLabel codiAzules = new JLabel("C2   $9",SwingConstants.CENTER);
		JLabel codiVerdes = new JLabel("C3   $9",SwingConstants.CENTER);
		JLabel codiBolitas = new JLabel("C4   $9",SwingConstants.CENTER);

		//Cambio de color de la fuente
		codiOriginal.setForeground(Color.white);
		codiLimon.setForeground(Color.white);
		codiAdobadas.setForeground(Color.white);
		codiCrujientes.setForeground(Color.white);
		codiNacho.setForeground(Color.white);
		codiIncognita.setForeground(Color.white);
		codiDiablo.setForeground(Color.white);
		codi3D.setForeground(Color.white);
		codiChetos.setForeground(Color.white);
		codiAzules.setForeground(Color.white);
		codiVerdes.setForeground(Color.white);
		codiBolitas.setForeground(Color.white);
		//Avances Horus termina (Inicia 89)
        
		//Avance A--- Posicionar titulos panel
		principal.setBounds(300, 10, 700, 40);
		codigo.setBounds(450, 70, 300, 32);
		entrega.setBounds(500, 510, 300, 32);
		pago.setBounds(740, 70, 250, 32);
		cambio.setBounds(1040, 70, 250, 32);
		signo.setBounds(580, 105, 50, 50);

		//Posicionar etiquetas en el panel , coordenadas y tamaño etiqueta - codigo precio
		codiOriginal.setBounds(55, 200, 55, 12);
		codiLimon.setBounds(150, 200, 55, 12);
		codiAdobadas.setBounds(245, 200, 55, 12);
		codiCrujientes.setBounds(345, 200, 55, 12);
		codiNacho.setBounds(55, 370, 55, 12);
		codiIncognita.setBounds(150, 370, 55, 12);
		codiDiablo.setBounds(245, 370, 55, 12);
		codi3D.setBounds(345, 370, 55, 12);
		codiChetos.setBounds(50, 540, 55, 12);
		codiAzules.setBounds(150, 540, 55, 12);
		codiVerdes.setBounds(245, 540, 55, 12);
		codiBolitas.setBounds(345, 540, 55, 12);

        
		//Posicionar los botones en el panel
		ba.setBounds(550, 180, 50, 50);
		bb.setBounds(550, 235, 50, 50);
		bc.setBounds(550, 290, 50, 50);
		ok.setBounds(550, 345, 50, 50);
		b1.setBounds(605, 180, 50, 50);
		b2.setBounds(605, 235, 50, 50);
		b3.setBounds(605, 290, 50, 50);
		b4.setBounds(605, 345, 50, 50);
		borrar.setBounds(550, 400, 105, 50);
        //Avance A--
		
		//Avance Arisbeth INICIA-----------
		//Posicionar cajas 
		caja1.setBounds(485, 110, 110, 45);
		caja5.setBounds(620, 110, 80, 45);
		caja2.setBounds(785, 110, 160, 45);
		caja3.setBounds(1085, 110, 160, 45);
		//Se añaden los titulos a el panel
		p1.add(principal);
		p1.add(codigo);
		p1.add(entrega);
		p1.add(pago);
		p1.add(cambio);
		p1.add(signo);

		//Se añaden las etiquetas de codigo a el panel
		p1.add(codiOriginal);
		p1.add(codiLimon);
		p1.add(codiAdobadas);
		p1.add(codiCrujientes);
		p1.add(codiNacho);
		p1.add(codiIncognita);
		p1.add(codiDiablo);
		p1.add(codi3D);
		p1.add(codiChetos);
		p1.add(codiAzules);
		p1.add(codiVerdes);
		p1.add(codiBolitas);

		//Se añaden botones a el panel
		p1.add(ba);
		p1.add(bb);
		p1.add(bc);
		p1.add(ok);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(borrar);

		//Se añaden cajas
		p1.add(caja1);
		p1.add(caja2);
		p1.add(caja3);
		p1.add(caja5);

		caja2.setText("0");
		caja5.setText("0");
		caja3.setText("0");

        
		//Propiedades de la ventana principal
		setSize(1300,650);//tamaño de la ventana
		setVisible(true);//hacer visible la ventana
		setLocationRelativeTo(null);//posicionar la ventana en el centro
		setDefaultCloseOperation(EXIT_ON_CLOSE);//cierra procesos cuando se cierra la ventana
		//Avence Arisbeth TERMINA---------------
	}
   
	public static void main(String [] args){
		Expendedora ventana = new Expendedora();
	}
    
}
