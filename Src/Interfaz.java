import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Interfaz extends JFrame {   
	private JTextArea processArea;
	public final JButton checkButton;
	public final JButton selectButton;
	public final JPanel contentPanel;
	public JPanel subPanel;
	public final JLabel dirLabel;
	public final JLabel processLabel;
	public JScrollPane pane;    
	public final JButton selectButtonArchivo;
	private static ArrayList<String> bd;
	private static String file;

}