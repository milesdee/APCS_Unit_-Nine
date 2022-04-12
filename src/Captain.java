public class Captain extends UltimatePlayer {
    private boolean type;

    public Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);
        this.type = type;
    }

    public Captain(){
        super();
        type = false;
    }
    public String toString(){
        String typeeee = "";
        if (type==true){
            typeeee+= "offense";
        }
        else if(type==false){
            typeeee += "defense";
        }
        return super.toString() + "\n   Captain: "+ typeeee;
    }
}
