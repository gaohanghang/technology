package com.imooc.jdk12;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

/**
 * <h1>JMH 使用方法</h1>
 */
@Fork(2)
@Threads(8)
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 5)
@Measurement(iterations = 10, time = 5)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class BenchmarkTest {

    @Benchmark
    public void testStringAdd() {
        String a = "";

        for (int i = 0; i < 10; i++) {
            a += i;
        }

        //System.out.println(a);
    }

    @Benchmark
    public void testStringBuilderAdd() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
    }

    public static void main(String[] args) throws RunnerException {

        Options options = new OptionsBuilder()
                .include(BenchmarkTest.class.getSimpleName())
                //.output("/tmp/benchmark.log")
                .build();
        new Runner(options).run();
    }
}
