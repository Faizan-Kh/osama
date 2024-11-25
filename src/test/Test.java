/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import lms.Book;
public class Test {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList<>();
        
        Book b1=new Book(1,"Fawad");
        Book b2=new Book(2,"Fawad");
        
        books.add(b1);
        books.add(b2);
        
        
        int bookId=1;
        for(Book book:books){
           if(book.getBookId()==bookId){
               System.out.println(book.toString());
           }
        }
        
        
    }
}
