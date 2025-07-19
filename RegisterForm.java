import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm implements ActionListener {
    JFrame frame;
    JButton regisButton;
    JTextField nameField;
    JTextField firstAddressField;
    JTextField secondAddressField;
    JTextField ageField;
    JTextField heightField;
    JTextField weightField;
    String name;
    String firstAddress;
    String secondAddress;
    int age;
    double height;
    double weight;

    public void createFrame(){
        frame = new JFrame("Signup Form");
        frame.setVisible(true);
        frame.setSize(400,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
    }

    public void createForm(){
        //name
        nameField = new JTextField();
        nameField.setBounds(30, 40, 320, 40);
        frame.add(nameField);

        //firstAddress
        firstAddressField = new JTextField();
        firstAddressField.setBounds(30,120,320,40);
        frame.add(firstAddressField);

        //secondAddress
        secondAddressField = new JTextField();
        secondAddressField.setBounds(30, 200, 320, 40);
        frame.add(secondAddressField);

        //age
        ageField = new JTextField();
        ageField.setBounds(30, 280, 320, 40);
        frame.add(ageField);

        //height
        heightField = new JTextField();
        heightField.setBounds(30, 360, 320, 40);
        frame.add(heightField);

        //weight
        weightField = new JTextField();
        weightField.setBounds(30, 440, 320, 40);
        frame.add(weightField);

        //button
        regisButton = new JButton("ثبت نام");
        regisButton.addActionListener(this);
        regisButton.setBounds(90, 520, 200, 60);
        frame.add(regisButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        name = nameField.getText();
        firstAddress = firstAddressField.getText();
        secondAddress = secondAddressField.getText();
        age = Integer.parseInt(ageField.getText());
        height = Double.parseDouble(heightField.getText());
        weight = Double.parseDouble(weightField.getText());
        boolean signUp = true;

        if (e.getSource() == regisButton){
            if (name.length() < 3){
                System.out.println("The name cannot be less than 3 letters");
                signUp = false;
            }
            if (firstAddress.equals(secondAddress)){
                System.out.println("The first and second addresses must not be the same");
                signUp = false;
            }
            if (age < 18){
                System.out.println("The age cannot be younger than 18");
                signUp = false;
            }
            if (height < 100){
                System.out.println("The height cannot be younger than 18 cm");
                signUp = false;
            }
            if (weight < 40){
                System.out.println("The weight cannot be younger than 40 kg");
                signUp = false;
            }

            if (signUp){
                System.out.println("Registration was successful");
                System.out.println("name: " + name);
                System.out.println("firstAddress: " + firstAddress);
                System.out.println("secondAddress: " + secondAddress);
                System.out.println("age: " + age);
                System.out.println("height: " + height);
                System.out.println("weight: " + weight);
            }
        }
    }
}
