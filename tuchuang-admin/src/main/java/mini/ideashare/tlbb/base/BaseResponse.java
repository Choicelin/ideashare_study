package mini.ideashare.tlbb.base;

import java.io.Serializable;

/**
 * @author lixiang
 * @date 2018/04/02
 */
public class BaseResponse<T> implements Serializable {


    private static final long serialVersionUID = -6707681616003589614L;
    private boolean success = true;

    private String message;
    /**
     *  data返回list时T需要继承 PageData
     *  data为单个vo时，T不需要继承 PageData
     */
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(boolean success, T data) {
        this.success = success;
        this.data = data;
    }


   public BaseResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public BaseResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
