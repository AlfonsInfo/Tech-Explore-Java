package utils;

import java.util.Date;
import java.util.Objects;

public class CommonHelper {
    
     private CommonHelper(){}

    public static String getCurrentTime(){
        Date date = new Date();
        int hours = date.getHours();
        int minute = date.getMinutes();
        int seconds = date.getSeconds();
        return "[" + hours + ":"+minute+":"+seconds + "] ";
    }
 
      public static String getCurrentMethodName() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 3) {
            StackTraceElement currentMethod = stackTrace[2];
            return currentMethod.getMethodName();
        } else {
            return "UnknownMethod";
        }
    }
    
    public static void printLog(String activity, String location, String dataInformation){
        
        StringBuilder builder = new StringBuilder();
        builder.append(getCurrentTime());
        
        if(Objects.nonNull(activity)){
            builder.append("[").append("INFORMATION: ").append(activity).append("]");     
        }
        
        if(Objects.nonNull(location)){
            builder.append("[").append("METHOD NAME: ").append(location).append("]");     
        }
        
        if(Objects.nonNull(dataInformation)){
            builder.append("[").append("DATA INFORMATION : ").append(dataInformation).append("]");     
        }
        
        System.out.println(builder.toString());
        //return  builder.toString();
    }
    
    public static void printLogError(String errorInformation, String methodName){
        
        StringBuilder builder = new StringBuilder();
        builder.append("[").append(getCurrentTime()).append("]");
        
        if(Objects.nonNull(errorInformation)){
            builder.append("[").append("ERROR : ").append(errorInformation).append("]");     
        }
        
        if(Objects.nonNull(methodName)){
            builder.append("[").append("METHOD NAME: ").append(methodName).append("]");     
        }
                
        System.out.println(builder.toString());
    }
    
    
}
