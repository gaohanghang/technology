package 基础知识.设计模式.策略模式;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description
 * @Author Gao Hang Hang
 * @Date 2019-05-12 20:58
 **/
//@Slfj
//@Service("fastDfsServiceImpl")
//public class FastDfsServiceImpl implements IStorageService<String,FileVo> {
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public FileVo upload(MultipartFile multipartFile){
//        logger.info("存储在fastDfs……");
//    }
//
//    @Override
//    public FileVo download(String hash) {
//        logger.info("从fastDfs下载文件");
//        return null;
//    }
//
//    @Override
//    @Transactional(rollbackFor = Exception.class)
//    public void delete(String hash) {
//        logger.info("从fastDfs删除文件");
//    }
//}
