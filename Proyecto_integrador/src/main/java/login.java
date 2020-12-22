import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.*;
import java.net.URL;


public class Login extends JFrame {
 
        private JLabel LblTitle, LblUser, LblPass, LblCargo, LblImg;
        private JTextField TxtUser;
        private JPasswordField TxtPass;  
        private JButton BtnOk, BtnCancel;  
        private JComboBox JCombo;
        private JPanel Panel;
     
     
     
  public Login()  
  {            
      super("Granados Software Control y Data");
  getContentPane().setLayout(null);

  //CREACION Y DISEÑO
  LblTitle = new JLabel("Acceso al Sistema");
  LblTitle.setFont(new Font("Verdama",Font.BOLD,34));      
  LblTitle.setBounds(240,10,450,80);

  ImageIcon imagen = new ImageIcon("Control.png");
  LblImg = new JLabel(imagen);
  LblImg.setBounds(50,50,270,300);  
  LblImg.setIcon(new ImageIcon(getClass().getResource("Control.png")));

  LblUser = new JLabel("Usuario");
  LblUser.setFont(new Font("Verdama",Font.BOLD,14));      
  LblUser.setBounds(400,130,150,30);

  LblPass = new JLabel("Contraseña");
  LblPass.setFont(new Font("Verdama",Font.BOLD,14));  
  LblPass.setBounds(400,190,150,30);

  LblCargo = new JLabel("Cargo");
  LblCargo.setFont(new Font("Verdama",Font.BOLD,14));  
  LblCargo.setBounds(400,250,150,30);

  TxtUser = new JTextField(15);
  TxtUser.setBounds(520,130,150,30);  

  TxtPass = new JPasswordField(15);
  TxtPass.setBounds(520,190,150,30);    
 
  //AQUI ME FALTA PONER JCOMBOBOX

  BtnOk  =  new JButton ("Aceptar");            
  BtnOk.setBounds(400,300,120,70);

  BtnCancel  =  new JButton ("Cancelar");            
  BtnCancel.setBounds(550,300,120,70);


  getContentPane().add(LblTitle);
  getContentPane().add(LblUser);
  getContentPane().add(LblPass);
  getContentPane().add(TxtUser);
  getContentPane().add(TxtPass);
  getContentPane().add(LblCargo);
  getContentPane().add(BtnOk);
  getContentPane().add(BtnCancel);
  getContentPane().add(LblImg);

  //CREAR CAMPO DE TEXTO Y COLOCAR EN POSICION EL JCOMBO

  String[] JCombo = {"Administrador", "Ursula", "Mariela"
                ,"Veronica", "Magaly", "Nikol", "Stefany"};


  //AQUI SE AGREGA EL EVENTO DEL BOTON DIRECTAMENTE    
 BtnOk.addActionListener(new ActionListener()      
  {             public void actionPerformed(ActionEvent evento)
   
   
  {      
   
   char Pass[]=TxtPass.getPassword();
   String PassDefinido = new String(Pass);
   
      if( TxtUser.getText().equals("admin") && PassDefinido.equals("123") )          

      JOptionPane.showMessageDialog(null,"Bienvenido Has ingresado satisfactoriamente al sistema");


  else  {
  if( !TxtUser.getText().equals("admin") )
  JOptionPane.showMessageDialog(null,"USUARIO INCORRECTO");
  else
  if( !TxtPass.getPassword().equals("123") )
  JOptionPane.showMessageDialog(null,"PASSWORD INCORRECTO");
  }                                        
  }                       });

  setSize(800,500);    
  setLocation(150,50);    
  setVisible(true);

  }  



  }
