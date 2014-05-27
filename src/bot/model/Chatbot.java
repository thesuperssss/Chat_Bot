package bot.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import bot.model.Chatbot;

/**
 * Where everything happens
 * 
 * @author jwil1446 1.4 10/13/29 added .compareTo
 */
@SuppressWarnings("unused")
public class Chatbot
{

	private ArrayList<String> myMemes;
	/**
	 * Makes the array myMemes.
	 */
	private ArrayList<String> myVideogames;
	/**
	 * Makes the array myVideo games.
	 */
	private ArrayList<String> gen1;
	/**
	 * Makes the array gen1.
	 */
	private ArrayList<String> gen2;
	/**
	 * Makes the array gen2.
	 */
	private ArrayList<String> gen3;
	/**
	 * Makes the array gen3.
	 */
	private ArrayList<String> gen4;
	/**
	 * Makes the array gen4.
	 */
	private ArrayList<String> gen5;
	/**
	 * Makes the array gen5.
	 */
	private ArrayList<String> gen6;
	/**
	 * Makes the array gen6.
	 */
	private String firstPoke;
	/**
	 * Makes the String firstPoke.
	 */
	private String[] myRandomList;
	/**
	 * Makes the array myRandomList.
	 */
	private ArrayList<String> conversationList;

	/**
	 * adds variables and starts things
	 */
	public Chatbot()
	{
		conversationList = new ArrayList<String>();
		myMemes = new ArrayList<String>();
		myRandomList = new String[3];
		myVideogames = new ArrayList<String>();

		gen1 = new ArrayList<String>();
		gen2 = new ArrayList<String>();
		gen3 = new ArrayList<String>();
		gen4 = new ArrayList<String>();
		gen5 = new ArrayList<String>();
		gen6 = new ArrayList<String>();

		gen1List();
		gen2List();
		gen3List();
		gen4List();
		gen5List();
		gen6List();

		fillTheMemeList();
		fillTheRandomList();
		fillTheVideogameList();
		fillTheConversationPiece();
	}

	/**
	 * Helper method to full the myRansomList with String.
	 */
	private void fillTheRandomList()
	{
		myRandomList[0]=(" penguins");
		myRandomList[1]=(" I have to say something random?");
		myRandomList[2]=(" you don't want that?");
		myRandomList[3]=(" aklsjdfhklasdjhflkj");
	}

	/**
	 * the array for memes.
	 **/
	private void fillTheMemeList()
	{
		myMemes.add(" my jammies are rustled");
		myMemes.add(" cats");
		myMemes.add(" what does the fox say");
		myMemes.add(" philosoraptor");
		myMemes.add(" I am disapoint");
	}

	/**
	 * Method to retrieve a random value from the myRandomLIst.
	 * 
	 * @return The String value randomly selected from the list.
	 */
	public String getRandomTopic()
	{
		String randomTopic = "";
		double myRandomNumber = Math.random();
		int myRandomListPosition = (int) (myRandomNumber * myRandomList.size());
		randomTopic = myRandomList.get(myRandomListPosition);

		return randomTopic;
	}

	/**
	 * A method for checking memes.
	 * 
	 * @param currentPhrase
	 * @return
	 */
	public boolean memeChecker(String currentPhrase)
	{
		boolean isMeme = false;

		if (currentPhrase != null)
		{
			for (String currentMeme : myMemes)
			{
				if (currentPhrase.equalsIgnoreCase(currentMeme))
				{
					isMeme = true;
				}
			}
		}

		return isMeme;
	}

	/**
	 * the array for videogames.
	 */
	private void fillTheVideogameList()
	{
		myVideogames.add(" pokemon");
		myVideogames.add(" zelda");
		myVideogames.add(" legend of zelda");
		myVideogames.add(" mario");
		myVideogames.add(" call of duty");
		myVideogames.add(" final fantasy");
		myVideogames.add(" kingdom hearts");
		myVideogames.add(" warcraft");
	}

	/**
	 * gen1 array.
	 */

