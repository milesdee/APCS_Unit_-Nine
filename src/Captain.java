public class Captain extends UltimatePlayer {
    private boolean captainType;

    public Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);
        this.captainType = type;
    }
    public Captain(){
        super();
        captainType = false;
    }
    public String toString(){
        String captainrole = "";
        if (captainType){
            captainrole+= "offense";
        }
        else{
            captainrole += "defense";
        }
        return super.toString() + "\n   Captain: "+ captainrole;
    }
}
