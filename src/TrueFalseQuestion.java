/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class TrueFalseQuestion extends Question<Boolean> {
    private final boolean Answer;

    public TrueFalseQuestion(String Text, boolean Answer) {
        super(Text);
        this.Answer = Answer;
    }
    
    @Override
    public String getQuestion(){
        return "<html>"+getText()+"<br/> Is this statment true or false?";   
    }
    
    @Override
    public Boolean getAnswer(){
        return this.Answer;
    }
    
    @Override
    public boolean checkAnswer(Boolean Answer){
        if(Answer==this.Answer)
            return true;
        return false;
    }
    
}
