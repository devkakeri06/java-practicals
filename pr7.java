
class Demoplayer {
	public static void main(String args[]) {
		Cricket_player bb = new Cricket_player("Cricket", 69);
		Football_player sw = new Football_player("Football", 14);
		Hockey_player sp = new Hockey_player("Hockey", 56);
		
		bb.display();
		sw.display();
		sp.display();
		
	}

}
class Player {
	String gamename;
	Player(String gamename){
		this.gamename = gamename;
	}
}

class Cricket_player extends Player{
	int no_of_players;
	Cricket_player(String gamename, int number){
		super(gamename);
		this.no_of_players = number;
	}
	void display() {
		System.out.println("Name of the game:- "+gamename);
		System.out.println("Total players:- "+no_of_players);
	}
}

class Football_player extends Player{
	int no_of_players;
	Football_player(String gamename, int number){
		super(gamename);
		this.no_of_players = number;
	}
	void display() {
		System.out.println("Name of the game:- "+gamename);
		System.out.println("Total players:- "+no_of_players);
	}
}

class Hockey_player extends Player{
	int no_of_players;
	Hockey_player(String gamename, int number){
		super(gamename);
		this.no_of_players = number;
	}
	void display() {
		System.out.println("Name of the game:- "+gamename);
		System.out.println("Total players:- "+no_of_players);
	}
}
