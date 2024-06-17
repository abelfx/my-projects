package InventoryManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FrontEnd extends JFrame {
    private JTextField idField, nameField, categoryField, priceField, quantityField;
    private JButton addButton, removeButton, findButton, updateButton, viewButton, saveButton, loadButton;
    private JTextArea outputArea;
    private Inventory inventory;
    private ImageIcon icon;
    

    public FrontEnd() {

        setTitle("Inventory Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Center the frame

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField(10);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(10);

        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField(10);

        JLabel priceLabel = new JLabel("Price ($):");
        priceField = new JTextField(10);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField(10);

        addButton = new JButton("Add");
        removeButton = new JButton("Remove");
        findButton = new JButton("Search");
        updateButton = new JButton("Update");
        viewButton = new JButton("View");
        saveButton = new JButton("Save");
        loadButton = new JButton("Load");

        addButton.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeProduct();
            }
        });

        findButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                findProduct();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateProduct();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewProducts();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveInventory();
            }
        });

        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadInventory();
            }
        });

        // Add labels and fields to the input panel
        inputPanel.add(idLabel);
        inputPanel.add(idField);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(categoryLabel);
        inputPanel.add(categoryField);
        inputPanel.add(priceLabel);
        inputPanel.add(priceField);
        inputPanel.add(quantityLabel);
        inputPanel.add(quantityField);
        
        // Add buttons to the input panel
        JPanel buttonPanel = new JPanel(new GridLayout(7, 1, 0, 5));
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(findButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);

        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.EAST);

        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        mainPanel.add(scrollPane, BorderLayout.SOUTH);
        
        icon = new ImageIcon("th.jpg");
        this.setIconImage(icon.getImage());

        add(mainPanel);

        inventory = new Inventory();
    }
    
    private void addProduct() {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String category = categoryField.getText();
        double price = Double.parseDouble(priceField.getText());
        int quantity = Integer.parseInt(quantityField.getText());

        Product product = new Product(id, name, category, price, quantity);
        inventory.addProduct(product);
        outputArea.setText("Product added sucessfully");

        clearFields();
    }

    private void removeProduct() {
        int id = Integer.parseInt(idField.getText());
        inventory.removeProduct(id);
        outputArea.setText("product removed successfully");

        clearFields();
    }

    private void findProduct() {
        int id = Integer.parseInt(idField.getText());
        Product foundProduct = inventory.findProduct(id);
        if (foundProduct != null) {
            outputArea.setText("Name: " + foundProduct.getName() + "\n"
                    + "Category: " + foundProduct.getCategory() + "\n"
                    + "Price: $" + foundProduct.getPrice() + "\n"
                    + "Quantity: " + foundProduct.getQuantity());
        } else {
            outputArea.setText("Product not found.");
        }

        clearFields();
    }

    private void updateProduct() {
        try {
            int id = Integer.parseInt(idField.getText());
    
            String name = nameField.getText();
            if (name.isEmpty()) {
                name = null; // Use null to indicate no update
            }
    
            String category = categoryField.getText();
            if (category.isEmpty()) {
                category = null; // Use null to indicate no update
            }
    
            double price;
            if (priceField.getText().isEmpty()) {
                price = -1; // Use -1 to indicate no update
            } else {
                price = Double.parseDouble(priceField.getText());
            }
    
            int quantity;
            if (quantityField.getText().isEmpty()) {
                quantity = -1; // Use -1 to indicate no update
            } else {
                quantity = Integer.parseInt(quantityField.getText());
            }
    
            inventory.updateProduct(id, name, category, price, quantity);
    
            clearFields();
        } catch (NumberFormatException e) {
            // Handle invalid input
            System.out.println("Error: Please enter valid numbers for ID, Price, and Quantity.");
        }
    }

    private void viewProducts() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        inventory.printProducts();
        outputArea.setText(stringWriter.toString());
        outputArea.setText("Products are present in console");
    }

    private void saveInventory() {
        inventory.saveInventoryToFile("inventory.csv");
        outputArea.setText("Inventory saved to file.");
    }

    private void loadInventory() {
        inventory.loadInventoryFromFile("inventory.csv");
        outputArea.setText("Inventory loaded from file.");
    }


    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        categoryField.setText("");
        priceField.setText("");
        quantityField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FrontEnd().setVisible(true);
            }
        });
    }
}

