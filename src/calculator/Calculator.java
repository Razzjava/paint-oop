package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        
        

        System.out.println("how many walls do you have?: ");
        int numofwalls = input.nextInt();

        ArrayList<Wall> wallArr = shapeinfo(numofwalls);

    
            System.out.println(wallArr.get(0).getHeight());

        System.out.println("Do you have any windows?: ");    
        int numofwindows = input.nextInt();

        // ArrayList<Window> windowArr = shapeinfo(numofwindows);
        


    }

     static ArrayList<Wall> shapeinfo(int numofshapes ){

        
        //storing an array of walls
        ArrayList<Wall> wallArr = new ArrayList<Wall>();

        if(numofshapes != 0){
            for(int i=0; i<numofshapes; i++){

                System.out.println("what is the height of the wall (m)?: ");
                int wallheight = input.nextInt();

                System.out.println("what is the width of the wall (m)?: ");
                int wallwidth = input.nextInt();

                Wall wall = new Wall(wallheight, wallwidth) ;



                wallArr.add(wall);
            }
        } else {
            System.out.println("please enter a number above 0");
        }
        return wallArr;

    }
    
}
