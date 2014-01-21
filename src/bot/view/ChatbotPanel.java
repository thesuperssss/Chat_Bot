package bot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import bot.controller.ChatbotController;
import bot.model.Chatbot;

/**
 * 
 * @author jwil1446
 * @version 1.1 added setupPanel, setupLayout helper method.
 */
@SuppressWarnings("serial")
public class ChatbotPanel extends JPanel
{
	private ChatbotController baseController;
	private Chatbot appBot;
	private SpringLayout baseLayout;
	private JButton submitChatButton;
	private JTextField userTextField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private int clickCount;

	/**
	 * creates a chatbot panel with a linked chatbot controller object
	 * @param baseController the referenced controller
	 */
	public ChatbotPanel(ChatbotController baseController)
	{
		this.baseController = baseController;
		this.appBot = baseController.getAppBot();
		
		submitChatButton = new JButton("click here to type the chatbot");
		baseLayout = new SpringLayout();
		userTextField = new JTextField(30);
		chatArea = new JTextArea(10,30);		
		chatPane = new JScrollPane(chatArea);
		
		clickCount = 0;
		
		setupPanel();
		setupLayout();
		
		setupChat();
		setupListeners();
		
	}
	/**
	 * Starts the chatbot chat screen with a topic.
	 */
	private void setupChat()
	{
		chatArea.setText("	" + appBot.getRandomTopic());
	}
	
	/**
	 * loads all components into the panel and sets the layout manager and color.
	 */
	private void setupPanel()
	{
		
		 this.setLayout(baseLayout);		 
		 this.setBackground(Color.RED);
	
		 this.add(submitChatButton);		 
		 this.add(userTextField);		
		 this.add(chatPane);

		 		 
		 chatArea.setWrapStyleWord(true);
		 chatArea.setLineWrap(true);
	}
	/**
	 * creates listeners for all user interactive objects in the panel.
	 */
	private void setupListeners()
	{
		submitChatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				clickCount++;
				String userInput = userTextField.getText();
				if(clickCount % 7 == 0)
				{
					
					String currentPhrase =  baseController.dominateTheConversatoin();
					if(currentPhrase.length() != 0)
					{
					chatArea.append("\n" + currentPhrase);
					clickCount--;	
					}

				}
				else if(clickCount % 5 ==0)
				{
					chatArea.append(baseController.memeValidation(userInput));
				}
				else
				{

					chatArea.append("\n" + userInput);
					String processedInputer = baseController.processUserInput(userInput);
					chatArea.append(processedInputer);
					userTextField.setText("");
					userTextField.setToolTipText("type to the chatbot here");
					chatArea.append("\n    " + appBot.getRandomTopic()+"\n");
					// this should be a method in the controller
					String me, you, other;
					me = "Jacob";
					you = "Cody";
					other = "Grayson";
					chatArea.append(appBot.putNameInAlphabeticOrder(me, you, other));
				}
				
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}	
		});
	}
	
	/**
	 * places all objects with the computer generated code.
	 */
	private void setupLayout()
	{	
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 17, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, userTextField, -60, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitChatButton, 17, SpringLayout.SOUTH, userTextField);
		baseLayout.putConstraint(SpringLayout.WEST, userTextField, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitChatButton, 138, SpringLayout.WEST, this);
	}

}
