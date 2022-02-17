package com.example.android1lesso4.data.model;

public class BooksModel {

   private String booksName;
   private String bookDescription;

   public BooksModel(String booksName,String bookDescription){
       this.booksName = booksName;
       this.bookDescription = bookDescription;
   }

   public String getBookDescription(){
       return bookDescription;
   }

   public void setBookDescription(String bookDescription){
       this.bookDescription = bookDescription;
   }
   public String getBooksName(){
       return booksName;
   }
   public void setBooksName(String booksName){
       this.booksName = booksName;
   }
}