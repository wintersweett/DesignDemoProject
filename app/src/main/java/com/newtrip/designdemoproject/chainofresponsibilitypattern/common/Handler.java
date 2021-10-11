package com.newtrip.designdemoproject.chainofresponsibilitypattern.common;

/**
 * @author : WinterSweett
 * @time : {DATE}
 */
public abstract class Handler {
    private Handler nextHandler ;
    protected abstract Level getHandlerLevel();
    protected abstract Response echo(Request request) ;
    public void setNext(Handler handler){
        this.nextHandler = handler ;
    }
    public final Response handleMessage(Request request){
        Response response = null ;
        if(getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else {
            if(this.nextHandler != null){
                response = this.nextHandler.echo(request);
            }else {
                System.out.println("没有下一个处理者，业务自行处理");
            }
        }
        return response ;
    }
}
