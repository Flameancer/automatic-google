
import javax.swing.*;

public class testgui {
	private JFrame testframe;
	
	public testgui() {
		framebuild();
	}
	
	//Frame builder
	private void framebuild(){
		testframe = new JFrame("This is a test Frame");
		testframe.setSize(200, 200);
		testframe.setVisible(true);
		
	}
	//Main method
	public static void main(String args[]) {
		testgui  testgui = new testgui();
		
	}
	
}
