import javax.swing.*;
import java.awt.*;
class SuperHero{
String name;
String power;
String weakness;
String alterEgo;
String names [] = new String [16];
String powers [] = new String [16];
String weaknesses [] = new String [16];
String alterEgos[] = new String [16];
String sHImage;
String aEImage;
// stats and arrays





public SuperHero (int whichOne ){
  String [] names = {"Superman", "Batman", "Aquaman", "The Flash","Spider-Man","Thor Odinson","Iron Man","Wonder Woman", "Ant-Man","Doctor Strange","The Incredible Hulk", "Wolverine","Martian Manhunter","Quicksilver","Dr Manhattan","Deadpool"};
  /*Info Taken from the fandom Wiki of each Super Hero and/or respective comic universe Wiki*/
  String [] powers = {
    "Super Strength, Super Speed, Super Durability, Enhanced Senses, Flight, Nigh-Invulnerability , Enhanced Vision , Heat Vision, Super/Frost Breath, Enhanced Mental Powers, Superhuman Healing Factor, Superhuman Longevity, Solar Radiation Absorption   " ,//SUPERMAN'S
     "Peak Human Condition , Master Martial Artist, Weapon Master, Expert Marksman, Master Acrobat, Master Spy, Expert of Disguise, Genius-level Intellect, Master Hacker, Expert Tracker, Multilinguist, Indomitable Will", //BATMAN's
     "Superhuman Strength, Superhuman Durability, Hybrid Amphbian-like Physiology, Superhuman Speed, Marine Telepathy, Hydrokinesis, High Intellect, Master Combatant",//AQUAMAN's
     "Conduit of the Speed Force, Superhuman Speed, Superhuman Reflexes, Superhuman Stamina, Superhuman Strength, Superhuman Durability, Accelerated Healing, Aerokinesis,Dimensional Travel, Light Projection, Energy Transformation, Accelerated Mental Processes, Enhanced Senses, Intangibility and Invisibilty, Time Travel",//THE Flash
     "Wall-Crawling, Superhuman Strength, Superhuman Speed, Superhuman Stamina, Superhuman Durability, Accelerated Healing, Enhanced Immune System, Spider-Sense (pre-cognition),Indomitable Will, Gifted Intellect ", //SPIDERMAN
     "Asgardian Physiology, Superhuman Strength, Superhuman Speed, Superhuman Stamina, Superhuman Durability, Superhuman Agility, Superhuman Longevity, Superhuman Healing Factor, Flight, Odinforce", //THOR
     "Super-Genius Intelligence, Master Engineer, Master Tactician, Skilled Combatant, Multilingual",//IRON MAN
     "Superhuman Strength, Superhuman Durability, Superhuman Speed, Flight, Superhuman Stamina, Superhuman Healing Factor, Superhuman Vision, Expert Lasso Wielder",  //WONDER WOMAN
     "Able to change the spaces in between atoms as well as in atoms (Pym Particles, Master Thief, Electrical Engineer",//ANT MAN
     "Sorcerer, Infinite Longevity, Fearlessness of Death, Energy Manipulation, Astral Projection, Banishment, Conjuration, Telekinesis, Flight, Illusionism, Intangibility, Time Manipulation, Teleportation, Dimensional Travel, Expert Strategist, Expert Surgeon, Expert Martial Artist",//DOCTOR STRANGE
     "Gamma Radiation Physiology, Potentially Limitless Strength, Superhuman Leaping, Superhuman Stamina, Enhanced Healing, Superhuman Immunity, Decelerated Aging/Nigh-Immortality, Superhuman Speed, Reactive Adaptation, Underwater Breathing, Telepathy Resistance, Gamma Emission/Manipulation, Super-Genius Intelligence (while human), Master Combatant", //THE HULK
     "Extreme Healing Factor, Nigh Total Immunity, Superhuman Senses, Increased Strength, Superhuman Stamina, Superhuman Reflexes, Bone/Adamantium Claws, Adamantium Skeleton, Covert Ops Expert, Master Tactician",//WOLVERINE
     "Martian Physiology, Shape-Shifting, Invisibility, Phasing, Superhuman Durability, Superhuman Strength, Superhuman Stamina, Enhanced Healing Factor, Immunity, Flight, Superhuman Speed, Longevity, Super-Breath, Telepathy, Matter Absorption ", //MARTIAN MANHUNTER  
     "Speed Physiology, Superhuman Speed, Superhuman Reflexes, Superhuman Durabilty, Superhuman Strength, Enhanced Reactivity, Self-Molecular Control",//QUICKSILVER
     "Nigh-Omnipotence, Nigh-Omniscience, Cosmic Awareness, Time Travel, Precognition, Nigh-Omnipresence, Bio-Fission, Bio-Fusion, Dimensional Travel, Telekinesis, Matter Control, Flight, Energy Manipulation, Immortality, Invulnerability, Absolute Molecular Control, Reality Alteration, Teleportation, Superhuman Strength ", //DR MANHATTAN
     "Wolverine Healing Factor (very fast), Immunity, Chemical Resistance, Nigh-Immortality, Telepathic Immunity, Superhuman Strength, Superhuman Durability, Peak Human Speed, Superhuman Stamina, Superhuman Reflexes, Master Martial Artist, Master Assassin, Unpredictabilty, Fourth-Wall Awareness",//DEADPOOL                  
                            };

  String [] weaknesses = {"Vulnerable to Magic, Vulnerable to Kryptonite, Vulnerable to red sun radition, Sensory Overload, Magic",//SUPERMAN 
  "Psychological Trauma, Unwilligness to Kill, Regular Human Physiology, Identity, Friends, Technology Reliance, Self Control, Dogs, Magic",//BATMAN
  "Dehydration",//AQUAMAN
  "Vulnerable to Dimensional Energy Bursts, Vulnerable to Extreme Temperatures, Vulnerable to EMP's, Negative Speed Force, Magic",//THE FLASH
  "Spider-Sense Disruption, Ethyl Chloride, Magic",//SPIDERMAN
  "Warrior's Madness, Magic",//THOR
  "Alcoholism, Regular Human Physiolgy",//IRON MAN
  "Lasso of Truth, Enhanced Poisons, Enhanced Hallucinogens, Aging, Naiveity, Magic",//WONDER WOMAN
  "Regular Human Physiology",//ANT-MAN
  "Regular Human Physiology, Astro-Limits, Magic",//DOCTOR STRANGE
  "Gamma Radiation Draining, Radiation Bombardment, Gas Inhalation, Adamantium/Vibranium Weapons, Toxic Substances, Rage Nullification, Magic",//THE HULK
  "Memory Issues, Sensory Overload, Adamantium Allotropes, Drowning, Magic",//WOLVERINE
  "Fire, Magic, Chochoholism",//MARTIAN MANHUNTER
  "Mental Illness, Magic",//QUICKSILVER
  "Mental Illness",//DR MANHATTAN
  "Mental Illness, Magic",//DEADPOOL
  };
  String [] alterEgos = {
  "Clark Kent",//SUPERMAN
  "Bruce Wayne",// BATMAN
  "Arthur Curry",//AQUAMAN
  "Barry Allen",//THE FLASH
  "Peter Parker",//SPIDERMAN
  "None",//THOR
  "Anthony Stark",//IRON MAN
  "Diana Prince", //WONDER WOMAN
  "Scott Lang",//ANTMAN
  "Stephen Strange",//DRSTRANGE
  "Bruce Banner",//HULK
  "James Howlett",//WOLVERINE
  "J'onn J'onzz",//MARTIANMANHUNTER
  "Pietro Maximoff",//QUICKSILVER
  "Jonathan Osterman",//DRMANHATTAN
  "Wade Wilson"//DEADPOOL 
  };                      






String [] superheroImageNames = {"superman.jpg","batman.png","aquaman.jpg","theflash.jpg", "spiderman.jpg", "thor.jpg","ironman.jpg","wonderwoman.jpg","antman.jpg","doctorstrange.jpg","hulk.jpg","wolverine.jpg","martianmanhunter.png","quicksilver.png","dr manhattan.png","deadpool.jpg" };

String [] alterEgoImageNames = {"clarkkent.jpg","brucewayne.jpg","arthurcurry,jpg","barryallen.png","peterparker.jpg",null,"tonystark.jpg","dianaprince.jpg","scottlang.jpg", null,"brucebanner.jpg","jameshowlett.jpg",null,null,"jonosterman.png", "wadewilson.jpg"};

// a whole bunch of arrays I wish I could have initialzed another more efficient way


this.name = names[whichOne];
this.power= powers[whichOne];
this.weakness = weaknesses[whichOne];
this.alterEgo = alterEgos[whichOne];
this.sHImage = superheroImageNames [whichOne];
this.aEImage = alterEgoImageNames [whichOne];
//setting some values for a certain object when a int parameter sent through to this class
  } 


public void createGUI (){
JFrame heroGUI = new JFrame (this.name);
heroGUI.setSize(1200,1200);



//method that creates info screen


JLabel nLabel= new JLabel (this.name);
JLabel pLabel=new JLabel("<html>"+this.power+"</html>");//so that JLabel is not cut off at the end, text continues at bottom
JLabel wLabel = new JLabel (this.weakness);
JLabel aELabel = new JLabel (this.alterEgo);

ImageIcon imageIcon = new ImageIcon(this.sHImage);
ImageIcon imageIcon2 = new ImageIcon (this.aEImage); // load the image to a imageIcon
Image image = imageIcon.getImage();
Image image2 = imageIcon2.getImage(); // 
Image newimg = image.getScaledInstance(500, 200,  java.awt.Image.SCALE_SMOOTH);
Image newimg2 = image2.getScaledInstance(500, 200,  java.awt.Image.SCALE_SMOOTH); //  200 max height for both, otherwise all text won't show
imageIcon = new ImageIcon(newimg); 
imageIcon2 = new ImageIcon(newimg2);  // transform it back


JLabel nameTitle = new JLabel ("NAME:");
JLabel powerTitle = new JLabel ("POWERS:");
JLabel weaknessTitle = new JLabel ("WEAKNESSES:");
JLabel alterEgoTitle = new JLabel ("ALTER EGO:");

JLabel heroImg = new JLabel(imageIcon);
JLabel aEImg = new JLabel (imageIcon2);
JBox heroInfoScreen=JBox.vbox(
                              JBox.hbox(heroImg,aEImg),
                              JBox.hbox(nameTitle,nLabel),
                              JBox.hbox (powerTitle,pLabel),
                              JBox.hbox(weaknessTitle,wLabel),
                              JBox.hbox(alterEgoTitle,aELabel)
                               );
                              JBox.setSize (nameTitle, 100,150);
JBox.setSize (nLabel, 1000,150);
JBox.setSize (powerTitle,100,400);
JBox.setSize (pLabel, 1000,400);
JBox.setSize (alterEgoTitle,100,100);
JBox.setSize (aELabel,500,100);//setting up some GUI layouts^^

heroGUI.add(heroInfoScreen);
heroGUI.pack();
heroGUI.setLocationRelativeTo(null);
heroGUI.setVisible(true);
//finishing touches






























}









  
}
















































