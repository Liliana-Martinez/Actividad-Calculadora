import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
public class Calculadora extends JFrame {

   
   //constructor
   public Calculadora()
   {
      initComponents();
   }
   
   //método para inicializar los componentes
   private void initComponents()
   {
         /*variables
         String n1 = Text_num1.getText();
         String n2 = Text_num1.getText();
         
         int val1 = Integer.parseInt(n1);
         int val2 = Integer.parseInt(n2);
   */
      
         //crear segundo contenedor
         JPanel panel = new JPanel();
         setSize(400, 250);//largo, ancho
         setTitle("CALCULADORA");
         setLocationRelativeTo(null);
         this.getContentPane().add(panel);
         panel.setLayout(null);//para permitir acomodar elementos en el panel
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         //Crear etiqueta para numero 1 
         JLabel Eti_num1 = new JLabel("Numero");
         Eti_num1.setBounds(10, 10, 50, 20);//separacionHorizantalConVentana, separacionvertialConVentana, largoEtiqueta, anchoEtiqueta 
         Eti_num1.setOpaque(true);//permitir que la etiqueta guarde el color
         Eti_num1.setBackground(Color.WHITE);
         panel.add(Eti_num1);
         
         //Crear caja se texto para número 1
         JTextField Text_num1 = new JTextField();
         Text_num1.setBounds(70, 10, 50, 20);
         panel.add(Text_num1);
         
         //Crear etiqueta para numero 2 
         JLabel Eti_num2 = new JLabel("Numero");
         Eti_num2.setBounds(160, 10, 50, 20);//separacionHorizantalConVentana, separacionvertialConVentana, largoEtiqueta, anchoEtiqueta 
         Eti_num2.setOpaque(true);//permitir que la etiqueta guarde el color
         Eti_num2.setBackground(Color.WHITE);
         panel.add(Eti_num2);
         
         //Crear caja se texto para número 2
         JTextField Text_num2 = new JTextField();
         Text_num2.setBounds(220, 10, 50, 20);
         panel.add(Text_num2);
         
         //crear boton sumar
         JButton sumar = new JButton();
         sumar.setBounds(10, 50, 60, 60);
         sumar.setEnabled(true);
         ImageIcon bsuma = new ImageIcon("suma.jpg");
         sumar.setIcon(new ImageIcon(bsuma.getImage().getScaledInstance(sumar.getWidth(), sumar.getHeight(), Image.SCALE_SMOOTH)));
         panel.add(sumar);
         
         //crear boton restar
         JButton restar = new JButton();
         restar.setBounds(80, 50, 60, 60);
         restar.setEnabled(true);
         ImageIcon bresta = new ImageIcon("resta.png");
         restar.setIcon(new ImageIcon(bresta.getImage().getScaledInstance(restar.getWidth(), restar.getHeight(), Image.SCALE_SMOOTH)));
         panel.add(restar);
         
         //crear boton multiplicar
         JButton mult = new JButton();
         mult.setBounds(150, 50, 60, 60);
         mult.setEnabled(true);
         ImageIcon bmult = new ImageIcon("mult.jpg");
         mult.setIcon(new ImageIcon(bmult.getImage().getScaledInstance(mult.getWidth(), mult.getHeight(), Image.SCALE_SMOOTH)));
         panel.add(mult);
         
         //crear boton dividir
         JButton divi = new JButton();
         divi.setBounds(220, 50, 60, 60);
         divi.setEnabled(true);
         ImageIcon bdivi = new ImageIcon("divi.png");
         divi.setIcon(new ImageIcon(bdivi.getImage().getScaledInstance(divi.getWidth(), divi.getHeight(), Image.SCALE_SMOOTH)));
         panel.add(divi);
         
         /*crear boton calcular
         JButton calcular = new JButton("CALCULAR");
         calcular.setBounds(160, 130, 100, 20);
         calcular.setEnabled(true);
         panel.add(calcular);*/
         
         //crear etiqueta de resultado
         JLabel resultado = new JLabel();
         resultado.setBounds(160, 160, 100, 20);
         resultado.setOpaque(true);//permitir que la etiqueta guarde el color
         resultado.setBackground(Color.WHITE);
         panel.add(resultado);
         
         
         /*Eventos
            Evento para suma*/
         ActionListener oyenteSuma = new ActionListener(){
         
            @Override
            public void actionPerformed(ActionEvent ae) {
               int n1 = Integer.parseInt(Text_num1.getText());
               int n2 = Integer.parseInt(Text_num2.getText());
               int total = n1 + n2;
               String res = total+"";
               resultado.setText(res);
            }
         };
         sumar.addActionListener(oyenteSuma);
         
         //evento resta
         ActionListener oyenteResta = new ActionListener(){
         
            @Override
            public void actionPerformed(ActionEvent ae) {
               int n1 = Integer.parseInt(Text_num1.getText());
               int n2 = Integer.parseInt(Text_num2.getText());
               int total;
               if(n1 > n2)
                  total = n1 - n2;
                  else
                     total = n2 - n1;
               String res = total+"";
               resultado.setText(res);
            }
         };
         restar.addActionListener(oyenteResta);
         
         //evento multiplicar
         ActionListener oyenteMult = new ActionListener(){
         
            @Override
            public void actionPerformed(ActionEvent ae) {
               int n1 = Integer.parseInt(Text_num1.getText());
               int n2 = Integer.parseInt(Text_num2.getText());
               int total = n1 * n2;
               String res = total+"";
               resultado.setText(res);
            }
         };
         mult.addActionListener(oyenteMult);
         
         //evento division
         ActionListener oyenteDivi = new ActionListener(){
         
            @Override
            public void actionPerformed(ActionEvent ae) {
               int n1 = Integer.parseInt(Text_num1.getText());
               int n2 = Integer.parseInt(Text_num2.getText());
               int total;
               if(n1 > n2)
                  total = n1/n2;
                  else
                     total = n2/n1;    
               String res = total+"";
               resultado.setText(res);
            }
         };
         divi.addActionListener(oyenteDivi);
   }
   
}