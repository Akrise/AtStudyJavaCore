package homework_solution.lesson4.task2;

import homework_solution.lesson4.task1.Human;

public class Validator {

    public boolean validateString(String inputString) {
        if(inputString.matches("^\\S+\\s{1}\\S+\\s{1}\\S+$")){
            return true;
        }
        else {
            System.out.println("Строка не соответсвует формату, пожалуйста, попробуйте еще раз");
            return false;
        }
    }

    public String[] splitString(String inputString) {
        return  inputString.split(" ");
    }

    public boolean valiadateHuman(Human inputHuman) {
        if (inputHuman.getBirthDate()==null || inputHuman.getFirstName()==null || inputHuman.getLastName()==null){
            return false;
        }
        return true;
    }

    public boolean validateHumansArray(Human[] inputHumansArray) {
        if(inputHumansArray[inputHumansArray.length-1] == null){
            return true;
        }
        return false;
    }
}
