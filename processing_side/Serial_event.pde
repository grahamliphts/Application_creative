void serialEvent(Serial port) {
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

