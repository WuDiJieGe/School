import java.util.Scanner;
public class Work_5_14 {
	public static void main(String[] args) {
/*		案例：输出学生成绩的等级
		int a=89；
		（优秀：90-100，良好,70-89，及格60-69，不及格0-59）
*/
		Scanner sc = new Scanner(System.in);
	    System.out.println("ScannerTest, Please Enter Number:");
	    String str = sc.nextLine();  //读取字符串型输入
	    
		int number =Integer.parseInt(str) ;
		if (number<=100 && number>=90) {
			System.out.println("优秀");
		} else if (number<=89 && number>=70) {
			System.out.println("良好");
		}else if (number<=69 && number>=60) {
			System.out.println("及格");
		}else if (number<=59 && number>=0) {
			System.out.println("不及格");
		}
	}
}
