/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lms;

/**
 *
 * @author Faizan
 */
public class LMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookService bookS=Factory.createBookService();
       
        Book b1=Factory.createBook(1,"Fawad");
        Book b2=Factory.createBook(2,"Usmma");
       
        
        bookS.addBook(b2);
        bookS.addBook(b1);
        
        Book b3=bookS.getBookById(1);
        System.out.println(b3.getAuthorName());
    }
    
}
