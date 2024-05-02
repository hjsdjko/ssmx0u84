package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShenghuoxiguanEntity;
import com.entity.view.ShenghuoxiguanView;

import com.service.ShenghuoxiguanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 生活习惯
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-21 18:56:45
 */
@RestController
@RequestMapping("/shenghuoxiguan")
public class ShenghuoxiguanController {
    @Autowired
    private ShenghuoxiguanService shenghuoxiguanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenghuoxiguanEntity shenghuoxiguan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shisheng")) {
			shenghuoxiguan.setShishengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yisheng")) {
			shenghuoxiguan.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenghuoxiguanEntity> ew = new EntityWrapper<ShenghuoxiguanEntity>();
		PageUtils page = shenghuoxiguanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenghuoxiguan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenghuoxiguanEntity shenghuoxiguan, 
		HttpServletRequest request){
        EntityWrapper<ShenghuoxiguanEntity> ew = new EntityWrapper<ShenghuoxiguanEntity>();
		PageUtils page = shenghuoxiguanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenghuoxiguan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenghuoxiguanEntity shenghuoxiguan){
       	EntityWrapper<ShenghuoxiguanEntity> ew = new EntityWrapper<ShenghuoxiguanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenghuoxiguan, "shenghuoxiguan")); 
        return R.ok().put("data", shenghuoxiguanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenghuoxiguanEntity shenghuoxiguan){
        EntityWrapper< ShenghuoxiguanEntity> ew = new EntityWrapper< ShenghuoxiguanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenghuoxiguan, "shenghuoxiguan")); 
		ShenghuoxiguanView shenghuoxiguanView =  shenghuoxiguanService.selectView(ew);
		return R.ok("查询生活习惯成功").put("data", shenghuoxiguanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenghuoxiguanEntity shenghuoxiguan = shenghuoxiguanService.selectById(id);
        return R.ok().put("data", shenghuoxiguan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenghuoxiguanEntity shenghuoxiguan = shenghuoxiguanService.selectById(id);
        return R.ok().put("data", shenghuoxiguan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenghuoxiguanEntity shenghuoxiguan, HttpServletRequest request){
    	shenghuoxiguan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenghuoxiguan);

        shenghuoxiguanService.insert(shenghuoxiguan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenghuoxiguanEntity shenghuoxiguan, HttpServletRequest request){
    	shenghuoxiguan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenghuoxiguan);

        shenghuoxiguanService.insert(shenghuoxiguan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShenghuoxiguanEntity shenghuoxiguan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenghuoxiguan);
        shenghuoxiguanService.updateById(shenghuoxiguan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenghuoxiguanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShenghuoxiguanEntity> wrapper = new EntityWrapper<ShenghuoxiguanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shisheng")) {
			wrapper.eq("shishengzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yisheng")) {
			wrapper.eq("yishengzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shenghuoxiguanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
