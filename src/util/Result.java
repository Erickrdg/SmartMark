/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author FireX
 */
public class Result {
    private boolean Outcome;
    private String Message;
    private int Id;

    public Result() {
        Outcome=false;
        Message="";
        Id=0;
    }

    public Result(boolean Outcome, String Message, int Id) {
        this.Outcome = Outcome;
        this.Message = Message;
        this.Id = Id;
    }

    public boolean isOutcome() {
        return Outcome;
    }

    public void setOutcome(boolean Outcome) {
        this.Outcome = Outcome;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
        }
}
