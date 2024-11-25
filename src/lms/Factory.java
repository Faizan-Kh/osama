/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms;

/**
 *
 * @author Faizan
 */
public class Factory {
    public Book createBook(int id,String authorName){
        return new Book(id,authorName);
    }
    public static BookService createBookService(){
        
        return new BookService();
    }
    
}
