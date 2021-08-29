package launcher;

import entities.*;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
            		Student Ramiro = new Student(130551, "Navarro", "Ramiro Ezequiel", "navarroramiro14@gmail.com", "https://github.com/NavarroRamiro14", "/images/AMEL_0147.jpg");
            		SimplePresentationScreen frame = new SimplePresentationScreen(Ramiro);
            		frame.setVisible(true);;
            	}catch(Exception e) {e.printStackTrace();}
            }
        });
    }
}