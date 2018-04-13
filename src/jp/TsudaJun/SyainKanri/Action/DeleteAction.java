package jp.TsudaJun.SyainKanri.Action;

import java.sql.SQLException;

import jp.TsudaJun.SyainKanri.Dao.CustomDao;
import lombok.Getter;
import lombok.Setter;

public class DeleteAction {
	
	@Getter @Setter private int s_idx;
	
	public String execute() throws SQLException{
		CustomDao.Delete(s_idx);
		return "ok";
	}

}
