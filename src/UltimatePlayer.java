public class UltimatePlayer extends Player{

    private static int playerNumber = 1;
    private int jersey;
    private String position;

    UltimatePlayer(String first, String last, String position){
        super(first, last);
        if (position.equals("cutter") || position.equals("handler")){
            this.position = position;
        }
        else{
            this.position = "handler";
        }
        jersey = playerNumber;
        playerNumber++;
    }

    UltimatePlayer(){
        super();
        jersey = 0;
        position = "handler";
    }

    public String getPosition(){
        return position;
    }
    public String toString(){
        return super.toString() + "\n   Number: " + jersey + "\n   Position: " + position;
    }


}