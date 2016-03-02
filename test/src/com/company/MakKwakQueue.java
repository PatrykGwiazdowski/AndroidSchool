package com.company;

/**
 *  MakKwakQueue class has its size and can display speeches of all clients waiting for thier Kebab
 */
public class MakKwakQueue {
    private int queueSize;

    /**
     * Creates MakKwakQueue with given size
     * @param size - size of queue
     */
    public MakKwakQueue(int size){
        this.queueSize=size;
    }
    /**
        Prints speech of all clients in queue
    */
    protected String getAllQuotes(){
        StringBuilder toPrint = new StringBuilder();
        for (int i = 1;i<=queueSize;i++){                   //iterate through all clients in queue
            toPrint.append(i + "." +getQuote(i)+"\n");                      //print to screen current client quote
        }
        return toPrint.toString();
    }

    /**
     * Return qoute of given client number
     * @param clientNumber number of client in queue
     * @return quote of current client
     */
    protected String getQuote(int clientNumber){
        StringBuilder returnQuote=new StringBuilder();
        if(clientNumber % 3 == 0)                                           //if client number can be divided by 3
            returnQuote.append("Mak");
        if(clientNumber % 5 == 0)
            returnQuote.append("Kwak");                                     //if client number can be divided by 5
        return returnQuote.toString();
    }
}
