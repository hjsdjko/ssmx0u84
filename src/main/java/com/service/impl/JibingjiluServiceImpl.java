package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JibingjiluDao;
import com.entity.JibingjiluEntity;
import com.service.JibingjiluService;
import com.entity.vo.JibingjiluVO;
import com.entity.view.JibingjiluView;

@Service("jibingjiluService")
public class JibingjiluServiceImpl extends ServiceImpl<JibingjiluDao, JibingjiluEntity> implements JibingjiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JibingjiluEntity> page = this.selectPage(
                new Query<JibingjiluEntity>(params).getPage(),
                new EntityWrapper<JibingjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JibingjiluEntity> wrapper) {
		  Page<JibingjiluView> page =new Query<JibingjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JibingjiluVO> selectListVO(Wrapper<JibingjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JibingjiluVO selectVO(Wrapper<JibingjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JibingjiluView> selectListView(Wrapper<JibingjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JibingjiluView selectView(Wrapper<JibingjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
