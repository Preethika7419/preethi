package jdk8;

@FunctionalInterface  
interface sayable{  
    void say(String msg);  
}  
public class Functionalinterface implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        Functionalinterface f = new Functionalinterface();  
        f.say("Functional Interface");  
    }  
} 

