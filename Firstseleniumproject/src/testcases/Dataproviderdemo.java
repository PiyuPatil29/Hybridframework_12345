package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo {
	
	@Test(dataProvider="LoginDataProvider")
	public void m1(String uname,String pass) {
		if(uname.contains("name") &&pass.contains("pass")) {
		System.out.println(uname+"\t"+pass);
		}else {
			throw new ArithmeticException();
		}
	}
	@DataProvider (name="LoginDataProvider")
	public Object[] [] logindata() {
			Object values[][]= {{"name1","pass1"},
											{"name2","pass2"},
											{"name3","pass3"},
											{"Adi","Adi123"}};
			return values;
		}
	}


