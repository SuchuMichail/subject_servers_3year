package task9;

public class Message {
    private String message;

    public Message(String message){
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void printMessage(){
        System.out.println(message);
    }
}
