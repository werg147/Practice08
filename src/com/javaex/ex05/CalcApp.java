package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int result;
    	
    	while(true) {
    		System.out.print(">> ");
    		String str = sc.nextLine();
    		String[] data = str.split(" ");
    		
    		if(str.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}
    		
    		/*
    		System.out.println(data[0]);
    		System.out.println(data[1]);
    		System.out.println(data[2]);
    		*/
    		
    		//Integer.parseInt (문자형->정수형 변환)
    		int left = Integer.parseInt(data[0]);
    		int right = Integer.parseInt(data[2]);
    		
    		switch(data[1]) {
    		case("+"):
    			Add add = new Add();
    			add.setValue(left, right);
    			result = add.calculate(); 
    			System.out.println(">> " + result);
    			break;
    		
    		case("-"):
    			Sub sub = new Sub();
    			sub.setValue(left, right);
    			result = sub.calculate();
    			System.out.println(">> " + result);
    			break;
    			
    		case("*"):
    			Mul mul = new Mul();
    			mul.setValue(left, right);
    			result = mul.calculate();
    			System.out.println(">> " + result);
    			break;
    			
    		case("/"):
    			Div div = new Div();
    			div.setValue(left, right);
    			result = div.calculate();
    			System.out.println(">> " + result);
    			break;
    			
    		default:
    			System.out.println("알 수 없는 연산입니다.");
    		
    		}
    		
    		
    	
    		
    	} 
    	
    	
    	
    	sc.close();

    }
}
