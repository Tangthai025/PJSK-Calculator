import javax.swing.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PJSK Rank score calulator");
        frame.setSize(380, 530);
        frame.setLayout(null);

        ImageIcon logo = new ImageIcon("logo.png");

        JLabel Logo = new JLabel();
        Logo.setIcon(logo);
        Logo.setBounds(25, 25, 300, 150);
        frame.add(Logo);
        
        //input
        JTextField input1 = new JTextField();
        input1.setBounds(225, 185, 100, 30);
        frame.add(input1);
        
        JTextField input2 = new JTextField();
        input2.setBounds(225, 235, 100, 30);
        frame.add(input2);
        
        JTextField input3 = new JTextField();
        input3.setBounds(225, 285, 100, 30);
        frame.add(input3);
        
        JTextField input4 = new JTextField();
        input4.setBounds(225, 335, 100, 30);
        frame.add(input4);
        
        JTextField input5 = new JTextField();
        input5.setBounds(225, 385, 100, 30);
        frame.add(input5);
        
        JLabel label1 = new JLabel();
        label1.setText("Prefect");
        label1.setBounds(85, 185, 100, 30);
        frame.add(label1);
        
        JLabel label2 = new JLabel();
        label2.setText("Great");
        label2.setBounds(85, 235, 100, 30);
        frame.add(label2);
        
        JLabel label3 = new JLabel();
        label3.setText("Good");
        label3.setBounds(85, 285, 100, 30);
        frame.add(label3);
        
        JLabel label4 = new JLabel();
        label4.setText("Bad");
        label4.setBounds(85, 335, 100, 30);
        frame.add(label4);
        
        JLabel label5 = new JLabel();
        label5.setText("Miss");
        label5.setBounds(85, 385, 100, 30);
        frame.add(label5);

        //Output
        JLabel Output = new JLabel();
        Output.setBounds(225, 435, 100, 30);
        frame.add(Output);
        
        JButton button = new JButton("ok");
        button.setBounds(40, 435, 120, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //input form JTextField
                int p = Integer.parseInt(input1.getText());
                int g = Integer.parseInt(input2.getText());
                int G = Integer.parseInt(input3.getText());

                int Prefect = p * 3;
                int Great = g * 2;

                int sam = Prefect+Great+G;
                int x = sam;
                String score = String.valueOf(x);
                Output.setText(score);
            }
        });
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}