import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class advancedArrays {
    public static void main(String[] args){
        //Parallel Array
            System.out.println("Ice Cream Shop supplies:");
            String[] iceCreamShop;
            iceCreamShop = new String[]{"Ice Cream", "Bowls", "Cake Cones", "Sugar Cones", "Spoons",
                    "Ice Cream Scooper", "Hot Fudge", "Freezer", "Whipped Cream", "Chopped Peanuts"};
            int[] onHandStock;
            onHandStock = new int[] {4, 30, 30, 20, 30, 4, 1, 2, 2, 4};
            String [] stockDescrition;
            stockDescrition = new String[]{"Tubs", "Pieces", "Cones", "Cones", "Pieces", "Units", "Tubs", "Units", "Canisters",
            "Tubs"};

            for (int i = 0; i < iceCreamShop.length; i++) {
                System.out.println(iceCreamShop[i] + " " + onHandStock[i] + " " + stockDescrition[i]);
            }
        System.out.println("   ");
          //Check Inventory
            boolean itemFound = false;
            String userInput;
            String userInput2;
            int userInput3;
            String answer = "";
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            Scanner scanner4 = new Scanner(System.in);

            System.out.println("Search Inventory");
            System.out.println("Select inventory item:");
            userInput = scanner.nextLine();
        for (int i = 0; i < iceCreamShop.length; i++) {
            if (userInput.equals(iceCreamShop[i])) {
                itemFound = true;
                System.out.println(iceCreamShop[i] + " has " + onHandStock[i] + " " + stockDescrition[i] + " in stock.");

                //Ask to change amount
                System.out.println("Do you want to adjust On Hand quantity? Yes or No?");
                userInput2 = scanner2.nextLine();
                if (userInput2.equals("Yes")) {
                    //Change onHandStock
                    System.out.println("Add or Subtract inventory. Use '-' to subtract from inventory.");
                    userInput3 = scanner3.nextInt();
                    onHandStock[i] = onHandStock[i] + userInput3;
                    if (onHandStock[i] < 0) {
                        System.out.println("This item is out of stock!!");
                        onHandStock[i] = 0;
                    }
                    System.out.print("You have added " + iceCreamShop[i] + " " );
                    System.out.println("Amount " + onHandStock[i] + " ");
                }
            }

                }
            if (!itemFound){
                System.out.println("That is not in stock"); }

        /*Add or subtract from inventory - Me playing around with adding new inventory
        String addToInventory1;
        int addToInventory2;

        List<String> iceCreamShopAdd = new ArrayList<>();
        List<String> iceCreamShopSub = new ArrayList<>();
        List<Integer> iceCreamShopAdd2 = new ArrayList<>();
        List<Integer> iceCreamShopSub2 = new ArrayList<>();

        do{
        System.out.println("Add items and amounts to inventory");
        System.out.println("Item name:");
        addToInventory1 = scanner2.next();
        iceCreamShopAdd.add(addToInventory1);
        System.out.println("Item amount:");
        addToInventory2 = scanner3.nextInt();
        iceCreamShopAdd2.add(addToInventory2);

        System.out.println("Do you have more inventory to add?");
        answer = scanner4.next();
        } while (answer.equals("Yes"));
            for (int i = 0; i < iceCreamShopAdd.size(); i++){
                System.out.print("You have added " + iceCreamShopAdd.get(i) + " " );
                System.out.println("Amount " + iceCreamShopAdd2.get(i) + " ");
            }

       /* do{
            System.out.println("Remove items and amounts from inventory");
            System.out.println("Item name:");
            addToInventory1 = scanner2.next();
            iceCreamShopAdd.add(addToInventory1);
            System.out.println("Item amount:");
            addToInventory2 = scanner3.nextInt();
            iceCreamShopAdd2.add(addToInventory2);

            System.out.println("Do you have more inventory to remove?");
            answer = scanner4.next();
        } while (answer.equals("Yes"));
        for (int i = 0; i > iceCreamShopAdd.size(); i--){
            System.out.print("You have removed " + iceCreamShopAdd.remove(i) );
            System.out.println("Amount " + iceCreamShopAdd2.remove(i));
        }*/



           //2 Dimensional Array
            System.out.println("   ");
            System.out.println("Daily Hours:");
            String[][] iceCreamShopHours;
            iceCreamShopHours = new  String[7][2];
                  iceCreamShopHours[0][0] = "Monday ";
                  iceCreamShopHours[0][1] = "Open 11AM to 8PM";
                  iceCreamShopHours[1][0] = "Tuesday ";
                  iceCreamShopHours[1][1] = "Open 11AM to 8PM";
                  iceCreamShopHours[2][0] = "Wednesday ";
                  iceCreamShopHours[2][1] = "Closed";
                  iceCreamShopHours[3][0] = "Thursday ";
                  iceCreamShopHours[3][1] = "Open 10AM to 9PM";
                  iceCreamShopHours[4][0] = "Friday ";
                  iceCreamShopHours[4][1] = "Open 8AM to 10PM";
                  iceCreamShopHours[5][0] = "Saturday ";
                  iceCreamShopHours[5][1] = "Open 8AM to 10PM";
                  iceCreamShopHours[6][0] = "Sunday ";
                  iceCreamShopHours[6][1] = "Closed";

        for (String[] iceCreamShopHour : iceCreamShopHours) {
            StringBuilder sb = new StringBuilder();
            sb.append("Store hours are ")
                    .append(iceCreamShopHour[0])
                    .append(iceCreamShopHour[1]);


            System.out.println(sb);
        }


        }

    }


