import java.util.Scanner;

public class Homework02 {
	static String fever;
	static String cough;
	static String lazy;
	static String highbool;
	static String thirsty;
	static String sweats;
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("歡迎使用醫療診斷系統，請依序回答問題");
		System.out.println("========================================");
		System.out.println("請問您最近是否發燒y/n");
		fever=scn.next();
		
		if(fever.toLowerCase().equals("y")) {
			System.out.println("請問您最近是否咳嗽");
			cough=scn.next();
			if(cough.toLowerCase().equals("y")) {
				System.out.println("請問您最近是否疲倦");
				lazy=scn.next();
				if(lazy.toLowerCase().equals("y")) {
					System.out.println("先生/小姐您可能感冒了");
				}
				else {
					System.out.println("您可能是其他系統");
				}
			}else {
				System.out.println("請問您最近是否高血壓");
				highbool=scn.next();
				
				if(highbool.toLowerCase().equals("y")) {
					System.out.println("請問您最近是否口乾");
					thirsty= scn.next();
					if(thirsty.toLowerCase().equals("y")) {
						System.out.println("先生/小姐您可能得到肝病");
					}else {
						System.out.println("您可能是其他系統");
					}
				}else {
					System.out.println("請問您最近是否盜汗");
					sweats=scn.next();
					
					if(sweats.toLowerCase().equals("y")) {
						System.out.println("先生/小姐您可能得到肺病");
					}else {
						System.out.println("您可能是其他系統");
					}
				}
			}
		}else {
			System.out.println("您是正常的");
		}
	}
}