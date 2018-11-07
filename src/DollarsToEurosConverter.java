/** DollarsToEurosConverter.java converts dollars to euros.
 *  @author Phillip Turner
 *  @version for Alice+Java, Alice 3 edition
 */
import java.util.Scanner;
public class DollarsToEurosConverter {
    
    public static void main(String[] args){
        System.out.print("How many dollars do you want to convert?"+"\n");
        System.out.print("Dollars:" );
        Scanner keyboard = new Scanner(System.in);
        double dollars = keyboard.nextDouble();
        System.out.print("What is the euros-per-dollar exchange rate?"+"\n");
        System.out.print("Exchange Rate: ");
        double eurosPerDollar = keyboard.nextDouble();
        double euros = dollars * eurosPerDollar;
        System.out.printf("%.2f dollars => %.2f euros", dollars,euros);
    }
}
