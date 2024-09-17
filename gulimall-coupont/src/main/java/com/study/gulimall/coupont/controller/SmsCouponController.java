package com.study.gulimall.coupont.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.gulimall.coupont.entity.SmsCouponEntity;
import com.study.gulimall.coupont.service.SmsCouponService;
import com.study.common.utils.PageUtils;
import com.study.common.utils.R;



/**
 * 优惠券信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-13 17:11:35
 */
@RefreshScope
@RestController
@RequestMapping("coupont/smscoupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService smsCouponService;

    @Value("${coupon.user.name}")
    private String name;

    @Value("${coupon.user.age}")
    private String age;

    /**
     * 测试nacos 配置中心
     * @return
     */
    @RequestMapping("/Configuration/Center")
    public R testConfigurationCenter(){
        return R.ok().put("name",name).put("age",age);
    }

    /**
     *  用户调用优惠卷
     * @return
     */
    @RequestMapping("/member/list")
    public R memberCoupons(){
        SmsCouponEntity couponEntity = new SmsCouponEntity();
        couponEntity.setCouponName("满100减20");
        return R.ok().put("coupons",Arrays.asList(couponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupont:smscoupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsCouponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupont:smscoupon:info")
    public R info(@PathVariable("id") Long id){
		SmsCouponEntity smsCoupon = smsCouponService.getById(id);

        return R.ok().put("smsCoupon", smsCoupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupont:smscoupon:save")
    public R save(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.save(smsCoupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupont:smscoupon:update")
    public R update(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.updateById(smsCoupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupont:smscoupon:delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
