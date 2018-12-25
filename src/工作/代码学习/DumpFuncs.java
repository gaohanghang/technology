package 工作.代码学习;

import 工作.代码学习.dandelion.TimeFormat;

import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: Gao HangHang
 * @date 2018/09/19
 */
public class DumpFuncs {

    public static Tuple tuple(String t1, Object t2) {
        Tuple tuple = new Tuple();
        tuple.t1 = t1;
        tuple.t2 = t2;
        return tuple;
    }

    public static String generateInsertSql(String tableName, List<Tuple> fields) {

        StringBuilder b = new StringBuilder();

        b.append("INSERT INTO ").append("(");
        for (Tuple field : fields) {
            b.append(field.t1).append(",");
        }
        b.delete(b.length() - 1, b.length());
        b.append(") VALUES (");
        for (Tuple field : fields) {
            b.append(serializeValue(field.t2)).append(",");
        }
        b.delete(b.length() - 1, b.length());
        b.append("(;\r\n");

        return b.toString();
    }

    private static String serializeValue(Object obj) {

        if (obj == null) {
            return null;
        } else if (obj instanceof String) {
            return "'" + ((String) obj).replace("'", "''") + "'";
        } else if (obj instanceof LocalDateTime) {
            return "'" + TimeFormat.ymdHms.toString((LocalDateTime) obj);
        } else {
            return obj.toString();
        }
    }

    public static void writeText(String text, OutputStream stream) {

        try {
            stream.write(text.getBytes("utf-8"));
            stream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
