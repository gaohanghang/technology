package 工作.代码学习.dandelion.io;

import java.io.*;

/**
 * @author: Gao HangHang
 * @date 2018/09/19
 */
public class StreamWriter {


    private OutputStream outStream;

    public StreamWriter(OutputStream outStream) {
        this.outStream = outStream;
    }

    public StreamWriter(OutputStream outStream, String encoding) {
        this.outStream = outStream;
        this.encoding = encoding;
    }


    private String encoding = "utf-8";


    private boolean closeSourceWhenFinish;

    public StreamWriter closeSourceWhenFinish() {
        closeSourceWhenFinish = true;
        return this;
    }


    private boolean closeTargetWhenFinish;

    public StreamWriter closeTargetWhenFinish() {
        closeTargetWhenFinish = true;
        return this;
    }


    public void close() throws IOException {
        outStream.close();
    }

    public void writeStream(InputStream inStream) throws IOException {
        writeStream(inStream, false);
    }

    private void writeStream(InputStream inStream, boolean isTempStream) throws IOException {

        BufferedInputStream bStream = new BufferedInputStream(inStream);

        byte[] bytes = new byte[4096];

        while (true) {
            int count = bStream.read(bytes);
            if (count >= 0) {
                outStream.write(bytes, 0, count);
            } else {
                break;
            }
        }

        outStream.flush();

        bStream.close();


        if (isTempStream || closeSourceWhenFinish) {
            inStream.close();
        }

        if (closeTargetWhenFinish) {
            close();
        }
    }

    public void writeBytes(byte[] bytes) throws IOException {
        writeStream(new ByteArrayInputStream(bytes), true);
    }

    public void writeString(String s) throws IOException {
        writeBytes(s.getBytes(encoding));
    }

}
