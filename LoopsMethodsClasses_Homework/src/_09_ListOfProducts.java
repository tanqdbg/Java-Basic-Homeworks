//Create a class Product to hold products, which have name (string) and price (decimal number).
//Read from a text file named "Input.txt" a list of products. Each product will be in format name + space + price.
//You should hold the products in objects of class Product.
//Sort the products by price and write them in format price + space + name in a file named "Output.txt". 
//Ensure you close correctly all used resources.
//Examples:input:
//milk 2.80
//apple 1.20
//coffee 8.50
//output:
//1.20 apple
//2.80 milk
//8.50 coffee


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _09_ListOfProducts {

	public static void main(String[] args) {
		File inputFile = new File("src/_09_Input.txt");
		File outputFile = new File("src/_09_Output.txt");
		ArrayList<Product> productList = new ArrayList<Product>();

		try (Scanner input = new Scanner(inputFile);
				FileWriter out = new FileWriter(outputFile);) {
			while (input.hasNextLine()) {
				String[] productLine = input.nextLine().split("[\\s]+");

				String nameProduct = productLine[0];
				double priceProduct = Double.parseDouble(productLine[1]);
				Product newProduct = new Product(nameProduct, priceProduct);
				productList.add(newProduct);
			}
			Collections.sort(productList,
					(p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
			for (Product product : productList) {

				out.write(product.toString());
				// out.write(String.format("%6.2f %s", product.getPrice()) + " "
				// + product.getName()+"\r\n");
			}
		} catch (FileNotFoundException fnfEx) {
			System.err.println("File Not Found");
			fnfEx.printStackTrace();

		} catch (IOException ioEx) {
			System.err.println("Error");
			ioEx.printStackTrace();

		}

	}
}

class Product {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%6.2f %s%n", price, name);
	}

}
