package chap04.Example;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 90~100입니다");
			System.out.println("등급은 A 입니다");
		} else if (score >= 80) {				// 80<= score <=90
			System.out.println("점수는 80~89입니다");
			System.out.println("등급은 B 입니다");
		} else if (score >= 70) {				// 70 <= score <= 80
			System.out.println("점수는 70~79입니다");
			System.out.println("등급은 C 입니다");
		} else {								// score <70	
			System.out.println("점수가 70 미만입니다");
			System.out.println(" 등급은 D 입니다");
		}
	}
}
