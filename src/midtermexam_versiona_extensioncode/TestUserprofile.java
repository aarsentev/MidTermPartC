/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Created by
 * Name: Aleksandr Arsentev
 * Student ID: 991636298
 * Date 25/2/2022
*/
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author grom6
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        //prompting the name
        System.out.println("Please enter your name");
        String yourName = key.next();
        
        //giving the list of availible genres, no validation is required for the task
        System.out.println("Please choose your favourite genre");
        for (int genreNumber = 0; genreNumber < UserProfile.genres.length; genreNumber++){
            System.out.println((genreNumber + 1) + ") " + UserProfile.genres[genreNumber]);
        }
       
        // prompting the genre
        String yourGenre = key.next(); 
        
        //creating the UserProfile object
        UserProfile u1 = new UserProfile(yourName, yourGenre);
        
        System.out.println("New user profile was successfully created!");
        
    }
}
