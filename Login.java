import javax.swing.*;
import java.util.*;

public class Login {
  
public String duplUserEntry;
boolean accessGranted = false;
public Login  () {

JCanvas mainCanvas = new JCanvas();
JFrame a = new JFrame ("Prad-Base");
 a.setSize(1200,1000);
a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
 mainCanvas.setLayout(null);
JLabel username = new JLabel ("User");
username.setBounds(10, 200, 300, 10);
mainCanvas.add(username);

JTextField userEntry = new JTextField ();
userEntry.setBounds(15, 220, 75, 20);
mainCanvas.add(userEntry);

JLabel password = new JLabel("Password");
password.setBounds(10,300,300,10);
mainCanvas.add(password);

JTextField passwordEntry = new JTextField ();
passwordEntry.setBounds (15,320,75,20);
mainCanvas.add(passwordEntry);

JButton loginButton = new JButton ("Login");
loginButton.setBounds(10, 340, 100, 50);
loginButton.setEnabled(true);


mainCanvas.add(loginButton);
a.add(mainCanvas);
//setting up the login GUI


a.setVisible(true);


JEventQueue events = new JEventQueue();

events.listenTo(loginButton, "PUSHED");
duplUserEntry = userEntry.getText();



while(accessGranted == false){
  EventObject event = events.waitEvent();
  String whatHappened = JEventQueue.getName(event);

  if(whatHappened.equals("PUSHED")){
    // they clicked the loginButton
    String userValue = userEntry.getText();
    String pwValue = passwordEntry.getText();
    if(pwValue.equals("kronos") && userValue.equals(userEntry.getText())){
      a.dispose();
      accessGranted = true;
    }//wont grant access without correct password, username is modifiable, password is kronos, loops and waits for a correct entry to break out of loop



    
  }

}








}



public void wait(int time) {
    try {
      Thread.sleep(time);
    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }









}

