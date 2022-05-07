import java.util.Scanner;

public class Delicatessen {
	public static void main(String [] args) {
		String item;
		char shipping;
		double price, final_shipping, total;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the item you would like to order: ");
		item = input.nextLine();

		System.out.println("Please enter the price of your item: ");
		price = input.nextDouble();

		System.out.println("Would you like overnight shipping? Y/N ");
		shipping = input.next().charAt(0);


			if (shipping == 'Y' && price > 10) {
				final_shipping = 3 + 5;
				total = final_shipping + price;
			System.out.println("Invoice: \n" + item + "\n" + "Price: $ " + price + "\n" + "Shipping: " + "$" + final_shipping + "\n" + "Total: $ " + total);
	
		} else if (shipping == 'Y' && price < 10) {
			final_shipping = 2 + 5;
				total = final_shipping + price;
			System.out.println("Invoice: \n" + item + "\n" + "Price: $ " + price + "\n" + "Shipping: " + "$" + final_shipping + "\n" + "Total: $ " + total);

			} else if (shipping == 'N' && price > 10) {
			final_shipping = 3 + 5;
				total = final_shipping + price;
			System.out.println("Invoice: \n" + item + "\n" + "Price: $ " + price + "\n" + "Shipping: " + "$" + final_shipping + "\n" + "Total: $ " + total);

		} else {
			final_shipping = 2 + 5;
				total = final_shipping + price;
			System.out.println("Invoice: \n" + item + "\n" + "Price: $ " + price + "\n" + "Shipping: " + "$" + final_shipping + "\n" + "Total: $ " + total);

					}
				}
			}