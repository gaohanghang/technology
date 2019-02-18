package java知识.Java基础.二进制;

/**
 * @Description:
 * @author: Gao Hang Hang
 * @date 2019/02/18 11:09
 */
public class Convert {

    /**
     * int转换为byte[]
     * @param id
     * @return
     */
    public static byte[] int2Bytes(int id) {
        byte[] arr = new byte[4];
        // arr[0] = (byte) ((id >> 0*8) & 0xff);
        // arr[1] = (byte) ((id >> 1*8) & 0xff);
        // arr[2] = (byte) ((id >> 2*8) & 0xff);
        // arr[3] = (byte) ((id >> 3*8) & 0xff);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) ((id >> i*8) & 0xff);
        }
        return arr;
    }

    public static int bytes2Int(byte[] arr) {
        // int rs0 = (arr[0] & 0xff) << 0*8;
        // int rs1 = (arr[1] & 0xff) << 1*8;
        // int rs2 = (arr[2] & 0xff) << 2*8;
        // int rs3 = (arr[3] & 0xff) << 3*8;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += (arr[i] & 0xff) << i*8;
        }
        return result;
    }


    /**
     * int转换为byte[]
     * @param id
     * @return
     */
    public static byte[] long2Bytes(int id) {
        byte[] arr = new byte[8];
        // arr[0] = (byte) ((id >> 0*8) & 0xff);
        // arr[1] = (byte) ((id >> 1*8) & 0xff);
        // arr[2] = (byte) ((id >> 2*8) & 0xff);
        // arr[3] = (byte) ((id >> 3*8) & 0xff);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) ((id >> i*8) & 0xff);
        }
        return arr;
    }

    public static int bytes2Long(byte[] arr) {
        // int rs0 = (arr[0] & 0xff) << 0*8;
        // int rs1 = (arr[1] & 0xff) << 1*8;
        // int rs2 = (arr[2] & 0xff) << 2*8;
        // int rs3 = (arr[3] & 0xff) << 3*8;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += (long)((arr[i] & 0xff) << i*8);
        }
        return result;
    }

    public static void main(String[] args) {
        byte[] arr = Convert.int2Bytes(8143);
        System.out.println(arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3]);
        System.out.println(Convert.bytes2Int(arr));

        //字符串与字节数组
        String describe = "我每天都练功，我天下无敌...";
        byte[] barr = describe.getBytes();

        String des = new String(barr);
        System.out.println(des);
    }
}
