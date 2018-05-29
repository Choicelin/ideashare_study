package mini.ideashare.cms.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author lixiang
 * @CreateTime 2018/5/29
 **/
public class SessionInfo implements Serializable {


    private static final long serialVersionUID = 3435901876286003054L;

    private String sessionId;

    private String currentUserAgent;

    private List<String> roleIds = new ArrayList<String>();

    private String groupUserId;


}
