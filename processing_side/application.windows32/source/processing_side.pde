
import ddf.minim.*;
import processing.serial.*;

AudioPlayer player = null;
Minim minim;//audio context

Serial port; // Serial port

void setup() {
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




