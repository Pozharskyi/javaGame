package pozharskyi.com;

public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_INT = "INT value = ";
    public static final String CORRECT = "Correct answer with attempt s= ";
	public static final String GUESS = "Guess number betwen: ";
	public static final String SEPARATOR = "separator";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }

}
