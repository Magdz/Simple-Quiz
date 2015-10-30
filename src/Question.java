/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 * @param <Type>
 */
public abstract class Question<Type> {
    private final String Text;
    
    public Question(String Text){
        this.Text=Text;
    }
    
    public String getText(){
        return this.Text;
    }
    
    public abstract String getQuestion();
    
    public abstract Type getAnswer();
    
    public abstract boolean checkAnswer(Type Answer);
    
}
