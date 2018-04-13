package jp.TsudaJun.SyainKanri.Action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

import jp.TsudaJun.SyainKanri.Dao.CustomDao;
import jp.TsudaJun.SyainKanri.Model.Syain;
import lombok.Getter;
import lombok.Setter;

public class UpdateAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;

	private Syain syain =new Syain();
	
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
	
	public String execute() throws Exception{
		syain.setS_idx(s_idx);
		syain.setS_name1(s_name1);
		syain.setS_name2(s_name2);
		syain.setSex(sex);
		syain.setYmd(ymd);
		syain.setNyusya_ymd(nyusya_ymd);
		syain.setZipcode(zipcode);
		syain.setAddr1(addr1);
		syain.setAddr2(addr2);
		syain.setBango(bango);

		CustomDao.Update(syain);
		return "ok";
	}
	
	
	
	@Override
    public void validate(){
		//社員名（漢字）
		if(StringUtils.isEmpty(getS_name1())){
			addFieldError("s_name1", "社員名（漢字）を入力せよ");
		}
		
		//社員名（カナ）
		if(StringUtils.isEmpty(getS_name2())){
			addFieldError("s_name2", "社員名（カナ）を入力せよ");
		}
		
		//性別
		if(!sex.equals("1") && !sex.equals("2")){
			addFieldError("sex", "性別は1か2で入力してください");
		}
		
		//生年月日
		if(ymd.length() != 8){
			addFieldError("ymd", "生年月日は8桁で入力してください");
		}
		
		//入社日
		if(nyusya_ymd.length() != 8){
			addFieldError("nyusya_ymd", "入社日は8桁で入力してください");
		}
		
		//電話番号
		try{
			Long.parseLong(bango);
		}catch (Exception e){
			addFieldError("bango", "電話番号は数字のみで入力してください");
		}
		
    }

}
