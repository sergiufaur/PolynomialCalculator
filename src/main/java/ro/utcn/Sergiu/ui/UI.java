package ro.utcn.Sergiu.ui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class UI {
        private JFrame frame;
        private JTextField field1;
        private JTextField field2;
        private JTextField result;
        private JButton buttonAdd;
        private JButton buttonSub;
        private JButton buttonMul;
        private JButton buttonDer;
        private JButton buttonInt;
        private JTextField textP1;
        private JTextField textP2;

    public UI(){
        frame = new JFrame() ;
        field1 = new JTextField(20);
        field2 = new JTextField(20);
        result = new JTextField(40);
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("x");
        buttonDer = new JButton("Deriv");
        buttonInt = new JButton("I");
        textP1=new JTextField("P1",20);
        textP2=new JTextField("P2",20);

        textP1.setEditable(false);
        textP2.setEditable(false);

        JPanel p=new JPanel();
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        JPanel p0 = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2=new JPanel();

        p0.add(field1);
        p0.add(field2);
        p0.add(textP1);
        p0.add(textP2);
        p1.add(result);
        p2.add(buttonAdd);
        p2.add(buttonSub);
        p2.add(buttonMul);
        p2.add(buttonDer);
        p2.add(buttonInt);

        p.add(p0);
        p.add(p1);
        p.add(p2);
        result.setEditable(false);

        frame.setSize(500 ,300);

        frame.setContentPane(p);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void show(){
        frame.setVisible(true);
    }
    public String getField1Value(){
        return field1.getText();
    }
    public String getField2Value(){
        return field2.getText();
    }

    public void setResult(String s){
        result.setText(s);
    }
    public String getResullt(){
        return result.getText();
    }
    public void setSecondField(String s){
        field2.setText(s);
    }

    public void addComputeActionListener(ActionListener actionListener){
        buttonAdd.addActionListener(actionListener);
    }
    public void subComputeActionListener(ActionListener actionListener){
        buttonSub.addActionListener(actionListener);
    }
    public void derivComputeActionListener(ActionListener actionListener){
        buttonDer.addActionListener(actionListener);
    }
    public void intComputeActionListener(ActionListener actionListener){
        buttonInt.addActionListener(actionListener);
    }
    public void mulComputeActionListener(ActionListener actionListener){
        buttonMul.addActionListener(actionListener);
    }

}
