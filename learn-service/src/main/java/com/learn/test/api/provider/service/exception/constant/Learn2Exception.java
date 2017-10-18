package com.learn.test.api.provider.service.exception.constant;

import lombok.Getter;

/**
 * @author geweijian
 * @data 2017-09-21
 */
@Getter
public class Learn2Exception extends Exception {

    private Integer errCode;

    private String errMessage;

    /**
     * 默认构造
     */
    public Learn2Exception() {
        this(ErrorEnum.MARKET);
    }

    /**
     * 根据异常信息构造异常
     *
     * @param errorEnum
     */
    public Learn2Exception(ErrorEnum errorEnum) {
        super(errorEnum.getName());
        this.errCode = errorEnum.getValue();
        this.errMessage = errorEnum.getName();
    }

    /**
     * 根据异常信息构造异常
     *
     * @param errorEnum
     */
    public Learn2Exception(ErrorEnum errorEnum, String desc) {
        super(errorEnum.getName() + "：" + desc);
        this.errCode = errorEnum.getValue();
        this.errMessage = desc;
    }

    /**
     * 屏蔽异常堆栈
     */
    @Override
    public Throwable fillInStackTrace() {
        return null;
    }


    /**
     * 获取业务处里类调用链，方便异常时查问题<br/>
     * <p>注意：仅显示业务类调用链，以com.nongfenqi，动态代理类也不在其中</p>
     *
     * @return
     */
    private String getStrackTrace() {
        StackTraceElement[] ste;
        if (null == super.getCause()) {
            ste = Thread.currentThread().getStackTrace();
        } else {
            ste = super.getCause().getStackTrace();
        }
        StringBuilder trace = new StringBuilder();

        for (int i = 0, n = ste == null ? 0 : ste.length; i < n; i++) {
            String methodName = ste[i].getMethodName();
            int lineNumber = ste[i].getLineNumber();
            String className = ste[i].getClassName();

            if (null == className || !className.startsWith("com.nongfenqi") || className.contains("$$") || className.contains(this.getClass().getName())) {
                continue;
            }

            trace.append(className).append(".").append(methodName).append(":").append(lineNumber).append(System.getProperty("line.separator", "\r\n"));
        }
        return trace.toString();
    }
}
