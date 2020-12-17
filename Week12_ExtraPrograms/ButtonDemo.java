import java.awt.*;
import java.awt.event.*;
class ButtonDemo extends Frame implements ActionListener{
    String msg="";
    Button buttonList[]=new Button[3];
    public ButtonDemo(){

        setLayout(new FlowLayout());

        Button yes=new Button("Yes");
        Button no=new Button("No");
        Button maybe=new Button("Maybe");

        buttonList[0]=(Button) add(yes);
        buttonList[1]=(Button) add(no);
        buttonList[2]=(Button) add(maybe);

        for(int i=0;i<3;i++){
            buttonList[i].addActionListener(this);
        }
        addWindowListener(new MyWindowAdapter());
    }
    public void actionPerformed(ActionEvent ae){
        String action=ae.getActionCommand();
        for(int i=0;i<3;i++){
            if(action==buttonList[i].getLabel())
                msg="You Pressed "+action;
        }
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg,20,100);
    }
    public static void main(String args[]){
        ButtonDemo btnDemo=new ButtonDemo();
        btnDemo.setSize(new Dimension(300,300));
        btnDemo.setTitle("Button Example");
        btnDemo.setVisible(true);
    }
}
class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent window){
        System.exit(0);
    }
}
