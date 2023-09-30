import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator");
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("How many people are in your group: ");
        int people = scan.nextInt();

        System.out.print("What's the tip percentage? (0 - 100): ");
        int percentTip = scan.nextInt();

        double cost = 0;
        System.out.print("Enter a cost in dollars and cents: ");
        double cost2 = scan.nextDouble();
        cost += cost2;

        while (cost2 != -1) {
            System.out.print("Enter a cost in dollars and cents: ");
            cost2 =  scan.nextDouble();
            cost += cost2;
        }
        System.out.println("--------------------------------------------");
        double beforeTip = cost;
        System.out.println("Total bill before tip: " + beforeTip);
        System.out.println("Total percentage: " + percentTip + "%");
        double totalTip = beforeTip * (percentTip / 100.0 );
        double roundedTotalTip = Math.round(totalTip * 100) / 100.00;
        System.out.println("Total Tip: $" + roundedTotalTip);
        double billWTip = beforeTip + roundedTotalTip;
        System.out.println("Total bill with Tip: " + billWTip);
        double personBeforeTip = beforeTip / people;
        double roundedPersonBeforeTip = Math.round(personBeforeTip * 100) / 100.00;
        System.out.println("Per person cost before tip: " + (roundedPersonBeforeTip));
        double tipPerPerson = roundedTotalTip / people;
        double roundedTipPerPerson = Math.round(tipPerPerson * 100) / 100.00;
        System.out.println("Tip per person:" + (roundedTipPerPerson));
        double costPerPerson = billWTip / people;
        double roundedCostPerPerson = Math.round(costPerPerson * 100) / 100.00;
        System.out.println("Total cost per person:" + (roundedCostPerPerson));
        System.out.println("---------------------------------------------------");
    }
}