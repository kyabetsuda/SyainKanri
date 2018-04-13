package jp.TsudaJun.SyainKanri;

import java.util.ArrayList;
import java.util.List;

import jp.TsudaJun.SyainKanri.Dao.CustomDao;
import jp.TsudaJun.SyainKanri.Model.Syain;

import lombok.Getter;
import lombok.Setter;

public class IndexAction {
	@Getter @Setter private List<Syain> syains;
	
	public String execute() throws Exception{
		syains = (ArrayList<Syain>)CustomDao.selectAllData();
		return "ok";
	}

}
