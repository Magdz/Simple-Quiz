
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
   
   public QuizList(){
   }
   
   public Question getQuestion(int i){
       return (Question) this.get(i);
   }
}
