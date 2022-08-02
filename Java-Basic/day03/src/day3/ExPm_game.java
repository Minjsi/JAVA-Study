package day3;

import java.util.Scanner;
import java.util.Random;

public class ExPm_game {
	public static void main(String[] args) {
		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int you = sc.nextInt();
		
		Random rand = new Random();
		int machine = rand.nextInt(3)+1;
		System.out.println("당신은 "+you+"입니다.");
		
		if(you ==3 && machine == 1){
			System.out.println("컴퓨터가 "+machine+"을 내서 컴퓨터가 이겼습니다.");
		}else if (you ==1 && machine ==3) {
			System.out.println("컴퓨터가 "+machine+"을 내서 당신이 이겼습니다.");
		}else if (you < machine) {
			System.out.println("컴퓨터가 "+machine+"을 내서 이겼습니다.");
		}else if (you > machine) {
			System.out.println("컴퓨터가 "+machine+"을 내서 당신이 이겼습니다.");
		}else if (you == machine) {
			System.out.println("컴퓨터가 "+machine+"을 내서 비겼습니다.");
		}
	}
}

