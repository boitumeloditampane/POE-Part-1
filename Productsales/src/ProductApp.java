
    import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

    public class ProductApp extends JFrame {

        JTextField txtName = new JTextField();
        JComboBox<String> cmbProduct = new JComboBox<>(new String[]{
                "Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"});
        JTextField txtPrice = new JTextField();
        JButton btnProcess = new JButton("PROCESS");

        ArrayList<String> storedSales = new ArrayList<>();

        public ProductApp() {
            setTitle("Product App");
            setSize(500, 300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new GridLayout(4, 2, 10, 10));

            // Menu bar
            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            JMenu editMenu = new JMenu("Edit");
            JMenuItem exitItem = new JMenuItem("Exit");
            JMenuItem clearItem = new JMenuItem("Clear");
            fileMenu.add(exitItem);
            editMenu.add(clearItem);
            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            setJMenuBar(menuBar);

            // Form
            add(new JLabel("Customer Name:"));
            add(txtName);
            add(new JLabel("Select Product:"));
            add(cmbProduct);
            add(new JLabel("Enter Price:"));
            add(txtPrice);
            add(new JLabel(""));
            add(btnProcess);

            // Button and menu actions
            btnProcess.addActionListener(e -> processSale());
            exitItem.addActionListener(e -> System.exit(0));
            clearItem.addActionListener(e -> {
                txtName.setText("");
                txtPrice.setText("");
            });
        }

        void processSale() {
            try {
                String customer = txtName.getText();
                String product = (String) cmbProduct.getSelectedItem();
                double price = Double.parseDouble(txtPrice.getText());

                double vat = price * 0.15;
                double commission = price * 0.05;
                double total = price + vat + commission;

                String result = "Customer: " + customer
                        + "\nProduct: " + product
                        + "\nVAT: R" + String.format("%.2f", vat)
                        + "\nCommission: R" + String.format("%.2f", commission)
                        + "\nTotal Sale: R" + String.format("%.2f", total);

                storedSales.add(result);
                JOptionPane.showMessageDialog(this, result);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number for the price.");
            }
        }

        public static void main(String[] args) {
            new ProductApp().setVisible(true);
        }
}
