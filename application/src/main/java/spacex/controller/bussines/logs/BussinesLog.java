package main.java.spacex.controller.bussines.logs;

import java.util.logging.Logger;


public class BussinesLog {

private  Logger LOGGER;
private String Class_Name;
private String path;
private String line;

    public BussinesLog(Class classe){
        this.path = classe.getPackageName();
        this.Class_Name = classe.getName();
    
        this.LOGGER = Logger.getLogger(classe.getName());
        
    }

    public Logger getLOGGER() { 
        return LOGGER;
    }
    public void setLOGGER(Logger lOGGER) {
        LOGGER = lOGGER;
    }
    
    public void infr(String msg){
        LOGGER.info(COLORS.ANSI_YELLOW+msg+COLORS.ANSI_RESET);
    }
    
    public void warnning(String msg){
        LOGGER.warning(COLORS.ANSI_YELLOW + msg+COLORS.ANSI_RESET);
        
    }
    public void error(String msg){
        LOGGER.warning(COLORS.ANSI_YELLOW + msg+COLORS.ANSI_RESET);
    }

    public void infor(String msg){
        LOGGER.warning(COLORS.ANSI_YELLOW + msg+"\n" +Class_Name+COLORS.ANSI_RESET);
    }



    public enum COLORS{
     ANSI_RESET ("\u001B[0m"),
     ANSI_BLACK ( "\u001B[30m"),
     ANSI_RED ( "\u001B[31m"),
     ANSI_GREEN ( "\u001B[32m"),
     ANSI_YELLOW ( "\u001B[33m"),
     ANSI_BLUE ( "\u001B[34m"),
     ANSI_PURPLE ( "\u001B[35m"),
     ANSI_CYAN ( "\u001B[36m"),
     ANSI_WHITE ( "\u001B[37m");
    
    COLORS(String color){
       this.color = color;
    }
    
    private String color;
    
    
    @Override
    public String toString() {
    return color;
    }
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}
}
