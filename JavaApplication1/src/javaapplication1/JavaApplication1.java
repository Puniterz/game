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
	userChoice = scan.next();
        if (userChoice.equals("Thomas")) {
        System.out.println("Your and Thomas are walking around the school. after a while evrthing goes silent \n" +
				"Then Thomas says guess what. You can reply with \"What\"\n" +
				"or do you just \"stare and walk away\".");
        userChoice = scan.next();
        	if (userChoice.equals("What")) {
        		System.out.println("CHIKEN BUTT HAHAHAH GET PRANKED L BOZO + RATIO!!!!!!!!!! \n" + "Hey atleast you are still friend");
     
                     if (userChoice.equals("stare and walk away")){
	System.out.println("You never talk to Thomas again \n" + "resulting u never becomaing friends" );
			}
                }
		}
    
    else if (userChoice.equals("Punit")) {
		System.out.println("Your and Puit are sitting in computer sience class. after the leason is done\n" +
				"Punit asks you a question. Do you \"ignore\"\n" +
				"him or do you say \"what is your question \"");
		userChoice = scan.next();
		if (userChoice.equals("ignore")) {
			System.out.println("He asks you agin but also taps on your sholder do you  (\"ignore\" him again or say \"what is your question\")");
			userChoice = scan.next();
				if (userChoice.equals("what is your question")) {
                                        System.out.println("He says \"guess why\" do you say \"why\" or just \"ignore\" him again");
					System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n");
				}
			}
		}
    }
}
   
