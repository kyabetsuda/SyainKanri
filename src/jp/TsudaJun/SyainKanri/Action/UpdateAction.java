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
		//�Ј����i�����j
		if(StringUtils.isEmpty(getS_name1())){
			addFieldError("s_name1", "�Ј����i�����j����͂���");
		}
		
		//�Ј����i�J�i�j
		if(StringUtils.isEmpty(getS_name2())){
			addFieldError("s_name2", "�Ј����i�J�i�j����͂���");
		}
		
		//����
		if(!sex.equals("1") && !sex.equals("2")){
			addFieldError("sex", "���ʂ�1��2�œ��͂��Ă�������");
		}
		
		//���N����
		if(ymd.length() != 8){
			addFieldError("ymd", "���N������8���œ��͂��Ă�������");
		}
		
		//���Г�
		if(nyusya_ymd.length() != 8){
			addFieldError("nyusya_ymd", "���Г���8���œ��͂��Ă�������");
		}
		
		//�d�b�ԍ�
		try{
			Long.parseLong(bango);
		}catch (Exception e){
			addFieldError("bango", "�d�b�ԍ��͐����݂̂œ��͂��Ă�������");
		}
		
    }

}
