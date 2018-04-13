package jp.TsudaJun.SyainKanri.Action;

import jp.TsudaJun.SyainKanri.Dao.CustomDao;
import lombok.Getter;
import lombok.Setter;

public class GetMaxNoAction {
	
	@Getter @Setter private int maxno;
	
	public String execute() throws Exception{
		maxno=CustomDao.getMaxNo();
		return "ok";
	}

}
