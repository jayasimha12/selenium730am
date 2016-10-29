package com.pprojname.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ProjNAme.Master.Reuse_functins;

public class Ohm_exe {
  @Test
  public void f() throws IOException {
	  
	  
	  Reuse_functins obj=new Reuse_functins();
	  
	  obj.launchapp("http://professional.demo.orangehrmlive.com");
	  obj.loginApp("Admin", "admin");
	  
	  
  }
}
