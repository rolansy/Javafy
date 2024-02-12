import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class calc extends JFrame implements ActionListener{
    JFrame jfr;
    JTextField jt;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton badd,bsub,bmul,bdiv,beq,bclear,bdot;
    String s0,s1,s2;
    double t;
    
    calc(){
        s0=s1=s2="";
        jfr=new JFrame();
        jfr.setTitle("Calculator");
        jfr.setLayout(null);
        jfr.getContentPane().setBackground(Color.blue);
        jfr.setSize(260,350);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jt=new JTextField();
        jt.setBounds(10,10,170,50);
        jfr.add(jt);

        bclear=new JButton("C");
        bclear.setBounds(190,10,50,50);
        bclear.addActionListener(this);
        jfr.add(bclear);

        badd=new JButton("+");
        badd.setBounds(10,70,50,50);
        badd.addActionListener(this);
        jfr.add(badd);

        bsub=new JButton("-");
        bsub.setBounds(10,130,50,50);
        bsub.addActionListener(this);
        jfr.add(bsub);

        bmul=new JButton("*");
        bmul.setBounds(10,190,50,50);
        bmul.addActionListener(this);
        jfr.add(bmul);

        bdiv=new JButton("/");
        bdiv.setBounds(10,250,50,50);
        bdiv.addActionListener(this);
        jfr.add(bdiv);
        
        b1=new JButton("1");
        b1.setBounds(70,70,50,50);
        b1.addActionListener(this);
        jfr.add(b1);


        b2=new JButton("2");
        b2.setBounds(130,70,50,50);
        b2.addActionListener(this);
        jfr.add(b2);

        b3=new JButton("3");
        b3.setBounds(190,70,50,50);
        b3.addActionListener(this);
        jfr.add(b3);

        b4=new JButton("4");
        b4.setBounds(70,130,50,50);
        b4.addActionListener(this);
        jfr.add(b4);

        b5=new JButton("5");
        b5.setBounds(130,130,50,50);
        b5.addActionListener(this);
        jfr.add(b5);

        b6=new JButton("6");
        b6.setBounds(190,130,50,50);
        b6.addActionListener(this);
        jfr.add(b6);

        b7=new JButton("7");
        b7.setBounds(70,190,50,50);
        b7.addActionListener(this);
        jfr.add(b7);

        b8=new JButton("8");
        b8.setBounds(130,190,50,50);
        b8.addActionListener(this);
        jfr.add(b8);

        b9=new JButton("9");
        b9.setBounds(190,190,50,50);
        b9.addActionListener(this);
        jfr.add(b9);



        bdot=new JButton(".");
        bdot.setBounds(70,250,50,50);
        bdot.addActionListener(this);
        jfr.add(bdot);
        b0=new JButton("0");
        b0.setBounds(130,250,50,50);
        b0.addActionListener(this);
        jfr.add(b0);
        beq=new JButton("=");
        beq.setBounds(190,250,50,50);
        beq.addActionListener(this);
        jfr.add(beq);

        jfr.setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e){
        
        String s=e.getActionCommand();
        char ch=s.charAt(0);
        if (ch>='0' && ch<='9' || ch=='.'){
            if (s1.equals("")){
                s0+=ch;
            }
            else{
                s2+=ch;
            }
            jt.setText(s0+s1+s2);
        }
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
            s1+=ch;
            jt.setText(s0+s1+s2);
        }
        else if (s.equalsIgnoreCase("C")){
            s1=s2=s0="";
            jt.setText("");
        }
        else if (ch=='='){
            if (s1.equalsIgnoreCase("+")){
                t=Double.parseDouble(s0)+Double.parseDouble(s2);
            }
            else if (s1.equalsIgnoreCase("-")){
                t=Double.parseDouble(s0)-Double.parseDouble(s2);
            }
            else if (s1.equalsIgnoreCase("*")){
                t=Double.parseDouble(s0)*Double.parseDouble(s2);
            }
            else if (s1.equalsIgnoreCase("/")){
                t=Double.parseDouble(s0)/Double.parseDouble(s2);
            }
            s0=String.valueOf(t);
            s1=s2="";
            jt.setText(String.valueOf(t));
        }

    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new calc();
            }
        });
    }

}