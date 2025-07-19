import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonAdd;
    JButton buttonDivision;
    JButton buttonEqual;
    JButton buttonMines;
    JButton buttonMulti;
    JButton buttonDec;
    JButton buttonDelete;
    JButton buttonClear;
    String operation;
    double firstNumber;
    double secondNumber;

    public void createFrame(){
        frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
    }

    public void createButtons(){
        //Text field
        textField = new JTextField();
        textField.setBounds(30,40,320,35);
        frame.add(textField);
        //7,8,9,+
        button7 = new JButton("7");
        button7.addActionListener(this);
        button7.setBounds(0,110,100,50);
        frame.add(button7);
        button8 = new JButton("8");
        button8.addActionListener(this);
        button8.setBounds(100,110,100,50);
        frame.add(button8);
        button9 = new JButton("9");
        button9.addActionListener(this);
        button9.setBounds(200,110,100,50);
        frame.add(button9);
        buttonAdd = new JButton("+");
        buttonAdd.addActionListener(this);
        buttonAdd.setBounds(300,110,100,50);
        frame.add(buttonAdd);

        //4,5,6,*
        button4 = new JButton("4");
        button4.addActionListener(this);
        button4.setBounds(0,160,100,50);
        frame.add(button4);
        button5 = new JButton("5");
        button5.addActionListener(this);
        button5.setBounds(100,160,100,50);
        frame.add(button5);
        button6 = new JButton("6");
        button6.addActionListener(this);
        button6.setBounds(200,160,100,50);
        frame.add(button6);
        buttonMulti = new JButton("*");
        buttonMulti.addActionListener(this);
        buttonMulti.setBounds(300,160,100,50);
        frame.add(buttonMulti);

        //1,2,3,/
        button1 = new JButton("1");
        button1.addActionListener(this);
        button1.setBounds(0,210,100,50);
        frame.add(button1);
        button2 = new JButton("2");
        button2.addActionListener(this);
        button2.setBounds(100,210,100,50);
        frame.add(button2);
        button3 = new JButton("3");
        button3.addActionListener(this);
        button3.setBounds(200,210,100,50);
        frame.add(button3);
        buttonDivision = new JButton("/");
        buttonDivision.addActionListener(this);
        buttonDivision.setBounds(300,210,100,50);
        frame.add(buttonDivision);

        //.,0,-,=
        buttonDec = new JButton(".");
        buttonDec.addActionListener(this);
        buttonDec.setBounds(0,260,100,50);
        frame.add(buttonDec);
        button0 = new JButton("0");
        button0.addActionListener(this);
        button0.setBounds(100,260,100,50);
        frame.add(button0);
        buttonMines = new JButton("-");
        buttonMines.addActionListener(this);
        buttonMines.setBounds(200,260,100,50);
        frame.add(buttonMines);
        buttonEqual = new JButton("=");
        buttonEqual.addActionListener(this);
        buttonEqual.setBounds(300,260,100,50);
        frame.add(buttonEqual);

        //Delete,Clear
        buttonDelete = new JButton("Delete");
        buttonDelete.addActionListener(this);
        buttonDelete.setBounds(80,310,120,50);
        frame.add(buttonDelete);
        buttonClear = new JButton("Clear");
        buttonClear.addActionListener(this);
        buttonClear.setBounds(200,310,120,50);
        frame.add(buttonClear);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button0){
            textField.setText(textField.getText().concat("0"));
        }
        if (e.getSource() == button1){
            textField.setText(textField.getText().concat("1"));
        }
        if (e.getSource() == button2){
            textField.setText(textField.getText().concat("2"));
        }
        if (e.getSource() == button3){
            textField.setText(textField.getText().concat("3"));
        }
        if (e.getSource() == button4){
            textField.setText(textField.getText().concat("4"));
        }
        if (e.getSource() == button5){
            textField.setText(textField.getText().concat("5"));
        }
        if (e.getSource() == button6){
            textField.setText(textField.getText().concat("6"));
        }
        if (e.getSource() == button7){
            textField.setText(textField.getText().concat("7"));
        }
        if (e.getSource() == button8){
            textField.setText(textField.getText().concat("8"));
        }
        if (e.getSource() == button9){
            textField.setText(textField.getText().concat("9"));
        }
        if (e.getSource() == buttonDec){
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == buttonAdd){
            firstNumber = Double.parseDouble(textField.getText());
            operation = "+";
            textField.setText("");
        }
        if (e.getSource() == buttonMines){
            firstNumber = Double.parseDouble(textField.getText());
            operation = "-";
            textField.setText("");
        }
        if (e.getSource() == buttonMulti){
            firstNumber = Double.parseDouble(textField.getText());
            operation = "*";
            textField.setText("");
        }
        if (e.getSource() == buttonDivision){
            firstNumber = Double.parseDouble(textField.getText());
            operation = "/";
            textField.setText("");
        }
        if (e.getSource() == buttonDelete){
            String content = textField.getText();
            textField.setText("");
            for (int i = 0; i < content.length() - 1; i++) {
                textField.setText(textField.getText().concat(String.valueOf(content.charAt(i))));
            }
        }
        if (e.getSource() == buttonClear){
            textField.setText("");
            operation = "";
        }
        if (e.getSource() == buttonEqual){
            secondNumber = Double.parseDouble(textField.getText());
            double result;
            switch (operation){
                case "+":
                    result = firstNumber + secondNumber;
                    textField.setText(String.valueOf(result));
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    textField.setText(String.valueOf(result));
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    textField.setText(String.valueOf(result));
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    textField.setText(String.valueOf(result));
                    break;
                case "":
                    break;
            }
        }
    }
}
