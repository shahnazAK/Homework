package hw2JavaVariablesInitialized;

public class AboutMe {
	//
	public String myCity;// Variable Declared

//Now initializing string,INT,float,Fchar and boolean type variables to define myself
	public String myName = "Shahnaz";
	public int myAge = 95;
	public float myHeight = 5.42339f;
	public char myGender = 'F';
	public boolean fullTimeStudent = true;

//Declare a default constructor
	public AboutMe() {
		System.out.println("......This is all about Myself......");
	}

//Implement a void type method
	public void aboutMe() {
		System.out.println("MyName:" + myName + "\nMy Age:" + myAge + "\nMy Height:" + myHeight + "\nMy Gender:"
				+ myGender + "\nI am a full time student:" + fullTimeStudent);
	}

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // instantiate AboutMe/default constructor initialized
		aboutMe.aboutMe(); // Method initializes

	}

	// TODO Auto-generated method stub

}
