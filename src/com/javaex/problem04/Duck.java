package com.javaex.problem04;

public class Duck extends Bird {
	
	public Duck() {
	}
	
	public Duck(String name) {
		super(name);
	}

    public void sing() {
    	System.out.println("오리("+name+")가 소리내며 웁니다.");
    }

    public void fly() {
    	System.out.println("오리("+name+")가 날지 않습니다.");
    
    }
    
    public void showName() {
    	System.out.println("오리의 이름은 "+name+" 입니다.");
    }

}
