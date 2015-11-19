package Questions;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class ShortAnswerQuestion extends Question<String> {
    private final String Answer;

    public ShortAnswerQuestion(String Text, String Answer) {
        super(Text);
        this.Answer = Answer;
    }
    
    @Override
    public String getQuestion(){
       return getText();   
    }
    
    @Override
    public String getAnswer(){
       return this.Answer; 
    }
    
    @Override
    public boolean checkAnswer(String Answer){
        return Answer.equalsIgnoreCase(this.Answer);
    }
    
}
