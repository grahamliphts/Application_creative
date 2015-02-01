void draw() {
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

