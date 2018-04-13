package jp.TsudaJun.SyainKanri.Dao;

import java.io.Reader;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import jp.TsudaJun.SyainKanri.Model.Syain;

public class CustomDao {
	
	private static SqlMapClient sqlmap;

	static{
		try{
			String xmlPath="SqlMapConfig.xml";
			Reader reader=Resources.getResourceAsReader(xmlPath);
			sqlmap=SqlMapClientBuilder.buildSqlMapClient(reader);
		}catch(Exception ex){
			System.out.println("SqlMapConfig Parsing Error()"+ex.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Syain> selectAllData() throws SQLException{
		return (ArrayList<Syain>)sqlmap.queryForList("selectAllData");
	}
	
	public static Integer getMaxNo()throws SQLException{
		return (Integer)sqlmap.queryForObject("getmaxno");
	}
	
	public static void Insert(Syain syain) throws SQLException{
		sqlmap.insert("insert",syain);
	}
	
	public static Syain getSyainByS_idx(int s_idx) throws SQLException{
		return (Syain)sqlmap.queryForObject("getSyainByS_idx", s_idx);
	}
	
	public static void Update(Syain syain) throws SQLException{
		sqlmap.update("update",syain);
	}


}
