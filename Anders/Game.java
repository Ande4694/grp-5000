import java.util.Scanner;

/*            case 1:        ///kanin op     
               // metode til at udregne afstanden mellem rabbit(x,y) og snake (x,y)
               // http://www.mathwarehouse.com/algebra/distance_formula/index.php 
               // double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               
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
               // double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               
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
               // double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               
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
               // double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               
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
      double distb = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
      snake.sound = "evil";
      rabbit.sound = "nice";
      rabbit.name = "rabbit";
      snake.name = "snake";
      int turns = 0;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to group 5000's Little Animal Horror Zoo");
      System.out.println("Your goal is to avoid the snake for 16 turns");
      System.out.println("To control the rabbit, choose one of the  following commands");
      menuPrompt();
      
      int choice;
      do 
      {
         choice = input.nextInt();
         menuPrompt();
      }while(choice !=0); /* || turns<16 || distb < 2)  // turns // 0 give up // distb < 2    */
      System.out.println("Thank you for playing");
  }
  private static void menuPrompt()
  {
               System.out.println("\n1: Move rabbit up");
               System.out.println("2: Move rabbit down");
               System.out.println("3: Move rabbit left");
               System.out.println("4: Move rabbit right");
               System.out.println("0: Give up");
  }
}