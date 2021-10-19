
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikhi
 */
public class insert extends JFrame implements ActionListener{
     JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
 String file;
     JButton b1,b2;

    public insert(){
          setSize(600,650);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1= new JPanel();
        p1.setBackground(Color.WHITE);
      
        p1.setLayout(new GridLayout(8,2,10,40));
        l1 = new JLabel("Name");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);
       
      
       
        l2 = new JLabel("empid");
        p1.add(l2);
        t2 = new JTextField(15);
        p1.add(t2);
        l3 = new JLabel("Salary");
        t3 = new JTextField(15);
        p1.add(l3);
        p1.add(t3);
        l4 = new JLabel("Joining Date");
        t4 = new JTextField(15);
        p1.add(l4);
        p1.add(t4); 
        l5 = new JLabel("Age");
        t5 = new JTextField(15);
        p1.add(l5);
        p1.add(t5);
        
        
        b1 =new JButton("Insert");
        p1.add(b1);
                 b2 =new JButton("Submit");
        p1.add(b2);
       
        setLayout(new BorderLayout());
        
        add(p1,"Center");
       
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
       
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        
       }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==b1){
       PrintWriter pw = null;
         try {
             pw = new PrintWriter(new FileOutputStream(new File("D:\\manualtest.txt"),true));
            file = "D:\\manualtest.txt";
            String b = t1.getText()+"|"+t2.getText()+"|"+t3.getText()+"|"+t4.getText()+"|"+t5.getText();
             
             pw.println(b);
             
             JOptionPane.showMessageDialog(null, "Insertion Successfull");
                setVisible(true);
             pw.flush();
             pw.close();
         } catch (FileNotFoundException ex) {
             Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             pw.close();
         }
       } if(ae.getSource()==b2){
       new test1(file).setVisible(true);
       }


      }
   
}
