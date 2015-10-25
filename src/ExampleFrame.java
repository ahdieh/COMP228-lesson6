import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ExampleFrame extends JFrame {
// PRIVATE INSTANCE VARIABLES
	private JPanel _contentPanel;
    private EmptyBorder _myEmptyBoarder;
    private BorderLayout _myBorderLayout;
    private JLabel _firstLable;
	
	
// CONSTRUCTOR +++++++++++++++++++++++++++
	public ExampleFrame() {
		this._initialize();
	}


//PRIVATE METHOD
	private void _initialize() {
		this._myEmptyBoarder = new EmptyBorder(5, 5, 5, 5);
		this._myBorderLayout = new BorderLayout(0, 0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this._contentPanel = new JPanel();
		this._contentPanel.setBorder(this._myEmptyBoarder );
		setContentPane(this._contentPanel);
		_contentPanel.setLayout(this._myBorderLayout);
		
		this._firstLable = new JLabel("First Name:");
		this._contentPanel.add(this._firstLable , BorderLayout.NORTH);
	}

}
