/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitconvertoop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;






public class Unitconvertoop  extends JFrame implements MouseListener{
   
    
    JPanel singin =new JPanel();
JPanel jPanel1 =new JPanel();
JPanel side_pane =new JPanel();
JLabel   jLabel1 =new JLabel();
JLabel   well =new JLabel();
JLabel   jLabel =new JLabel();
JLabel   day =new JLabel();
JPanel btn_2 =new JPanel();
JLabel   jLabel2 =new JLabel();
JPanel panel3=new JPanel();
JPanel  btn_1=new JPanel();
JPanel  btn_3=new JPanel();
JLabel   jLabel3 =new JLabel();
JPanel  btn_4=new JPanel( );
JPanel  btn_5=new JPanel( );
JLabel   jLabel4 =new JLabel();
JLabel   jLabel5 =new JLabel();
JLabel   image =new JLabel();
JLabel   newem =new JLabel();
JPanel  btn_6=new JPanel( );
JLabel   jLabel6 =new JLabel();
JPanel  btn_7=new JPanel( );
JLabel   jLabel7 =new JLabel();
JPanel p1=new JPanel();
JPanel p2=new JPanel();
JPanel p3=new JPanel();
JPanel p4=new JPanel();
JPanel p5=new JPanel();
JPanel p7=new JPanel();
        
JButton jButton3=new JButton(
new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }


);

