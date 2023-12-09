////////////////////////////////////      【★】       ////////////////////////////////////
////////////////////////////////      Start program     /////////////////////////////////
////////////////////////////      •‿•  Hello world •‿•     //////////////////////////////

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
class SupManageSys{
    static String uName = "admin";//////////User Name//
    static String uPassword = "admin";//////////user Password//
    static String[][] supplier=new String[0][2];
    static String[] categorie=new String[0];
    static String[][] item=new String[0][6];
    static Scanner keyIn = new Scanner(System.in);
    //////////////////////////////////////////////////////////////////////////////////////
    static String keyBoard = 
        "\n\n\t\t  _____________________________________________________________________\n" +
        "\t\t | Esc | 1! | 2@ | 3# | 4$ | 5% | 6^ | 7& | 8* | 9( | 0) | -_ | =+ | ⌫ |\n" +
        "\t\t |---------------------------------------------------------------------|\n" +
        "\t\t | Tab | Q | W | E | R | T | Y | U | I | O | P | [{ | ]} |  \\          |\n" +
        "\t\t |---------------------------------------------------------------------|\n" +
        "\t\t | Caps | A | S | D | F | G | H | J | K | L | ;: | '\"' |     Enter     |\n" +
        "\t\t |---------------------------------------------------------------------|\n" +
        "\t\t | Shift | Z | X | C | V | B | N | M | ,< | .> | /? | ↑ |    Shift     |\n" +
        "\t\t |---------------------------------------------------------------------|\n" +
        "\t\t | Ctrl | Win | Alt |   ©Developed by ShenSingh   | Alt | FN | Ctrl    |\n" +
        "\t\t \\_____________________________________________________________________/\n";
    /////////////////////////////////////////////////////////////////////////////////////////////

