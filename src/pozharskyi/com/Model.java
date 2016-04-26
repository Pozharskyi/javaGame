package pozharskyi.com;

import java.util.Random;

public class Model {

	private Random rand = new Random();

	private int userValue;
	private int leftLimit = 0;
	private int rightLimit = 100;
	private int attemptCunter;
	public int randomNumber = rand.nextInt(rightLimit)+leftLimit+1;

	// The Program logic

	/**
	 * in this method we compare userValue with randomNumber and change limits accordingly
	 * 
	 * 
	 * @return result
	 */
	public boolean compareUserValueWithRandomNumber() {
		Boolean result = false;
		if (userValue == randomNumber) {
			result = true;
		}
		if (userValue > randomNumber) {
			rightLimit = userValue;
			result = false;
		} else {

			leftLimit = userValue;
			result = false;
		}
		return result;
	}

	public boolean checkValidUserValue() {
		if ((userValue < leftLimit) || (userValue > rightLimit)) {
			return false;
		}
		return true;
	}

	public void incrementAttempt() {
		attemptCunter++;
	}

	public int getAttemptCunter() {
		return attemptCunter;
	}

	public void setAttemptCunter(int attemptCunter) {
		this.attemptCunter = attemptCunter;
	}

	public int getUserValue() {
		return userValue;
	}

	public void setUserValue(int userValue) {
		this.userValue = userValue;
	}

	public int getLeftLimit() {
		return leftLimit;
	}

	public void setLeftLimit(int leftLimit) {
		this.leftLimit = leftLimit;
	}

	public int getRightLimit() {
		return rightLimit;
	}

	public void setRightLimit(int rightLimit) {
		this.rightLimit = rightLimit;
	}
}