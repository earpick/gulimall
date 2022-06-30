package com.study.gulimall.ware.configuration;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.study.common.utils.PurchaseConstant;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * mybatisPlus属性自动填充，对应的实体类字段上需要加@TableField(fill = FieldFill.INSERT/UPDATE/INSERT_UPDATE)
 */
@Configuration
public class AutoFillConfig implements MetaObjectHandler {


    /**
     * @method 插入时自动填充
     */
    @Override
    public void insertFill(MetaObject metaObject) {


        this.setInsertFieldValByName(PurchaseConstant.INSERT_FILE_NAME, getDateValue(), metaObject);


        this.setInsertFieldValByName(PurchaseConstant.UPDATE_FILE_NAME, getDateValue(), metaObject);


    }

    /**
     * @method 更新时自动填充
     * 更新时必须携带实体类，goodsService.update(goods, goodsUpdateWrapper);
     * 且自动填充的优先级 > 实体类中即使设置了该属性的优先级
     * goodsUpdateWrapper更新的字段值优先级 > 实体类中即使设置了该属性的优先级
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        //更新时设置 updateTime 字段为当前时间

        this.setFieldValByName(PurchaseConstant.UPDATE_FILE_NAME, getDateValue(), metaObject);


    }

    /**
     * Data时间格式化工具
     *
     * @return 时间格式化后，根据不同的参数类型返回
     */
    private Object getDateValue() {
        try {
            // 时间格式化
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(PurchaseConstant.TIME_FORMAT);
            String format = dateTimeFormatter.format(LocalDateTime.now());
            LocalDateTime localDateTime = LocalDateTime.parse(format, dateTimeFormatter);

            // LocalDateTime 转换成 Date
            ZoneId zone = ZoneId.systemDefault();
            Instant instant = localDateTime.atZone(zone).toInstant();
            return Date.from(instant);

        } catch (Exception e) {
            throw new RuntimeException(" Time format fail ! ");
        }

    }


}
