import java.awt.*;
import java.awt.event.*;

public class ArithOp extends Frame implements ActionListener {
    TextField f1, f2, f3, f4;
    Label lf1, lf2, lf3, lf4;
    Button b;

    public ArithOp() {
        setLayout(new FlowLayout());
        Label lf1 = new Label("Number 1", Label.RIGHT);
        Label lf2 = new Label("Number 2", Label.RIGHT);
        Label lf3 = new Label("Operation", Label.RIGHT);
        Label lf4 = new Label("Answer", Label.RIGHT);
        f1 = new TextField(12);
        f2 = new TextField(12);
        f3 = new TextField(12);
        f4 = new TextField(12);
        b = new Button("RESULT");
        add(lf1);
        add(f1);
        add(lf2);
        add(f2);
        add(lf3);
        add(f3);
        add(b);
        add(lf4);
        add(f4);

        b.addActionListener(this);
        addWindowListener(new WindowAdapter1());

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {

            int num1 = Integer.parseInt(f1.getText());
            int num2 = Integer.parseInt(f2.getText());
            int num3 = 0;
            String op = f3.getText();
            switch(op){
                case "+": num3 = num1+num2;
                break;

                case "-": num3 = num1-num2;
                break;

                case "*": num3 = num1 * num2;
                break;

                case "/": num3 = num1 / num2;
            }
            f4.setText(String.valueOf(num3));

        }
    }

    public static void main(String args[]) {
        ArithOp ss = new ArithOp();
        ss.setSize(new Dimension(500, 400));
        ss.setTitle("ARITHMETIC OPERATOR");
        ss.setVisible(true);
    }

    class WindowAdapter1 extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}
