import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // this is the prices of the items in the store
        /*
        final char dollor= '$';
        final int bubblegum = 2;
        final double toffee = 0.2;
        final int iceCream = 5;
        final int milkChocolate = 4;
        final double doughnut = 2.5;
        final double pancake = 3.2;
        */
       // adding the functionality to ask the user for Staff and other Staff expenses
       Scanner sc = new Scanner(System.in);

        // this is the total income of the store in one month
        final char dollor = '$';
        final int totalBubblegum = 202;
        final double totalToffee = 118;
        final int totalIceCream = 2250;
        final int totalMilkChocolate = 1680;
        final double totalDoughnut = 1075;
        final double totalPancake = 80;
        final double totalIncome = totalBubblegum + totalToffee + totalIceCream + totalMilkChocolate + totalDoughnut + totalPancake;
        /*
        System.out.println("Prices:");
        System.out.println("Bubblegum: "+dollor+bubblegum);
        System.out.println("Toffee: "+dollor+toffee);
        System.out.println("Ice cream: "+dollor+iceCream);
        System.out.println("Milk chocolate: "+dollor+milkChocolate);
        System.out.println("Doughnut: "+dollor+doughnut);
        System.out.println("Pancake: "+dollor+pancake);
        */
        System.out.println("Earned amount :");
        System.out.println("Bubblegum: "+dollor+totalBubblegum);
        System.out.println("Toffee: "+dollor+totalToffee);
        System.out.println("Ice cream: "+dollor+totalIceCream);
        System.out.println("Milk chocolate: "+dollor+totalMilkChocolate);
        System.out.println("Doughnut: "+dollor+totalDoughnut);
        System.out.println("Pancake: "+dollor+totalPancake);
        System.out.println("Total Income: "+dollor+totalIncome);
        System.out.println("Staff expenses: ");

        int staffScalar = sc.nextInt();
        System.out.println("Other Staff expenses: ");
        int otherStaffScalar = sc.nextInt();
        double totalStaffExpenses = staffScalar + otherStaffScalar;
        int netIncome = (int) totalIncome - (int) totalStaffExpenses;
        System.out.println("Net Income: "+dollor+netIncome);

        sc.close();
    }
}
