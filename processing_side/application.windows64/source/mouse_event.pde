void mousePressed() {
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

