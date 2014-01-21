package bot.view;

import javax.swing.JFrame;

import bot.controller.ChatbotController;

@SuppressWarnings("serial")
public class ChatbotFrame extends JFrame
{
	@SuppressWarnings("unused")
	private ChatbotController baseController;
	private ChatbotPanel basePanel;
	
	public ChatbotFrame(ChatbotController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatbotPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setVisible(true);
		
	}
}
