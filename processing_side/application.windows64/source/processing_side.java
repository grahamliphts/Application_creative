import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 
import processing.serial.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class processing_side extends PApplet {





AudioPlayer player = null;
Minim minim;//audio context

Serial port; // Serial port

public void setup() {
  size(600, 250);
  background(255);
  stroke(0);
  noFill();  
  minim = new Minim(this);
  if(Serial.list().length > 0)
    port = new Serial(this, Serial.list()[0], 9600); 
   else
   println("no Serial found");
}




public void serialEvent(Serial port) {
  // Data from the Serial port is read in serialEvent() using the read() function and assigned to the global variable: val
  val = port.read();
  // For debugging
  println( "Raw Input:" + val);
  if (val == 5)
  {
    val = (int)random(1,5);   
    println("Randomise !!!!" + val);
  }
  if (val == 1)
  {
    if (player != null)
      player.close();
    if (Song_1_path != "")
    {
      player = minim.loadFile(Song_1_path);    
      player.play();
    }
    println("playing" + Song_1_path);
  }
  if (val == 2)
  {
    if (player != null)
      player.close();
    if (Song_2_path != "")
    {
      player = minim.loadFile(Song_2_path);    
      player.play();
    }
    println("playing" + Song_2_path);
  }
  if (val == 3)
  {
    if (player != null)
      player.close();
    if (Song_3_path != "")
    {
      player = minim.loadFile(Song_3_path);    
      player.play();
    }
    println("playing" + Song_3_path);
  }
  if (val == 4)
  {
    if (player != null)
      player.close();
    if (Song_4_path != "")
    {
      player = minim.loadFile(Song_4_path);    
      player.play();
    }
    println("playing" + Song_4_path);
  }
  

}

public void draw() {
  background(255);
  fill(255);

  if (mouseX>Song_1_button_x && mouseX <Song_1_button_x+Song_1_button_w &&
    mouseY>Song_1_button_y && mouseY <Song_1_button_y+Song_1_button_h) {
    //println("Song_1_button hover");
    fill(200);
  }
  rect(Song_1_button_x, Song_1_button_y, Song_1_button_w, Song_1_button_h);

  textSize(15);
  fill(0, 102, 153);
  text(Song_1_name, 120, 40); 
  textSize(25);
  text("Browse", 17, 45); 
  fill(255);

  if (mouseX>Song_2_button_x && mouseX <Song_2_button_x+Song_2_button_w &&
    mouseY>Song_2_button_y && mouseY <Song_2_button_y+Song_2_button_h) {
    // println("Song_2_button hover");
    fill(200);
  }
  rect(Song_2_button_x, Song_2_button_y, Song_2_button_w, Song_2_button_h);
  textSize(15);
  fill(0, 102, 153);
  text(Song_2_name, 120, 100); 
  textSize(25);
  text("Browse", 17, 105); 
  fill(255);

  if (mouseX>Song_3_button_x && mouseX <Song_3_button_x+Song_3_button_w &&
    mouseY>Song_3_button_y && mouseY <Song_3_button_y+Song_3_button_h) {
    fill(200);
  }
  rect(Song_3_button_x, Song_3_button_y, Song_3_button_w, Song_3_button_h);
  textSize(15);
  fill(0, 102, 153);
  text(Song_3_name, 120, 160); 
  textSize(25);
  text("Browse", 17, 165); 
  fill(255);

  if (mouseX>Song_4_button_x && mouseX <Song_4_button_x+Song_4_button_w &&
    mouseY>Song_4_button_y && mouseY <Song_4_button_y+Song_4_button_h) {
    fill(200);
  }
  rect(Song_4_button_x, Song_4_button_y, Song_4_button_w, Song_4_button_h);
  textSize(15);
  fill(0, 102, 153);
  text(Song_4_name, 120, 220); 
  textSize(25);
  text("Browse", 17, 225); 
  fill(255);

  if (mouseX>Song_1_play_button_x && mouseX <Song_1_play_button_x+Song_1_play_button_w &&
    mouseY>Song_1_play_button_y && mouseY <Song_1_play_button_y+Song_1_play_button_h)
    fill(200);
  rect(Song_1_play_button_x, Song_1_play_button_y, Song_1_play_button_w, Song_1_play_button_h);
  fill(0, 102, 153);
  textSize(25);
  text("Play", 515, 45); 
  fill(255);
  if (mouseX>Song_2_play_button_x && mouseX <Song_2_play_button_x+Song_2_play_button_w &&
    mouseY>Song_2_play_button_y && mouseY <Song_2_play_button_y+Song_2_play_button_h)
    fill(200);
  rect(Song_2_play_button_x, Song_2_play_button_y, Song_2_play_button_w, Song_2_play_button_h);
  fill(0, 102, 153);
  textSize(25);
  text("Play", 515, 105);
  fill(255);
  if (mouseX>Song_3_play_button_x && mouseX <Song_3_play_button_x+Song_3_play_button_w &&
    mouseY>Song_3_play_button_y && mouseY <Song_3_play_button_y+Song_3_play_button_h)
    fill(200);
  rect(Song_3_play_button_x, Song_3_play_button_y, Song_3_play_button_w, Song_3_play_button_h);
  fill(0, 102, 153);
  textSize(25);
  text("Play", 515, 165);
  fill(255);
  if (mouseX>Song_4_play_button_x && mouseX <Song_4_play_button_x+Song_4_play_button_w &&
    mouseY>Song_4_play_button_y && mouseY <Song_4_play_button_y+Song_4_play_button_h)
    fill(200);
  rect(Song_4_play_button_x, Song_4_play_button_y, Song_4_play_button_w, Song_4_play_button_h);
  fill(0, 102, 153);
  textSize(25);
  text("Play", 515, 225);
}


public void fileSelected_1(File selection) {
  if (selection == null) 
    println("Window was closed or the user hit cancel.");
  else
  {
    println("User selected " + selection.getAbsolutePath());
    Song_1_path = selection.getAbsolutePath();
    Song_1_name = selection.getName();
    println(Song_1_name);
  }
}
public void fileSelected_2(File selection) {
  if (selection == null) 
  {
    println("Window was closed or the user hit cancel.");
  } 
  else
  {
    println("User selected " + selection.getAbsolutePath());
    Song_2_path = selection.getAbsolutePath();
    Song_2_name = selection.getName();
    println(Song_2_name);
  }
}
public void fileSelected_3(File selection) {
  if (selection == null) 
  {
    println("Window was closed or the user hit cancel.");
  } else
    {
    println("User selected " + selection.getAbsolutePath());
    Song_3_path = selection.getAbsolutePath();
    Song_3_name = selection.getName();
    println(Song_3_name);
  }
}
public void fileSelected_4(File selection) {
  if (selection == null) 
  {
    println("Window was closed or the user hit cancel.");
  } else
    {
    println("User selected " + selection.getAbsolutePath());
    Song_4_path = selection.getAbsolutePath();
    Song_4_name = selection.getName();
    println(Song_4_name);
  }
}
public void mousePressed() {
  if (mouseX>Song_1_button_x && mouseX <Song_1_button_x+Song_1_button_w &&
    mouseY>Song_1_button_y && mouseY <Song_1_button_y+Song_1_button_h) {
    println("Song_1_button pressed");
    selectInput("Select a file to process:", "fileSelected_1");
  } else if (mouseX>Song_2_button_x && mouseX <Song_2_button_x+Song_2_button_w &&
    mouseY>Song_2_button_y && mouseY <Song_2_button_y+Song_2_button_h) {
    println("Song_2_button pressed");
    selectInput("Select a file to process:", "fileSelected_2");
  } else if (mouseX>Song_3_button_x && mouseX <Song_3_button_x+Song_3_button_w &&
    mouseY>Song_3_button_y && mouseY <Song_3_button_y+Song_3_button_h) {
    println("Song_3_button pressed");
    selectInput("Select a file to process:", "fileSelected_3");
  } else if (mouseX>Song_4_button_x && mouseX <Song_4_button_x+Song_4_button_w &&
    mouseY>Song_4_button_y && mouseY <Song_4_button_y+Song_4_button_h) {
    println("Song_4_button pressed");
    selectInput("Select a file to process:", "fileSelected_4");
  }

  //PLAY BUTTON EVENT *****DEBUG*****


  if (mouseX>Song_1_play_button_x && mouseX <Song_1_play_button_x+Song_1_play_button_w &&
    mouseY>Song_1_play_button_y && mouseY <Song_1_play_button_y+Song_1_play_button_h) {
    println("Song_1_play_button pressed");
    if (player != null)
      player.close();
    if (Song_1_path != "")
    {
      player = minim.loadFile(Song_1_path);    
      player.play();
    }
    println("playing" + Song_1_path);
  } else if (mouseX>Song_2_play_button_x && mouseX <Song_2_play_button_x+Song_2_play_button_w &&
    mouseY>Song_2_play_button_y && mouseY <Song_2_play_button_y+Song_2_play_button_h) {
    println("Song_2_play_button pressed");
    if (player != null)
      player.close();
    if (Song_2_path != "")
    {
      player = minim.loadFile(Song_2_path);
      player.play();
    }
    println("playing" + Song_2_path);
  } else if (mouseX>Song_3_play_button_x && mouseX <Song_3_play_button_x+Song_3_play_button_w &&
    mouseY>Song_3_play_button_y && mouseY <Song_3_play_button_y+Song_3_play_button_h) {
    println("Song_3_play_button pressed");
    if (player != null)
      player.close();
    if (Song_3_path != "")
    {
      player = minim.loadFile(Song_3_path);
      player.play();
    }
    println("playing" + Song_3_path);
  } else if (mouseX>Song_4_play_button_x && mouseX <Song_4_play_button_x+Song_4_play_button_w &&
    mouseY>Song_4_play_button_y && mouseY <Song_4_play_button_y+Song_4_play_button_h) {
    println("Song_4_play_button pressed");
    if (player != null)
      player.close();
    if (Song_4_path != "")
    {
      player = minim.loadFile(Song_4_path);
      player.play();
    }
    println("playing" + Song_4_path);
  }
}

// Song One button
float Song_1_button_x = 10;
float Song_1_button_y = 10;
float Song_1_button_w = 100;
float Song_1_button_h = 50;
// end of Song One button

// Song two button
float Song_2_button_x = 10;
float Song_2_button_y = 70;
float Song_2_button_w = 100;
float Song_2_button_h = 50;
// end of Song two button

// Song three button
float Song_3_button_x = 10;
float Song_3_button_y = 130;
float Song_3_button_w = 100;
float Song_3_button_h = 50;
// end of Song three button

// Song four button
float Song_4_button_x = 10;
float Song_4_button_y = 190;
float Song_4_button_w = 100;
float Song_4_button_h = 50;
// end of four One button

// Song one play button
float Song_1_play_button_x = 490;
float Song_1_play_button_y = 10;
float Song_1_play_button_w = 100;
float Song_1_play_button_h = 50;
// end of One play button

// Song two play button
float Song_2_play_button_x = 490;
float Song_2_play_button_y = 70;
float Song_2_play_button_w = 100;
float Song_2_play_button_h = 50;
// end of two play button

// Song three play button
float Song_3_play_button_x = 490;
float Song_3_play_button_y = 130;
float Song_3_play_button_w = 100;
float Song_3_play_button_h = 50;
// end of three play button

// Song fourplay  button
float Song_4_play_button_x = 490;
float Song_4_play_button_y = 190;
float Song_4_play_button_w = 100;
float Song_4_play_button_h = 50;
// end of four play button

//files names
String Song_1_name="";
String Song_2_name="";
String Song_3_name="";
String Song_4_name="";

//files path
String Song_1_path = "";
String Song_2_path = "";
String Song_3_path = "";
String Song_4_path = "";


//Random
int val = 0;
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "processing_side" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
