package example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Translator {
    
    private final Person person;
    
    int decidingFactor;
    int randomNr;

    public Translator(Person person, int decidingF, int randomNr) {
        this.person = person;
        this.decidingFactor = decidingF;
        this.randomNr = randomNr;
    }
    
    public String getTemporaryMessage(){
        return "This is a temporary standard message";
    }
    
    public String getMessage(){
        String mes="";
        
        switch(decidingFactor){
            
            case 0:{//Name message
                mes=getMessageByName();
                break;
            }
            case 1:{//Age message
                mes=getMessageByAge();
                break;
            }
            case 2:{//Occupasion message
                mes=getMessageByOccupation();
                break;
            }
            case 3:{//Gender message
                mes=getMessageByGender();
                break;
            }
            
        }
        return mes;
    }

    public String getMessageByName() {
     if(person.getNamn().contains("Sara")){
         return "Det var ett fint namn!";
     }
        else if (person.getNamn().contains("Karl"))
            return "Karl is name!";
        else if (person.getNamn().contains("aMartin"))
            return "Marting is namn";
        else
         return "The name is not valid.";
    }
    

    public String getMessageByAge() {
        if(person.getOld() < 18)
            return "You under 18";
        else if (person.getOld() > 80)
            return "You are older than 18!";
        else
            return "Your age are appropriated!";
    }

    public String getMessageByGender() {
        if(person.getGender().equalsIgnoreCase("man & woman"))
            return "Man & Woman IS SEPARATE";
        else if (person.getGender().equalsIgnoreCase("man"))
            return "hello man !";
        else if (person.getGender().equalsIgnoreCase("woman"))
            return "Hello women";
        else
            return "Have a fun!";
    }

    public String getMessageByOccupation() {
        if(person.getJob().contains("prog"))
            return "See you better in the future!";
        else if (person.getJob().contains("rar"))
            return "Continue!";
        else if (person.getJob().contains("e"))
            return "keep going on!";
        else if(person.getJob().contains("a"))
            return "You see how beautiful is with programer!";
        else
            return "It's happing something wrong?";
    }

}
