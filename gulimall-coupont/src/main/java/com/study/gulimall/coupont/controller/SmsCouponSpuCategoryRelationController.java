package com.study.gulimall.coupont.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.gulimall.coupont.entity.SmsCouponSpuCategoryRelationEntity;
import com.study.gulimall.coupont.service.SmsCouponSpuCategoryRelationService;
import com.study.common.utils.PageUtils;
import com.study.common.utils.R;



/**
 * 优惠券分类关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-13 17:11:35
 */
@RestController
@RequestMapping("coupont/smscouponspucategoryrelation")
public class SmsCouponSpuCategoryRelationController {
    @Autowired
    private SmsCouponSpuCategoryRelationService smsCouponSpuCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupont:smscouponspucategoryrelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsCouponSpuCategoryRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupont:smscouponspucategoryrelation:info")
    public R info(@PathVariable("id") Long id){
		SmsCouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation = smsCouponSpuCategoryRelationService.getById(id);

        return R.ok().put("smsCouponSpuCategoryRelation", smsCouponSpuCategoryRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupont:smscouponspucategoryrelation:save")
    public R save(@RequestBody SmsCouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation){
		smsCouponSpuCategoryRelationService.save(smsCouponSpuCategoryRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupont:smscouponspucategoryrelation:update")
    public R update(@RequestBody SmsCouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation){
		smsCouponSpuCategoryRelationService.updateById(smsCouponSpuCategoryRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupont:smscouponspucategoryrelation:delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponSpuCategoryRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
