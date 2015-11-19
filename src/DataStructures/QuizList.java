package DataStructures;


import Questions.Question;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class QuizList extends LinkedList {
    private final MysqlDB DB;

       
   public QuizList(){
       DB = new MysqlDB(this);
       DB.getData();
   }
   
   public Question getQuestion(int i){
       return (Question) this.get(i);
   }
   
   public void save(){
       try {
           DB.setData(this);
       } catch (SQLException ex) {
           System.out.println("Saving Error: "+ex);
       }
   }
   
   public QuizList shuffle(int QL){
       if(QL > this.size())return this;
       ArrayList list=new ArrayList<>(this.size());
       for(int i=0;i<this.size();++i)
           list.add(i);
       Collections.shuffle(list);
       
       QuizList Test = new QuizList();
       Test.removeRange(0, Test.size());
       for(int i=0;i<QL;++i){
           Test.add(this.getQuestion((int) list.get(i)));
       }
       return Test;
   }
}
