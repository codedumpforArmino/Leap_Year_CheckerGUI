import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leap_Year extends JFrame {
    private JTextField tfInputYear;
    private JButton BtCheck;
    private JLabel YearLabel;
    private JPanel Jpanel;

    public Leap_Year(){

        BtCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tfInputYear.getText().equals("")){
                    JOptionPane.showMessageDialog(Jpanel, "Please input year");
                    return;
                }

                try{
                    int year = Integer.parseInt(tfInputYear.getText());

                    if(year<0){
                        JOptionPane.showMessageDialog(Jpanel, "Please input valid year");
                        return;
                    }

                    String outputmsg = "Not a leap year";
                    if (year % 400 == 0 || year % 4 == 0){
                        outputmsg = "Leap year";
                    }

                    JOptionPane.showMessageDialog(Jpanel, outputmsg);
                }catch(NumberFormatException exception){
                    JOptionPane.showMessageDialog(Jpanel, "You didn't enter a number");
                }
            }
        });
    }
    public static void main(String[] args) {
        Leap_Year app = new Leap_Year();
        app.setContentPane(app.Jpanel);
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}

