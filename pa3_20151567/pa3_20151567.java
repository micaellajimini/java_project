import java.awt.*;
import java.awt.event.*;
public class pa3_20151567 implements ActionListener{
    private Frame f;
    private TextField t;
    private boolean pn_flag = false;
    private boolean del_flag = false;
    private boolean equal_flag = false;
    private boolean[] bi = new boolean[4];
    private String num = "";


    public pa3_20151567(){
        
        bi[0]=false;bi[1]=false;bi[2]=false;bi[3]=false;
        f = new Frame("20151567_Calculator");
        t = new TextField("0",40);
        t.setFocusable(false);

        f.setLayout(new BorderLayout());
        Panel p = new Panel();
        Panel p2 = new Panel();
        Panel pt = new Panel();

        p.setLayout(new GridLayout(5,4,1,1));
        p2.setLayout(new GridLayout(2,1,1,1));

        f.setResizable(false);

        Button b0 = new Button("0");
        b0.setBackground(Color.black);
        Button b1 = new Button("1");
        b1.setBackground(Color.black);
        Button b2 = new Button("2");
        b2.setBackground(Color.black);
        Button b3 = new Button("3");
        b3.setBackground(Color.black);
        Button b4 = new Button("4");
        b4.setBackground(Color.black);
        Button b5 = new Button("5");
        b5.setBackground(Color.black);
        Button b6 = new Button("6");
        b6.setBackground(Color.black);
        Button b7 = new Button("7");
        b7.setBackground(Color.black);
        Button b8 = new Button("8");
        b8.setBackground(Color.black);
        Button b9 = new Button("9");
        b9.setBackground(Color.black);
        Button bstar = new Button("*");
        Button bdiv = new Button("/");
        Button broot = new Button("root");
        Button bpow = new Button("x^2");
        Button bmod = new Button("%");
        Button bdel = new Button("Del");
        Button bplus = new Button("+");
        Button bminus = new Button("-");
        Button bpoint = new Button(".");
        Button bpn = new Button("+/-");
        Button bcancel = new Button("C");
        Button bequal = new Button("=");

        pt.add(t);

        p.add(broot);
        broot.addActionListener(this);
        p.add(bpow);
        bpow.addActionListener(this);
        p.add(bmod);
        bmod.addActionListener(this);
        p.add(bdel);
        bdel.addActionListener(this);
        p.add(b7);
        b7.addActionListener(this);
        p.add(b8);
        b8.addActionListener(this);
        p.add(b9);
        b9.addActionListener(this);
        p.add(bdiv);
        bdiv.addActionListener(this);
        p.add(b4);
        b4.addActionListener(this);
        p.add(b5);
        b5.addActionListener(this);
        p.add(b6);
        b6.addActionListener(this);
        p.add(bstar);
        bstar.addActionListener(this);
        p.add(b1);
        b1.addActionListener(this);
        p.add(b2);
        b2.addActionListener(this);
        p.add(b3);
        b3.addActionListener(this);
        p.add(bplus);
        bplus.addActionListener(this);
        p.add(bpn);
        bpn.addActionListener(this);
        p.add(b0);
        b0.addActionListener(this);
        p.add(bpoint);
        bpoint.addActionListener(this);
        p.add(bminus);
        bminus.addActionListener(this);

        p2.add(bcancel);
        bcancel.addActionListener(this);
        p2.add(bequal);
        bequal.addActionListener(this);

        f.add(pt,BorderLayout.NORTH);
        //f.add(t,BorderLayout.NORTH);
        f.add(p,BorderLayout.WEST);
        f.add(p2,BorderLayout.EAST);

        f.setBackground(Color.black);
        //f.pack();
        f.setSize(370,500);
        WindowDestroyer Destroyer = new WindowDestroyer();
        f.addWindowListener(Destroyer);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        String tmp = e.getActionCommand();
        
        //System.out.println(num);
        if(tmp.equals("0")) {
            if(t.getText().equals("0")) t.setText("0");
            else {
                if(del_flag == true) t.setText("0");
                else t.setText(t.getText()+"0");
            }
            if(equal_flag == true){
                num="";
                equal_flag = false;
            }
            if(find(bi)==false){
                num += tmp;
            }
            del_flag = false;
        }
        if(tmp.equals("1")) {
            if(t.getText().equals("0")) t.setText("1");
            else {
                if(del_flag == true) t.setText("1");
                else t.setText(t.getText()+"1");
            }
            if(equal_flag == true){
                num = "";
                equal_flag = false;
            }
            if(find(bi)==false){
                num += tmp;
            }
            del_flag = false;

        }
        if(tmp.equals("2")) {
            if(t.getText().equals("0")) t.setText("2");
            else {
                if(del_flag == true) t.setText("2");
                else t.setText(t.getText()+"2");
            }
            if(equal_flag == true){
                num = "";
                equal_flag = false;
            }

            if(find(bi)==false){
                num += tmp;
            }
            del_flag = false;

        }
        if(tmp.equals("3")) {
            if(t.getText().equals("0")) t.setText("3");
            else {
                if(del_flag == true) t.setText("3");
                else t.setText(t.getText()+"3");
            }
            if(equal_flag == true){
                num = "";
                equal_flag = false;
            }

            if(find(bi)==false){
                num += tmp;
            }
            del_flag = false;
        }
        if(tmp.equals("4")) {
             if(t.getText().equals("0")) t.setText("4");
             else {
                 if(del_flag == true) t.setText("4");
                 else t.setText(t.getText()+"4");
             }
            if(equal_flag == true){
                num = "";
                equal_flag = false;
            }

            if(find(bi)==false){
                num += tmp;
            }
            del_flag = false;
       }
        if(tmp.equals("5")) {
            if(t.getText().equals("0")) t.setText("5");
            else {
                if(del_flag == true) t.setText("5");
                else t.setText(t.getText()+"5");
            }
            if(equal_flag == true){
                num = "";
                equal_flag = false;
            }

            if(find(bi)== false){
                num += tmp;
            }
            del_flag = false;
        }
        if(tmp.equals("6")) {
            if(t.getText().equals("0")) t.setText("6");
            else {
                if(del_flag == true) t.setText("6");
                else t.setText(t.getText()+"6");
            }
            if(equal_flag == true){
                num = "";
                equal_flag = false;
            }

            if(find(bi)==false){
                num += tmp;
            }
            del_flag = false;
        }
        if(tmp.equals("7")) {
             if(t.getText().equals("0")) t.setText("7");
             else {
                 if(del_flag == true) t.setText("7");
                 else t.setText(t.getText()+"7");
             }
            if(equal_flag == true){
                num = "";
                equal_flag = false;
            }

            if(find(bi)==false){
                num += tmp;
            }
            del_flag = false;
       }
        if(tmp.equals("8")) {
            if(t.getText().equals("0")) t.setText("8");
            else {
                if(del_flag == true) t.setText("8");
                else t.setText(t.getText()+"8");
            }
            if(equal_flag == true){
                num = "";
                equal_flag = false;
            }

            if(find(bi)==false){
                num += tmp;
            }
            del_flag = false;
        }
        if(tmp.equals("9")) {
            if(t.getText().equals("0")) t.setText("9");
            else {
                if(del_flag == true) t.setText("9");
                else t.setText(t.getText()+"9");
            }
            if(equal_flag == true){
                num = "";
                equal_flag = false;
            }

            if(find(bi)==false){
                num += tmp;
            }
            del_flag = false;

        }
        if(tmp.equals("root")||tmp.equals("x^2")||tmp.equals("%")) {
            unary(tmp);
            del_flag = true;
        }
        if(tmp.equals("/")) {
            if(find(bi)== true) {
                binary(num);
                num = t.getText();
            }
            bi[0] = true;
            del_flag = true;
            equal_flag = false;
        }
        if(tmp.equals("*")) {
            if(find(bi)==true) {
                binary(num);
                num = t.getText();
            }
            bi[1] = true;
            del_flag = true;
            equal_flag = false;
        }
        if(tmp.equals("+")) {
            if(find(bi)==true) {
                binary(num);
                num = t.getText();
            }
            bi[2] = true;
            del_flag = true;
            equal_flag = false;
        }
        if(tmp.equals("-")) {
            if(find(bi)==true) {
                binary(num);
                num = t.getText();
            }
            bi[3] = true;
            del_flag = true;
            equal_flag = false;
        }
        if(tmp.equals("C")) {
            t.setText("0");
            bi[0]=false;bi[1]=false;bi[2]=false;bi[3]=false;
            pn_flag = false;
            del_flag = false;
            equal_flag = false;
            num = "";
        }
        if(tmp.equals(".")) t.setText(t.getText()+".");
        if(tmp.equals("Del")) {
            if(del_flag == false) {
                if(t.getText()!="") t.setText(t.getText().substring(0,t.getText().length()-1));
            }
        }
        if(tmp.equals("=")){
            if(find(bi)== true){
                binary(num);
                num = t.getText();
            }
            del_flag = true;
            equal_flag = true;
        }
        if(tmp.equals("+/-")){
            Double n = Double.parseDouble(t.getText());
            if (pn_flag == false){
                if(n > 0) n = 0 - n;
                pn_flag = true;
            }
            else{
                if(n < 0) n = 0 - n;
                pn_flag = false;
            }
            del_flag = true;
            print(n);
        }

    }
    private void unary(String n){
        if(n.equals("root")){
            print(Math.sqrt(Double.parseDouble(t.getText())));
        }
        else if(n.equals("x^2")){
            print(Math.pow(Double.parseDouble(t.getText()),2));
        }
        else if(n.equals("%")){
            print(Double.parseDouble(t.getText())/100.0);
        }
    }
    private void binary(String n){
        if(bi[0] == true) {
            print(Double.parseDouble(num)/Double.parseDouble(t.getText()));
            bi[0] = false;
        }
        else if(bi[1] == true) {
            print(Double.parseDouble(n)*Double.parseDouble(t.getText()));
            bi[1] = false;
        }
        else if(bi[2] == true) {
            print(Double.parseDouble(n) + Double.parseDouble(t.getText()));
            bi[2] = false;
        }
        else if(bi[3] == true) {
            print(Double.parseDouble(n) - Double.parseDouble(t.getText()));
            bi[3] = false;
        }
    }
    private boolean find(boolean[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == true) return true;
        }
        return false;
    }
    private void print(double d){
        if((int)d==d) t.setText(Integer.toString((int)d));
        else t.setText(Double.toString(d));
    }
    public static void main(String args[]){
        pa3_20151567 jimin = new pa3_20151567();
    }
}
class WindowDestroyer extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
