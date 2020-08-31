package blackJack;

import java.util.LinkedList;

public class CardDeck {
	private LinkedList<Card> deck; 
	
	final static String[] PATTERNS = {"spade","diamond","club","heart"};
	final static int CARD_COUNT = 13;
	
	public CardDeck() {
		deck = new LinkedList<Card>();
		deckArrangement();
	}
	
	public void deckArrangement() {
		//덱 52장 설정
		for(String str : PATTERNS) {	//무늬의 개수 만큼
			for(int i=1; i<=CARD_COUNT; i++) {
				Card card = new Card(str, convertDenomination(i));
				deck.add(card);
			} //in end
		} //out end
	}
	
	public String convertDenomination(int num) {
		String cd = "";
		
		switch (num) {
		case 1: cd = "A";break;
		case 11: cd = "J";break;
		case 12: cd = "Q";break;
		case 13: cd = "K";break;
		default: cd = String.valueOf(num);
		}
		
		return cd;
	}
	
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		System.out.println(cd.deck);
	}
}
