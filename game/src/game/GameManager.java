package game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " adlý oyun eklendi.");
		
	}

	@Override
	public void upDate(Game game) {
		System.out.println(game.getGameName() + " adlý oyun güncellendi.");

		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " adlý oyun silindi.");
		
	}

}
