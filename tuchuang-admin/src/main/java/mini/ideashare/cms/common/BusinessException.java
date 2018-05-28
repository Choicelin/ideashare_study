package mini.ideashare.cms.common;

/**
 * 自定义异常，在程序中运行出错时可以主动抛出这个异常
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -3393181577604579443L;

    private String code;


    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



    @Override
    public String toString() {
        return "BusinessException{" +
                "code='" + code + '\'' +
                "message='"+ getMessage() + '\'' +
                '}';
    }
}
