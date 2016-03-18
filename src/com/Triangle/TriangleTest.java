package com.Triangle;

public class TriangleTest {
	public String positiveTest(int a, int b, int c){
		//�жϱ߳��Ƿ�Ϊ������
		if(a>0 && b>0 && c>0) return "Passed";
		else{
			String report = "";
			if(a<=0) report+="1st ";
			if(b<=0) report+="2nd ";
			if(c<=0) report+="3rd ";
			report += "Not Positive";
			return report;
		}
	}
	public String canFormTriangle(int a, int b, int c){
		//�ж��������Ƿ����γ�������
		if(a+b>c && b+c>a && c+a>b) return "Passed";
		else return "Not Triangle";
	}
	public String isoscelesTest(int a, int b, int c){
		//�ж��Ƿ�Ϊ����������
		if(a==b || b==c || c==a) return "Passed";
		else return "Not Isosceles";
	}
	public String equilateralTest(int a, int b, int c){
		//�ж��Ƿ�Ϊ�ȱ�������
		if(a==b && b==c) return "Passed";
		else return "Not Equilateral";
	}
	public String test(int a, int b, int c){
		//�����Ĳ���
		String report="";
		report = positiveTest(a,b,c);
		if(!report.equals("Passed")) return report;
		else{
			report = canFormTriangle(a,b,c);
			if(!report.equals("Passed")) return report;
			else{
				report = isoscelesTest(a,b,c);
				if(!report.equals("Passed")) return "Scalene";
				else{
					report = equilateralTest(a,b,c);
					if(!report.equals("Passed")) return "Isosceles";
					else{
						return "Equilateral";
					}
				}
			}
		}
	}
}
