package com.newtrip.designdemoproject.decoratepattern.common;

/**
 * @author : WinterSweett
 * @time : {DATE}
 * 抽象装饰者
 */
abstract class Decorator extends Component {
    private Component component ;
    //通过构造函数传递被装饰者
    public Decorator(Component component){
        this.component = component ;
    }

    /**
     * @param:
    * 委托给被修饰者执行
    */
    @Override
    public void operate() {
        this.component.operate();
    }
}
