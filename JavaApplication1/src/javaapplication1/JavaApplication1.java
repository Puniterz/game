/*
Punit Pabla
*/

package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String userChoice = "";
    System.out.println("WELCOME TO The GUESS WHAT ADVENTURE!\n" );
    System.out.println("You are at school! do you talk to \"Thomas\" or  \"Punit\"?");
    userChoice = scan.nextLine();
    
    if (userChoice.equals("Thomas")) {
        System.out.println("You and Thomas are walking around the school. after a while everything goes silent \n" +
				"Then Thomas says guess what. You can reply with \"What\"\n" +
				"or do you just \"stare and walk away\".");
        userChoice = scan.nextLine();
        if (userChoice.equals("What")) {
        	System.out.println("CHIKEN BUTT HAHAHAH GET PRANKED L BOZO + RATIO!!!!!!!!!! \n" + "Hey atleast you are still friend");
                }
        else if (userChoice.equals("stare and walk away")){
                System.out.println("You later see thomas in you class and he ask's you to guess what you can relpy with \"what\" to get over it or just \"ignore\" him" );
                userChoice = scan.nextLine();
                if (userChoice.equals("what")){
                    System.out.println("CHIKEN BUTT HAHAHAH GET PRANKED L BOZO + RATIO!!!!!!!!!! \n" + "after school you go to gidenc and drop the class");
                }
                else if(userChoice.equals("ignore"))
                    System.out.println("Well, then I GUESS you'll never know what his question was. Thanks for playing.");
			}
                
		}
    
    else if (userChoice.equals("Punit")) {
        System.out.println("You and Punit are sitting in computer science class. after the leason is done\n" +
				"Punit asks you a question. Do you \"ignore\"\n" +
				"him or do you say \"what is your question \"");
		userChoice = scan.nextLine();
        if (userChoice.equals("ignore")) {
			System.out.println("He asks you agin but also taps on your sholder do you \"ignore\" him again or say \"what is your question\"");
			userChoice = scan.nextLine();

        if(userChoice.equals("ignore")){
                        System.out.println("Well, then I GUESS you'll never know what his question was. Thanks for playing.");
                    }
        if (userChoice.equals("what is your question")){
                        System.out.println("He says \"guess why\" you say \"why\"");
                userChoice = scan.nextLine();
        if (userChoice.equals("why")) {
                        System.out.println("CHIKEN PIE HAHAHAH GET PRANKED L BOZO + RATIO!!!!!!!!!! \n" + "Hey atleast you are still friend");
                }
                }	
                }
    else if (userChoice.equals("what is your question")){
        System.out.println("He says \"guess why\" you say \"why\"");
                userChoice = scan.nextLine();
            if (userChoice.equals("why")) {
                        System.out.println("CHIKEN PIE HAHAHAH GET PRANKED L BOZO + RATIO!!!!!!!!!! \n" + "Hey atleast you are still friend");
                }
		}
    }
}}
   
