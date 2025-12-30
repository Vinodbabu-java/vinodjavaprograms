package com.javaintro;

public class College {

	static int collegeId;
	static String collegeName;

	int studentNo;
	String studentName;

	public static void main(String[] args) {
		System.out.println("welcome to my college");
		College vk = new College();
		
		collegeId =143;
		collegeName="Rise";
		
		vk.studentNo=43;
		vk.studentName="ashok";	

		System.out.println("collegeId:"+collegeId);
		System.out.println("collegeName:"+collegeName);
		
		System.out.println("studentNo:"+vk.studentNo);
		System.out.println("studentName:"+vk.studentName);
		
		College mv = new College();
		mv.studentNo=54;
		mv.studentName="vinod";
		
		System.out.println("collegeId:"+collegeId);
		System.out.println("collegeName:"+collegeName);
		
		System.out.println("studentNo:"+mv.studentNo);
		System.out.println("studentName:"+mv.studentName);
		
		College rj = new College();
		rj.studentNo =56;
		rj.studentName ="raja";
		System.out.println("collegeId:"+collegeId);
		System.out.println("collegeName:"+collegeName);
		
		System.out.println("studentNo:"+rj.studentNo);
		System.out.println("studentName:"+rj.studentName);
		
		College ok = new College();
		
		ok.studentNo=55;
		ok.studentName="koti";
		collegeId=420;
		collegeName="rise prakasam";
		
		System.out.println("collegeId:"+collegeId);
		System.out.println("collegeName:"+collegeName);
		
		System.out.println("studentNo:"+ok.studentNo);
		System.out.println("studentName:"+ok.studentName);
	
	
	
	}

}
