package enums.tarefa3.application;

import enums.tarefa3.entities.entity.Comment;
import enums.tarefa3.entities.entity.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
     Scanner scanner = new Scanner(System.in);

     SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

     Comment c01 = new Comment("Have a nice trip!");
     Comment c02 = new Comment("Wow that's awesome!");

     Comment c11 = new Comment("Good Night!");
     Comment c12 = new Comment("May the Force be with you");

     Post post1 = new Post(sdf1.parse("21/06/2018 13:05:44"),"Traveling to New Zealand","I'm going to visit this wonderful country!",12);
     Post post2 = new Post(sdf1.parse("28/07/2018 23:14:09"),"Good night guys","See you tomorrow",5);

     post1.addComment(c01);
     post1.addComment(c02);

     post2.addComment(c11);
     post2.addComment(c12);

     System.out.println(post1.toString());
     System.out.println("");
     System.out.println(post2.toString());

     scanner.close();
    }
}
