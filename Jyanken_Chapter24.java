package kadai_024;

import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう(r: ぐー, s: チョキ, p: パー)");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String input = scanner.nextLine();
			
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				System.out.println(input);
				return input;
			} else {
				System.out.println("無効な入力です。r,s,pを入力してください");
			}
		}
	}
	
	public String getRandom() {
		String[] choices = {"r", "s", "p"};
		int randomIndex = (int) (Math.random() * choices.length);
		return choices[randomIndex];
	}
	
	public void playGame() {
		String myChoice = getMyChoice();
		String opponentChoice = getRandom();
		
		System.out.println("自分の手は" + translateChoice(myChoice) + ",対戦相手の手は" + translateChoice(opponentChoice));
		String result = determineWinner(myChoice, opponentChoice);
		System.out.println(result);
	}
	
    private String translateChoice(String choice) {
        switch (choice) {
            case "r":
                return "グー";
            case "s":
                return "チョキ";
            case "p":
                return "パー";
            default:
                return "無効な手";
        }
    }
	
	private String determineWinner(String playerChoice, String opponentChoice) {
		if(playerChoice.equals(opponentChoice)) {
			return "あいこです";
		} else if ((playerChoice.equals('r') && opponentChoice.equals('s')) ||
				(playerChoice.equals('s') && opponentChoice.equals('p')) ||
				(playerChoice.equals('p') && opponentChoice.equals('r'))) {
			return "自分の勝ちです";
		} else {
			return "自分の負けです";
		}
	}
