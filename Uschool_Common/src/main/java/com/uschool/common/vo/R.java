package com.uschool.common.vo;
/**
 * @author ：caomu
 * @date ：Created in 2020/11/25 19:03
 * @description：
 * @modified By：
 * @version:
 */

import com.uschool.common.config.SystemCodeConfig;
import lombok.Data;

/**
 *@ClassName R
 *@Description TODO
 *@aurhor caomu
 *@Date 2020/11/25 19:03
 *@Version 1.0
 */
@Data
public class R {
    private int code;
    private String msg;
    private Object data;

    public R() {
    }

    public R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static R ok(){
        return new R(SystemCodeConfig.OK,"OK",null);
    }
    public static R ok(Object data){
        return new R(SystemCodeConfig.OK,"OK",data);
    }
    public static R fail(){
        return new R(SystemCodeConfig.FAIL,"fail",null);
    }
    public static R fail(String msg){
        return new R(SystemCodeConfig.FAIL,msg,null);
    }
    public static R ok(String msg){
        return new R(SystemCodeConfig.OK,msg,null);
    }
}