	private void gen1List()
	{
		gen1.add("bulbasaur");
		gen1.add("charmander");
		gen1.add("squirtle");
		gen1.add("pikachu");
	}

	/**
	 * gen2 array.
	 */
	private void gen2List()
	{
		gen2.add(" chikorita");
		gen2.add(" cyndaquil");
		gen2.add(" totodile");
	}

	/**
	 * gen3 array.
	 */
	private void gen3List()
	{
		gen3.add("treecko");
		gen3.add("torchic");
		gen3.add("mudkip");
	}

	/**
	 * gen4 array.
	 */
	private void gen4List()
	{
		gen4.add(" turtwig");
		gen4.add(" chimchar");
		gen4.add(" piplup");
	}

	/**
	 * gen5 array.
	 */

	private void gen5List()
	{
		gen5.add(" snivy");
		gen5.add(" tepig");
		gen5.add(" oshawoot");
	}

	/**
	 * gen6 array.
	 */
	private void gen6List()
	{
		gen6.add(" chespin");
		gen6.add(" fennekin");
		gen6.add(" froakie");

	}

	/**
	 * checks for video games.
	 * 
	 * @param currentPhrase
	 * @return
	 */

	public boolean videogameChecker(String currentPhrase)
	{
		boolean isGame = false;

		if (currentPhrase != null)
		{
			for (String currentGame : myVideogames)
			{
				if (currentPhrase.equalsIgnoreCase(currentGame))
				{
					isGame = true;
				}
			}
		}
		return isGame;
	}

	/**
	 * this is where the conversations about pokemon happens.
	 */
	public ArrayList<String> conversationPiece()
	{
		// String myFavPokemon;
		// String favType = "none";
		// int generation = 0;
		// myFavPokemon =
		// JOptionPane.showInputDialog("what is you favorite pokemon");
		//
		// conversationList.add("so your favorite pokemon is "+ myFavPokemon +
		// "/n"+ "that pokemon is a " + favType + "\n" +
		// "your first pokemon is " + firstPoke +"\n" + "it is from generation "
		// + generation);
		// conversationList.add("so your favorite pokemon is "+ myFavPokemon +
		// "/n"+ "that pokemon is a " + favType + "\n" +
		// "your first pokemon is " + firstPoke +"\n" +
		// "it is not a starter pokemon");
		// //3 lines of interaction with the user
		//
		// if (myFavPokemon.equalsIgnoreCase("pikachu"))
		// {
		// JOptionPane.showMessageDialog(null, "Seriously?");
		// System.exit(0);
		//
		// }
		// else
		// {
		// if (myFavPokemon.equalsIgnoreCase("eevee"))
		// {
		// JOptionPane.showMessageDialog(null, "That is mine too");
		// favType = "normal";
		//
		// }
		// else
		// {
		// favType = JOptionPane.showInputDialog("What type is that?");
		//
		// }
		//
		// }
		// firstPoke =
		// JOptionPane.showInputDialog("What was your first pokemon");
		//
		// if (firstPoke != null)
		// {
		// for (String currentGen : gen1)
		// {
		// if (firstPoke.equalsIgnoreCase(currentGen))
		// {
		// generation = 1;
		// }
		// }
		// }
		//
		// if (firstPoke != null)
		// {
		// for (String currentGen : gen2)
		// {
		// if (firstPoke.equalsIgnoreCase(currentGen))
		// {
		// generation = 2;
		// }
		// }
		// }
		//
		// if (firstPoke != null)
		// {
		// for (String currentGen : gen3)
		// {
		// if (firstPoke.equalsIgnoreCase(currentGen))
		// {
		// generation = 3;
		// }
		// }
		// }
		//
		// if (firstPoke != null)
		// {
		// for (String currentGen : gen4)
		// {
		// if (firstPoke.equalsIgnoreCase(currentGen))
		// {
		// generation = 4;
		// }
		// }
		// }
		//
		// if (firstPoke != null)
		// {
		// for (String currentGen : gen5)
		// {
		// if (firstPoke.equalsIgnoreCase(currentGen))
		// {
		// generation = 5;
		// }
		// }
		// }
		//
		// if (firstPoke != null)
		// {
		// for (String currentGen : gen6)
		// {
		// if (firstPoke.equalsIgnoreCase(currentGen))
		// {
		// generation = 6;
		// }
		// }
		// }
		// if (generation == 1)
		// {
		// JOptionPane.showMessageDialog(null,
		// "Cool you started in the 1 generation");
		// }
		//
		// else if (generation == 2)
		// {
		// JOptionPane.showMessageDialog(null,
		// "cool you stared in the 2 generation");
		// }
		//
		// else if (generation == 3)
		// {
		// JOptionPane.showMessageDialog(null,
		// "cool you started in the 3 generation");
		// }
		// else if (generation == 4)
		// {
		// JOptionPane.showMessageDialog(null,
		// "cool you started in the 4 generation, I did too");
		// }
		//
		// else if (generation == 5)
		// {
		// JOptionPane.showMessageDialog(null,
		// "cool you started in the 5 generation");
		// }
		//
		// else if (generation == 6)
		// {
		// JOptionPane.showMessageDialog(null,
		// "cool you started in the 6 generation");
		// }
		// else
		// {
		// JOptionPane.showMessageDialog(null,
		// "so your first pokemon was not a starter");
		// }
		// if(generation > 0)
		// {
		// JOptionPane.showMessageDialog(null, "so your favorite pokemon is "+
		// myFavPokemon + "/n"+ "that pokemon is a " + favType + "\n" +
		// "your first pokemon is " + firstPoke +"\n" + "it is from generation "
		// + generation);
		// }
		// else
		// {
		// JOptionPane.showMessageDialog(null, "so your favorite pokemon is "+
		// myFavPokemon + "/n"+ "that pokemon is a " + favType + "\n" +
		// "your first pokemon is " + firstPoke +"\n" +
		// "it is not a starter pokemon");
		// }
		return conversationList;
	}

