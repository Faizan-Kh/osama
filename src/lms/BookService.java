/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lms;

import java.util.ArrayList;

/**
 *
 * @author Faizan
 */
public class BookService {
   private ArrayList<Book> bookList=new ArrayList<>();
   
   public Book getBookById(int id){
       for(Book b:bookList){
           if(b.getBookId()==id){
               return b;
           }
       }
       return null;
   }
   
   public void addBook(Book book){
       this.bookList.add(book);
   }
    
}
