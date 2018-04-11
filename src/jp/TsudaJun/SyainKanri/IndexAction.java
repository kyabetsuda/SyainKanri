package jp.TsudaJun.SyainKanri;

import lombok.Getter;
import lombok.Setter;

public class IndexAction {
	
	@Getter @Setter private String hello;
	
	public String execute() throws Exception{
		this.hello = "Hello World!";
		return "ok";
	}

}
