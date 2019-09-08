package example;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


@ManagedBean
@SessionScoped
public class Person {
   
    
    private String namn;
    private String gender;
    private String Job;
    private String message;
    private int old;

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        this.Job = job;
    }
    
    

    public String getGender() {
        return gender;
    }

    public void setKon(String Gender) {
        this.gender = Gender;
    }
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    
    public void generateMessage(){
        RandomGenerator RG = new RandomGenerator();
        int decidingFactor = RG.whatFactorToConsider();
        int randomNumber = RG.getOneRandomNumber();
        
        Translator t = new Translator(this, decidingFactor, randomNumber);
        
        
        //UNcomment to see that the button works 
//        if(namn.contains("marcus")){
//            message="Ratt namn!";
//        }
//        else if (namn.contains("sandra")){
//            message="Det var ett valdigt fint namn!";
//        }
//        else{
//            message="Fel namn!";
//        }

        //Uncomment below to see that the proper things are put into the right variabels
        //message+=", namn: " + namn + ", Ethnicity: " + Ethnicity + ", Nationality: " + Nationality + ", Ethnicity: " + Ethnicity;
        
        message=t.getMessage();
    }
    
    
    

}
