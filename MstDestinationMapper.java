package jp.co.internous.sunny.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import jp.co.internous.sunny.model.domain.MstDestination;

//mst_destinationにアクセス

@Mapper
public interface MstDestinationMapper {
	// ユーザーIDを条件に宛先情報を取得する
	@Select("SELECT * FROM mst_destination WHERE user_id = #{userId} AND status = 1 ORDER BY id ASC")
	List<MstDestination> findByUserId(int userId);
}
