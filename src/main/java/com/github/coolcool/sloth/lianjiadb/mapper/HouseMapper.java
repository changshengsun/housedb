package com.github.coolcool.sloth.lianjiadb.mapper;
import java.util.*;
import com.github.coolcool.sloth.lianjiadb.model.House;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.*;

@Generated(
	value = {
		"https://github.com/coolcooldee/sloth",
		"Sloth version:1.0"
	},
	comments = "This class is generated by Sloth"
)
public interface HouseMapper{

	@Select("SELECT COUNT(*) FROM house ")
	Integer count();


	@Select("SELECT * FROM house WHERE id = #{primaryKey} LIMIT 1 ")
	House getByPrimaryKey(@Param("primaryKey") Object primaryKey);

	@Select("SELECT * FROM house WHERE code=#{code} LIMIT 1 ")
	House getByCode(@Param("code") String code);

	@Select("SELECT count(code) FROM house WHERE code=#{code} LIMIT 1 ")
	int countByCode(@Param("code") String code);


	@Delete("DELETE FROM house WHERE id = #{primaryKey} ")
	Integer deleteByPrimaryKey(@Param("primaryKey") Object primaryKey);

	@Update({
		"UPDATE house SET id=#{id}, code=#{code}, url=#{url}, title=#{title}, subtitle=#{subtitle}, favcount=#{favcount}, cartcount=#{cartcount}, price=#{price}, unitprice=#{unitprice}, firstPayPrice=#{firstPayPrice}, taxPrice=#{taxPrice}, roomMainInfo=#{roomMainInfo}, roomSubInfo=#{roomSubInfo}, roomMainType=#{roomMainType}, roomSubType=#{roomSubType}, areaMainInfo=#{areaMainInfo}, areaSubInfo=#{areaSubInfo}, communityName=#{communityName}, areaName=#{areaName}, schoolName=#{schoolName}, tags=#{tags}, decoratingDesc=#{decoratingDesc}, houseTypeDesc=#{houseTypeDesc}, investmentDesc=#{investmentDesc}, villageDesc=#{villageDesc}, schoolDesc=#{schoolDesc}, sellingPointDesc=#{sellingPointDesc}, reason4saleDesc=#{reason4saleDesc}, supportingDesc=#{supportingDesc}, trafficDesc=#{trafficDesc}, createtime=#{createtime}, baseContent1=#{baseContent1}, baseContent2=#{baseContent2}, baseContent3=#{baseContent3}, baseContent4=#{baseContent4}, baseContent5=#{baseContent5}, baseContent6=#{baseContent6}, baseContent7=#{baseContent7}, baseContent8=#{baseContent8}, baseContent9=#{baseContent9}, baseContent10=#{baseContent10}, baseContent11=#{baseContent11}, baseContent12=#{baseContent12}, transactionContent1=#{transactionContent1}, transactionContent2=#{transactionContent2}, transactionContent3=#{transactionContent3}, transactionContent4=#{transactionContent4}, transactionContent5=#{transactionContent5}, transactionContent6=#{transactionContent6}, transactionContent7=#{transactionContent7}, transactionContent8=#{transactionContent8}, transactionContent9=#{transactionContent9}, transactionContent10=#{transactionContent10}, chengjiaoPrice=#{chengjiaoPrice}, chengjiaoDate=#{chengjiaoDate} where id = #{id}"
	})
	Integer updateByPrimaryKey(House house);

