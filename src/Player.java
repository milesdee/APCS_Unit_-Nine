public class Player {
    private String firstName;
    private String lastName;

    public Player(String first, String last){
        firstName = first;
        lastName = last;
    }

    public Player(){
        firstName = "unknown";
        lastName = "unknown";
    }

    public String toString(){
        return lastName + ", " + firstName;
    }

}