package mini.ideashare.cms.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestResponseContext {
	private static ThreadLocal<HttpServletRequest> request_threadLocal = new ThreadLocal<HttpServletRequest>();
	 
    private static ThreadLocal<HttpServletResponse> response_threadLocal = new ThreadLocal<HttpServletResponse>();
 
    public static void setRequest(HttpServletRequest request) {
        request_threadLocal.set(request);
    }
 
    public static HttpServletRequest getRequest() {
        return request_threadLocal.get();
    }
 
    public static void removeRequest() {
        request_threadLocal.remove();
    }
 
    public static void setResponse(HttpServletResponse response) {
        response_threadLocal.set(response);
    }
 
    public static HttpServletResponse getResponse() {
        return response_threadLocal.get();
    }
 
    public static void removeResponse() {
        response_threadLocal.remove();
    }
}
