package java知识.Java基础.IO流.IO流的关闭;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author GaoHangHang
 * @date 2018/07/22 12:20
 **/
public class CloseIOStream2 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String s;
            while((s = reader.readLine()) != null){
                if (s.equalsIgnoreCase("quit")){
                    break;
                }
                System.out.println(s.toUpperCase());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
