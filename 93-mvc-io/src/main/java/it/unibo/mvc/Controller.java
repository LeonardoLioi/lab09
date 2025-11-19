package it.unibo.mvc;

import java.util.List;

/**
 *
 */
public interface Controller {

    public void setStringToPrint(String str);

    public String getStringToPrint();

    public List<String> getHistoryStringsPrinted();
    
    public void printCurrentString();


    




}
