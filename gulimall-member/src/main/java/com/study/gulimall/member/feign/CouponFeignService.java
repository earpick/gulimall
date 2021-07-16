package com.study.gulimall.member.feign;

import com.study.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这个接口是一个声明式的远程调用
 * 当调用这个接口CouponFeignService.memberCoupons()方法
 * 发送Http请求 http:xxx/member/member/coupons 时
 * 会到 gulimall-coupont 下 发送 coupont/smscoupon/member/list 这个请求
 */
@FeignClient("gulimall-coupont")
public interface CouponFeignService {

    @RequestMapping("coupont/smscoupon/member/list")
    public R memberCoupons();
}
