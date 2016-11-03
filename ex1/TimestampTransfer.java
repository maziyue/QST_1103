package No1;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 题目要求：
 * 0. 在个人仓库下，创建分支yourname_ex1
 * 1. 在个人分支下，修改Answers.md文件，里面填入当输入为'2016-11-11 11:11:11'时，输出的值是多少
 * 2. 对代码进行注释，说明每行代码的作用，把代码提交到个人分支下
 * 3. 创建pull request，与主仓库的master分支对比
 */
public class TimestampTransfer {
	@SuppressWarnings("resource")
	public static void main(String[] args){//标准输入
		Scanner scanner = new Scanner(System.in);//更改日期格式
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//输入内容
		SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//输出内容
		while (scanner.hasNext()){//循环执行
			String line = scanner.nextLine();
			Date lineDate = null;//获得日期数据
			long lineTimestamp;
			try {
				lineDate = inputFormat.parse(line);//传入输入内容
				lineTimestamp = lineDate.getTime();
				System.out.println(outputFormat.format(lineDate) + " to " + lineTimestamp);//输出结果
			} catch (ParseException e) {//捕获异常
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
