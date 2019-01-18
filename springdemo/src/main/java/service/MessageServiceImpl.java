package service;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Auther: cpb
 * @Date: 2018/11/30 14:18
 * @Description:
 */
public class MessageServiceImpl implements MessageService {
    @Qualifier
    public String getMessage() {
        return "hello world";
    }
}
