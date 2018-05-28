package mini.ideashare.cms.base;


import mini.ideashare.cms.common.BusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {



    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public BaseResponse managerErrorHandler(BusinessException myException){
        BaseResponse baseResponse = new BaseResponse<>();
        baseResponse.setSuccess(false);
        baseResponse.setMessage(myException.getMessage());
        return baseResponse;
    }
}
