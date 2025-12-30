package com.javalab;

public class StationaryCompany {
	
	int RM = 18000;
	int cost = 12000;
	int factoryoverhead = 6000;
	float wastageofmaterial = 0.05f;
	float scarpsoild = 0.02f;
	short additonalcosts = 3500;
	short totalproduction = 2000;
	float car;
	float wm=0.03f;
	float bike;
	int m;
	int n;
	int p;
	
	void Material(){
		m=(int)(RM*wm);
		System.out.println(m);
		
	}
	
	void waste() {
		n=RM-m;
		System.out.println(n);
	}
	
	void total() {
		p=RM+cost+factoryoverhead+additonalcosts;
		System.out.println(p);
		
		p=p/totalproduction;
		System.out.println(p);
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");

		StationaryCompany sc=new StationaryCompany();
		sc.Material();
		sc.waste();
		sc.total();
		
		

		sc.car=(sc.RM*sc.wm);	
		System.out.println(sc.car);
		
		
		sc.car=(sc.RM-sc.car);
		System.out.println(sc.car);
	
		sc.bike=sc.cost+sc.car+sc.factoryoverhead+sc.additonalcosts;
		System.out.println(sc.bike);

		sc.bike=sc.bike/sc.totalproduction;
		System.out.println(sc.bike);
		
	     
          
	}

}
