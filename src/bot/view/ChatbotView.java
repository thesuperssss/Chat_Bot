package bot.view;

import javax.swing.JOptionPane;

import bot.model.Chatbot;

/**
 * GUI View for the Chat project
 * 
 * @author Jacob Wilson
 * @versioin 1.3 10\13\13
 */

public class ChatbotView
{
	/**
	 * Chatbot used for internal chat methods
	 */

	private Chatbot myChatbot;

	public ChatbotView()
	{
		myChatbot = new Chatbot();
	}

	/**
	 * It shows the app and processes user input.
	 */

	public void showApp()
	{
		String input = "keep going";

		while (input == null || !input.equals("no"))
		{
			input = getInput();
			useInput(input);
			if(input.equalsIgnoreCase("pokemon"))
			{
			myChatbot.conversationPiece();
			}
			JOptionPane.showMessageDialog(null, "lets talk about " + myChatbot.getRandomTopic());
		}

	}

	/**
	 * Captures the users input based on a question.
	 * 
	 * @return the input
	 */
	private String getInput()
	{
		String input = "";

		input = JOptionPane.showInputDialog("what would you like to talk to me about?");

		return input;
	}

	/**
	 * This method checks for arrays.
	 * 
	 * @param userInput
	 */
	private void useInput(String userInput)
	{
		if (myChatbot.memeChecker(userInput))
		{
			JOptionPane.showMessageDialog(null, "I knew that " + userInput + " is a meme!!!");
		}

		if (myChatbot.videogameChecker(userInput))
		{
			JOptionPane.showMessageDialog(null, "I have have played " + userInput);
		}

		JOptionPane.showMessageDialog(null, "Wow that is so interesting that you want to talk with me about " + userInput);
	}

}
