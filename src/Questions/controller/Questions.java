package Questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions

{

	private Scanner myScanner;

	public Questions()

	{

		myScanner = new Scanner(System.in);

	}

	public void start()

	{
		
		System.out.println(230/100%10);

	//	askQuestionsGUI();

	}

	@SuppressWarnings("unused")
	private void askQuestions()

	{

		System.out.println("What would you like for breakfast?");

		String answer = myScanner.next();

		System.out.println("Wow, " + answer + " sounds like a good breakfast!");

	}

	private void askQuestionsGUI()

	{

		String myAnswer = JOptionPane.showInputDialog(null, "What do you want for breakfast?");

		myAnswer = JOptionPane.showInputDialog(null, "oh is that so? I do not think that " + myAnswer + " is a good choice.");

		String myAnswer1 = JOptionPane.showInputDialog(null, "what do you like to do in your free time?");

		myAnswer1 = JOptionPane.showInputDialog(null, "Oh really? I really like to " + myAnswer1 + " also!");

		String myAnswer2 = JOptionPane.showInputDialog(null, "How do you like doing that?");

		myAnswer1 = JOptionPane.showInputDialog(null, "that is so cool, I like doing that too! " + myAnswer2 + " is there anything else you like doing?");

	}

}
