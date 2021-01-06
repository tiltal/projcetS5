package affichage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import donneesDynamique.Captor;
import donneesDynamique.TempReelTableModel;



public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Captor captorTest1 = new Captor(getWarningString(), null, ABORT, getName(), null);
	Captor captorTest2 = new Captor(getWarningString(), null, ABORT, getName(), null);
	private JTabbedPane tabbedPane;
	private JScrollPane tempsReelPannel = new TempsReel(new TempReelTableModel(new ArrayList<Captor>((Arrays.asList(captorTest1, captorTest2)))));
	
	public MainFrame() {
		super("Projet S5");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new BorderLayout(0, 0));
		this.setBounds(100, 100, 800, 800);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.getContentPane().add(tabbedPane);
		
		tabbedPane.addTab("Temps reel", null, tempsReelPannel );
	}



public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() { 
			try {
				MainFrame window = new MainFrame();
				window.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}