    public static void clearConsole() { //////////////// clear consol//////////////////////
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void disTimeDate(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + formattedDateTime);
    }
    public static void main(String[] args){////////// Main Method/////////////////////
    
        logingPage();
    
    }
    public static void  logingPage(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t\t+--------------------------------------------+");
        System.out.println("\t\t\t\t|                 Loging Page                |");
        System.out.println("\t\t\t\t+--------------------------------------------+");

        boolean flog01 = true;
        boolean flog02 = true;
        do {
            System.out.println();
            System.out.print("Enter User Name"+keyBoard+"\n\t\t"+"✎. ");
            String UserName = keyIn.next();
            int i=0;

            if (UserName.equals(uName)) {
                for (i = 0; i <5; i++) {                    
                    System.out.println();
                    System.out.print("Enter User Password"+"\n\t\t"+"✎. ");
                    String pass = keyIn.next();
                    if (pass.equals(uPassword)) {
                        flog01 = false;
                        flog02 = false;
                        mainManu();
                    } else {
                        System.out.println("wrong password! try agin ✗");
                        System.out.println();
                    }
                }
                ///////////////////////////////////////forget pass///////////////////////////
                clearConsole();
                disTimeDate();
                System.out.println("\t\t\t\t+--------------------------------------------+");
                System.out.println("\t\t\t\t|                 Loging Page                |");
                System.out.println("\t\t\t\t+--------------------------------------------+");

                do{

                    System.out.println();
                    System.out.print("Do you wont to forget password(y/n)"+keyBoard+"\n\t\t"+"✎. ");
                    String option =keyIn.next();
    
                    if (option.equals("y")) {
                        System.out.print("Enter your Gmail "+"\n\t\t"+"✎. ");
                        String gmail=keyIn.next();
                        fogetPass(gmail);
                    }
                    if (option.equals("n")) {
                        logingPage();
                    }
                    else{
                        System.out.println("worng Commond try Again!");
                        flog02=true;
                    }
                }while(flog01);
                
                
            } else {
                clearConsole();
                disTimeDate();
                System.out.println("\t\t\t\t+--------------------------------------------+");
                System.out.println("\t\t\t\t|                 Loging Page                |");
                System.out.println("\t\t\t\t+--------------------------------------------+");
                System.out.println("Wrong Name! try agin ✗ ");
            }
        } while (flog01);
    }
    private static void fogetPass(String gmail) {
        Random random = new Random();
        boolean flog01=false;
        boolean flog02=false;
        
        do{
            flog01=false;
            /////////////////////////////////////////////////////////////////////////
            clearConsole();
            disTimeDate();
            System.out.println("\t\t\t\t+--------------------------------------------+");
            System.out.println("\t\t\t\t|                 Loging Page                |");
            System.out.println("\t\t\t\t+--------------------------------------------+");
            System.out.println("\n\n\n\n");
    
    
           
    
            System.out.println("\t\t\t\t\t\t W   A  I  T ");
            System.out.println();
            System.out.print("\t\t\t\t\t      ◆");
            
    
            
            for (int i = 0; i < 8; i++) {
                
                System.out.print("◇");
                try {
                    // Sleep for 1 second (1000 milliseconds)
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                 System.out.print("◆");
                try {
                    // Sleep for 1 second (1000 milliseconds)
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            
            ////////////////////////////////////////////////////////////////////////
            //////////////////////////////////////////////////////////////////////
            clearConsole();
            disTimeDate();
            System.out.println("\t\t\t\t+--------------------------------------------+");
            System.out.println("\t\t\t\t|                 Loging Page                |");
            System.out.println("\t\t\t\t+--------------------------------------------+");
            System.out.println("\n\n");
            int randomNum = 0;
            int lowerBound = 1001;
            int upperBound = 9999;
    
            for (int i = 0; i < 10; i++) {
                randomNum = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            }
    
            System.out.println("\t\t\t+------------------------------------------------------+");
            System.out.printf("\t\t\t|   %-50s |%n", gmail);
            System.out.println("\t\t\t+------------------------------------------------------+");
    
            for (int i = 0; i < 4; i++) {
                System.out.printf("\t\t\t|   %-50s |%n", ""); // Add an empty string as the missing argument
            }
           System.out.println("\t\t\t|                      Hey User                        |");
           System.out.println("\t\t\t|                Your PIN Number is                    |");
           System.out.println("\t\t\t|                                                      |");
           System.out.println("\t\t\t|                       "+randomNum+"                           |");
    
            for (int i = 0; i < 4; i++) {
                System.out.printf("\t\t\t|   %-50s |%n", ""); // Add an empty string as the missing argument
            }
            System.out.println("\t\t\t+------------------------------------------------------+");
            
            //////////////////////////////////////////////////////////////////////
            System.out.println();
            
            System.out.print("Enter Your PIN Number"+keyBoard+"\n\t\t"+"✎. ");
            String pinNumber=keyIn.next();

            String randPinNum = String.valueOf(randomNum);
            // String strNumber2 = "" + number;
    
            if (pinNumber.equals(randPinNum)){
                clearConsole();
                disTimeDate();
                System.out.println("\t\t\t\t+--------------------------------------------+");
                System.out.println("\t\t\t\t|                 Loging Page                |");
                System.out.println("\t\t\t\t+--------------------------------------------+");
                System.out.println("\n\n");

                System.out.println("Verifid successfully!");
                System.out.println("\n");
                System.out.print("Enter new password"+keyBoard+"\n\t\t"+"✎. ");
                uPassword=keyIn.next();
                System.out.println("password change Successful.");

                do{
                    flog02=false;
                    System.out.println();
                    System.out.print("Do you wont to go loging page(y/n)"+"\n\t\t"+"✎. ");
                    String option=keyIn.next();
    
                    if (option.equals("y")) {
                        logingPage();
                    }
                    if (option.equals("n")) {
                        fogetPass(gmail);
                    }
                    else{
                        System.out.println("wrong commond try agin!");
                        flog02=true;
                    }
                }while(flog02);
            }
            else{
                System.out.println("you pin number is worng try agin");
                flog01=true;
            }
        }while(flog01);
       
    }
    
    public static void mainManu(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+----------------------------------------------------+");
        System.out.println("\t\t\t|                       Main_Manu                    |");
        System.out.println("\t\t\t+----------------------------------------------------+");
        System.out.println();
        System.out.println("[1] Change the Credentials " + "\t\t[2] Supplier Manage");
        System.out.println("[3] Stock Manage " + "\t\t\t[4] Log Out");
        System.out.println("[5] Exit the System ");
        System.out.println();

        boolean while01 = true;
        do {
            System.out.println();
            System.out.print("Enter an option to continue"+keyBoard+"\n\t\t"+"✎. ");
            String option = keyIn.next();
        
            switch (option){
                case "1":
                    changeTheCredentials();
                    break;
                case "2":
                    SupplierManage();
                    break;
                case "3":
                    StockManagement();
                    break;
                case "4":
                    logingPage();
                    break;
                case "5":
                System.exit(0);
                    break;
                default:
                    clearConsole();
                    disTimeDate();
                    System.out.println("\t\t\t+----------------------------------------------------+");
                    System.out.println("\t\t\t|                       Main_Manu                    |");
                    System.out.println("\t\t\t+----------------------------------------------------+");
                    System.out.println();
                    System.out.println("[1] Change the Credentials " + "\t\t[2] Supplier Manage");
                    System.out.println("[3] Stock Manage " + "\t\t\t[4] Log Out");
                    System.out.println("[5] Exit the System ");
                    System.out.println();
                    System.out.println("Wrong Command! Plese try agin ✗");
                    while01 = true;
                    break;
            }
        }while (while01);
    }
    public static void SupplierManage(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+--------------------------------------+");
        System.out.println("\t\t\t|            Supplier Manage           |");
        System.out.println("\t\t\t+--------------------------------------+");

        System.out.println("[1] Add Supplier"+"\t\t\t[2] Update Supplier");
        System.out.println("[3] Delete Supplier"+"\t\t\t[4] View Suppliers");
        System.out.println("[5] Search Supplier"+"\t\t\t[6] Home Page\n");

        boolean flog01=false;        
        do{
            System.out.print("Enter an option to continue"+keyBoard+"\n\t\t"+"✎. ");
            String rem= keyIn.next();
            switch (rem) {
                case "1" :
                    addSupplier();
                    break;
                case "2" :
                    updateSuppler();
                    break;
                case "3" :
                    deleteSupplier();
                    break;
                case "4" :
                    viewSuppliers();
                    break;
                case "5" :
                    searchSuppliers();
                    break;
                case "6" :
                    mainManu();
                    break;
                default:
                    clearConsole();
                    disTimeDate();
                    System.out.println("\t\t\t+--------------------------------------+");
                    System.out.println("\t\t\t|            Supplier Manage           |");
                    System.out.println("\t\t\t+--------------------------------------+\n");
                    System.out.println("[1] Add Supplier"+"\t\t\t[2] Update Supplier");
                    System.out.println("[3] Delete Supplier"+"\t\t\t[4] View Suppliers");
                    System.out.println("[5] Search Supplier"+"\t\t\t[6] Home Page\n");

                    System.out.println("wrong commond! Plese Try agin ✗");
                    flog01=true;
                    break;
            }
        }while(flog01);
    }
    public static void searchSuppliers(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+-------------------------------------------+");
        System.out.println("\t\t\t|               SEARCH SUPPLIER             |");
        System.out.println("\t\t\t+-------------------------------------------+");

        boolean while01=false;
        boolean while02=false;
        do{
            System.out.println();
            System.out.print("Enter Supplier Id"+keyBoard+"\n\t\t"+"✎. ");
            String supId=keyIn.next();
            
            for (int i = 0; i < supplier.length; i++) {
                if (supplier[i][0].equals(supId)){
                    while01=false;
                    System.out.println();
                    System.out.println("+--------------------------------------+");
                    System.out.println("| Supplier ID  |     Supplier Name     |");
                    System.out.println("+--------------------------------------+");
                    System.out.printf("|   %-10s |      %-16s |%n", supplier[i][0], supplier[i][1]);
                    System.out.println("+--------------------------------------+");
                }else{
                    clearConsole();
                    disTimeDate();
                    System.out.println("\t\t\t+-------------------------------------------+");
                    System.out.println("\t\t\t|               SEARCH SUPPLIER             |");
                    System.out.println("\t\t\t+-------------------------------------------+");
                    System.out.println("worng Supplier Id! try agin ✗");
                    while01=true;
                }
            }
        }while(while01);

        do{
            System.out.println();
            System.out.print("Do you wont to search anthor supplier(y/n)"+"\n\t\t"+"✎. ");
            String option=keyIn.next();
    
            if (option.equals("y")){
                while02=false;
                searchSuppliers();
            }
            if (option.equals("n")){
                while02=false;
                SupplierManage();
            }
            else{
                while02=true;
                System.out.println("worng commond! try Agin ✗");
            }
        }while (while02);
    }
    public static void viewSuppliers(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+-------------------------------------------+");
        System.out.println("\t\t\t|                VIEW SUPPLIER              |");
        System.out.println("\t\t\t+-------------------------------------------+");

        boolean while01=false;
        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.println("| Supplier ID  |     Supplier Name     |");
        System.out.println("+--------------------------------------+");

        for (String[] strings : supplier){
            System.out.printf("|   %-10s |      %-16s |%n", strings[0], strings[1]);
        }
        System.out.println("+--------------------------------------+");

        do{
            System.out.println();
            System.out.println("do you wont to view Agin(y/n)"+keyBoard+"\n\t\t"+"✎. ");
            String option=keyIn.next();
    
            if (option.equals("y")){
                while01=false;
                viewSuppliers();
            }
            if (option.equals("n")){
                while01=false;
                SupplierManage();
            }else{
                while01=true;
                System.out.println("Worn commond! try agin ✗");  
                viewSuppliers();
            }
        }while(while01);
    }
    private static void deleteSupplier(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+-------------------------------------------+");
        System.out.println("\t\t\t|               DELETE SUPPLIER             |");
        System.out.println("\t\t\t+-------------------------------------------+");

        boolean flog01=false;
        boolean flog02=false;

        do{
			 flog01=false;
			flog02=false;
            System.out.println();
            System.out.print("Enter Supplier Id"+keyBoard+"\n\t\t"+"✎. ");
            String supId=keyIn.next();
            
           boolean rem =checkDeleteSupId(supId);
           if (rem) {
                supplier=deletingSup(supId);
           }
           else{
                clearConsole();
                disTimeDate();
                System.out.println("\t\t\t+-------------------------------------------+");
                System.out.println("\t\t\t|               DELETE SUPPLIER             |");
                System.out.println("\t\t\t+-------------------------------------------+");
                System.out.println("wrong supplier id!  Try agin ✗");
                flog02=true;
            }
        }while(flog02);
        System.out.println("\nSupplier delete ok ✓");

        do{
            System.out.println();
            System.out.print("Do you wont to delete another supplier(y/n)"+"\n\t\t"+"✎. ");
            String option =keyIn.next();
    
            if (option.equals("y")){
                deleteSupplier();
            }
            if (option.equals("n")){
                SupplierManage();
            }
            else{
                System.out.println("worng commond! try agin ✗");
                flog01=true;
            }
        }while(flog01);
    }
    public static boolean checkDeleteSupId(String supId){
        for (int i = 0; i < supplier.length; i++) {
            if (supplier[i][0].equals(supId)) {
                return true;
            }
        }
        return false;
    }
    public static String[][] deletingSup(String supId){
        String[][] temp = new String[supplier.length - 1][2];
        int tempIndex =0;
    
        for (int i = 0; i < supplier.length; i++){
            if (!supplier[i][0].equals(supId)) {
                temp[tempIndex][0] = supplier[i][0];
                temp[tempIndex][1] = supplier[i][1];
                tempIndex++;
            }
        }
        return temp;
    }
    public static void updateSuppler(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+----------------------------------------+");
		System.out.println("\t\t\t|             Update Suplier             |");
        System.out.println("\t\t\t+----------------------------------------+");
        boolean flog01;
        boolean flog02=false;
        do{
            flog01=false;
            System.out.println();
            System.out.print("Enter Supplier Id"+keyBoard+"\n\t\t"+"✎. ");
            String supId=keyIn.next();

            for (int i = 0; i < supplier.length; i++){
                if (supplier[i][0].equals(supId)){
                    System.out.println("curent Supplier name is : "+supplier[i][1]);
                    System.out.print("\nEnter new Supplier Name"+"\n\t\t"+"✎. ");
                    supplier[i][1]=keyIn.next();
                    System.out.println("Update sucsussfuly.");
                    break;
                }
                else{
                    clearConsole();
                    disTimeDate();
                    System.out.println("\t\t\t+----------------------------------------+");
                    System.out.println("\t\t\t|             Update Suplier             |");
                    System.out.println("\t\t\t+----------------------------------------+");
                    System.out.println("wrong supplier id ✗");
                    flog01=true;
                }    
            }
        }while(flog01);
        do{
            flog02=false;
            System.out.println();
            System.out.print("Do you wont to update anothr Supplier(y/n)"+"\n\t\t"+"✎. ");
            String option=keyIn.next();
    
            if (option.equals("y")){
                updateSuppler();
            }
            if (option.equals("n")){
                SupplierManage();
            }
            else{
                System.out.println("worng commond! try agin ✗");
                flog02=true;
            }
        }while (flog02);
    }
    public static void addSupplier(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+-------------------------------------+");
        System.out.println("\t\t\t|             ADD SUPPLIER            |");
        System.out.println("\t\t\t+-------------------------------------+");
        boolean flog01=false;
        boolean flog02=false;

        do{
            flog01=false;
            System.out.println();
            System.out.print("Enter Supplier Id"+keyBoard+"\n\t\t"+"✎. ");
            String supId =keyIn.next();
            boolean rem=checkSupId(supId);
            if (rem){
            System.out.print("Enter Supplier Name"+"\n\t\t"+"✎. ");
                String supName =keyIn.next();
              supplier = supplierArrGrow(supId,supName);
            }
            else{
                clearConsole();
                disTimeDate();
                System.out.println("\t\t\t+-------------------------------------+");
                System.out.println("\t\t\t|             ADD SUPPLIER            |");
                System.out.println("\t\t\t+-------------------------------------+");
                System.out.println("This id is already exiet ✗");
                flog01=true;
            }
        }while(flog01);
        
        do{
            System.out.print("Supplier added. Do you wont to add new Supplier(y/n)"+"\n\t\t"+"✎. ");
            String option=keyIn.next();
            if (option.equals("y")){
                addSupplier();
            }
            if (option.equals("n")){
                SupplierManage();
            }
            else{
                System.out.println("worng commond! Try agin ✗");
                flog02=true;
            }
        }while(flog02);
    }
    public static String[][] supplierArrGrow(String supId, String supName){
        String[][] temp=new String[supplier.length+1][2];

        for (int i = 0; i < supplier.length; i++){

            temp[i][0]=supplier[i][0];
            temp[i][1]=supplier[i][1];
        }
        temp[temp.length-1][0]=supId;
        temp[temp.length-1][1]=supName;
        return temp;
    }

    public static boolean checkSupId(String supId) {
        for (int i = 0; i < supplier.length; i++) {
            if (supplier[i][0].equals(supId)) {
                return false;
            }
        }
        return true;
    }

    public static void changeTheCredentials() {
        clearConsole();
        System.out.println("\t\t\t+-----------------------------------------+");
        System.out.println("\t\t\t|          Change The Credentials         |");
        System.out.println("\t\t\t+-----------------------------------------+");

        boolean flog01 = true;
        boolean flog02 = true;
        boolean flog03 = false;

        do {
            System.out.println();
            System.out.println("We wont to verify you ✇");
            System.out.print("Plese enter your user Name"+keyBoard+"\n\t\t"+"✎. ");
            String UserName = keyIn.next();

            if (UserName.equals(uName)) {
                do {
                    System.out.println();
                    System.out.print("Enter your user password"+"\n\t\t"+"✎. ");
                    String pass =keyIn.next();

                    if (pass.equals(uPassword)){
                        flog01 = false;
                        flog02 = false;
                        flog03 = false;

                        System.out.println("Your currnt password is :" + uPassword);
                        do {
                            System.out.println();
                            System.out.print("Enter your new Password"+"\n\t\t"+"✎. ");
                            String newPass = keyIn.next();
                            if (!newPass.equals("1234") && !newPass.equals("4321")) {
                                uPassword = newPass;
                                flog03 = false;
                            } else {
                                System.out.println("Your password is Week! Enter Strong password ✗");
                                flog03 = true;
                            }
                        } while (flog03);

                        do {
                            System.out.println();
                            System.out.print("Password changed successfully ✓ Do you want to change agin (y/n)"+"\n\t\t"+"✎. ");
                            String option = keyIn.next();

                            if (option.equals("y")) {
                                changeTheCredentials();
                            }
                            if (option.equals("n")) {
                                mainManu();
                                System.out.println("Bye");
                            } else {
                                System.out.println("wrong option! try Agin ✗");
                                flog03 = true;
                            }
                        } while (flog03);
                    } else {
                        System.out.println("Incorrect password! try agin ✗ ");
                    }
                } while (flog02);
            } else {
                System.out.println("Invalid user name! Try agin ✗");
            }
        } while (flog01);
    }
    public static void StockManagement(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println("\t\t\t|                STOCK MANAGEMENT                |");
        System.out.println("\t\t\t+------------------------------------------------+");

        System.out.println("[1] Manage Item Categories"+"\t\t[2] Add Item");
        System.out.println("[3] Get Items Supplier wise "+"\t\t[4] View Items");
        System.out.println("[5] Rank Items Per Unit Price"+"\t\t[6] Home page");
        System.out.println();
        
        boolean while_01 = true;

        do{
            System.out.print("/nEnter an option to continue"+keyBoard+"\n\t\t"+"✎. ");
            String option= keyIn.next();

                switch (option) {
                    case "1":
                        while_01 = false;
                        manageItemCategories();
                    break;

                    case "2":
                        while_01 = false;
                        addItem();
                    break;

                    case "3":
                        while_01 = false;
                        getItemsSupplierWise();
                    break;

                    case "4":
                        while_01 = false;
                        viewItems();
                    break;

                    case "5":
                        while_01 = false;
                        rankItemsPerUnitPrice();
                    break;

                    case "6":
                        while_01 = false;
                        mainManu();
                    break;

                    default:
                        clearConsole();
                        disTimeDate();
                        System.out.println("\t\t\t+------------------------------------------------+");
                        System.out.println("\t\t\t|                STOCK MANAGEMENT                |");
                        System.out.println("\t\t\t+------------------------------------------------+");
                        System.out.println("[1] Manage Item Categories"+"\t\t[2] Add Item");
                        System.out.println("[3] Get Items Supplier wise "+"\t\t[4] View Items");
                        System.out.println("[5] Rank Items Per Unit Price"+"\t\t[6] Home page");

                        System.out.println("Wrong commond! Plese Try agin ✗");
                    break;
                }
        }while(while_01);
    }
    public static void rankItemsPerUnitPrice(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+----------------------------------------------+");
        System.out.println("\t\t\t|          RANK ITEMS PER UNIT PRICE           |");
        System.out.println("\t\t\t+----------------------------------------------+");

        boolean flog01=false;
        /////////////////////////////////////Shot and compare///////////////////////
        String[][] sortedArray=item;
        for (int i = 0; i < item.length; i++){
			for (int j = 0; j < item.length-1; j++){
				if(Double.parseDouble(sortedArray[j][4])<Double.parseDouble(sortedArray[j+1][4])){
					String [] temp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = temp;
				}
		}
	}
        System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");
        System.out.println("|      CODE       |       SID       |       CAT       |       DESC      |       PRICE     |        QTY      |");
        System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");

        for (String[] row : item) {
            System.out.printf("|    %-12s |    %-12s |    %-12s |    %-12s |    %-12s |    %-12s |%n",
            row[0], row[1], row[2], row[3], row[4], row[5]);
        }
        System.out.println("+-----------------+-----------------+-----------------+-----------------+-----------------+-----------------+");
        do{
            System.out.println();
            System.out.println("Do you wont to view agin.");
            String option=keyIn.next();
            if (option.equals("y")){
                rankItemsPerUnitPrice();
            }
            if (option.equals("n")) {
                StockManagement();
            }else{
                System.out.println("wrong commond! try agin ✗");
                flog01=true;
            }
        }while(flog01);
    }
    public static void viewItems(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println("\t\t\t|                    view ITEMS                   |");
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println();
        boolean flog01=false;

			System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
			System.out.printf("|        %s       |        %s       |        %s       |        %s      |        %s        |%n","SId","CODE","DESC","PRICE","QTY");
			System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
			for (int j = 0; j < item.length; j++){
				
                System.out.printf("|    %10s    |    %10s     |    %10s     |    %10s     |    %10s     |%n",item[j][1],item[j][0],item[j][3],item[j][4],item[j][5]);
			}
			System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
        do{
            flog01=false;
            System.out.println("\nDo you wont to view agin(y/n)"+keyBoard+"\n\t\t"+"✎. ");
            String option=keyIn.next();

            if (option.equals("y")) {
                viewItems();
            }
            if (option.equals("n")) {
                StockManagement();
            }else{
                clearConsole();
                viewItems();
                System.out.println("worng commond! try agin ✗");
                flog01=true;
            }
        }while(flog01);
    }
    public static void getItemsSupplierWise(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println("\t\t\t|                  Get Supplier Item             |");
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println();

        boolean flog01=false;
        while(true){
            boolean flag = false;
            System.out.println();
            System.out.print("Enter Supplier Id"+keyBoard+"\n\t\t"+"✎. ");
            String supId =keyIn.next();

            String name =supId;
            Integer lastDigit = null;

            for (int i = name.length() - 1; i >= 0; i--){
                if (Character.isDigit(name.charAt(i))){
                    lastDigit = Integer.parseInt(String.valueOf(name.charAt(i)));
                    break;
                }
            }
            for (int i = 0; i < supplier.length; i++) {
                if (supId.equals(supplier[i][0])){
                    flag = true;
                    System.out.println("Supplier Name : " + supplier[i][1] + "\n\n");
                    System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
                    System.out.printf("|     %s    |    %s    |     %s    |     %s   |     %s      |%n", "ITEM CODE", "DESCRIPTION", "UNIT PRICE", "QTY ON HAND", "CATEGORY");
                    System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");

                    for (int j = 0; j < item.length; j++) {
                        if (lastDigit != null && lastDigit.equals(Integer.parseInt(item[j][1]))) {  // Change the index from 1 to 0
                            System.out.printf("|    %10s    |    %-10s     |    %10s     |    %10s     |   %10s   |%n", item[j][0], item[j][3], item[j][4], item[j][5], item[j][2]);
                        }
                    }
                    System.out.printf("+------------------+-------------------+-------------------+-------------------+-------------------+%n");
                }
            }
            if (!flag) {
                System.out.println("Can't find supplier ID. Try again ✗");
            }
            do{
                System.out.println();
                System.out.println("Do you wont to view another supplier item(y/n)"+"\n\t\t"+"✎. ");
                String option=keyIn.next();
                if (option.equals("y")){
                    getItemsSupplierWise();
                }
                if (option.equals("n")){
                    StockManagement();
                }else{
                    System.out.println("wrong commond! Try agin ✗");
                    flog01=true;
                }
            }while(flog01);
        }  
    }
    public static void addItem(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println("\t\t\t|                    ADD ITEMS                   |");
        System.out.println("\t\t\t+------------------------------------------------+");
    
        boolean flog01 = false;
        boolean flog02 = false;
        boolean flog03 = false;
        boolean flog04 = true;
    
        if (supplier.length >= 1){
            if (categorie.length >= 1) {
                do {
                    System.out.println();
                    System.out.print("Enter Item Code >"+keyBoard+"\n\t\t"+"✎. ");
                    String itemCode = keyIn.next();
                    boolean flog = CheckItemID(itemCode);
    
                    if (flog) {
                        item = IncrementItemArr(itemCode);
                        flog04 = false;
                    } else {
                        System.out.println("Already Item ID! Try again ✗");
                    }
                } while (flog04);
            } else {
                do {
                    flog01 = false;
                    System.out.print("\nOops! It seems that you don't have any categories in the system.\nDo you want to add a new category? (y/n)"+keyBoard+"\n\t\t"+"✎. ");
                    String option01 = keyIn.next();
                    if (option01.equals("y")) {
                        addCategory();
                    } else if (option01.equals("n")) {
                        StockManagement();
                    } else {
                        System.out.println("Wrong command! Try again ✗");
                        flog01 = true;
                    }
                } while (flog01);
            }
        } else {
            do {
                flog02 = false;
                System.out.print("Oops! It seems that you don't have any suppliers in the system.\nDo you want to add a new supplier? (y/n)"+keyBoard+"\n\t\t"+"✎. ");
                String option02 = keyIn.next();
                if (option02.equals("y")) {
                    addSupplier();
                } else if (option02.equals("n")) {
                    StockManagement();
                } else {
                    System.out.println("Wrong command! Try again ✗");
                    flog02 = true;
                }
            } while (flog02);
        }
        // Print Supplier Table
        System.out.println("\t\t"+"SUPPLIER TABLE ");
        System.out.printf("+------------------+-------------------+-------------------+%n");
        System.out.printf("|     %s      |    %s    |   %s   |%n", "   #   ", "SUPPLIER ID", "SUPPLIER NAME");
        System.out.printf("+------------------+-------------------+-------------------+%n");
    
        for (int i = 0; i < supplier.length; i++) {
            System.out.printf("|    %-10s    |     %-10s    |    %-10s     |%n", (i + 1), supplier[i][0], supplier[i][1]);
        }
        System.out.printf("+------------------+-------------------+-------------------+%n");
    
        System.out.print("Enter supplier number"+"\n\t\t"+"✎. ");
        String supNum = keyIn.next();
    
        for (int j = 0; j < item.length; j++) {
            if (item[j][1] == null) {
                item[j][1] = supNum;
            }
        }
        // Print Category Table
        System.out.println("\t\t" + "CATEGORY TABLE" + '\n');
        System.out.printf("+------------------+-------------------+%n");
        System.out.printf("|     %s      |   %s   |%n", "   #   ", "CATEGORY NAME");
        System.out.printf("+------------------+-------------------+%n");
    
        for (int i = 0; i < categorie.length; i++) {
            System.out.printf("|    %-10s    |     %-10s    |%n", (i + 1), categorie[i]);
        }
        System.out.printf("+------------------+-------------------+%n");
    
        System.out.print("Enter category Number"+"\n\t\t"+">> ");
        String CateNum = keyIn.next();
    
        for (int a = 0; a < item.length; a++) {
            if (item[a][2] == null) {
                item[a][2] = CateNum;
            }
        }
        ////////////////// Enter Description
        System.out.print("\nEnter Description"+"\n\t\t"+"✎. ");
        String ItemDis = keyIn.next();
    
        for (int l = 0; l < item.length; l++) {
            if (item[l][3] == null) {
                item[l][3] = ItemDis;
            }
        }
        ////////////////// Enter Price
        System.out.print("\nEnter Price"+"\n\t\t"+"✎. ");
        String ItemPrice = keyIn.next();
    
        for (int k = 0; k < item.length; k++) {
            if (item[k][4] == null) {
                item[k][4] = ItemPrice;
            }
        }
        /////////////// Enter Quantity
        System.out.print("\nEnter Quantity"+"\n\t\t"+"✎. ");
        String itemQuantity = keyIn.next();
    
        for (int k = 0; k < item.length; k++) {
            if (item[k][5] == null) {
                item[k][5] = itemQuantity;
            }
        }
        do {
            System.out.print("Do you want to add another item? (y/n)"+"\n\t\t"+"✎. ");
            String option = keyIn.next();
    
            if (option.equals("y")){
                addItem();
            } 
            if(option.equals("n")){
                StockManagement();
            }else{
                flog03 = true;
                System.out.println("Wrong command! Try again ✗");
            }
        } while (flog03);
    }
    public static String[][] IncrementItemArr(String itemCode) {
        String[][] temp = new String[item.length + 1][6];
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j] = item[i][j];
            }
        }
        temp[temp.length - 1][0] = itemCode;
        return temp;
    }
    public static boolean CheckItemID(String itemID){
        if (item == null){
            return true;
        }
        boolean flog = true;
        for (int i = 0; i < item.length; i++){
            if (item[i][0] != null && item[i][0].equals(itemID)){
                flog = false;
                break;
            }
        }
        return flog;
    }
    public static void manageItemCategories(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println("\t\t\t|              MANEGE ITRM CATEGORIES            |");
        System.out.println("\t\t\t+------------------------------------------------+");

        System.out.println("[1] Add Category\t\t[2] Update Category");
        System.out.println("[3] Delete Category\t\t[4]. Back");
        
        boolean flog01=false;

        do{
            System.out.println();
            System.out.print("Enter an option to continue"+keyBoard+"\n\t\t"+"✎. ");
            String option = keyIn.next();
    
            if(option.equals("1")){
                flog01=false;
                addCategory();
            }
            if(option.equals("2")){
                flog01=false;
                updateCategory();
            }
            if(option.equals("3")){
                flog01=false;
                deleteCategory();
            }
            if (option.equals("4")){
                StockManagement();
            }
            else{
                clearConsole();
                disTimeDate();
                System.out.println("\t\t\t+------------------------------------------------+");
                System.out.println("\t\t\t|              MANEGE ITRM CATEGORIES            |");
                System.out.println("\t\t\t+------------------------------------------------+");

                System.out.println("[1] Add Category\t\t[2] Update Category");
                System.out.println("[3] Delete Category\t\t[4]. Back");
                flog01=true;
                System.out.println("wrong commond! try agin ✗");
            }
        }while(flog01);
    }
    public static void deleteCategory(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println("\t\t\t|                 Delete Categorie               |");
        System.out.println("\t\t\t+------------------------------------------------+");

        boolean flog01=false;
        boolean flog02=false;

        do{
            flog01=false;
            System.out.println();
            System.out.print("Enter Category Name"+keyBoard+"\n\t\t"+"✎. ");
            String catName=keyIn.next();
            boolean rem=checkDeleteCatName(catName);

            if (rem){
                categorie=deletingCate(catName);
                System.out.println("Categorie delete ok ✓");
            }else{
                clearConsole();
                disTimeDate();
                System.out.println("\t\t\t+------------------------------------------------+");
                System.out.println("\t\t\t|                 Delete Categorie               |");
                System.out.println("\t\t\t+------------------------------------------------+");
                flog01=true;
                System.out.println("no categorie Name ✗");
            }
        }while(flog01);

        do{
            System.out.println();
            System.out.print("Do you wont to delete another categorie(y/n)"+"\n\t\t"+"✎. ");
            String option=keyIn.next();
    
            if (option.equals("y")) {
                deleteCategory();
            }
            if (option.equals("n")) {
                StockManagement();
            }else{
                System.out.println("wrong Commond! try agin ✗");
                flog02=true;
            }
        }while (flog02);
    }
    public static boolean checkDeleteCatName(String catName){
        for (int i = 0; i < categorie.length; i++) {
            if (categorie[i].equals(catName)) {
                return true;
            }
        }
        return false;
    }
    public static String[] deletingCate(String catName){
        String[] temp=new String[categorie.length-1];
        int tempIndex =0;

        for (int i = 0; i < temp.length; i++){
            if (!categorie[i].equals(catName)) {
                temp[tempIndex]=categorie[i];
                tempIndex++;
            }
        }
        return temp;
    }
    public static void updateCategory(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println("\t\t\t|                 update Categorie               |");
        System.out.println("\t\t\t+------------------------------------------------+");

        boolean flog01=false;
        boolean flog02=false;

        do{
            System.out.println();
            flog01=false;
            System.out.print("Enter category Name"+keyBoard+"\n\t\t"+"✎. ");
            String catName=keyIn.next();
    
            for (int i = 0; i < categorie.length; i++){
                if (categorie[i].equals(catName)){
                    System.out.print("Enter new Categorie Name"+"\n\t\t"+"✎. ");
                    
                    categorie[i]=keyIn.next();
                    System.out.println("update ok ✓");
                    break;
                }
                else{
                    clearConsole();
                    disTimeDate();
                    System.out.println("\t\t\t+------------------------------------------------+");
                    System.out.println("\t\t\t|                 update Categorie               |");
                    System.out.println("\t\t\t+------------------------------------------------+");

                    System.out.println("no categorie Name! try agin ✗");
                    flog01=true;
                }
            }
        }while(flog01);

        System.out.print("do you wont to update anpther categorie(y/n)"+"\n\t\t"+"✎. ");
        String option=keyIn.next();

        if (option.equals("y")){
            updateCategory();
        }
        if (option.equals("n")) {
            manageItemCategories();
        }
    }
    public static void addCategory(){
        clearConsole();
        disTimeDate();
        System.out.println("\t\t\t+------------------------------------------------+");
        System.out.println("\t\t\t|                   Add Categorie                |");
        System.out.println("\t\t\t+------------------------------------------------+");
    
        boolean flog01 = false;
        boolean flog02 = false;
    
        do {
            System.out.println();
            System.out.print("Enter Category Name"+keyBoard+"\n\t\t"+"✎. ");
            String catName = keyIn.next();
    
            for (int i = 0; i < categorie.length; i++){
                if (categorie[i].equals(catName)){
                    flog01 = true;
                    System.out.println("Category already exists! Try again ✗");
                    break;
                }
            }
            if (!flog01) {
                categorie = growCatArr(catName);
                System.out.println("Category added successfully ✓");
            }
        }while(flog01);
    
        do {
            flog02 = false;
            System.out.println();
            System.out.print("Do you want to add another category (y/n)"+"\n\t\t"+"✎. ");
            String option = keyIn.next();
    
            if (option.equals("y")) {
                addCategory();
            } else if (option.equals("n")) {
                manageItemCategories();
            } else {
                flog02 = true;

                System.out.println("Wrong command! Try again ✗");
            }
        } while (flog02);
    }
    public static String[] growCatArr(String catName){
        String[] temp = new String[categorie.length + 1];
    
        for (int i = 0; i < categorie.length; i++) {
            temp[i] = categorie[i];

        }
        temp[temp.length - 1] = catName;
    
        return temp;
    }
}
//////////////////////////////////////////End Program //////////////////////////////////////////
//////////////////////////////////////////////////////////////   -ShenSingh-  /////2023-11-26///
