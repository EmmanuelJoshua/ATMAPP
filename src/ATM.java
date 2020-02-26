/*
 * Created By Spark.
 */
// package com.spark.ATM;

import java.util.Scanner;

public class ATM{

    Scanner input = new Scanner(System.in);
    int pin[] = {2544, 1342, 9867, 2354};
    String userNames[] = {"Anna Kendrick", "Dwayne Johnson", "Cameron Diaz", "David Mazouz"};
    double money[] = {85000, 150000, 95000, 50000};
    double amt;
    int pinCheck;

    public void pinValidation() {
        System.out.println("----------------------------\n         LIGHTBANK\n----------------------------");
        System.out.print("Enter Your Pin: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        pinCheck = input.nextInt();
        if (pinCheck == pin[0]) {
            System.out.print("Please Wait While Pin Is Confirmed.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\n-----------------\nPin Is Confirmed.\n-----------------");
            mainMenu();
        } else if (pinCheck == pin[1]) {
            System.out.print("Please Wait While Pin Is Confirmed.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\n-----------------\nPin Is Confirmed.\n-----------------");
            mainMenu();
        } else if (pinCheck == pin[2]) {
            System.out.print("Please Wait While Pin Is Confirmed.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\n-----------------\nPin Is Confirmed.\n-----------------");
            mainMenu();
        } else if (pinCheck == pin[3]) {
            System.out.print("Please Wait While Pin Is Confirmed.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\n-----------------\nPin Is Confirmed.\n-----------------");
            mainMenu();
        } else {
            System.out.print("Please Wait While Pin Is Confirmed.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.err.println("\nInvalid Pin.");
            pinValidation();
        }
    }

    public void mainMenu() {
        int menuNum;
        System.out.println("\n-------------------\n    LIGHT BANK\n-------------------");
        if (pinCheck == pin[0]) {
            System.out.println("Account Name: " + userNames[0]);
        } else if (pinCheck == pin[1]) {
            System.out.println("Account Name: " + userNames[1]);
        } else if (pinCheck == pin[2]) {
            System.out.println("Account Name: " + userNames[2]);
        } else if (pinCheck == pin[3]) {
            System.out.println("Account Name: " + userNames[3]);
        }
        System.out.println("Press [1] For Transactions.");
        System.out.println("Press [2] For Account Balance.");
        System.out.println("Press [3] To Log Out.");
        System.out.println("Press [4] To Exit.");
        System.out.print("\n-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        menuNum = input.nextInt();
        switch (menuNum) {
            case 1:
                transactionsPinCheck();
                break;
            case 2:
                accountBalance();
                break;
            case 3:
                logOut();
                break;
            case 4:
                exit();
                break;
            default:
        }
    }

    public void transactions() {
        int menuNum;
        System.out.println("\n-----------------\n  TRANSACTIONS\n-----------------");
        System.out.println("Press [1] For Withdrawal.");
        System.out.println("Press [2] To Transfer.");
        System.out.println("Press [3] To Pay Bills.");
        System.out.println("Press [4] To Go Back.");
        System.out.print("\n-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        menuNum = input.nextInt();
        switch (menuNum) {
            case 1:
                withdrawal();
                break;
            case 2:
                transfer();
                break;
            case 3:
                paybills();
                break;
            case 4:
                mainMenu();
                break;
            default:

        }
    }

    public void transactionsPinCheck() {
        System.out.print("--------------------\nEnter Your Pin: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        pinCheck = input.nextInt();
        if (pinCheck == pin[0]) {
            transactions();
        } else if (pinCheck == pin[1]) {
            transactions();
        } else if (pinCheck == pin[2]) {
            transactions();
        } else if (pinCheck == pin[3]) {
            transactions();
        } else {
            System.err.println("Invalid Pin.");
            transactionsPinCheck();
        }
    }

    public void accountBalance() {
        System.out.println("\n------------------\n  Account Balance\n------------------");
        if (pinCheck == pin[0]) {
            System.out.println("Account Name: " + userNames[0]);
            System.out.println("\nAccount Balance: $" + money[0]);
        } else if (pinCheck == pin[1]) {
            System.out.println("Account Name: " + userNames[1]);
            System.out.println("\nAccount Balance: $" + money[1]);
        } else if (pinCheck == pin[2]) {
            System.out.println("Account Name: " + userNames[2]);
            System.out.println("\nAccount Balance: $" + money[2]);
        } else if (pinCheck == pin[3]) {
            System.out.println("Account Name: " + userNames[3]);
            System.out.println("\nAccount Balance: $" + money[3]);
        }
        System.out.println("\n1.Mainmenu  2.Remove Card And Exit");
        System.out.print("-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        accountBalanceSwitch();
    }

    public void accountBalanceSwitch() {
        int menuNum;
        menuNum = input.nextInt();
        switch (menuNum) {
            case 1:
                mainMenu();
                break;
            case 2:
                exit();
                break;
            default:
                System.err.println("Invalid Option.");
                System.out.println("Try Again: ");
                while (!input.hasNextInt()) {
                    System.err.println("Nope!! Numbers Only.");
                    System.out.print("Try Again: ");
                    input.next();
                }
                accountBalanceSwitch();
        }
    }

    public void logOut() {
        if (pinCheck == pin[0]) {
            System.out.println("GoodBye " + userNames[0] + ".\n");
        } else if (pinCheck == pin[1]) {
            System.out.println("GoodBye" + userNames[1] + ".\n");
        } else if (pinCheck == pin[2]) {
            System.out.println("GoodBye" + userNames[2] + ".\n");
        } else if (pinCheck == pin[3]) {
            System.out.println("GoodBye" + userNames[3] + ".\n");
        }
        pinValidation();
    }

    public void exit() {
        System.out.println("\n-----------------------------------------------------\nFor More Enquiries Visit www.LightBank.org\nThank You For Banking With Us..Please Take Your Card.");
        System.out.println("------------------------------------------------------");
        System.exit(0);
    }

    public void withdrawal() {
        int menuNum;
        System.out.println("-----------\n CASHOUT\n-----------");
        System.out.println("Please Select An Amount To Withdraw.");
        System.out.println("1. $20,000\t2. $15,000\t3. $10,000");
        System.out.println("4. $5,000\t5. $1,000\t6. $500");
        System.out.println("7. Other");
        System.out.print("\n-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        menuNum = input.nextInt();
        switch (menuNum) {
            case 1:
                System.out.println("------------------------------\nYou Want To Withdraw $20,000?");
                System.out.println("1. Yes\t2. No");
                cashOne();
                break;
            case 2:
                System.out.println("------------------------------\nYou Want To Withdraw $15,000?");
                System.out.println("1. Yes\t2. No");
                cashTwo();
                break;
            case 3:
                System.out.println("------------------------------\nYou Want To Withdraw $10,000?");
                System.out.println("1. Yes\t2. No");
                cashThree();
                break;
            case 4:
                System.out.println("------------------------------\nYou Want To Withdraw $5,000?");
                System.out.println("1. Yes\t2. No");
                cashFour();
                break;
            case 5:
                System.out.println("------------------------------\nYou Want To Withdraw $1,000?");
                System.out.println("1. Yes\t2. No");
                cashFive();
                break;
            case 6:
                System.out.println("------------------------------\nYou Want To Withdraw $500?");
                System.out.println("1. Yes\t2. No");
                cashSix();
                break;
            case 7:
                cashOthers();
                break;
            default:
        }
    }

    public void cashOne() {
        int cashA;
        amt = 20000;
        System.out.print("\n-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        cashA = input.nextInt();
        switch (cashA) {
            case 1:
                if (money[0] <= amt) {
                    System.out.println("\n------------------------\nInsufficient  Funds\n------------------------\n");
                    withdrawal();
                } else if (money[0] > amt) {
                    money[0] = money[0] - amt;
                    System.out.println("-----------------------------------------------------------------\nCounting And Dispensing Cash... Do Not Remove Card...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou Have Withdrawn $" + amt);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour Account Balance is $" + money[0] + "\n-----------------------------------------------------------------");
                    goTO();
                }
                break;
            case 2:
                withdrawal();
                break;
            default:
                System.err.println("Invalid Option.");
                cashOne();
        }
    }

    public void cashTwo() {
        int cashA;
        amt = 15000;
        System.out.print("\n-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        cashA = input.nextInt();
        switch (cashA) {
            case 1:
                if (money[0] <= amt) {
                    System.out.println("\n------------------------\nInsufficient  Funds\n------------------------\n");
                    withdrawal();
                } else if (money[0] > amt) {
                    money[0] = money[0] - amt;
                    System.out.println("-----------------------------------------------------------------\nCounting And Dispensing Cash... Do Not Remove Card...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou Have Withdrawn $" + amt);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour Account Balance is $" + money[0] + "\n-----------------------------------------------------------------");
                    goTO();
                }
                break;
            case 2:
                withdrawal();
                break;
            default:
                System.err.println("Invalid Option.");
                cashTwo();
        }
    }

    public void cashThree() {
        int cashA;
        amt = 10000;
        System.out.print("\n-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        cashA = input.nextInt();
        switch (cashA) {
            case 1:
                if (money[0] <= amt) {
                    System.out.println("\n------------------------\nInsufficient  Funds\n------------------------\n");
                    withdrawal();
                } else if (money[0] > amt) {
                    money[0] = money[0] - amt;
                    System.out.println("-----------------------------------------------------------------\nCounting And Dispensing Cash... Do Not Remove Card...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou Have Withdrawn $" + amt);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour Account Balance is $" + money[0] + "\n-----------------------------------------------------------------");
                    goTO();
                }
                break;
            case 2:
                withdrawal();
                break;
            default:
                System.err.println("Invalid Option.");
                cashThree();
        }
    }

    public void cashFour() {
        int cashA;
        amt = 5000;
        System.out.print("\n-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        cashA = input.nextInt();
        switch (cashA) {
            case 1:
                if (money[0] <= amt) {
                    System.out.println("\n------------------------\nInsufficient  Funds\n------------------------\n");
                    withdrawal();
                } else if (money[0] > amt) {
                    money[0] = money[0] - amt;
                    System.out.println("-----------------------------------------------------------------\nCounting And Dispensing Cash... Do Not Remove Card...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou Have Withdrawn $" + amt);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour Account Balance is $" + money[0] + "\n-----------------------------------------------------------------");
                    goTO();
                }
                break;
            case 2:
                withdrawal();
                break;
            default:
                System.err.println("Invalid Option.");
                cashFour();
        }
    }

    public void cashFive() {
        int cashA;
        amt = 1000;
        System.out.print("\n-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        cashA = input.nextInt();
        switch (cashA) {
            case 1:
                if (money[0] <= amt) {
                    System.out.println("\n------------------------\nInsufficient  Funds\n------------------------\n");
                    withdrawal();
                } else if (money[0] > amt) {
                    money[0] = money[0] - amt;
                    System.out.println("-----------------------------------------------------------------\nCounting And Dispensing Cash... Do Not Remove Card...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou Have Withdrawn $" + amt);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour Account Balance is $" + money[0] + "\n-----------------------------------------------------------------");
                    goTO();
                }
                break;
            case 2:
                withdrawal();
                break;
            default:
                System.err.println("Invalid Option.");
                cashFive();
        }
    }

    public void cashSix() {
        int cashA;
        amt = 500;
        System.out.print("\n-------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        cashA = input.nextInt();
        switch (cashA) {
            case 1:
                if (money[0] <= amt) {
                    System.out.println("\n------------------------\nInsufficient  Funds\n------------------------\n");
                    withdrawal();
                } else if (money[0] > amt) {
                    money[0] = money[0] - amt;
                    System.out.println("-----------------------------------------------------------------\nCounting And Dispensing Cash... Do Not Remove Card...");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou Have Withdrawn $" + amt);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour Account Balance is $" + money[0] + "\n-----------------------------------------------------------------");
                    goTO();
                }
                break;
            case 2:
                withdrawal();
                break;
            default:
                System.err.println("Invalid Option.");
                cashSix();
        }
    }

    public void cashOthers() {
        System.out.print("\n------------------------------\nEnter Amount To Be Withdraw: ");
        amt = input.nextDouble();
        if (money[0] <= amt) {
            System.out.println("\n------------------------\nInsufficient  Funds\n------------------------\n");
            withdrawal();
        } else if (money[0] > amt) {
            money[0] = money[0] - amt;
            System.out.println("-----------------------------------------------------------------\nCounting And Dispensing Cash... Do Not Remove Card...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\nYou Have Withdrawn $" + amt);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("\nYour Account Balance is $" + money[0] + "\n-----------------------------------------------------------------");
            goTO();
        }

    }

    public void transfer() {
        int menuNum;
        System.out.println("----------\n TRANSFER\n----------");
        System.out.println("Press [1] For Account Transfer");
        System.out.println("Press [2] For Airtime Transfer");
        System.out.print("--------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        menuNum = input.nextInt();
        switch (menuNum) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.err.println("Invalid Input.");
                transfer();
        }
    }

    public void paybills() {

    }

    public void goTO() {
        int menuNum;
        System.out.println("\n1. Mainmenu\t2. Withdraw\t3. Remove Card And Exit");
        System.out.print("--------------------\nEnter An Option: ");
        while (!input.hasNextInt()) {
            System.err.println("Nope!! Numbers Only.");
            System.out.print("Try Again: ");
            input.next();
        }
        menuNum = input.nextInt();
        switch (menuNum) {
            case 1:
                mainMenu();
                break;
            case 2:
                withdrawal();
                break;
            case 3:
                exit();
                break;
            default:
        }
    }

    public static void main(String[] args) {
        ATM displayAPP = new ATM();
        displayAPP.pinValidation();
    }

}
