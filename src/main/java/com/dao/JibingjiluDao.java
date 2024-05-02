package com.dao;

import com.entity.JibingjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JibingjiluVO;
import com.entity.view.JibingjiluView;


/**
 * 疾病记录
 * 
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
public interface JibingjiluDao extends BaseMapper<JibingjiluEntity> {
	
	List<JibingjiluVO> selectListVO(@Param("ew") Wrapper<JibingjiluEntity> wrapper);
	
	JibingjiluVO selectVO(@Param("ew") Wrapper<JibingjiluEntity> wrapper);
	
	List<JibingjiluView> selectListView(@Param("ew") Wrapper<JibingjiluEntity> wrapper);

	List<JibingjiluView> selectListView(Pagination page,@Param("ew") Wrapper<JibingjiluEntity> wrapper);
	
	JibingjiluView selectView(@Param("ew") Wrapper<JibingjiluEntity> wrapper);
	
}
