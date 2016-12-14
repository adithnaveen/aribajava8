package com.ariba.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NasHornEx2 {
	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		ScriptEngineManager scriptEngineManger = new ScriptEngineManager();
		ScriptEngine  nasHorn = scriptEngineManger.getEngineByName("nashorn");
		
		// will load the file and if the scripting elements are not within the function 
		// then it will executed 
		nasHorn.eval(new FileReader("sample.js"));
		System.out.println("-------------------------------------------");
		nasHorn.eval("fnTest()");
		
		Invocable inv = (Invocable) nasHorn;
		System.out.println("************************************");
		inv.invokeFunction("fnTest", "10", "20");
	}
}
