package mini.ideashare.tlbb.controller;


import mini.ideashare.tlbb.base.BaseResponse;
import mini.ideashare.tlbb.base.PageData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * 基本的Controller ， 所有的Controller都要去继承这个类
 * 提供了logger的初始化（在每个Controller中不用再new一个logger）
 * 提供了对普通返回结果，分页返回结果的封装
 * Created by lixiang on 2018/3/2.
 */
@CrossOrigin
@RestController
public abstract class AbstractBaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    /**
     * @param data
     * @param message
     * @param success
     * @return
     */
    public <T> BaseResponse<T> assembleResponse(T data, String message, boolean success) {
        BaseResponse<T> baseResponse = new BaseResponse<T>();
        baseResponse.setData(data);
        baseResponse.setMessage(message);
        baseResponse.setSuccess(success);
        return baseResponse;
    }

    public <T> BaseResponse<T> assembleResponse(T data, boolean success) {
        return assembleResponse(data, "", success);
    }

    public <T> BaseResponse<T> assembleResponse(T data) {
        return assembleResponse(data, true);
    }

    public <T> BaseResponse<PageData<T>> assemblePageResponse(List<T> data, int totalCount, int pageIndex, int pageSize) {
        PageData<T> pageData = new PageData<>(pageIndex, pageSize, totalCount, data);
        return assembleResponse(pageData);
    }
}
