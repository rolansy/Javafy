import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

public class guifiles extends JFrame implements ActionListener {
    JFrame jfr;
    JButton bf;
    JTextField jt;
    JLabel jl,jl2;
    JTextArea jta;

    guifiles(){
        jfr=new JFrame("FILESORCERY");
        jfr.setSize(400,400);
        jfr.setLayout(null);
        jfr.getContentPane().setBackground(Color.magenta);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jl=new JLabel("Enter File Name : ");
        jl.setBounds(50,10,200,50);
        jfr.add(jl); 

        jl2=new JLabel("Check Existency : ");
        jl2.setBounds(50,100,200,50);
        jfr.add(jl2); 
        
        jt=new JTextField();
        jt.setBounds(50,50,200,50);
        jfr.add(jt);

        bf=new JButton("^");
        bf.setBounds(50,150,100,50);
        bf.addActionListener(this);
        jfr.add(bf);

        jta=new JTextArea();
        jta.setBounds(50,250,250,100);
        jfr.add(jta);




        jfr.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();

        if (s.charAt(0)=='^'){
            String fname=jt.getText();
            try{

                BufferedReader r=new BufferedReader(new FileReader(fname+".txt"));
                int wc=0;
                String l;
                while((l=r.readLine())!=null){
                    wc+=l.length();
                    System.out.println(l);

                }
                String pr=("Length of File : "+wc);
                jta.setText(pr);


            }
            catch(Exception ex){
                String pr=("File Not Found : \n"+ex);
                jta.setText(pr);
            }
        }
    }


    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new guifiles();
            }
        });

    }

}
