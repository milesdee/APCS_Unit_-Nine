import java.util.ArrayList;
public class UltimateTeam {

    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches){
        this.players = players;
        this.coaches = coaches;
    }
    public String getCutters(){
        String cutters = "";
        for (UltimatePlayer i: players){
            if(i.getPosition() == "cutter")
                cutters += i + "\n\n";
        }
        return cutters;
    }
    public String getHandlers(){
        String handlers = "";
        for (UltimatePlayer i: players){
            if(i.getPosition() == "handler")
                handlers += i + "\n\n";
        }
        return handlers;
    }
    public String toString(){
        String coachlist = "";
        String playerlist = "";
        for(Coach i: coaches){
            coachlist += i + "\n\n";
        }
        for (UltimatePlayer i: players){
            playerlist += i + "\n\n";
        }
        return "COACHES : " + coachlist + "\nPLAYERS : " + playerlist;
    }
}