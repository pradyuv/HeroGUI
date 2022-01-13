  import javax.swing.*;
  import java.awt.*;
  import java.util.EventObject;
 
class HeroSelection {


 String[] jButtonName;
 SuperHero[] namesForJButton = new SuperHero[16];
 JButton[] superheroButtons = new JButton[16];


 public HeroSelection() {
  JFrame heroSelectionFrame = new JFrame("CHOOSE YOUR CHARACTER");
  JCanvas heroSelectionMenu = new JCanvas();


  JLabel welcome = new JLabel("Welcome to Prad-Base. We are not responsible for what you do with this information.");
//intro text


  heroSelectionFrame.setSize(1200, 800);

  heroSelectionFrame.add(welcome);
  heroSelectionFrame.setVisible(true);
  try {
   Thread.sleep(5000);
  } catch (InterruptedException ex) {
   Thread.currentThread().interrupt();
  }


  heroSelectionFrame.remove(welcome); //setting a time delay for appear and disappear of welcome JLabel


  ImageIcon[] superheroIcons = new ImageIcon[16];
  superheroIcons[0] = new ImageIcon("superman.jpg");
  superheroIcons[1] = new ImageIcon("batman.png");
  superheroIcons[2] = new ImageIcon("aquaman.jpg");
  superheroIcons[3] = new ImageIcon("theflash.jpg");
  superheroIcons[4] = new ImageIcon("spiderman.jpg");
  superheroIcons[5] = new ImageIcon("thor.jpg");
  superheroIcons[6] = new ImageIcon("ironman.jpg");
  superheroIcons[7] = new ImageIcon("wonderwoman.jpg");
  superheroIcons[8] = new ImageIcon("antman.jpg");
  superheroIcons[9] = new ImageIcon("doctorstrange.jpg");
  superheroIcons[10] = new ImageIcon("hulk.jpg");
  superheroIcons[11] = new ImageIcon("wolverine.jpg");
  superheroIcons[12] = new ImageIcon("martianmanhunter.png");
  superheroIcons[13] = new ImageIcon("quicksilver.png");
  superheroIcons[15] = new ImageIcon("deadpool.jpg");
  superheroIcons[14] = new ImageIcon("dr manhattan.png");
//could have made an instance type method to call upon a specific ImageIcon like in SuperHero class but chose to use the Space in memory in tangent with below for loop(s) to create an array of objects and buttons, could not for loop due to file path having to be inputted

  for (int i = 0; i < 16; i++) {

   Image image = superheroIcons[i].getImage(); // transform it
   Image newimg = image.getScaledInstance(200, 60, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
   superheroIcons[i] = new ImageIcon(newimg);  // transform it back
  }

  for (int i = 0; i < 16; i++) {
   namesForJButton[i] = new SuperHero(i);
   superheroButtons[i] = new JButton(namesForJButton[i].name, superheroIcons[i]);
   superheroButtons[i].setEnabled(true);
  } //proud of this, created an array of objects and buttons to make it much easier instead of manual typing


  JBox menuLayout = JBox.vbox(JBox.hbox(superheroButtons[0], superheroButtons[1], superheroButtons[2]), JBox.hbox(superheroButtons[3], superheroButtons[4], superheroButtons[5]), JBox.hbox(superheroButtons[6], superheroButtons[7], superheroButtons[8]), JBox.hbox(superheroButtons[9], superheroButtons[10], superheroButtons[11]), JBox.hbox(superheroButtons[13]), JBox.hbox(superheroButtons[12], superheroButtons[14], superheroButtons[15]));//setting a layout for our buttons, would have liked to for loop this, but didn't for now

  heroSelectionFrame.setVisible(false);
  heroSelectionFrame.add(menuLayout);
  heroSelectionFrame.setVisible(true);


  JEventQueue heroSelect = new JEventQueue();

  for (int i = 0; i < 16; i++) {
   heroSelect.listenTo(superheroButtons[i], namesForJButton[i].name);
  } //for loop to listen to all button actions


  heroSelectionMenu.add(menuLayout);
  heroSelectionFrame.add(heroSelectionMenu);

  heroSelectionFrame.setVisible(true);


  while (true) {
   EventObject theHeroButtonSelection = heroSelect.waitEvent();
   String theButtonChoice = JEventQueue.getName(theHeroButtonSelection);
//running waitEvents when listening to buttons


   switch (theButtonChoice) {
    case "Superman":
     namesForJButton[0].createGUI();
     break;

    case "Batman":
     namesForJButton[1].createGUI();
     break;

    case "Aquaman":
     namesForJButton[2].createGUI();
     break;

    case "The Flash":
     namesForJButton[3].createGUI();
     break;

    case "Spider-Man":
     namesForJButton[4].createGUI();
     break;

    case "Thor Odinson":
     namesForJButton[5].createGUI();
     break;

    case "Iron Man":
     namesForJButton[6].createGUI();
     break;

    case "Wonder Woman":
     namesForJButton[7].createGUI();
     break;

    case "Ant-Man":
     namesForJButton[8].createGUI();
     break;

    case "Doctor Strange":
     namesForJButton[9].createGUI();
     break;

    case "The Incredible Hulk":
     namesForJButton[10].createGUI();
     break;

    case "Wolverine":
     namesForJButton[11].createGUI();
     break;

    case "Martian Manhunter":
     namesForJButton[12].createGUI();
     break;


    case "Quicksilver":
     namesForJButton[13].createGUI();
     break;

    case "Dr Manhattan":
     namesForJButton[14].createGUI();
     break;

    case "Deadpool":
     namesForJButton[15].createGUI();
     break;

   }
  }
 }
}










