package com.newtrip.designdemoproject.strategypattern.strategyenum;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 策略枚举
 */
enum  EnumCaculator {
    ADD("+"){
        @Override
        public int exec(int a, int b){
            return a+b;
        }

    },
    SUB("-"){
        @Override
        public int exec(int a, int b){
            return a-b;
        }
    };
    String value = "";
    private EnumCaculator(String value){
        this.value = value ;
    }
    public String getValue(){
        return this.value;
    }
    public abstract int exec(int a , int b);
}
