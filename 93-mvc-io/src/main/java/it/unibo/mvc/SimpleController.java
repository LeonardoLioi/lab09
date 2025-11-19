package it.unibo.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 */
public final class SimpleController implements Controller {
    private String current;
    private List<String> history = new ArrayList<>();
    

    @Override
    public void setStringToPrint(String str) {
        
        if(str != null){
            this.current = str;
            this.history.add(str);
        }
        else
        {
            throw new NullPointerException("String to print cannot be null");
        }
    }

    @Override
    public String getStringToPrint() {
       return this.current;
    }

    @Override
    public List<String> getHistoryStringsPrinted() {
        return this.history;        
    }

    @Override
    public void printCurrentString() {

        if(this.current==null){
            throw new IllegalStateException("The string is unset");
        }
        System.out.println(this.current);        
    }

}
