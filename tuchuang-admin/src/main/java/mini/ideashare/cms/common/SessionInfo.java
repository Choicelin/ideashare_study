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

    private String currentUserName;

    private List<String> roleIds = new ArrayList<String>();

    private String groupUserId;


    public String getSessionId() {
        return sessionId;
    }

    public SessionInfo setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public String getCurrentUserName() {
        return currentUserName;
    }

    public SessionInfo setCurrentUserName(String currentUserName) {
        this.currentUserName = currentUserName;
        return this;
    }

    public List<String> getRoleIds() {
        return roleIds;
    }

    public SessionInfo setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
        return this;
    }

    public String getGroupUserId() {
        return groupUserId;
    }

    public SessionInfo setGroupUserId(String groupUserId) {
        this.groupUserId = groupUserId;
        return this;
    }
}
