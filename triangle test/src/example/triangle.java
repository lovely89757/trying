package example;

public class triangle {
	double a,b,c;
	public triangle(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	boolean isVald(){
		if(a<=0||b<=0||c<=0){		
			return false;
		}
		if((a+b<=c)||(a+c<=b)||(b+c<=a)){
			return false;
		}		
			return true;
	}

}