JButton upload=new JButton(
new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
           JFileChooser jfc = new JFileChooser();
jfc.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
		

int returnValue = jfc.showOpenDialog(null);
if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println(selectedFile.getAbsolutePath());
                        image.setIcon(new javax.swing.ImageIcon(selectedFile.getAbsolutePath()));
		}
        }
    }


);
JButton sumbit=new JButton(
new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
          
        }
    }


);

  public Unitconvertoop(){
   
    
      
      jPanel1.setBackground((Color.WHITE));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
                jPanel1.setBounds(0, 0, 660, 560);
      //..  setBounds(0, 0, 1040, 560);
        setSize( 660, 560);

 
      
        well.setBounds(260, 20, 270, 50);

 
       
        //employ ......................
        jPanel1.add(side_pane);
      side_pane.setBounds(0, 0, 120, 600);
       side_pane.setBackground(new java.awt.Color(23, 35, 51));
       side_pane.setLayout(null);
               side_pane.add(btn_1);
        btn_1.setBackground(new java.awt.Color(23, 35, 51));
     
        btn_1.setBounds(0, 100, 120, 40);
   p1.hide();
           p1.setBackground((Color.black));
       p1.setLayout(null);
        jPanel1.add(p1);
                p1.setBounds(120, 0, 660, 560);
         jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Currncy");
        btn_1.add(jLabel1);
        jLabel1.setBounds(38, 12, 33, 26);
          btn_1.addMouseListener(this);
    
     
          
          
          
          
          
     //......................................................
        //new employ..................................
        side_pane.add(btn_2);
        btn_2.setBounds(0, 150, 120, 40);
          btn_2.setBackground(new java.awt.Color(23, 35, 51));
         jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(Color.white);
        jLabel2.setText("Temperature");
            jLabel2.setBounds(38, 12, 33, 26);
        btn_2.add(jLabel2);           p2.setBackground((Color.black));
       p2.setLayout(null);
       jPanel1.add(p2);
                p2.setBounds(120, 0, 660, 560);

 p2.hide();
          btn_2.addMouseListener(this);
      


        // Rigester...........
        
            side_pane.add(btn_3);
        btn_3.setBounds(0, 200, 120, 40);
          btn_3.setBackground(new java.awt.Color(23, 35, 51));
         jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(Color.white);
        jLabel3.setText("Length");
            jLabel3.setBounds(38, 12, 33, 26);
        btn_3.add(jLabel3);
          btn_3.addMouseListener(this);
            p3.hide();
           p3.setBackground((Color.BLACK));
       p3.setLayout(null);
        jPanel1.add(p3);
                p3.setBounds(120, 0, 660, 560);
          //log out...
          
              side_pane.add(btn_5);
        btn_5.setBounds(0, 250, 120, 40);
          btn_5.setBackground(new java.awt.Color(23, 35, 51));
         jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(Color.WHITE);
        jLabel5.setText("Area");
            jLabel5.setBounds(38, 12, 33, 26);
        btn_5.add(jLabel5);
       btn_5.addMouseListener(this);
          p5.hide();
           p5.setBackground((Color.black));
       p5.setLayout(null);
        jPanel1.add(p5);
                p5.setBounds(120, 0, 660, 560);
        //close.............. 
        
              side_pane.add(btn_4);
        btn_4.setBounds(0, 300, 120, 40);
          btn_4.setBackground(new java.awt.Color(23, 35, 51));
         jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setText("Volume");
            jLabel4.setBounds(38, 12, 33, 26);
        btn_4.add(jLabel4);
       btn_4.addMouseListener(this);
          p4.hide();
           p4.setBackground((Color.black));
       p4.setLayout(null);
        jPanel1.add(p4);
                p4.setBounds(120, 0, 660, 560);
        
        
      
       
                         side_pane.add(btn_7);
        btn_7.setBounds(0, 350, 120, 40);
          btn_7.setBackground(new java.awt.Color(23, 35, 51));
         jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(Color.white);
        jLabel7.setText("Weight");
            jLabel7.setBounds(38, 12, 33, 26);
        btn_7.add(jLabel7);
       btn_7.addMouseListener(this);
        p7.hide();
           p7.setBackground((Color.black));
       p7.setLayout(null);
        jPanel1.add(p7);
                p7.setBounds(120, 0, 660, 560);
        
          setLocationRelativeTo(null);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
    
    
    
    
    
    public static void main(String[] args) {
    Unitconvertoop obj=new Unitconvertoop();
    obj.show();
    obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==btn_1) {
      p1.show();
     p7.hide();
      p2.hide();
      p5.hide();
      p3.hide();
        }
        if (e.getSource()==btn_2) {
      p1.hide();
      p3.hide();
      p4.hide();
      p5.hide();
      p2.show();
      p7.hide();
        }
        if (e.getSource()==btn_3) {
          p1.hide();
          p4.hide();
      p2.hide();
      p5.hide();
      p3.show();
      p7.hide();
      
        }
        if (e.getSource()==btn_5) {
      p7.hide();
         p1.hide();
         p4.hide();
      p2.hide();
      p3.hide();
      p5.show();
        }
        if (e.getSource()==btn_4) {
      p7.hide();
        p1.hide();
      p2.hide();
      p3.hide();
      p5.hide();
      p4.show();
        }
        if (e.getSource()==btn_7) {
      
        
        p1.hide();
        p4.hide();
      p2.hide();
      p3.hide();
      p5.hide();
      p7.show();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
         if (e.getSource()==btn_4) {
         
            
        }
   
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    
       
        if (e.getSource()==btn_1) {
         
             btn_1.setBackground(new java.awt.Color(29, 46, 69)); 
        }
    
        if (e.getSource()==btn_2) {
         
             btn_2.setBackground(new java.awt.Color(29, 46, 69)); 
        }
    
        if (e.getSource()==btn_3) {
         
             btn_3.setBackground(new java.awt.Color(29, 46, 69)); 
        }
    
        if (e.getSource()==btn_4) {
         
             btn_4.setBackground(new java.awt.Color(29, 46, 69)); 
        }
        if (e.getSource()==btn_5) {
         
             btn_5.setBackground(new java.awt.Color(29, 46, 69)); 
        }
        if (e.getSource()==btn_6) {
         
             btn_6.setBackground(new java.awt.Color(29, 46, 69)); 
        }
        if (e.getSource()==btn_7) {
         
             btn_7.setBackground(new java.awt.Color(29, 46, 69)); 
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
     
         if (e.getSource()==btn_1) {
          
              btn_1.setBackground(new java.awt.Color(23, 35, 51));
        }
         if (e.getSource()==btn_2) {
          
              btn_2.setBackground(new java.awt.Color(23, 35, 51));
              
        }
         if (e.getSource()==btn_3) {
          
              btn_3.setBackground(new java.awt.Color(23, 35, 51));
        }
         if (e.getSource()==btn_4) {
          
              btn_4.setBackground(new java.awt.Color(23, 35, 51));
        }
         if (e.getSource()==btn_5) {
          
              btn_5.setBackground(new java.awt.Color(23, 35, 51));
        }
 if (e.getSource()==btn_6) {
          
              btn_6.setBackground(new java.awt.Color(23, 35, 51));
        }
  if (e.getSource()==btn_7) {
          
              btn_7.setBackground(new java.awt.Color(23, 35, 51));
        }
    
    }}
