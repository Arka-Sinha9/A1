import java.awt.*;
import java.awt.event.*;
class TextBox extends Frame implements ActionListener{
    TextField email,password;
    public TextBox(){
        setLayout(new FlowLayout());

        email=new TextField(20);
        password=new TextField(20);
        email.setText("");
        password.setText("");
        password.setEchoChar('*');
        Label emailLabel=new Label("Name :",Label.LEFT);
        Label passwordLabel=new Label("Password :",Label.RIGHT);
        Button btn=new Button("Submit");

        add(emailLabel);
        add(email);
        add(passwordLabel);
        add(password);
        add(btn);

        btn.addActionListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    public void actionPerformed(ActionEvent ae){
        repaint();
    }
    public void paint(Graphics g){
            g.drawString("Email Input : "+email.getText(),50,100);
            g.drawString("Selected Text : "+email.getSelectedText(),50,150);
            g.drawString("Password Input : "+password.getText(),50,200);
    }
    public static void main(String args[]){
        TextBox t=new TextBox();
        t.setSize(new Dimension(500,500));
        t.setTitle("Text filed input");
        t.setVisible(true);
    }
}
class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent window){
        System.exit(0);
    }
}
