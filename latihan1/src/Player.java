public class Player {
    String playerName;
    String playerName1;

    Player(String playerName, String playerName1) {
        this.playerName = playerName;
        this.playerName1 = playerName1;

    }

    void show() {
        System.out.println("Player Name : " + this.playerName);
        System.out.println("Player Name : " + this.playerName1);
    }

    void setPlayerName(String playerName, String playerName1) {
        this.playerName = playerName;
        this.playerName1 = playerName1;
    }
}
