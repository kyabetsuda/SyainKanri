package jp.TsudaJun.SyainKanri.Action;

import jp.TsudaJun.SyainKanri.Dao.CustomDao;
import jp.TsudaJun.SyainKanri.Model.Syain;
import lombok.Getter;
import lombok.Setter;

public class UpdateFormAction {
	
	@Getter @Setter private Syain syain;
	
	@Getter @Setter private int s_idx;
	@Getter @Setter private String s_name1;
	@Getter @Setter private String s_name2;
	@Getter @Setter private String sex;
	@Getter @Setter private String ymd;
	@Getter @Setter private String nyusya_ymd;
	@Getter @Setter private String zipcode;
	@Getter @Setter private String addr1;
	@Getter @Setter private String addr2;
	@Getter @Setter private String bango;
	
	public String execute()throws Exception{
		syain = CustomDao.getSyainByS_idx(s_idx);
		s_name1 = syain.getS_name1();
		s_name2 = syain.getS_name2();
		sex = syain.getSex();
		ymd = syain.getYmd();
		nyusya_ymd = syain.getNyusya_ymd();
		zipcode = syain.getZipcode();
		addr1 = syain.getAddr1();
		addr2 = syain.getAddr2();
		bango = syain.getBango();
		return "ok";
	}

}
