import java.util.Scanner;
public class Game{   
   public static void main(String[]args){
   
   
      // der laves en ny Rabbit og en ny Snake med følgende infomationer
      Point rabbit = new Point(0,0,"rabbit","nice","Jacky", "American", "Blue", "Male", 2);
      Point snake = new Point(10,10,"snake","evil","Jonny", "Anaconda", "Black", "Male", 4);  
      int turns = 0;
      int fejl = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to group 5000's Little Animal Horror Zoo");
      System.out.println("Your goal is to avoid the snake for 15 turns");
      System.out.println("To control the rabbit, choose one of the  following commands");
      menuPrompt();
      
   // anti Jarl, således at Jarl ikke ødelægger vores code ....
      while (!input.hasNextInt()) {
      input.next();
      System.out.println("Not an integer; try again.\nNice try Jarl..");
      }
     

      int choice;
      do 
      {
         choice = input.nextInt();
         
         switch(choice){
            
            case 1:        ///kanin op     
               rabbit.move(1,0);
               
               rabbit.getX();
               snake.getX();
               if((rabbit.x-snake.x)<1){
               snake.move(-1,0);
               }
               else if ((rabbit.x-snake.x)>-1){
               snake.move(1,0);
               }
               ++turns;
               break;
                  

            case 2:        /// kanin ned
               rabbit.move(-1,0);
               
               rabbit.getX();
               snake.getX();
               if((rabbit.x-snake.x)<1){
               snake.move(-1,0);
               }
               else if ((rabbit.x-snake.x)>-1){
               snake.move(1,0);
               }
               ++turns;               
               break;   

            case 3:     /// kanin venstre   
               rabbit.move(0,-1);
               
               rabbit.getY();
               snake.getY();
               if((rabbit.y-snake.y)<1){
               snake.move(0,-1);
               }
               else if ((rabbit.y-snake.y)>-1){
               snake.move(0,1);
               }               
               break;
                  
            case 4:        
               ///kanin højre                 
               rabbit.move(0,1);
               
               rabbit.getY();
               snake.getY();
               if((rabbit.y-snake.y)<1){
               snake.move(0,-1);
               }
               else if ((rabbit.y-snake.y)>-1){
               snake.move(0,1);
               }
               ++turns;        
               break;
               
            case 5:
               rabbit.printAInfo();
               System.out.println("7: Back to main menu");
               break;
            case 6:
               snake.printAInfo();
               System.out.println("7: Back to main menu");
               break;
            case 7:
               menuPrompt();
               break;
            case 0:
               System.out.println("You have given up\nThank you for playing.");
               break;
               
            default : 
               System.out.println("Group 5000 those not recognize your input, try again..");
               ++fejl;
               if(fejl > 1){
               System.out.println("Are you doing this on purpose?!");
               }
               break;
            
            
         }
               // metode til at udregne afstanden mellem rabbit(x,y) og snake (x,y)
               // http://www.mathwarehouse.com/algebra/distance_formula/index.php 
               double dist = Math.sqrt(((snake.x - rabbit.x)*(snake.x - rabbit.x))+ ((snake.y - rabbit.y)*(snake.y-rabbit.y)));
               
               if (turns==15){
                  System.out.println("Congratulations, you avoided the snake for 15 turns\nGroup 5000 salutes you");
                  choice = 0;   
                  }
               
               if (dist < 2){
                  System.out.println("\nSnake: \"Aahhhhrrrr i'm eating you!\"\nThe Snake has caught the Rabbit!\nIt took: "+turns+" turns.\nBetter luck next time.."); 
                  choice = 0;  
                  }else if(dist < 3){
                  System.out.println("Rabbit: \"NOOOOO, Please don't eat me\"");
                  } 
      }while(choice !=0); 
   }
  public static void menuPrompt()
  {
               System.out.println("\n1: Move rabbit up");
               System.out.println("2: Move rabbit down");
               System.out.println("3: Move rabbit left");
               System.out.println("4: Move rabbit right");
               System.out.println("5: Tell me about the rabbit");
               System.out.println("6: Tell me about the snake");
               System.out.println("0: Give up");
  }
  
}