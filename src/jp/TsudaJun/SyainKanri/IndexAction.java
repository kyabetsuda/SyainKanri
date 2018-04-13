package jp.TsudaJun.SyainKanri;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import jp.TsudaJun.SyainKanri.Dao.CustomDao;
import jp.TsudaJun.SyainKanri.Model.Syain;
=======
>>>>>>> origin/master
import lombok.Getter;
import lombok.Setter;

public class IndexAction {
	
<<<<<<< HEAD
	@Getter @Setter private List<Syain> syains;
	
	public String execute() throws Exception{
		syains = (ArrayList<Syain>)CustomDao.selectAllData();
=======
	@Getter @Setter private String hello;
	
	public String execute() throws Exception{
		this.hello = "Hello World!";
>>>>>>> origin/master
		return "ok";
	}

}
