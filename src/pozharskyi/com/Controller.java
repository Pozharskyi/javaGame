package pozharskyi.com;

import java.util.Scanner;

public class Controller {

	// Constructor
	Model model;
	View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	// The Work method
	public void processUser() {
		Boolean result = false;
		Scanner sc = new Scanner(System.in);
		do {
			setValidUserValue(sc);
			result = model.compareUserValueWithRandomNumber();
			model.incrementAttempt();
			if (result == true) {
				view.printMessage(view.CORRECT + model.getAttemptCunter());
			}

		} while (result == false);

	}

	private void setValidUserValue(Scanner sc) {
		Boolean valid = false;
		do {
			view.printMessage(view.GUESS + model.getLeftLimit()
					+ view.SEPARATOR + model.getRightLimit() + " "
					+ model.randomNumber);
			model.setUserValue(inputIntValueWithScanner(sc));
			valid = model.checkValidUserValue();
			if (!valid) {
				view.printMessage(view.WRONG_INPUT_INT_DATA);
			}

		} while (!valid);
	}

	// The Utility methods
	public int inputIntValueWithScanner(Scanner sc) {
		view.printMessage(view.INPUT_INT_DATA);
		while (!sc.hasNextInt()) {
			view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
			sc.next();
		}
		return sc.nextInt();
	}
}
