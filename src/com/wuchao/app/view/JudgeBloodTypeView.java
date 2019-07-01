package com.wuchao.app.view;

import com.wuchao.app.model.JudgeBloodTypeModel;
import com.wuchao.util.ConsoleUtil;


public class JudgeBloodTypeView {
		
	public static void show() {
		//1.欢迎语
		System.out.println("欢迎使用后代血型判断器v1.0");
		//2.获取用户输入的血型
			//2.1获取父亲血型
		System.out.print("父亲的血型：");
		int fatherBloodType = getBloodType();
			//2.2获取母亲血型
		System.out.print("母亲的血型：");
		int matherBloodType = getBloodType();
		//3.调用业务模型
		String result = JudgeBloodTypeModel .bloodType(fatherBloodType, matherBloodType);
		//4.显示结果
		System.out.println(result);
		System.out.println("欢迎再次使用，再见");

	}
	/**
	 * 获取血型
	 * @param bloodType  血型选项
	 * @return 血型标签（0:A型,1:B型,2:AB型,3:O型）
	 */
	public static int getBloodType() {
		int bloodTypeTag = ConsoleUtil.readInt("请选择血型0:A型,1:B型,2:AB型,3:O型",0);
		if(bloodTypeTag<0||bloodTypeTag>3) {
			System.out.println("非法数据，请重新输入");
			return getBloodType();
		}
		return bloodTypeTag;
	}
}
	

