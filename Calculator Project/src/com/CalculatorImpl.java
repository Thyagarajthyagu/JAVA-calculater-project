package com;

 public class CalculatorImpl implements Calculator{
	 @Override
	  public String add(int a,int b){
		 int sum=a+b;
		 return "sum of : "+a+" & "+b+"is "+sum;
	 }
	 @Override
	  public String sub(int a,int b){
		 int sub=a-b;
		 return "sub of : "+a+" & "+b+"is "+sub;
	 }
	 @Override
	  public String mul(int a,int b){
		 int multi=a*b;
		 return "multi of : "+a+" & "+b+"is "+multi;
	 }
	 @Override
	  public String div(int a,int b){
		 if(b!=0){
		 int div=a/b;
		 return "div of : "+a+" & "+b+"is "+div;
	 }
		 else{
			 return "Denominater is 0";
		 }
	 }
	 @Override
	 public String displayErrorMessage(){
		 return "Invalid Choice,Pleace enter valid Choice!@";
		 
	 }

}
