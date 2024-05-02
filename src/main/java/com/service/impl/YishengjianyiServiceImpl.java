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


import com.dao.YishengjianyiDao;
import com.entity.YishengjianyiEntity;
import com.service.YishengjianyiService;
import com.entity.vo.YishengjianyiVO;
import com.entity.view.YishengjianyiView;

@Service("yishengjianyiService")
public class YishengjianyiServiceImpl extends ServiceImpl<YishengjianyiDao, YishengjianyiEntity> implements YishengjianyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YishengjianyiEntity> page = this.selectPage(
                new Query<YishengjianyiEntity>(params).getPage(),
                new EntityWrapper<YishengjianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YishengjianyiEntity> wrapper) {
		  Page<YishengjianyiView> page =new Query<YishengjianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YishengjianyiVO> selectListVO(Wrapper<YishengjianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YishengjianyiVO selectVO(Wrapper<YishengjianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YishengjianyiView> selectListView(Wrapper<YishengjianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YishengjianyiView selectView(Wrapper<YishengjianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
