package mini.ideashare.cms.controller;

import mini.ideashare.cms.base.BaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author lixiang
 * @CreateTime 2018/6/27
 **/
@RestController
public class AdminController extends AbstractBaseController {

    // af50542cb89113575262af5c8e225e37
    // wx9a4049b07d5a5bc7
    /**
     * 上传文件的接口
     * @param file 文件
     * @return
     */
    @PostMapping("/admin/publishWebAdmin")
    public BaseResponse<Map> publishWebAdmin(@RequestParam("file") MultipartFile file) {

        FileOutputStream outputStream = null;
        try {
            String path = "/home/files/publishWebAdmin/";
            String fileName = path + file.getOriginalFilename();
            File file1 = new File(fileName);
            outputStream = new FileOutputStream(file1);
            outputStream.write(file.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
            return assembleResponse(null, false);
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Map<String , String >  map  =new HashMap<>();
        map.put("info","http://r.fenxiangtech.com/images/"+file.getOriginalFilename());
        return assembleResponse(map, true);
    }
}
