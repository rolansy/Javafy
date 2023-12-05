package labcycle3;
import java.awt.*;

import java.awt.event.*;

public class TrafficL extends Frame implements ItemListener {
    String clr = "";
    TrafficL() {
        Checkbox red, green, yellow;
        CheckboxGroup cbg = new CheckboxGroup();
        red = new Checkbox("RED", true, cbg);
        green = new Checkbox("GREEN", true, cbg);
        yellow = new Checkbox("YELLOW", true, cbg);
        setSize(300, 300);
        setTitle("Traffic Signal");
        setVisible(true);
        setLayout(null);
        add(red);
        add(yellow);
        add(green);
        red.setBounds(10,25,100,100);
        yellow.setBounds(10,100,100,100);
        green.setBounds(10,175,100,100);
        red.addItemListener(this);
        green.addItemListener(this);
        yellow.addItemListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new TrafficL();
    }

    public void itemStateChanged(ItemEvent e) {
        clr = (String)(e.getItem());
        repaint();
    }

    public void paint(Graphics g) {
        g.drawOval(200, 50, 50, 50);
        g.drawOval(200, 125, 50, 50);
        g.drawOval(200, 200, 50, 50);
       
        if (clr.equals("RED")) {
            g.setColor(Color.red);
            g.fillOval(200, 50, 50, 50);
        }
        if (clr.equals("YELLOW")) {
            g.setColor(Color.yellow);
            g.fillOval(200, 125, 50, 50);
        }
        if (clr.equals("GREEN")) {
            g.setColor(Color.green);
            g.fillOval(200, 200, 50, 50);
        }
    }
}