package com.src.common;

public class Const {


    public static String Manager = "manage";


    public enum  STATUS{

        /**
         * 帖子状态
         */
        NEED_EXAMINE_POST(1,"需要审核借书请求"),
        NORAML_POST(0,"正常借书请求");



        private int status;
        private String desc;

        STATUS(int status, String desc) {
            this.status = status;
            this.desc = desc;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getStatus() {
            return status;
        }

        public String getDesc() {
            return desc;
        }


    }
}
