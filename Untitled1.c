button to generate a bill.

java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerBillingProgram extends JFrame {
    private JLabel nameLabel;
    private JRadioButton pizzaRadioButton, burgerRadioButton, pastaRadioButton;
    private JButton printButton;
    private ButtonGroup foodButtonGroup;

    public CustomerBillingProgram() {
        // Set up the JFrame
        setTitle("Customer Billing Program");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1));

        // Initialize components
        nameLabel = new JLabel("Enter customer name:");
        pizzaRadioButton = new JRadioButton("Pizza ($10)");
        burgerRadioButton = new JRadioButton("Burger ($5)");
        pastaRadioButton = new JRadioButton("Pasta ($8)");
        printButton = new JButton("Print Bill");

        // Create a button group for radio buttons
        foodButtonGroup = new ButtonGroup();
        foodButtonGroup.add(pizzaRadioButton);
        foodButtonGroup.add(burgerRadioButton);
        foodButtonGroup.add(pastaRadioButton);

        // Add components to the JFrame
        add(nameLabel);
        add(pizzaRadioButton);
        add(burgerRadioButton);
        add(pastaRadioButton);
        add(printButton);

        // Attach action listener to the print button
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printBill();
            }
        });
    }

    private void printBill() {
        String customerName = nameLabel.getText();
        String selectedFood = "";
        if (pizzaRadioButton.isSelected()) {
            selectedFood = "Pizza";
        } else if (burgerRadioButton.isSelected()) {
            selectedFood = "Burger";
        } else if (pastaRadioButton.isSelected()) {
            selectedFood = "Pasta";
        }

        double foodPrice = 0;
        if (selectedFood.equals("Pizza")) {
            foodPrice = 10;
        } else if (selectedFood.equals("Burger")) {
            foodPrice = 5;
        } else if (selectedFood.equals("Pasta")) {
            foodPrice = 8;
        }

        double total = foodPrice;
        String bill = "Customer Name: " + customerName + "\n"
                + "Selected Food: " + selectedFood + "\n"
                + "Price: $" + foodPrice + "\n"
                + "Total: $" + total;

        // For simplicity, we will just print the bill to the console
        System.out.println(bill);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CustomerBillingProgram billingProgram = new CustomerBillingProgram();
            billingProgram.setVisible(true);
        });
    }
}
