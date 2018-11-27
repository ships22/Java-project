import java.awt.event.*;
import javax.swing.*;

public class MonApllication {
	public static void main(String[] args) {
		MaFenetre f = new MaFenetre();
		f.afficher();
		f.afficher("Hello la promo ");
	}
}
class MaFenetre {
	JFrame mainFrame = null;
	public MaFenetre() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Mon application");
		mainFrame.addWindowListener(new WindowAdapter() {
			class MonAutreClass {
				public void afficher(String message) {
					System.out.println(message);
				}
			}
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
		mainFrame.setSize(620, 450);}
	public void afficher() {
		mainFrame.setVisible(true);
		JLabel label = new JLabel("Bienvenue dans ma première application");
		mainFrame.add(label);
	}
	public void afficher(String message) {
		System.out.println(message);
	}
}
			
	
		
	

