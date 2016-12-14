package com.ariba.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NasHornEx1 {
	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager scriptEngineManger = new ScriptEngineManager();
		ScriptEngine  nasHorn = scriptEngineManger.getEngineByName("nashorn");
		
		String name ="Lakshmi";
		Integer result = null;
		
		
		nasHorn.eval("print('Hello : "+name+"');");
		result = (Integer) nasHorn.eval("10+20");
		System.out.println("Result " + result);
	}
}
