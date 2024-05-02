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


import com.dao.TiyuyundongDao;
import com.entity.TiyuyundongEntity;
import com.service.TiyuyundongService;
import com.entity.vo.TiyuyundongVO;
import com.entity.view.TiyuyundongView;

@Service("tiyuyundongService")
public class TiyuyundongServiceImpl extends ServiceImpl<TiyuyundongDao, TiyuyundongEntity> implements TiyuyundongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiyuyundongEntity> page = this.selectPage(
                new Query<TiyuyundongEntity>(params).getPage(),
                new EntityWrapper<TiyuyundongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiyuyundongEntity> wrapper) {
		  Page<TiyuyundongView> page =new Query<TiyuyundongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiyuyundongVO> selectListVO(Wrapper<TiyuyundongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiyuyundongVO selectVO(Wrapper<TiyuyundongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiyuyundongView> selectListView(Wrapper<TiyuyundongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiyuyundongView selectView(Wrapper<TiyuyundongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
