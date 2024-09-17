package com.study.gulimall.product.feign;

import com.study.common.to.SkuReductionTo;
import com.study.common.to.SpuBoundTo;
import com.study.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * gulimall-product服务 远程调用 gulimall-coupont服务 服务接口
 */

@FeignClient("gulimall-coupont")
public interface CouponFeignService {

    /**
     * 远程调用gulimall-coupont下的 商品spu积分保存服务
     * @param spuBoundTo 数据传输对象
     * @return R 返回数据
     */
    @PostMapping("/coupont/smsspubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    /**
     * 远程调用gulimall-coupont下的 优惠券保存服务
     * @param skuReductionTo 数据传输对象
     * @return R 返回数据
     */
    @PostMapping("/coupont/smsskufullreduction/saveInfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
