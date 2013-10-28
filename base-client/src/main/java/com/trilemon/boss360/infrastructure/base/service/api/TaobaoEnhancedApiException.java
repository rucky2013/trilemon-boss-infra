package com.trilemon.boss360.infrastructure.base.service.api;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author kevin
 */
public class TaobaoEnhancedApiException extends Exception {
    private String subCode;
    private String subMsg;
    private String errorCode;
    private String errorMsg;
    private TaobaoResponse taobaoResponse;
    private TaobaoRequest taobaoRequest;

    public TaobaoEnhancedApiException(String msg) {
        super(msg);
    }

    public TaobaoEnhancedApiException(String msg,TaobaoRequest request) {
        super(msg);
        this.taobaoRequest = request;
    }

    public TaobaoEnhancedApiException(TaobaoRequest request, TaobaoResponse response,
                                      ApiException apiException) {
        super(apiException);
        this.taobaoRequest = request;
        this.taobaoResponse = response;
        this.subCode = response.getSubCode();
        this.subMsg = response.getSubMsg();
        this.errorCode = apiException.getErrCode();
        this.errorMsg = apiException.getErrMsg();
    }

    public TaobaoEnhancedApiException(String msg, TaobaoRequest request, TaobaoResponse response) {
        super(msg);
        this.taobaoRequest = request;
        this.taobaoResponse = response;
        this.subCode = response.getSubCode();
        this.subMsg = response.getSubMsg();
        this.errorCode = response.getErrorCode();
        this.errorMsg = response.getMsg();
    }

    public TaobaoEnhancedApiException(ApiException apiException) {
        super(apiException);
        this.errorCode = apiException.getErrCode();
        this.errorMsg = apiException.getErrMsg();

    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public TaobaoResponse getTaobaoResponse() {
        return taobaoResponse;
    }

    public void setTaobaoResponse(TaobaoResponse taobaoResponse) {
        this.taobaoResponse = taobaoResponse;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public TaobaoRequest getTaobaoRequest() {
        return taobaoRequest;
    }

    public void setTaobaoRequest(TaobaoRequest taobaoRequest) {
        this.taobaoRequest = taobaoRequest;
    }


    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}