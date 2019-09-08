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
            
            case 0:{//The name decides the message
                mes=getMessageByName();
                break;
            }
            case 1:{//Age decides the message
                mes=getMessageByAge();
                break;
            }
            case 2:{//occupasion decides the message
                mes=getMessageByOccupation();
                break;
            }
            case 3:{//gender decides the message
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
        if(person.getGender().equalsIgnoreCase("horse"))
            return "HORSE IS NOT A GENDER STUPID";
        else if (person.getGender().equalsIgnoreCase("man"))
            return "Oj vilka stora muskler du har!";
        else if (person.getGender().equalsIgnoreCase("woman"))
            return "Vilket fint hår du har";
        else
            return "Du ser bra ut idag!";
    }

    public String getMessageByOccupation() {
        if(person.getJob().contains("prog"))
            return "Du ar en del av framtiden du!";
        else if (person.getJob().contains("rar"))
            return "Du skapar framtidens ledare du!";
        else if (person.getJob().contains("e"))
            return "Oj du har en bra framtid du!";
        else if(person.getJob().contains("a"))
            return "Hoppas ditt jobb gar bra!";
        else
            return "Konstigt jobb det dar?";
    }

}
