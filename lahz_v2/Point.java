// der oprettes en class "Point" med en x og y variable
public class Point{
   int x;
   int y;
   String name;
   String sound;
   String name2;
   String species;
   String color;
   String sex;
   int age;
   
   
   public void printAInfo(){
      System.out.println("Name:      " + name2);
      System.out.println("Species:   " + species);
      System.out.println("Color:     " + color);
      System.out.println("Sex:       " + sex);
      System.out.println("Age:       " + age + "\n");
   }
   
   // constructor til at deffinere start punkt
   public Point(int startx, int starty, String name, String sound, String name2, String species, String color, String sex, int age){
      x = startx;
      y = starty;
      this.name = name;
      this.sound = sound;
      this.name2= name2;
      this.species = species;
      this.color = color;
      this.sex = sex;
      this.age = age;    
   }   
   
   // metode til at ændre x og y, med given værdi.
   // samt at fortælle kaninens x og y.
   public void move(int dx, int dy){
      this.x += dx;
      this.y += dy;   
      System.out.println("I am the "+sound+" "+name+", I am now standing on "+x+","+y);
   } 
   
   public int getX(){
      return x;
   } 
   
   public int getY(){
      return y;
   }
   
   public void setName(String name){
      this.name=name;
   }
   
   public void setSound(String sound){
      this.sound=sound;
   }
}