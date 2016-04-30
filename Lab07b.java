import javax.swing.JOptionPane; // Imports JOptionPane class
public class Lab07b {

    /**
    * Expands a String by repeating characters in the String.
    * The character at position 0 is repeated 0 times, position one
    * is repeated once, position 2 is repeated twice and so on.
    * @param input String to expand
    * @return the input String expanded
    * Natalya Habib
     */

    /* method expandWord will take the user input 
    for sentence and repeat each letter a number of times 
    based on its index number*/
    public static String expandWord(String input) {
       
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
          
            int j=0;

            while (j<i){
                result = result.append(input.charAt(i));
                j++;
            }
        
        }
        
        return result.toString(); // returns refult to a string 
    }// end expandWord

    public static void main(String[] args) {
        
        String reTry = null; // declared variable to use within entire main 
        String sentence = null;
        
        // repeat entire process until user inputs "N" 
        do {

        sentence = JOptionPane.showInputDialog("Enter a String to Expand:");
        
        // if user leaves field empty program will print first sentence - else it will print result 
        if (sentence.equals("")) {
             JOptionPane.showMessageDialog(null, "You didn't put in a sentence! How do you expect the program to work!");
        }

        else{ 
            JOptionPane.showMessageDialog(null, "Your Sentence When Expanded is: " 
                                        + "\n" + expandWord(sentence));
        }

        //window will continue to pop up until user inputs "Y" or "N"  
        do { 
        // asks user to input "Y" or "N" to repeat program - if user inputs N program will quit 
            reTry = JOptionPane.showInputDialog("Would You Like to Try Again? (Y/N) ");
        
        }
        while (!reTry.equals("Y") && !reTry.equals("N"));
        
        }
        while (reTry.equals("Y"));

        JOptionPane.showMessageDialog(null, "Goodbye!"); 

    }// end main

}//end class 