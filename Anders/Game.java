import java.util.Scanner;

/*            case 1:        ///kanin op     
               // metode til at udregne afstanden mellem rabbit(x,y) og snake (x,y)
               // http://www.mathwarehouse.com/algebra/distance_formula/index.php 
               double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               
               rabbit.move(1,0);
               
               rabbit.getX();
               snake.getX();
               
               if(rabbit.x<snake.x){
               snake.move(-1,0);
               }
               else if (rabbit.x>snake.x){
               snake.move(1,0);
               }
               ++turns
               
               
               System.out.println("\n1: Move rabbit up");
               System.out.println("2: Move rabbit down");
               System.out.println("3: Move rabbit left");
               System.out.println("4: Move rabbit right");
               System.out.println("0: Give up");
               
               if (distb < 2){
                  System.out.println("\nThe Snake has caught the Rabbit! \n it took: "+turns+"turns\nPress 0 to continue");
               
               
               }else if(distb < 3){
                  System.out.println("NOOOOO, Please don't eat me");}
                  
               break;
                  

               case 2:        
               ///kanin ned     
               // metode til at udregne afstanden mellem rabbit(x,y) og snake (x,y)
               // http://www.mathwarehouse.com/algebra/distance_formula/index.php 
               double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               
               rabbit.move(-1,0);
               
               rabbit.getX();
               snake.getX();
               
               if(rabbit.x<snake.x){
               snake.move(-1,0);
               }
               else if (rabbit.x>snake.x){
               snake.move(1,0);
               }
               ++turns
               
               
               System.out.println("\n1: Move rabbit up");
               System.out.println("2: Move rabbit down");
               System.out.println("3: Move rabbit left");
               System.out.println("4: Move rabbit right");
               System.out.println("0: Give up");
               
               if (distb < 2){
                  System.out.println("\nThe Snake has caught the Rabbit! \n it took: "+turns+"turns\nPress 0 to continue");
               
               
               }else if(distb < 3){
                  System.out.println("NOOOOO, Please don't eat me");}
                  
               break;   

               case 3:        
               ///kanin venstre     
               // metode til at udregne afstanden mellem rabbit(x,y) og snake (x,y)
               // http://www.mathwarehouse.com/algebra/distance_formula/index.php 
               double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               
               rabbit.move(0,-1);
               
               rabbit.getY();
               snake.getY();
               
               if(rabbit.y<snake.y){
               snake.move(0,-1);
               }
               else if (rabbit.y>snake.y){
               snake.move(0,1);
               }
               ++turns
               
               
               System.out.println("\n1: Move rabbit up");
               System.out.println("2: Move rabbit down");
               System.out.println("3: Move rabbit left");
               System.out.println("4: Move rabbit right");
               System.out.println("0: Give up");
               
               if (distb < 2){
                  System.out.println("\nThe Snake has caught the Rabbit! \n it took: "+turns+"turns\nPress 0 to continue");
               
               
               }else if(distb < 3){
                  System.out.println("NOOOOO, Please don't eat me");}
                  
               break;
                  
               case 4:        
               ///kanin højre     
               // metode til at udregne afstanden mellem rabbit(x,y) og snake (x,y)
               // http://www.mathwarehouse.com/algebra/distance_formula/index.php 
               double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               
               rabbit.move(0,1);
               
               rabbit.getY();
               snake.getY();
               
               if(rabbit.y<snake.y){
               snake.move(0,-1);
               }
               else if (rabbit.y>snake.y){
               snake.move(0,1);
               }
               ++turns;
               
               
               
               System.out.println("\n1: Move rabbit up");
               System.out.println("2: Move rabbit down");
               System.out.println("3: Move rabbit left");
               System.out.println("4: Move rabbit right");
               System.out.println("0: Give up");
               
               if (distb < 2){
                  System.out.println("\nThe Snake has caught the Rabbit! \n it took: "+turns+"turns\nPress 0 to continue");
               
               
               }else if(distb < 3){
                  System.out.println("NOOOOO, Please don't eat me");}
                  
               break;


     */

public class Game{   
   public static void main(String[]args){
   
      // der laves en ny Rabbit og en ny Snake med følgende infomationer
      Rabbit rabbit1 = new Rabbit("Jacky", "American", "Blue", "Male", 2);
      Snake snake1 = new Snake("Jonny", "Anaconda", "Black", "Male", 4);
  
   
   // der laves et punkt der representere kaninen
      Point rabbit = new Point(0,0);
   // der laves et punkt der representere slangen
      Point snake = new Point(10,10);
      snake.sound = "evil";
      rabbit.sound = "nice";
      rabbit.name = "rabbit";
      snake.name = "snake";
      int turns = 0;
      
  }
}