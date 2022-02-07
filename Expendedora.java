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
	JLabel barritas = new JLabel();
	JLabel chips = new JLabel();
	JLabel cremax = new JLabel();
	JLabel gomitas = new JLabel();
	JLabel cacahuate = new JLabel();
	JLabel jugo = new JLabel();
	JLabel kidkad = new JLabel();
	JLabel mamut = new JLabel();
	JLabel panditas = new JLabel();
	JLabel pinguinos = new JLabel();
	JLabel trikitrakets = new JLabel();
	JLabel coca = new JLabel();
	JLabel produ = new JLabel();

	//Se le asigna a una variable un imagen
	ImageIcon ima1 = new ImageIcon("imagenes/barritas.png");
	ImageIcon ima2 = new ImageIcon("imagenes/chips.png");
	ImageIcon ima3 = new ImageIcon("imagenes/Cremax.png");
	ImageIcon ima4 = new ImageIcon("imagenes/coca.png");
	ImageIcon ima5 = new ImageIcon("imagenes/gomitas.png");
	ImageIcon ima6 = new ImageIcon("imagenes/Hot nut.png");
	ImageIcon ima7 = new ImageIcon("imagenes/jugo.png");
	ImageIcon ima8 = new ImageIcon("imagenes/Kid Kad.png");
	ImageIcon ima9 = new ImageIcon("imagenes/mamut.png");
	ImageIcon ima10 = new ImageIcon("imagenes/panditas.png");
	ImageIcon ima11 = new ImageIcon("imagenes/PINGUINOS.png");
	ImageIcon ima12 = new ImageIcon("imagenes/triki trakes.png");
	ImageIcon ima13 = new ImageIcon("imagenes/peso.png");
	ImageIcon ima14 = new ImageIcon("imagenes/dos.png");
	ImageIcon ima15 = new ImageIcon("imagenes/cinco.png");
	ImageIcon ima16 = new ImageIcon("imagenes/diez.png");
	ImageIcon ima17 = new ImageIcon("imagenes/veinte.png");
	ImageIcon ima18 = new ImageIcon("imagenes/cincuenta.png");
	ImageIcon ima19 = new ImageIcon("imagen19.jpg");

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
	JButton peso1 = new JButton("P1");
	JButton peso2 = new JButton("P2");
	JButton peso5 = new JButton("P5");
	JButton peso10 = new JButton("P10");
	JButton peso20 = new JButton("P20");
	JButton peso50 = new JButton("P50");
	JButton recoger = new JButton("RECOGER");
	JButton recoger2 = new JButton("RECOGER2");
	JButton pagar = new JButton("PAGAR");

	//Creacion de los JTextField
	JTextField caja1 = new JTextField();
	JTextField caja2 = new JTextField();
	JTextField caja3 = new JTextField();
	JTextField caja5 = new JTextField();

	public Expendedora(){

		setTitle("Maquina Expendedora");//Titulo de la ventana

		//Modificacion de los paneles
		p1.setBackground(Color.BLACK);//Establece el color del panel
		p1.setLayout(null);//Desactiva el diseño por default
		add(p1);
		p2.setLayout(null);
		p1.add(p2);
		p2.setBounds(785, 450, 300, 150);
		p2.setBackground(Color.BLACK);

		//Creacion de etiquetas de titulos
		JLabel principal = new JLabel("MAQUINA EXPENDEDORA",SwingConstants.CENTER);
		JLabel codigo = new JLabel("CODIGO DEL PRODUCTO",SwingConstants.CENTER);
		JLabel entrega = new JLabel("RECOJA SU PRODUCTO",SwingConstants.CENTER);
		JLabel pago = new JLabel("INGRESE SU PAGO",SwingConstants.CENTER);
		JLabel cambio = new JLabel("RECOJA SU CAMBIO",SwingConstants.CENTER);
		JLabel signo = new JLabel("$",SwingConstants.CENTER);
		//Modificacion de la fuente de las etiquetas
		principal.setFont(new Font("time new roman",Font.BOLD, 35));
		codigo.setFont(new Font("time new roman", Font.BOLD, 20));
		entrega.setFont(new Font("time new roman", Font.BOLD, 20));
		pago.setFont(new Font("time new roman", Font.BOLD, 20));
		cambio.setFont(new Font("time new roman", Font.BOLD, 20));
		signo.setFont(new Font("time new roman", Font.BOLD, 20));
		//Cambio de color de la fuente
		principal.setForeground(Color.RED);
		codigo.setForeground(Color.RED);
		entrega.setForeground(Color.RED);
		pago.setForeground(Color.RED);
		cambio.setForeground(Color.RED);
		signo.setForeground(Color.RED);
		caja1.setEditable(false);
		caja2.setEnabled(false);
		caja3.setEnabled(false);
		caja5.setEnabled(false);
		//Avances Horus Inicia (termina 117)
		//Creacion de etiquetas (codigos y precios)
		JLabel codiBarritas = new JLabel("A1   $13",SwingConstants.CENTER);//Creacion de etiqueta y centrar texto
		JLabel codiChips = new JLabel("A2   $13",SwingConstants.CENTER);
		JLabel codiCoca = new JLabel("A3   $13",SwingConstants.CENTER);
		JLabel codiCremax = new JLabel("A4   $13",SwingConstants.CENTER);
		JLabel codiGomitas = new JLabel("B1   $11",SwingConstants.CENTER);
		JLabel codiHot = new JLabel("B2   $11",SwingConstants.CENTER);
		JLabel codiJugo = new JLabel("B3   $11",SwingConstants.CENTER);
		JLabel codiKid = new JLabel("B4   $11",SwingConstants.CENTER);
		JLabel codiMamut = new JLabel("C1   $9",SwingConstants.CENTER);
		JLabel codiPanditas = new JLabel("C2   $9",SwingConstants.CENTER);
		JLabel codiPinguinos = new JLabel("C3   $9",SwingConstants.CENTER);
		JLabel coditriki = new JLabel("C4   $9",SwingConstants.CENTER);
		//Edicion de fuente de codigos y precios
		codiBarritas.setFont(new Font("time new roman",Font.BOLD, 12));
		codiChips.setFont(new Font("time new roman",Font.BOLD, 12));
		codiCoca.setFont(new Font("time new roman",Font.BOLD, 12));
		codiCremax.setFont(new Font("time new roman",Font.BOLD, 12));
		codiGomitas.setFont(new Font("time new roman",Font.BOLD, 12));
		codiHot.setFont(new Font("time new roman",Font.BOLD, 12));
		codiJugo.setFont(new Font("time new roman",Font.BOLD, 12));
		codiKid.setFont(new Font("time new roman",Font.BOLD, 12));
		codiMamut.setFont(new Font("time new roman",Font.BOLD, 12));
		codiPanditas.setFont(new Font("time new roman",Font.BOLD, 12));
		codiPinguinos.setFont(new Font("time new roman",Font.BOLD, 12));
		coditriki.setFont(new Font("time new roman",Font.BOLD, 12));
		//Cambio de color de la fuente
		codiBarritas.setForeground(Color.RED);
		codiChips.setForeground(Color.RED);
		codiCoca.setForeground(Color.RED);
		codiCremax.setForeground(Color.RED);
		codiGomitas.setForeground(Color.RED);
		codiHot.setForeground(Color.RED);
		codiJugo.setForeground(Color.RED);
		codiKid.setForeground(Color.RED);
		codiMamut.setForeground(Color.RED);
		codiPanditas.setForeground(Color.RED);
		codiPinguinos.setForeground(Color.RED);
		coditriki.setForeground(Color.RED);
		//Avances Horus termina (Inicia 89)

		//Se escala la imagen a el tamaño del boton (Productos)
		barritas.setIcon(new ImageIcon(ima1.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		chips.setIcon(new ImageIcon(ima2.getImage().getScaledInstance(100, 110, Image.SCALE_DEFAULT)));
        coca.setIcon(new ImageIcon(ima3.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		cremax.setIcon(new ImageIcon(ima4.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		gomitas.setIcon(new ImageIcon(ima5.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		cacahuate.setIcon(new ImageIcon(ima6.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		jugo.setIcon(new ImageIcon(ima7.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		kidkad.setIcon(new ImageIcon(ima8.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		mamut.setIcon(new ImageIcon(ima9.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		panditas.setIcon(new ImageIcon(ima10.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		pinguinos.setIcon(new ImageIcon(ima11.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
		trikitrakets.setIcon(new ImageIcon(ima12.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
		//Se escala la imagen a el tamaño del boton (Dinero)
		peso1.setIcon(new ImageIcon(ima13.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		peso2.setIcon(new ImageIcon(ima14.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		peso5.setIcon(new ImageIcon(ima15.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		peso10.setIcon(new ImageIcon(ima16.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		peso20.setIcon(new ImageIcon(ima17.getImage().getScaledInstance(110, 60, Image.SCALE_DEFAULT)));
		peso50.setIcon(new ImageIcon(ima18.getImage().getScaledInstance(110, 60, Image.SCALE_DEFAULT)));
		//Edicion de funte de boton
		ba.setFont(new Font("time new roman", Font.BOLD, 15));
		bb.setFont(new Font("time new roman", Font.BOLD, 15));
		bc.setFont(new Font("time new roman", Font.BOLD, 15));
		ok.setFont(new Font("time new roman", Font.BOLD, 11));
		b1.setFont(new Font("time new roman", Font.BOLD, 15));
		b2.setFont(new Font("time new roman", Font.BOLD, 15));
		b3.setFont(new Font("time new roman", Font.BOLD, 15));
		b4.setFont(new Font("time new roman", Font.BOLD, 15));
		//Cambio de color de fondo del JButton
		peso1.setBackground(Color.BLACK);
		peso2.setBackground(Color.BLACK);
		peso5.setBackground(Color.BLACK);
		peso10.setBackground(Color.BLACK);
		peso20.setBackground(Color.BLACK);
		peso50.setBackground(Color.BLACK);
		//Avance A--- Posicionar titulos panel
		//Posicionar titulos en el panel
		principal.setBounds(300, 10, 700, 40);
		codigo.setBounds(450, 70, 300, 32);
		entrega.setBounds(500, 510, 300, 32);
		pago.setBounds(740, 70, 250, 32);
		cambio.setBounds(1040, 70, 250, 32);
		signo.setBounds(580, 105, 50, 50);
		//posicionar JLabel de imagen en el panel 
		barritas.setBounds(20, 70, 120, 130);//Primeros dos datos son las coordenadas en las que se va a colocar
		chips.setBounds(115, 70, 100, 110);//segundos datos son el tamaño
		coca.setBounds(210, 70, 120, 130);
		cremax.setBounds(305, 70, 120, 130);
		gomitas.setBounds(20, 240, 120, 130);
		cacahuate.setBounds(115, 240, 120, 130);
		jugo.setBounds(210, 240, 120, 130);
		kidkad.setBounds(315, 240, 120, 130);
		mamut.setBounds(30, 410, 120, 130);
		panditas.setBounds(130, 410, 120, 130);
		pinguinos.setBounds(225, 410, 120, 130);
		trikitrakets.setBounds(320, 430, 100, 100);
		//Posicionar etiquetas en el panel (codigo, precio)
		codiBarritas.setBounds(55, 200, 55, 12);
		codiChips.setBounds(150, 200, 55, 12);
		codiCoca.setBounds(245, 200, 55, 12);
		codiCremax.setBounds(345, 200, 55, 12);
		codiGomitas.setBounds(55, 370, 55, 12);
		codiHot.setBounds(150, 370, 55, 12);
		codiJugo.setBounds(245, 370, 55, 12);
		codiKid.setBounds(345, 370, 55, 12);
		codiMamut.setBounds(50, 540, 55, 12);
		codiPanditas.setBounds(150, 540, 55, 12);
		codiPinguinos.setBounds(245, 540, 55, 12);
		coditriki.setBounds(345, 540, 50, 10);
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
		//Posicionar los botones con imagenes 
		peso1.setBounds(810, 175, 50, 50);
		peso2.setBounds(870, 175, 50, 50);
		peso5.setBounds(810, 235, 50, 50);
		peso10.setBounds(870, 235, 50, 50);
		peso20.setBounds(810, 290, 110, 50);
		peso50.setBounds(810, 345, 110, 50);
		pagar.setBounds(965, 110, 100, 40);
		recoger.setBounds(1110, 175, 100, 50);
		recoger2.setBounds(1110, 500, 100, 50);
        //Avance A--
		
		//Avance Arisbeth INICIA-----------
		//Posicionar cajas 
		caja1.setBounds(485, 110, 110, 45);
		caja5.setBounds(620, 110, 80, 45);
		caja2.setBounds(785, 110, 160, 45);
		caja3.setBounds(1085, 110, 160, 45);
		
		//Se agregan todos los objetos a el panel principal
		//Se añaden los titulos a el panel
		p1.add(principal);
		p1.add(codigo);
		p1.add(entrega);
		p1.add(pago);
		p1.add(cambio);
		p1.add(signo);
		//Se añaden los productos al panel
		p1.add(barritas);
		p1.add(chips);
		p1.add(coca);
		p1.add(cremax);
		p1.add(gomitas);
		p1.add(cacahuate);
		p1.add(jugo);
		p1.add(kidkad);
		p1.add(mamut);
		p1.add(panditas);
		p1.add(pinguinos);
		p1.add(trikitrakets);
		//Se añaden las etiquetas de codigo a el panel
		p1.add(codiBarritas);
		p1.add(codiChips);
		p1.add(codiCoca);
		p1.add(codiCremax);
		p1.add(codiGomitas);
		p1.add(codiHot);
		p1.add(codiJugo);
		p1.add(codiKid);
		p1.add(codiMamut);
		p1.add(codiPanditas);
		p1.add(codiPinguinos);
		p1.add(coditriki);
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
		//Se añade botones con imagen al panel
		p1.add(peso1);
		p1.add(peso2);
		p1.add(peso5);
		p1.add(peso10);
		p1.add(peso20);
		p1.add(peso50);
		p1.add(pagar);
		p1.add(recoger);
		p1.add(recoger2);
		//Se añaden cajas
		p1.add(caja1);
		p1.add(caja2);
		p1.add(caja3);
		p1.add(caja5);
		//Asignacion de OyenteCodigo
		GestionBoton accion = new GestionBoton(this);

		ba.addActionListener(accion);
		bb.addActionListener(accion);
		bc.addActionListener(accion);
		b1.addActionListener(accion);
		b2.addActionListener(accion);
		b3.addActionListener(accion);
		b4.addActionListener(accion); 
		ok.addActionListener(accion);

		peso1.addActionListener(accion);
		peso2.addActionListener(accion);
		peso5.addActionListener(accion);
		peso10.addActionListener(accion);
		peso20.addActionListener(accion);
		peso50.addActionListener(accion);

		borrar.addActionListener(accion);
		pagar.addActionListener(accion);
		recoger.addActionListener(accion);
		recoger2.addActionListener(accion);
		//Asignacion de texto a los cuadros de signos
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
}
