import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Game {

	public static void main(String[] args) {
		createGUI();
		showKeyboard();
	}

	private static void showKeyboard() {
		 JFrame frame = new JFrame("DrawRect");
		
	}

	public static void createGUI(){
		JFrame frame = new JFrame("The New Typing Tutor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1500, 1000);
		frame.setResizable(false);
		frame.setVisible(true);
		//Where the GUI is created:
		JMenuBar menuBar;
		JMenu menu, submenu;
		JMenuItem menuItem;
		//JRadioButtonMenuItem rbMenuItem;
		//JCheckBoxMenuItem cbMenuItem;

		//Create the menu bar.
		menuBar = new JMenuBar();

		//Build the first menu.
		menu = new JMenu("Options");
		menu.setMnemonic(KeyEvent.VK_ALT);
		menu.getAccessibleContext().setAccessibleDescription("Options");
		menuBar.add(menu);

		//add things
		JMenuItem item = new JMenuItem("Logout");
		menu.add(item);
		item = new JMenuItem("Difficulty");
		menu.add(item);
		item = new JMenuItem("Dictionary Menu");
		menu.add(item);

		//change language
		menu = new JMenu("Languages");
		menu.getAccessibleContext().setAccessibleDescription("Languages");
		menuBar.add(menu);

		//add langs
		JMenuItem language = new JMenuItem("Colemak");
		menu.add(language);

		language = new JMenuItem("Dvorak");
		menu.add(language);

		language = new JMenuItem("Qwerty");
		menu.add(language);


		//add menuBar
		frame.setJMenuBar(menuBar);
		menuBar.setVisible(true);
	}
}
