import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends JFrame implements ActionListener{

    JFrame jfr;
    JTextField jt1,jt2;
    JLabel jpl,jp1,jp2;
    JPasswordField pw;
    JButton b;
    
    login(){
        jfr=new JFrame("USER LOGIN");

        pw=new JPasswordField();

        jp1=new JLabel();
        jp1.setText("USERNAME");
        jp1.setBounds(50,10,200,50);
        jfr.add(jp1);
        jp2=new JLabel();
        jp2.setText("PASSWORD");
        jp2.setBounds(50,100,200,50);
        jfr.add(jp2);


        jpl=new JLabel();
        // jpl.setText("Ronal");
        jpl.setBounds(50,275,100,50);
        jfr.setLayout(null);
        jfr.setSize(400,400);
        jfr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jfr.getContentPane().setBackground(Color.magenta);
        jt1=new JTextField();
        jt1.setBounds(50,50,200,50);
        // jt1.addActionListener(this);
        // jt1.setText("USERNAME");
        jfr.add(jt1);
        // jt2=new JTextField();
        pw.setBounds(50,150,200,50);
        // pw.addActionListener(this);
        // jt2.setText("PASSWORD");
        jfr.add(pw);
        jfr.add(jpl);

        b=new JButton("LOGIN");
        b.setBounds(50,225,100,50);
        b.addActionListener(this);
        jfr.add(b);

        jfr.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
        if(s.equalsIgnoreCase("login")){
            String user=jt1.getText();
            String psw=String.valueOf(pw.getPassword());
            if (user.equals("ronal")&&psw.equals("podamaire")){
                jpl.setText("LOGIN SUCCESS");
            }
            else{
                jpl.setText("LOGIN FAILED");
            }
        }

    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new login();
            }

        });

    }
    
}
