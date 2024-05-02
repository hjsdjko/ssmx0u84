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


import com.dao.JianshenjiaolianjianyiDao;
import com.entity.JianshenjiaolianjianyiEntity;
import com.service.JianshenjiaolianjianyiService;
import com.entity.vo.JianshenjiaolianjianyiVO;
import com.entity.view.JianshenjiaolianjianyiView;

@Service("jianshenjiaolianjianyiService")
public class JianshenjiaolianjianyiServiceImpl extends ServiceImpl<JianshenjiaolianjianyiDao, JianshenjiaolianjianyiEntity> implements JianshenjiaolianjianyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianshenjiaolianjianyiEntity> page = this.selectPage(
                new Query<JianshenjiaolianjianyiEntity>(params).getPage(),
                new EntityWrapper<JianshenjiaolianjianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianshenjiaolianjianyiEntity> wrapper) {
		  Page<JianshenjiaolianjianyiView> page =new Query<JianshenjiaolianjianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianshenjiaolianjianyiVO> selectListVO(Wrapper<JianshenjiaolianjianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianshenjiaolianjianyiVO selectVO(Wrapper<JianshenjiaolianjianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianshenjiaolianjianyiView> selectListView(Wrapper<JianshenjiaolianjianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianshenjiaolianjianyiView selectView(Wrapper<JianshenjiaolianjianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
