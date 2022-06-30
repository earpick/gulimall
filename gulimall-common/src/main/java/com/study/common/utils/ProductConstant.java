package com.study.common.utils;

/**
 * Product生成环境常数工具类
 */
public class ProductConstant {

    /**
     * 时间格式
     */
    public static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * 插入数据时自动填充字段名
     */
    public static final String INSERT_FILE_NAME = "createTime";

    /**
     * 更新数据时自动填充字段名
     */
    public static final String UPDATE_FILE_NAME = "updateTime";


    public enum AttrEnum {
        ATTR_TYPE_BASE(1, "base"),
        ATTR_TYPE_SALE(0, "sale");

        private int code;
        private String msg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }


}
