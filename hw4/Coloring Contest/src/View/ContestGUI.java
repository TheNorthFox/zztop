package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ContestGUI extends JFrame implements Observer, PropertyChangeListener{
	
	// Constants
	
	/** Frame size when removed from full screen. */
	private static final Dimension FRAME_SIZE = new Dimension(800, 600);
	
	// Fields
	
	/** Welcome screen panel. */
	private final WelcomePanel myWelcomePanel;
	
	/**
	 * Constructs the coloring contest GUI
	 */
	public ContestGUI(final WelcomePanel theWelcomePanel) {
		// empty constructor
		super("Coloring Contest");
		myWelcomePanel = theWelcomePanel;
	}
	
	/**
	 * Displays the GUI
	 */
	public void start() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setSize(FRAME_SIZE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(myWelcomePanel, BorderLayout.NORTH);
		setVisible(true);
		JOptionPane.showMessageDialog(this, "Hello there!\n\n"
				+ "Jared Herdlevar, Nick Dantche, Jeff Lytle, Jake Nasanov, and Zach Martinez");
	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}