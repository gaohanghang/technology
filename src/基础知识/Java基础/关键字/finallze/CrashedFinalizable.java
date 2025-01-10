package 基础知识.Java基础.关键字.finallze;

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

/**
 * @author Gao Hanghang
 * @version 1.0
 * @description https://www.baeldung.com/java-finalize
 * @date 2025-01-10 19:49
 **/
public class CrashedFinalizable {
    public static void main(String[] args) throws ReflectiveOperationException {
        for (int i = 0; ; i++) {
            new CrashedFinalizable();
            if ((i % 1_000_000) == 0) {
                Class<?> finalizerClass = Class.forName("java.lang.ref.Finalizer");
                Field queueStaticField = finalizerClass.getDeclaredField("queue");
                queueStaticField.setAccessible(true);
                ReferenceQueue<Object> referenceQueue = (ReferenceQueue) queueStaticField.get(null);

                Field queueLengthField = ReferenceQueue.class.getDeclaredField("queueLength");
                queueLengthField.setAccessible(true);
                long queueLength = (long) queueLengthField.get(referenceQueue);
                System.out.format("There are %d references in the queue%n", queueLength);
            }
        }
    }

    @Override
    protected void finalize() {
        System.out.print("");
    }
}
