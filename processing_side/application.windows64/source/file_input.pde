
void fileSelected_1(File selection) {
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
void fileSelected_2(File selection) {
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
void fileSelected_3(File selection) {
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
void fileSelected_4(File selection) {
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
