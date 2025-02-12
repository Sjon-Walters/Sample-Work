/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayofmultiples;

/**
 *
 * @author sjonw
 */
import java.util.*;
public class ArrayOfMultiples {

    /**
     * @param args the command line arguments
     */
    
    
    /*
    
        This program is an solultion to the Array of Multiples coding challenge. I modified the 
        assignment to make it more diffcult for me. Namely by making it a requirment that I vaildate all input and 
        allow user driven run throughs of the program.
    
    
     
    
    
    */
    
    public static void main(String[] args) {
        int seedNumber = 0;
        int lengthOfArray = 0;
        int lengthViewer = 0;
        boolean vaildSeedNumber = true;
        boolean vaildMultiple = true;
        boolean vaildAgain = true;
        boolean again = true;
        
        Scanner user = new Scanner(System.in);
      
        
        
        do{
        //Getting and vaildaty input of starting number.
            do{
            System.out.println("Enter starting number you want multiples of: ");

                if(user.hasNextInt()){

                    seedNumber = user.nextInt();
                    user.nextLine();
                    vaildSeedNumber = true;


                }else{

                    System.out.println("Please enter a integer. ex 1, 2, -7, etc... ");
                    vaildSeedNumber = false;
                    user.nextLine();

                }
            }while(vaildSeedNumber != true);

             //Getting and vaildaty input of length.
            do{
            System.out.println("Enter the number of multiples you want: ");

            if(user.hasNextInt()){
                lengthViewer = user.nextInt();

                if(lengthViewer > 0){
                    lengthOfArray = lengthViewer;
                    user.nextLine();
                    vaildMultiple = true;
                }else{

                    System.out.println("Please enter a postive integer.");
                    vaildMultiple = false;
                    user.nextLine();

                }    


            }else{

                System.out.println("Please enter a integer. ex 1, 2, 4, etc... ");
                vaildMultiple = false;
                user.nextLine();

            }


            }while(vaildMultiple != true);




            //Calling and outputing multiples of user starting number and length.
            for(int x : aom(seedNumber,lengthOfArray)){
                System.out.print(x + ", ");

            }
            //Checking if user wants another set of multiples and vaildating input
            do{
                System.out.println("Do need more multiples? Enter true if yes or false if no");
                if(user.hasNextBoolean()){
                    again = user.nextBoolean();
                    vaildAgain = true;
                }else{
                    System.out.println("Please enter ONLY true or false");
                    vaildAgain = false;
                    user.nextLine();

                }
            }while(vaildAgain != true);
        
        
        
            
        }while(again);


    }
    
    public static int [] aom(int num, int length){
        int [] multiples = new int [length];
        
        //Generating multiples.
        for(int i = 0; i < multiples.length; i++){
           multiples[i] = num * (i + 1);
        
        }
    
        
        
    
        return multiples;
        
    }
    
}
