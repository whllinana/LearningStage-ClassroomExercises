package com.wuchao.app.model;

public class JudgeBloodTypeModel {
	
		/**
		 * 根据父母血型标判断后代可能出现的血型，和不可能出现的血型。
		 * @param fatherBloodType 父亲的血型 
		 * @param matherBloodType 母亲的血型 
		 * @return 后代可能的血型
		 * @throws IllegalArgumentException 如果fatherBloodType>3或fatherBloodType<0时
		 * @throws IllegalArgumentException 如果matherBloodType>3或matherBloodType<0时
		 */
       public static String bloodType(int fatherBloodType,int matherBloodType ) {
    	   if(fatherBloodType>3||fatherBloodType<0||matherBloodType<0||matherBloodType>3)throw new IllegalArgumentException("非法字符");
    	   String bloodType = getBloodTypeByParent(fatherBloodType, matherBloodType);
    	   return bloodType;
       }
       
       /**
        * 通过父母血型判断后代血型可能性
        * @param fatherBloodType 父亲的血型 
        * @param matherBloodType 母亲的血型 
        * @return 后代可能的血型
        */
       static private String getBloodTypeByParent(int fatherBloodType,int matherBloodType ) {
    	   if(fatherBloodType==0&&matherBloodType==0||fatherBloodType==0&&matherBloodType==3
    	      ||fatherBloodType==3&&matherBloodType==0)return "您子女可能出现的血型是A型、O型。不可能是B型、AB型";
    	   
    	   if(fatherBloodType==1&&matherBloodType==1||fatherBloodType==1&&matherBloodType==3
    		  ||fatherBloodType==3&&matherBloodType==1)return "您子女可能出现的血型是B型、O型。不可能是A型、AB型";
    	   
    	   if(fatherBloodType==1&&matherBloodType==1||fatherBloodType==1&&matherBloodType==3
    	      ||fatherBloodType==3&&matherBloodType==1)return "您子女可能出现的血型是B型、O型。不可能是A型、AB型";
    	   
    	   if(fatherBloodType==3&&matherBloodType==3)return "您子女可能出现的血型是O型。不可能是A型、B型、AB型";
    	   
    	   if(fatherBloodType==2&&matherBloodType==3||fatherBloodType==3&&matherBloodType==2)return "您子女可能出现的血型是A型、B型。不可能是O型、AB型";
    	   
    	   if(fatherBloodType==0&&matherBloodType==1||fatherBloodType==1&&matherBloodType==0)return "您子女可能出现的血型是A型、B型、AB型、O型。";
    	   
    	   return "您子女可能出现的血型是A型、B型、AB型。不可能是O型";
       }
}
