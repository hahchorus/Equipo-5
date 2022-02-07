import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GestionBoton implements ActionListener {
    private Expendedora maquina;

    public GestionBoton(Expendedora maquina){
        this.maquina = maquina;
    }

    public void actionPerformed (ActionEvent e){
        String accion = e.getActionCommand();

        if(accion.equals("A")){
            maquina.caja1.setText(maquina.caja1.getText() + "A");
        }

        if(accion.equals("B")){
            maquina.caja1.setText(maquina.caja1.getText() + "B");
        }

        if(accion.equals("C")){
            maquina.caja1.setText(maquina.caja1.getText() + "C");
        }

        if(accion.equals("1")){
            maquina.caja1.setText(maquina.caja1.getText() + "1");
        }

        if(accion.equals("2")){
            maquina.caja1.setText(maquina.caja1.getText() + "2");
        }

        if(accion.equals("3")){
            maquina.caja1.setText(maquina.caja1.getText() + "3");
        }

        if(accion.equals("4")){
            maquina.caja1.setText(maquina.caja1.getText() + "4");
        }

        if(accion.equals("OK")){
            switch(maquina.caja1.getText()){
                case "A1": maquina.caja5.setText("13");
                break;

                case "A2": maquina.caja5.setText("13");
                break;

                case "A3": maquina.caja5.setText("13");
                break;

                case "A4": maquina.caja5.setText("13");
                break;

                case "B1": maquina.caja5.setText("11");
                break;

                case "B2": maquina.caja5.setText("11");
                break;

                case "B3": maquina.caja5.setText("11");
                break;

                case "B4": maquina.caja5.setText("11");
                break;

                case "C1": maquina.caja5.setText("9");
                break;

                case "C2": maquina.caja5.setText("9");
                break;
                
                case "C3": maquina.caja5.setText("9");
                break;

                case "C4": maquina.caja5.setText("9");
                break;

                default: maquina.caja5.setText("Codigo Incorrecto");
                break;
            }
        }

        if(accion.equals("P1")){
            maquina.num1 = Integer.parseInt(maquina.caja2.getText());
            maquina.num1 = maquina.num1 + 1;
            maquina.num2 = String.valueOf(maquina.num1);
            maquina.caja2.setText(maquina.num2);
        }

        if(accion.equals("P2")){
            maquina.num1 = Integer.parseInt(maquina.caja2.getText());
            maquina.num1 = maquina.num1 + 2;
            maquina.num2 = String.valueOf(maquina.num1);
            maquina.caja2.setText(maquina.num2);
        }

        if(accion.equals("P5")){
            maquina.num1 = Integer.parseInt(maquina.caja2.getText());
            maquina.num1 = maquina.num1 + 5;
            maquina.num2 = String.valueOf(maquina.num1);
            maquina.caja2.setText(maquina.num2);
        }

        if(accion.equals("P10")){
            maquina.num1 = Integer.parseInt(maquina.caja2.getText());
            maquina.num1 = maquina.num1 + 10;
            maquina.num2 = String.valueOf(maquina.num1);
            maquina.caja2.setText(maquina.num2);
        }

        if(accion.equals("P20")){
            maquina.num1 = Integer.parseInt(maquina.caja2.getText());
            maquina.num1 = maquina.num1 + 20;
            maquina.num2 = String.valueOf(maquina.num1);
            maquina.caja2.setText(maquina.num2);
        }

        if(accion.equals("P50")){
            maquina.num1 = Integer.parseInt(maquina.caja2.getText());
            maquina.num1 = maquina.num1 + 50;
            maquina.num2 = String.valueOf(maquina.num1);
            maquina.caja2.setText(maquina.num2);
        }

        if(accion.equals("PAGAR")){
            maquina.pago1 = Integer.parseInt(maquina.caja5.getText());
            maquina.pago2 = Integer.parseInt(maquina.caja2.getText());
            if(maquina.pago2 >= maquina.pago1 & maquina.pago1 != 0){
                maquina.pago2 = maquina.pago2 - maquina.pago1;
                maquina.cambio1 = String.valueOf(maquina.pago2);
                maquina.caja3.setText(maquina.cambio1);

                switch(maquina.caja1.getText()){
                    case "A1":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima1.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "A2":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima2.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "A3":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima3.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "A4":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima4.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "B1":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima5.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "B2":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima6.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "B3":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima7.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "B4":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima8.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "C1":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima9.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "C2":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima10.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "C3":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima11.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;

                    case "C4":
                        maquina.produ.setIcon(new ImageIcon(maquina.ima12.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
                        maquina.produ.setBounds(70,15,120,130);
                        maquina.p2.add(maquina.produ);
                    break;
                }
            
            }else if(maquina.pago2 < maquina.pago1 & maquina.pago1 !=0){
                maquina.caja3.setText(maquina.caja2.getText());
                maquina.caja2.setText("Ingrese el pago completo");
            }else if(maquina.pago1 == 0){
                maquina.caja3.setText(maquina.caja2.getText());
                maquina.caja2.setText("Selecciona un producto");
            }
        }
    
        if(accion.equals("BORRAR")){
            maquina.caja1.setText("");
            maquina.caja5.setText("0");
        }

        if(accion.equals("RECOGER")){
            maquina.caja2.setText("0");
            maquina.caja3.setText("0");
            maquina.caja5.setText("0");
            maquina.caja1.setText("");
        }

        if(accion.equals("RECOGER2")){
            maquina.produ.setIcon(new ImageIcon(maquina.ima19.getImage().getScaledInstance(120, 130, Image.SCALE_DEFAULT)));
            maquina.produ.setBounds(70,15,120,130);
            maquina.p2.add(maquina.produ);
            maquina.caja2.setText("0");
            maquina.caja3.setText("0");
            maquina.caja5.setText("0");
            maquina.caja1.setText("");
        }

    }

}
