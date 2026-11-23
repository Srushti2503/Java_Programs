package ExceptionHandling.CustomException;

public class InvalidAgeException extends Exception {

    InvalidAgeException(String message){
        super(message);
    }


    static void ValidateAge(int age) throws InvalidAgeException{

        if(age<18){
            throw new InvalidAgeException("You are not eligible to vote.");
        }
        else{
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try{
            ValidateAge(17);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

}