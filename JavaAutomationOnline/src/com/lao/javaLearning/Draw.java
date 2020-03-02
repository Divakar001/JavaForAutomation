package com.lao.javaLearning;

public class Draw {
	String draw;
	Draw(){
		System.out.println("draw object created");
	}
	Draw(String todraw){
		draw=todraw;
		System.out.println("drawing "+todraw);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

Draw draw=new Draw("circle");
Draw draw2=new Draw();
	}

}
