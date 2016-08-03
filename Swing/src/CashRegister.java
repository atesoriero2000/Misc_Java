
import java.util.*;



public class CashRegister
{
	String product, total;
	double dollar, quarter = 0, dime, nickel, penny;
	double originalPrice, discountPercent, discountPrice, savings, finalPrice, payment, change, tax, x, y, z;
	Scanner scan= new Scanner(System.in);
	Random rand = new Random();
	
	
	public void input()
		{
			System.out.println("Please enter the name of your item.");
			product = scan.nextLine();
			System.out.println("What is the price of the item?");
			originalPrice = scan.nextDouble();
			scan.nextLine();
		}
	public void calculate()
		{
			discountPercent = (rand.nextInt(15)+1)*5;
			discountPercent = (double)(Math.round(discountPercent)*100)/100;
			System.out.println("Your purchase is now " + discountPercent + "% off!");
			discountPrice = originalPrice*(1-(discountPercent/100))*100;
			discountPrice = (double)(Math.round(discountPrice))/100;
			savings = (double)(Math.round((originalPrice-discountPrice)*100))/100;
			System.out.println("Original Price: $" + originalPrice);
			System.out.println("Discounted Price: $" + discountPrice);
			System.out.println("Savings: " + savings);
			tax = (discountPrice * .07);
			System.out.println(String.format("Tax: " + "%.3f", tax));
			finalPrice = (double)(Math.round((discountPrice*1.07)*100))/100;
			System.out.println("Your Total for Today is: $" + finalPrice);
			
		}
	// method exchange will get payment and give change
	public void exchange()
		{
			System.out.println("How much money are you paying me with?");
			payment = scan.nextDouble();
			scan.nextLine();
			change = payment-finalPrice;
			dollar = ((change)/(1.0))-((change)%1.0);
			x = change - Math.floor(change);
			x = Math.round( x * 100.0 ) / 100.0;
			System.out.println(x);
			
		while (x>=0.009)
			{
				System.out.println(x);
				System.out.println("1");
				if (x-.25>0)
				{
					x = x-.25;
					quarter++;
					
					
				}
				else
				{
					System.out.println("2");
					if (x-.10>0)
					{
						x = x-.10;
						dime++;
						
					}
					else
					{
						System.out.println("3");
						if (x-.05>0)
						{
							x -=.05;
							nickel++;
						}
						else
						{
							if(x-.01>0)
							{
								x = x-.01;
								penny++;
							}
						}
					}
				}
			}
			
			
			
		/*	if (x-.25 > 0)
			{
				quarter++;
				x = (x-.25);
				if ((x-.25) > 0)
				{
					quarter++;
					x = (x-.25);
					if ((x-.25) > 0)
					{
						quarter++;
					}
				}
				else
				{
					if (x > .10)
					{
						y = x/.10;
						z = x/.10;
					}
				}
				
			}
			else
			{
				z = x%.10;
				System.out.println(z);
			}
			
			
			*/
			
			System.out.println("Change Due:");
			System.out.println(dollar + " One Dollar Bills");
			System.out.println(quarter + " Quarters");
			System.out.println(dime + " Dimes");
			System.out.println(nickel + " Nickel");
			System.out.println(penny + " Penny");
			System.out.println("");
			
		}
	public void runRegister()//this puts the entire program into a while loop
	{
		do
		{
			input();
			calculate();
			exchange();
			System.out.println("Would you like to go again, Y/N?");
			total = scan.nextLine();
		}	
		while (total.equalsIgnoreCase("y"));
		System.out.println("Thanks for shopping, please come again");
		
	}

	public static void main(String[] args)
	{
		CashRegister bob = new CashRegister();
		bob.runRegister();
	}
}


