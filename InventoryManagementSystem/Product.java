package InventoryManagementSystem;

import java.io.*;
import java.util.*;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(int id, String name, String category, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                System.out.println("It already exists.");
                return;
            }
        }
        products.add(product);
        System.out.println("Product added successfully.");
        System.out.println("-----------------------------------------------------------");
        sortProducts(); // Sort the products after adding
    }

    public void removeProduct(int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
                System.out.println("Product removed successfully.");
                System.out.println("-----------------------------------------------------------");
                sortProducts(); // Resort after removal
                return;
            }
        }
        System.out.println("It does not exist.");
    }
    
    public Product findProduct(int id) {
        sortProducts(); // Ensure products are sorted before searching
        int left = 0, right = products.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product p = products.get(mid);
            if (id == p.getId()) {
                return p; // Found the product
            } else if (id < p.getId()) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null; // Product not found
    }

    public void updateProduct(int id, String name, String category, double price, int quantity) {
        for (Product p : products) {
            if (p.getId() == id) {
                if (name != null) {
                    p.setName(name);
                }
    
                if (category != null) {
                    p.setCategory(category);
                }
    
                if (price != -1) {
                    p.setPrice(price);
                }
    
                if (quantity != -1) {
                    p.setQuantity(quantity);
                }
    
                System.out.println("Product updated successfully.");
                System.out.println("-----------------------------------------------------------");
                return;
            }
        }
        System.out.println("It does not exist.");
    }

    public void printProducts() {
        sortProducts(); // Ensure products are sorted before printing
        for (Product p : products) {
            System.out.println("ID: " + p.getId());
            System.out.println("Name: " + p.getName());
            System.out.println("Category: " + p.getCategory());
            System.out.println("Price: $" + p.getPrice());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("-----------------------------------------------------------");
        }
    }

    private void sortProducts() {
        mergeSort(products); // Use Merge Sort to sort products
    }

    private void mergeSort(ArrayList<Product> arr) {
        if (arr.size() > 1) {
            ArrayList<Product> L = new ArrayList<>(arr.subList(0, arr.size()/2));
            ArrayList<Product> R = new ArrayList<>(arr.subList(arr.size()/2, arr.size()));

            mergeSort(L);
            mergeSort(R);

            int i = 0, j = 0, k = 0;
            while (i < L.size() && j < R.size()) {
                if (L.get(i).getId() < R.get(j).getId()) {
                    arr.set(k++, L.get(i++));
                } else {
                    arr.set(k++, R.get(j++));
                }
            }

            while (i < L.size()) {
                arr.set(k++, L.get(i++));
            }

            while (j < R.size()) {
                arr.set(k++, R.get(j++));
            }
        }
    }

	    public void saveInventoryToFile(String filename) {
	        if (products.isEmpty()) {
	            System.out.println("No products to save.");
	            return;
	        }
	
	        sortProducts(); // Ensure products are sorted before saving
	        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, false))) {
	            for (Product p : products) {
	                writer.println(p.getId() + "," + p.getName() + "," + p.getCategory() + "," + p.getPrice() + "," + p.getQuantity());
	            }
	            System.out.println("Inventory saved to file.");
	        } catch (IOException e) {
	            System.out.println("Error: Could not save to file " + filename);
	        }
	    }


    public void loadInventoryFromFile(String filename) {
    	products.clear();
    	try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine())!= null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String category = parts[2];
                double price = Double.parseDouble(parts[3]);
                int quantity = Integer.parseInt(parts[4]);
                Product p = new Product(id, name, category, price, quantity);
                products.add(p);
            }
            System.out.println("Inventory loaded from file.");
            System.out.println("-----------------------------------------------------------");
            sortProducts(); // Sort the products after loading
        } catch (IOException e) {
            System.out.println("Error: Could not open file " + filename);
        }
    }
}

	    


























	    
