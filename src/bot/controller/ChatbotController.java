package bot.controller;

import java.util.ArrayList;

import bot.model.Chatbot;
import bot.view.ChatbotFrame;
import bot.view.ChatbotView;

/**
 * 
 * @author jwil1446
 * @version 1.5 adding made to the project. Added getter for the chatbot.
 *          Removed the references to the popup view. added documentation. added
 *          conversation helper and memeCalidation
 */

@SuppressWarnings("unused")
public class ChatbotController
{

	/**
	 * the application frame for the Chatbot program.
	 */
	private ChatbotFrame appFrame;
	/**
	 * the main chatbot for the application.
	 */
	private Chatbot appBot;

	/**
	 * creates a chatbot controller and initializes the chatbot model instance.
	 */
	public ChatbotController()
	{
		// appView = new ChatbotView();
		appBot = new Chatbot();

	}

	/**
	 * getter method for the chatbot instance.
	 * 
	 * @return the chatbot for the application
	 */

	public Chatbot getAppBot()
	{
		return appBot;
	}

	/**
	 * initializes the chatbotFrame for the GUI.
	 */
	public void start()
	{
		// appView.showApp();
		appFrame = new ChatbotFrame(this);
	}

	public String memeValidation(String currentInput)
	{
		String memeReaction = "\n" + "Why aren't you talking about the memes?";
		if (appBot.memeChecker(currentInput))
		{
			memeReaction = currentInput + " is the coolest meme huh";
		}
		return memeReaction;
	}

	/**
	 * checks if the users inputs memes, videogames, or pokemon.
	 * 
	 * @param currentInput
	 * @return
	 */
	public String processUserInput(String currentInput)
	{
		String response = "";

		if (appBot.memeChecker(currentInput))
		{
			response = "memes!!!!";
		}
		else if (appBot.videogameChecker(currentInput))
		{
			response = "That's a video game";
		}
		// else if(Chatbot.pokemonQuestions())
		return response;

	}

	private String conversationHelper(ArrayList<String> currentList)
	{
		String currentPhrase = "";
		if (currentList.size() > 0)
		{
			currentPhrase = currentList.remove(0);
		}

		return currentPhrase;
	}

	public String dominateTheConversatoin()
	{
		String currentConversationPiece = "";

		currentConversationPiece = conversationHelper(appBot.conversationPiece());

		return currentConversationPiece;
	}

}
