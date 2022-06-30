package com.study.common.utils;

/**
 * 采购常量类
 */
public class PurchaseConstant {

    /**
     *  采购数据中心ID
     */
    public static final long StringDataCenterId = 3;

    /**
     * 采购机器标志ID
     */
    public static final long machineId = 3;

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

    /**
     *  采购订单状态
     */
    public enum PurchaseStatusEnum {
        NEW_BUILT(0),
        ASSIGNED(1),
        RECEIVED(2),
        COMPLETED(3),
        EXCEPTION(4);

        private int code;

        PurchaseStatusEnum(int code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }

    }

    /**
     * 采购需求状态
     */
    public enum PurchaseDetailStatusEnum {
        NEW_BUILT(0),
        ASSIGNED(1),
        PURCHASING(2),
        COMPLETED(3),
        PURCHASE_FAIL(4);

        private int code;

        PurchaseDetailStatusEnum(Integer code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }


    }
}