	/**
	 * Checks if someone says boo.
	 * 
	 * @param current
	 * @return
	 */

	public String usesContent(String current)
	{
		String processedString = "";
		if (current.contains("boo"))
		{
			processedString = "woo scary";
		}
		else
		{
			processedString = "boooooring";
		}
		return processedString;
	}

	/**
	 * Puts your full name in alphabetical order.
	 * 
	 * @param first
	 * @param middle
	 * @param last
	 * @return
	 */
	public String putNameInAlphabeticOrder(String first, String middle, String last)
	{
		String sortedName = "";
		if (first.compareTo(middle) < 0)
		{
			if (first.compareTo(last) < 0)
			{
				if (middle.compareTo(last) < 0)
				{
					sortedName = first + ", " + middle + ", " + last;
				}
				else
				{
					sortedName = first + ", " + last + ", " + middle;
				}
			}
			else
			{
				sortedName = last + ", " + first + ", " + middle;
			}
		}
		else
		{
			if (middle.compareTo(last) < 0)
			{
				if (first.compareTo(last) < 0)
				{
					sortedName = middle + ", " + last + ", " + first;
				}
				else
				{
					sortedName = middle + ", " + first + ", " + last;
				}
			}
			else
			{
				sortedName = last + ", " + middle + ", " + first;
			}

		}

		return sortedName;

	}

	public void fillTheConversationPiece()
	{

		conversationList.add("What is you favorite pokemon.");
		conversationList.add("Seriously?");
		conversationList.add("That is mine too.");
		conversationList.add("What type is that?");
		conversationList.add("What was your first pokemon.");
		conversationList.add("Cool you started in the 1 generation.");
		conversationList.add("Cool you started in the 2 generation.");
		conversationList.add("Cool you started in the 3 generation.");
		conversationList.add("Cool you started in the 4 generation, so did I.");
		conversationList.add("Cool you started in the 5 generation.");
		conversationList.add("Cool you started in the 6 generation.");
		conversationList.add("So your first pokemon was not a starter.");
	}

}
