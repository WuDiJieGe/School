
public class Work_2020_5_15 {
	public static void main(String[] args) {
//		春季：3 4 5
//		夏季：6 7 8
//		秋季：9 10 11
//		冬季： 12 1 2
		
		int number = 9;
		switch (number) {
		case 12:
		case 1:
		case 2:
			System.out.println(number+"是冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(number+"是夏季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(number+"是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(number+"是秋季");
			break;
		default:
			System.out.println("请输入一个正常的月份");
			break;
		}
	}
}
