/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputManager;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class InputMgr 
{
    private static String _userInput;
    
    private InputMgr() {}
    
    /**
     * Reads users input and checks if user wants to exit the program.
     * @return exitFlag true/false to terminate program or not
     */
    public static boolean UsrInput()
    {
        boolean continueFlag = true;
        boolean ignoreCase = true;
        Scanner keyboardInput = new Scanner(System.in);
        String input;
        
        System.out.println("> Please enter the query you want to execute Cassandra Joins");
        System.out.println("> Enter exit to terminate the program");
        
        input = keyboardInput.nextLine();
        
        if(input.regionMatches(ignoreCase, 0, "exit", 0, input.length()))
        {
            continueFlag = false;
        }
        else
        {
            setUserInput(input);
        }
        
        return continueFlag;
    }
    
    /**
     * Public getter method for _userInput
     * @return private member _userInput
     */
    public static String getUserInput()
    {
        return _userInput;
    }
    
    /**
     * Private setter method _userInput
    */
    private static void setUserInput(String input)
    {
        _userInput = input;
    }
}
