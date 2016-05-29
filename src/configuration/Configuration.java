package configuration;


import com.kyt.framework.config.Config;
import com.kyt.framework.util.ConvertUtils;

public class Configuration {

    public static int MIN_THREAD;
    public static int MAX_THREAD;
    public static String ROOT_URL;
    public static String MOBILE_URL;
    public static String ROOT_DOMAIN;
    public static String STATIC_URL;
    public static String REWRITE_PATH;
    public static String PORT_LISTEN;
    public static String HOST_LISTEN;
    
    static {
        try {
            MIN_THREAD = ConvertUtils.toInt(Config.getParam("thread-pool", "min"));
            MAX_THREAD = ConvertUtils.toInt(Config.getParam("thread-pool", "max"));
            ROOT_URL = Config.getParam("gagbuzz-url", "url");
            MOBILE_URL = Config.getParam("gagbuzz-url", "mobile-url");
            STATIC_URL = Config.getParam("gagbuzz-url", "static_url");
            ROOT_DOMAIN = Config.getParam("gagbuzz-url", "domain");
            REWRITE_PATH = Config.getParam("rewrite-path", "path");
            HOST_LISTEN = Config.getParam("rest", "host_listen");
            PORT_LISTEN = Config.getParam("rest", "port_listen");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
