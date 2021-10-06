package se.yiming;

import static com.diogonunes.jcolor.Ansi.*;
import static com.diogonunes.jcolor.Attribute.*;

public class BankSystem {


    public void loggaIn(){
        System.out.println(colorize("Hej! Välkommen till bankens huvudmeny!\n", YELLOW_TEXT(), BLACK_BACK()));
        System.out.print(colorize("Skriv in din email:", BLUE_TEXT(), BLACK_BACK()));
        String namn = System.console().readLine();  // Hur man färgar de inmätta strängarna?
        System.out.print(colorize("Skriv in din KOD:", YELLOW_TEXT(), BLACK_BACK()));
        String kod = System.console().readLine();
        //här skulle vi kunna kolla namn och kod mot en databas
        // filer
    }
    


    public void visaMeny2(){
        while(true){
            System.out.println(colorize("*Inloggad som Stefan*\n", BLUE_TEXT(), BLACK_BACK()));
            System.out.println(colorize("1. Ta ut pengar", BLUE_TEXT(), BLACK_BACK()));
            System.out.println(colorize("2. Sätt in pengar", BLUE_TEXT(), BLACK_BACK()));
            System.out.println(colorize("3. Kolla saldo", BLUE_TEXT(), BLACK_BACK()));
            System.out.println(colorize("4. Visa Transktioner", BLUE_TEXT(), BLACK_BACK()));
            System.out.print(colorize("5. ", BLUE_TEXT(), BLACK_BACK()));
            System.out.println(colorize("Tillback till huvudmeny", RED_TEXT(), BLACK_BACK()));
            System.out.print(colorize("0. ", BLUE_TEXT(), BLACK_BACK()));
            System.out.println(colorize("Logga ut\n\n\n", RED_TEXT(), BLACK_BACK()));

            System.out.print(colorize("Välkommen till din sida! Vad vill du göra? ", YELLOW_TEXT(), BLACK_BACK()));
            int val=Integer.parseInt(System.console().readLine());
            if(val==0){
                break;
            }
            if(val==1){
                System.out.print("Skriv in ditt konto nummer:");
                String konto = System.console().readLine();
                System.out.print("Hur mycket pergar ska du ta ut?");
                double amount=Double.parseDouble(System.console().readLine());

                System.out.println("*****");
                System.out.println("Kontonummer: "+ konto);
                System.out.println("Amount: "+  "("+amount+ "," +"'SEK'"+")");
                System.out.println("Typ: "+ "WITHDRAWL");
                System.out.println("*****");
            }
            if(val==2){
                System.out.print("Skriv in ditt konto nummer:");
                String konto = System.console().readLine();
                System.out.print("Hur mycket pergar ska du spara? ");
                double amount=Double.parseDouble(System.console().readLine());

                System.out.println("*****");
                System.out.println("Kontonummer: "+ konto);
                System.out.println("(" + amount+ "," +"'SEK'"+")");
                System.out.println("Typ: "+ "DEPOSIT");
                System.out.println("*****");
            }
            if(val==4){
                transktioner();
                break;
            }
            if(val==5){
                run();
            }
           
        }  
    }

    public void transktioner(){
        System.out.print("Skriv in ditt konto nummer:");
        String konto = System.console().readLine();

        System.out.println(colorize("TRANSKTIONER\n\n\n", YELLOW_TEXT(), BLACK_BACK()));

        System.out.println("*****\n");
        System.out.println("Kontonummer: "+ konto);
        System.out.println("Amount: "+  "0.0, 'SEK");
        System.out.print("Typ: ");
        System.out.println(colorize("WITHDRAWL", YELLOW_TEXT(), BLACK_BACK()));
        System.out.println("Tid: 2021-09-30 XXXX");
        System.out.println("*****\n\n\n");
            
       
        System.out.println("*****\n");
        System.out.println("Kontonummer: "+ konto);
        System.out.println("Amount: "+"100.0, 'SEK'");
        System.out.print("Typ: ");
        System.out.println(colorize("DEPOSIT", GREEN_TEXT(), BLACK_BACK()));
        System.out.println("Tid: 2021-09-31 XXXX");
        System.out.println("*****");
    }


    public void run(){
        while(true){
            System.out.println(colorize("***HUVUDMENY***\n\n", 
            YELLOW_TEXT(), BLACK_BACK()));
            System.out.println(colorize("(1). Logga in",BLUE_TEXT(), BLACK_BACK()));
            System.out.println(colorize("(2). Skapa nytt konto", BLUE_TEXT(), BLACK_BACK()));
            System.out.print(colorize("(3). ", BLUE_TEXT(), BLACK_BACK()));
            System.out.println(colorize("Avsluta\n\n", RED_TEXT(), BLACK_BACK()));
            System.out.print(colorize("Hej! Välkommen till bankens huvudmeny, vad vill du göra? ", 
            YELLOW_TEXT(), BLACK_BACK()));

            int val = Integer.parseInt(System.console().readLine());
            if(val == 3){
                break;
            }
            if(val == 1){
                loggaIn();
                visaMeny2();
                break;
            }  
        }
    }
    
}
