import org.apache.commons.lang3.StringUtils;

/**
 * @version V1.0
 * @ProjectName:jingli-tmc
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company:鲸力智享（北京）科技有限公司
 * @author: Gao Hang Hang
 * @email: hanghang.gao@jingli365.com
 * @date 2018/08/27 20:30
 */
public class Test {
    public static void main(String[] args) {
        String brandName = "艾美ff(Le Meridien)";//艾美(Le Meridien)
        if (StringUtils.isNotEmpty(brandName)){
            int index = brandName.indexOf('(');
            brandName = brandName.substring(0, index);
            System.out.println(brandName);
        }

    }
}
