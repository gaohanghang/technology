package 基础知识.设计模式.策略模式;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件存储接口
 * Identify表示文件的唯一标识，可任意类型
 * T 表示 上传下载的返回类型，可任意类型
 *
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-05-12 20:55
 **/
public interface IStorageService<Identify, T> {

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    T upload(MultipartFile file);

    /**
     * 下载文件
     *
     * @param identify
     * @return
     */
    T download(Identify identify);

    /**
     * 删除文件
     *
     * @param identify
     */
    void delete(Identify identify);
}
