
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class MysqlDB {
    private Connection connection;
    private Statement statement;
    private ResultSet result;
    private QuizList Quizer;
    private static int Length;
    
   public MysqlDB(QuizList Quizer){
       this.Quizer = Quizer;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple_quiz","root","");
           statement = connection.createStatement();
       }catch(ClassNotFoundException | SQLException e){
           System.out.println("Error: "+e);
       }
   }
   
   public void setData(QuizList Quizer) throws SQLException{
       String insert="";
       for(int i=Length;i<Quizer.size();++i){
           Question Question = Quizer.getQuestion(i);
           if(Question instanceof ShortAnswerQuestion){
               insert = "INSERT INTO shortanswerquestion VALUES ('"+ Question.getText() +"','"+ Question.getAnswer() +"')";
           }else if(Question instanceof FillInBlankQuestion){
               insert = "INSERT INTO fillinblankquestion VALUES ('"+ Question.getText() +"','"+ Question.getAnswer() +"')";
           }else if(Question instanceof TrueFalseQuestion){
               insert = "INSERT INTO truefalsequestion VALUES ('"+ Question.getText() +"','"+ Question.getAnswer() +"')";
           }else if(Question instanceof MultipleChoiceQuestion){
               MultipleChoiceQuestion Multiple = (MultipleChoiceQuestion) Question; 
               insert = "INSERT INTO multiplechoicequestion VALUES ('"+ Multiple.getText() +"','"+ Multiple.getAnswer() +"'"
                       + ",'"+ Multiple.getChoices().getFirst() +"','"+ Multiple.getChoices().get(1) +"','"+ Multiple.getChoices().getLast() +"')";
           }
           statement.executeUpdate(insert);
       }
   }
   
   public QuizList getData(){
       try{
           getFillinBlankQuestions();
       }catch(Exception e){
           System.out.println("Error: "+e);
       }
       try{
           getShortAnswerQuestions();
       }catch(Exception e){
           System.out.println("Error: "+e);
       }
       try{
           getTrueFalseQuestions();
       }catch(Exception e){
           System.out.println("Error: "+e);
       }
       try{
           getMultipleChoiceQuestions();
       }catch(Exception e){
           System.out.println("Error: "+e);
       }
       Length = Quizer.size();
       return Quizer;
   }
   
   private void getFillinBlankQuestions() throws SQLException{
       String query = "select * from fillinblankquestion";
       result = statement.executeQuery(query);
       while(result.next()){
           String question = result.getString("question");
           String answer = result.getString("answer");
           Quizer.add(new FillInBlankQuestion(question,answer));
       }
   }
   
   private void getShortAnswerQuestions() throws SQLException{
       String query = "select * from shortanswerquestion";
       result = statement.executeQuery(query);
       while(result.next()){
           String question = result.getString("question");
           String answer = result.getString("answer");
           Quizer.add(new ShortAnswerQuestion(question,answer));
       }
   }
   
   private void getTrueFalseQuestions() throws SQLException{
       String query = "select * from truefalsequestion";
       result = statement.executeQuery(query);
       while(result.next()){
           String question = result.getString("question");
           boolean answer = result.getBoolean("answer");
           Quizer.add(new TrueFalseQuestion(question,answer));
       }
   }
   
   private void getMultipleChoiceQuestions() throws SQLException{
       String query = "select * from multiplechoicequestion";
       result = statement.executeQuery(query);
       while(result.next()){
           String question = result.getString("question");
           String answer = result.getString("answer");
           MultipleChoiceQuestion multiple = new MultipleChoiceQuestion(question);
           multiple.setAnswer(answer);
           multiple.addChoice(result.getString("firstchoice"));
           multiple.addChoice(result.getString("secondchoice"));
           multiple.addChoice(result.getString("thirdchoice"));
           Quizer.add(multiple);
       }
   }
}
