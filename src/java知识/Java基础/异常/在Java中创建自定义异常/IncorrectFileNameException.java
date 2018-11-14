package java知识.Java基础.异常.在Java中创建自定义异常;

/**
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/11/11 5:04 PM
 */
public class IncorrectFileNameException extends Exception {
    public IncorrectFileNameException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
