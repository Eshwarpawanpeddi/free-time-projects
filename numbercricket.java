package numbercricket;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//System.out.println();

@SuppressWarnings("unused")
public class Main {
  // function is used to check if the player or computer is out
  public static boolean check_out(int a, int b) {
    if (a == b)
    {
      //System.out.println("OUT!!!");
        JOptionPane.showMessageDialog(null,"OUT!!!" , "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
      return true;
    } 
    else
    {
    return false;
    }
  }
  // initially used ... for checking if it is odd or even
  public static int toss(String bruh) {
    if (bruh.equals("odd")) {
      return 1;
    } else if (bruh.equals("even")) {
      return 2;
    } else {
      return 3;
    }

  }

  public static boolean check_win(int run1, int run2) {
    if (run1 <= run2) {
      return true;
    } else {
      return false;
    }
  }

  // main function
  public static void main(String[] args) {
    // String[] comments = {"THATS A RUN OUT","WHAT A CATCH!!"};
    int uscore = 0, cscore = 0;
    int scenario = 0;
    int l = 0, m = 0, w = 0, h = 0, z = 0, q = 0, e1 = 0,e2 = 0,e3 = 0,e4 = 0,e5 = 0,e6 = 0,e7 = 0;
    String j;
    JFrame frame1 = new JFrame();
    Object[] posopt = new Object[6];
    posopt[0] = 1;
    posopt[1] = 2;
    posopt[2] = 3;
    posopt[3] = 4;
    posopt[4] = 5;
    posopt[5] = 6;
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    String[] ooe = { "odd", "even" };
    String[] bob = { "bat", "ball" };// array for when the computer has to choose to bat or ball
    String pname = JOptionPane.showInputDialog(null, "HELLO PLAYER PLEASE ENTER YOUR NAME!!", "HAND CRICKET",      JOptionPane.PLAIN_MESSAGE);
    JOptionPane.showMessageDialog(null, "Welcome " + pname + " to HAND CRICKET", "HAND CRICKET",
        JOptionPane.PLAIN_MESSAGE);
    JFrame frame = new JFrame();
    String[] options = new String[2];
    options[0] = "odd";
    options[1] = "even";
    int b = JOptionPane.showOptionDialog(frame.getContentPane(), "Odd or Even?", "HAND CRICKET", 0,
        JOptionPane.INFORMATION_MESSAGE, null, options, null);
    String ore;
    if (b == 0) {
      ore = "odd";
    } else {
      ore = "even";
    }
    // System.out.println("Your move:");
    //JOptionPane.showMessageDialog(null, "Current score: " + uscore, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
    int x;
    // int a = s.nextInt();// user input for a number from 1 to 6
    x = JOptionPane.showOptionDialog(frame1.getContentPane(), "YOUR MOVE:", "HAND CRICKET", 0, JOptionPane.INFORMATION_MESSAGE, null, posopt, null);
    // s.nextLine();
    int a = 0;
    if (x == 0)
      a = 1;
    else if (x == 1)
      a = 2;
    else if (x == 2)
      a = 3;
    else if (x == 3)
      a = 4;
    else if (x == 4)
      a = 5;
    else if (x == 5)
      a = 6;
    if (a > 6) {
      // System.out.println("DISQUALIFIED");
      JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
      System.exit(0);// exits the program if the user enters a number greater than 6
    }

    int c = r.nextInt(6);
    //System.out.println("Computer move:" + c);
    JOptionPane.showMessageDialog(null, "Computer move:  " + c, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
    int d = a + c;
    int e = toss(ore);
    if ((d % 2 == 0 && e == 2) || (d % 2 == 1 && e == 1))// for when the player wins the toss
    {
      //System.out.println("YOU WON THE TOSS!!!");
      JOptionPane.showMessageDialog(null, "YOU WON THE TOSS!!! ", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
      //System.out.println("Choose bat or ball(bat/ball)");
      //JOptionPane.showMessageDialog(null, " Choose bat or ball(bat/ball)", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
      JFrame frame2 = new JFrame();
      String[] bb = new String[2];
      bb[0] = "bat";
      bb[1] = "ball";
      int q1 = JOptionPane.showOptionDialog(frame.getContentPane(), "Choose bat or ball(bat/ball)", "HAND CRICKET", 0,
    	        JOptionPane.INFORMATION_MESSAGE, null, bb, null);
      //String j = s.nextLine();// taking the input from the player
      if(q1==0) {
    	  j = "bat";
      }
      else {
    	  j = "ball";
      }
      int score = 0;
      if (j.contains("bat"))// when the player chooses bat
      {
        scenario = 1;// player bats first
        do {
          // System.out.println("Your move:");
          // w = s.nextInt();
          e1 = JOptionPane.showOptionDialog(frame1.getContentPane(), "YOUR CURRENT SCORE: " + uscore+"   " + pname+"'s MOVE:", "HAND CRICKET", 0, JOptionPane.INFORMATION_MESSAGE, null, posopt, null);
          if (e1 == 0)
            w = 1;
          else if (e1 == 1)
            w = 2;
          else if (e1 == 2)
            w = 3;
          else if (e1 == 3)
            w = 4;
          else if (e1 == 4)
            w = 5;
          else if (e1 == 5)
            w = 6;
          // s.nextLine();
          if (w > 6) {
            JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
          }
          h = r.nextInt(6) + 1;
          //System.out.println("Computer move:" + h);
         // JOptionPane.showMessageDialog(null, "Computer move: " + h, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);         
          uscore = w + uscore;// calculates the score of user
          if (check_out(w,h)==true){
        	  uscore = w - uscore;
          }
          //System.out.println("Current score:" + uscore);
          JOptionPane.showMessageDialog(null, "Computer move: " + h+ " Current score: " + uscore, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);

        } while (check_out(w, h) == false);
        //System.out.println("Total score of you:" + uscore);
        JOptionPane.showMessageDialog(null, "Your total score : " + uscore, "  HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);

      }

      else if (j.equals("ball"))// when the player chooses ball
      {
        scenario = 2;// player balls first
        do {
          //System.out.println("Your move:");
         /* q = s.nextInt();
          s.nextLine();*/
          //JOptionPane.showMessageDialog(null, "Your move: ", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          e2 = JOptionPane.showOptionDialog(frame1.getContentPane(), "COMPUTER'S CURRRENT SCORE: " + cscore+"  " + pname+"'s MOVE:",
            "HAND CRICKET", 0, JOptionPane.INFORMATION_MESSAGE, null, posopt, null);
          if (e2 == 0)
          q = 1;
          else if (e2 == 1)
          q = 2;
          else if (e2 == 2)
          q = 3;
          else if (e2 == 3)
          q = 4;
          else if (e2 == 4)
          q = 5;
          else if (e2 == 5)
          q = 6;
          if (q > 6) {
            JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
          }
          z = r.nextInt(6) + 1;
          //System.out.println("Computer move:" + z);
          //JOptionPane.showMessageDialog(null,"Computer move:" + z , "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          cscore = z + cscore;// calculates the score of computer
          //System.out.println("Current score:" + cscore);
          JOptionPane.showMessageDialog(null,"Computer move: " + z+ "Current score: " + cscore, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);

        } while (check_out(q, z) == false);
        //System.out.println("Total score of Computer:" + cscore);
        JOptionPane.showMessageDialog(null, "Total score of Computer: " + cscore , "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
      }

    } else if ((d % 2 == 1 && e == 2) || (d % 2 == 0 && e == 1))// when the player losses the toss
    {
     // System.out.println("YOU LOST THE TOSS...");
      JOptionPane.showMessageDialog(null, "YOU LOST THE TOSS... ", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
      int index = r.nextInt(bob.length);
      String k = bob[index];// now k is random element from bob
      //System.out.println("THE COMPUTER CHOOSES: " + k);
      JOptionPane.showMessageDialog(null, "THE COMPUTER CHOOSES: " + k, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
      if (k.contains("bat"))// when the computer chooses bat
      {
        scenario = 3;// the computer bats first
        do {
         // System.out.println("Your move:");
         // l = s.nextInt();
          //s.nextLine();
          //JOptionPane.showMessageDialog(null, "Your move: ", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          e3 = JOptionPane.showOptionDialog(frame1.getContentPane(), "COMPUTER'S CURRENT SCORE: "  + cscore+"  " + pname+"'s MOVE:",
            "HAND CRICKET", 0, JOptionPane.INFORMATION_MESSAGE, null, posopt, null);
          if (e3 == 0)
          l = 1;
          else if (e3 == 1)
          l = 2;
          else if (e3 == 2)
          l = 3;
          else if (e3 == 3)
          l = 4;
          else if (e3 == 4)
          l = 5;
          else if (e3 == 5)
          l = 6;
          if (l > 6) {
            JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
          }
          m = r.nextInt(6) + 1;
         // System.out.println("Computer move:" + m);
          //JOptionPane.showMessageDialog(null, "Computer move:" + m, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          cscore = m + cscore;
          //System.out.println("Current score:" + cscore);
          JOptionPane.showMessageDialog(null, "Computer move: " + m+ " Current score:  " + cscore, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
        } while (check_out(l, m) == false);
       // System.out.println("Total score of computer:" + cscore);
        JOptionPane.showMessageDialog(null, "Total score of computer : " + cscore, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
      } else {// if computer chooses to bowl
        scenario = 4;// computer bowls first
        do {
         // System.out.println("Your move:");
          //w = s.nextInt();
          //s.nextLine();
          //JOptionPane.showMessageDialog(null, "Your move: ", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          e4 = JOptionPane.showOptionDialog(frame1.getContentPane(), "YOUR CURRENT SCORE: " + uscore+"   " + pname+"'s MOVE: ","HAND CRICKET", 0, JOptionPane.INFORMATION_MESSAGE, null, posopt, null);
          if (e4 == 0)
          w = 1;
          else if (e4 == 1)
          w = 2;
          else if (e4 == 2)
          w = 3;
          else if (e4 == 3)
          w = 4;
          else if (e4 == 4)
          w = 5;
          else if (e4 == 5)
          w = 6;
          if (w > 6) {
            JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
          }
          h = r.nextInt(6) + 1;
          //System.out.println("Computer move:" + h);
          //JOptionPane.showMessageDialog(null, "Computer move:" + h, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          uscore = w + uscore;// calculates the score of user
          //System.out.println("Current score:" + uscore);
          JOptionPane.showMessageDialog(null,"Computer move:  " + h+ "  Current score:  " + uscore, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
        } while (check_out(w, h) == false);
       // System.out.println("Total score of user:" + uscore);
        JOptionPane.showMessageDialog(null, "Total score of user:  " + uscore, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
      }
    } else {
      JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
      System.exit(0);
    }
    switch (scenario) {
      case 1:// computer bats after player
       // System.out.println("Computer is batting now!!");
        JOptionPane.showMessageDialog(null, "Computer is batting now!! ", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
        do {
          //System.out.println(pname + "'s move:");
          //JOptionPane.showMessageDialog(null,  pname + "'s move:", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          //q = s.nextInt();
          //s.nextLine();
          e5 = JOptionPane.showOptionDialog(frame1.getContentPane(), "COMPUTER'S CURRENT SCORE:" + cscore + " " + pname+"'s MOVE: ","HAND CRICKET", 0, JOptionPane.INFORMATION_MESSAGE, null, posopt, null);
          if (e5 == 0)
          q = 1;
          else if (e5 == 1)
          q = 2;
          else if (e5 == 2)
          q = 3;
          else if (e5 == 3)
          q = 4;
          else if (e5 == 4)
          q = 5;
          else if (e5 == 5)
          q = 6;
          if (q > 6) {
            JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
          }
          z = r.nextInt(6) + 1;
          
          //System.out.println("Computer move:" + h);
          //JOptionPane.showMessageDialog(null, "Computer move:" + h, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          cscore = z + cscore;// calculates the score of computer
          //System.out.println("Current score:" + cscore);
          if (cscore>uscore) {
              JOptionPane.showMessageDialog(null, "OUT!! "+"Total score of computer : "+cscore, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
              
              break;
          }
          JOptionPane.showMessageDialog(null, "Computer move: " + z+ " Current score:  " + cscore, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
        } while(check_out(q, z) == false);
        if (cscore > uscore) {
         // System.out.println("COMPUTER WINS THE GAME!!");
         // System.exit(0);
          JOptionPane.showMessageDialog(null, "COMPUTER WINS THE GAME!! ", "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        } else if (cscore < uscore) {
         // System.out.println("YOU WIN THE GAME!!");
          JOptionPane.showMessageDialog(null,  pname +"!!! YOU WIN THE GAME!! ", "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        }

      case 2:// player bats after bowling
        do {
         // System.out.println("Your move:");
          //JOptionPane.showMessageDialog(null,  pname + "'s move:", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
         // w = s.nextInt();
          //s.nextLine();
          e6 = JOptionPane.showOptionDialog(frame1.getContentPane(), "YOUR CURRENT SCORE: " + uscore+" " + pname+"'s MOVE:", "HAND CRICKET", 0, JOptionPane.INFORMATION_MESSAGE, null, posopt, null);
          if (e6 == 0)
          w = 1;
          else if (e6 == 1)
          w = 2;
          else if (e6 == 2)
          w = 3;
          else if (e6 == 3)
          w = 4;
          else if (e6 == 4)
          w = 5;
          else if (e6 == 5)
          w = 6;
          if (w > 6) {
            JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
          }
          h = r.nextInt(6) + 1;
          //System.out.println("Computer move:" + h);
          //JOptionPane.showMessageDialog(null,  "Computer move:" + h, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          cscore = w + cscore;// calculates the score of user
          //System.out.println("Current score:" + uscore);
          if (cscore>uscore) {
              JOptionPane.showMessageDialog(null, "OUT!! "+"Total score of computer : "+cscore, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
              break;
          }
          JOptionPane.showMessageDialog(null,"Computer move : " + h+" Current score: " + cscore, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
        } while (check_out(w, h) == false);
        if (uscore > cscore) {
          //System.out.println("YOU WIN THE GAME!!");
          JOptionPane.showMessageDialog(null,  pname +"!!! YOU WIN THE GAME!! ", "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        } else {
          //System.out.println("COMPUTER WINS THE GAME!!");
          JOptionPane.showMessageDialog(null, "COMPUTER WIN THE GAME!! ", "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        }
      case 3:// computer bowls after batting
        do {
         // System.out.println("Your move:");
          JOptionPane.showMessageDialog(null,  pname + "'s move:", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          //w = s.nextInt();
          //s.nextLine();
          e7 = JOptionPane.showOptionDialog(frame1.getContentPane(), "YOUR CURRENT SCORE:" + uscore + "YOUR MOVE:", "HAND CRICKET", 0, JOptionPane.INFORMATION_MESSAGE, null, posopt, null);
          if (e7 == 0)
          w = 1;
          else if (e7 == 1)
          w = 2;
          else if (e7 == 2)
          w = 3;
          else if (e7 == 3)
          w = 4;
          else if (e7 == 4)
          w = 5;
          else if (e7 == 5)
          w = 6;
          if (w > 6) {
            JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
          }
          h = r.nextInt(6) + 1;
          //System.out.println("Computer move:" + h);
         // JOptionPane.showMessageDialog(null, "Computer move:" + h, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          uscore = w + uscore;// calculates the score of computer
         // System.out.println("Current score:" + uscore);
          if (uscore>cscore) {
              JOptionPane.showMessageDialog(null, "OUT!! "+"YOUR TOTAL SCORE : "+uscore, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
              break;
          }
          JOptionPane.showMessageDialog(null, "Computer move:" + h+"Current score:" + uscore, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
        } while (check_out(w, h) == false);
        if (uscore > cscore) 
        {
          //System.out.println("YOU WIN THE GAME!!");
          JOptionPane.showMessageDialog(null, pname + "YOU WIN THE GAME!! ", "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        }
        else
        {
          //System.out.println("COMPUTER WINS THE GAME!!");
          JOptionPane.showMessageDialog(null, "COMPUTER WIN THE GAME!! ", "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        }

      case 4:// computer bowls after batting
        do {
         // System.out.println("Your move:");
          JOptionPane.showMessageDialog(null,  pname + "'s move:", "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          //w = s.nextInt();
          //s.nextLine();
          e7 = JOptionPane.showOptionDialog(frame1.getContentPane(), "YOUR CURRENT SCORE:" + uscore + "YOUR MOVE:", "HAND CRICKET", 0, JOptionPane.INFORMATION_MESSAGE, null, posopt, null);
          if (e7 == 0)
          w = 1;
          else if (e7 == 1)
          w = 2;
          else if (e7 == 2)
          w = 3;
          else if (e7 == 3)
          w = 4;
          else if (e7 == 4)
          w = 5;
          else if (e7 == 5)
          w = 6;
          if (w > 6) {
            JOptionPane.showMessageDialog(null, "DISQUALIFIED ", "HAND CRICKET", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
          }
          h = r.nextInt(6) + 1;
          //System.out.println("Computer move:" + h);
         // JOptionPane.showMessageDialog(null, "Computer move:" + h, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
          uscore = w + uscore;// calculates the score of computer
          //System.out.println("Current score:" + uscore);
          if (uscore>cscore) { 
              JOptionPane.showMessageDialog(null, " OUT!!"+"Your total score : "+uscore, "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
              break;
          }
          JOptionPane.showMessageDialog(null,"Computer move:" + h+"Current score:" + uscore, "HAND CRICKET", JOptionPane.PLAIN_MESSAGE);
         
        } while (check_out(w, h) == false);
        if (uscore > cscore) {
          //System.out.println("YOU WIN THE GAME!!");
          JOptionPane.showMessageDialog(null,  pname +"YOU WIN THE GAME!! ", "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        } else {
          //System.out.println("COMPUTER WINS THE GAME!!");
          JOptionPane.showMessageDialog(null, "COMPUTER WIN THE GAME!! ", "HAND CRICKET", JOptionPane.INFORMATION_MESSAGE);
          System.exit(0);
        }
        s.close();
    }

  }
}