	@Insert({
		"INSERT INTO house ( code, url, title, subtitle, favcount, cartcount, price, unitprice, firstPayPrice, taxPrice, roomMainInfo, roomSubInfo, roomMainType, roomSubType, areaMainInfo, areaSubInfo, communityName, areaName, schoolName, tags, decoratingDesc, houseTypeDesc, investmentDesc, villageDesc, schoolDesc, sellingPointDesc, reason4saleDesc, supportingDesc, trafficDesc, createtime, baseContent1, baseContent2, baseContent3, baseContent4, baseContent5, baseContent6, baseContent7, baseContent8, baseContent9, baseContent10, baseContent11, baseContent12, transactionContent1, transactionContent2, transactionContent3, transactionContent4, transactionContent5, transactionContent6, transactionContent7, transactionContent8, " +
				"transactionContent9, transactionContent10, chengjiaoPrice)",
		"VALUE (#{code}, #{url}, #{title}, #{subtitle}, #{favcount}, #{cartcount}, #{price}, #{unitprice}, #{firstPayPrice}, #{taxPrice}, #{roomMainInfo}, #{roomSubInfo}, #{roomMainType}, #{roomSubType}, #{areaMainInfo}, #{areaSubInfo}, #{communityName}, #{areaName}, #{schoolName}, #{tags}, #{decoratingDesc}, #{houseTypeDesc}, #{investmentDesc}, #{villageDesc}, #{schoolDesc}, #{sellingPointDesc}, #{reason4saleDesc}, #{supportingDesc}, #{trafficDesc}, now(), #{baseContent1}, #{baseContent2}, #{baseContent3}, #{baseContent4}, #{baseContent5}, #{baseContent6}, #{baseContent7}, #{baseContent8}, #{baseContent9}, #{baseContent10}, #{baseContent11}, #{baseContent12}, #{transactionContent1}, #{transactionContent2}, #{transactionContent3}, #{transactionContent4}, #{transactionContent5}, #{transactionContent6}, #{transactionContent7}, #{transactionContent8}, #{transactionContent9}, #{transactionContent10}, #{chengjiaoPrice}) ON DUPLICATE KEY UPDATE code=code"
	})
	Integer insert(House house);


	@Select("SELECT * FROM house LIMIT 10 ")
	List<House> list();


	@Select("SELECT code, url, title, subtitle, favcount, cartcount, price, unitprice, firstPayPrice, taxPrice, roomMainInfo, roomSubInfo, roomMainType, roomSubType, areaMainInfo, areaSubInfo, communityName, areaName, schoolName, tags, decoratingDesc, houseTypeDesc, investmentDesc, villageDesc, schoolDesc, sellingPointDesc, reason4saleDesc, supportingDesc, trafficDesc, createtime, baseContent1, baseContent2, baseContent3, baseContent4, baseContent5, baseContent6, baseContent7, baseContent8, baseContent9, baseContent10, baseContent11, baseContent12, transactionContent1, transactionContent2, transactionContent3, transactionContent4, transactionContent5, transactionContent6, transactionContent7, transactionContent8, transactionContent9, transactionContent10,roomSize,chengjiaoPrice FROM house LIMIT #{start}, #{step}")
	List<House> page(@Param("start") int start, @Param("step") int step);

	@Select("SELECT code, url, title, subtitle, favcount, cartcount, price, unitprice, firstPayPrice, taxPrice, roomMainInfo, roomSubInfo, roomMainType, roomSubType, areaMainInfo, areaSubInfo, communityName, areaName, schoolName, tags, decoratingDesc, houseTypeDesc, investmentDesc, villageDesc, schoolDesc, sellingPointDesc, reason4saleDesc, supportingDesc, trafficDesc, createtime, baseContent1, baseContent2, baseContent3, baseContent4, baseContent5, baseContent6, baseContent7, baseContent8, baseContent9, baseContent10, baseContent11, baseContent12, transactionContent1, transactionContent2, transactionContent3, transactionContent4, transactionContent5, transactionContent6, transactionContent7, transactionContent8, transactionContent9, transactionContent10,roomSize,chengjiaoPrice FROM house where code in (select code from houseindex where lasecheckeddate = curdate())  LIMIT #{start}, #{step} ")
	List<House> pageToday(@Param("start") int start, @Param("step") int step);


	@Select("SELECT `AUTO_INCREMENT` as number FROM  INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'test' AND TABLE_NAME = 'house'")
	Integer increment();


	@Update({
			"UPDATE house SET chengjiaoPrice=#{chengjiaoPrice} where code = #{code}"
	})
	void updateChengjiaoPriceByCode(String code, Double chengjiaoPrice);

	
}