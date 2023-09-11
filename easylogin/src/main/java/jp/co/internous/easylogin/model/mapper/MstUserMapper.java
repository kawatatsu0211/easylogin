package jp.co.internous.easylogin.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.easylogin.model.domain.MstUser;

@Mapper
public interface MstUserMapper {

	@Select("select * FROM mst_user where user_name = #{userName} AND password = #{password}")
	MstUser findByUserNameAndPassword( String userName, String password);
	
}

