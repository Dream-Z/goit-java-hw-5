package com.company.module5.task29;

class LevelLoaderTest {
  public static void main(String[] args) {
    //Level loaded
    try {
      new LevelLoader().load(new Level(10, 20));
    } catch (LevelTooBigException ex) {
      System.out.println("Level too big");
    }

    //Level too big
    try {
      new LevelLoader().load(new Level(10000, 2000));
    } catch (LevelTooBigException ex) {
      System.out.println("Level too big");
    }
  }
}
