/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auth;

import java.util.Scanner;

/**
 *
 * @author Faizan
 */
public class Client {
    public static void main(String[] args) {
        AuthenticationService auth=new AuthenticationService();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username");
        String usr=sc.nextLine();
        System.out.println("Enter password");
        String password=sc.nextLine();
        
        User user=new User(usr,password);
        
        if(auth.verifyUser(user)){
            System.out.println("Loggin Successfull");
        }else{
            System.out.println("User not exist.");
        }
    }
}
