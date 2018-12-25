/**
 * switch对String的支持
 *
 * @author GaoHangHang
 * @date 2018/07/03 10:47
 **/
public class SwitchString {

    public static void main(String[] args) {
        String bis = "java";
        switch (bis) {
            case "java":
                break;
            case "python":
                break;
            case "ruby":
                break;
            default:
                break;
        }

        EnumDemo enumDemo = EnumDemo.GREEN;

        switch (enumDemo) {
            case RED:
                break;
            case YELLOW:
                break;
            default:
                break;
        }
    }
}
