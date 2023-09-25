import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Input and output values used for the receipt
        double bill;
        int tipPercentage;
        int numberOfPartyMembers;
        double totalTipAmount;
        double totalBillTip;
        double tipPerPerson;
        double totalPerPerson;

        //Collects input data for receipt
        Scanner s = new Scanner(System.in);
        System.out.println("I am going to calculate your total bill and how much each of your party members owe.\nPlease answer the questions below: \n");
        System.out.println("How much is your bill? ");
        String billTemp = s.nextLine();
        bill = Double.parseDouble(billTemp);
        System.out.println(" ");

        System.out.println("What whole number percent would you like to tip for our service ? ");
        String tipPercentageTemp = s.nextLine();
        tipPercentage = Integer.parseInt(tipPercentageTemp);
        System.out.println(" ");

        System.out.println("Wow that was so generous of you! \nHow many people are in your party? ");
        String numberOfPartyMembersTemp = s.nextLine();
        numberOfPartyMembers = Integer.parseInt(numberOfPartyMembersTemp);
        System.out.println(" ");

        //Final receipt calculations
        totalTipAmount = (bill * (tipPercentage /100));
        totalBillTip = bill + totalTipAmount;
        tipPerPerson = totalTipAmount / numberOfPartyMembers;
        totalPerPerson = totalBillTip / numberOfPartyMembers;

        //Receipt/output print]
        System.out.println("Based on the data provided, your new receipt is: " );
        System.out.println("_________________________________________________\n");
        System.out.println("Total Tip: " + totalTipAmount + '\n');
        System.out.println("Total Bill Including Tip: " + totalBillTip + '\n');
        System.out.println("Amount of Tip per Person: " + tipPerPerson + '\n');
        System.out.println("Total Bill with Tip per person: " + totalPerPerson);

    }
}