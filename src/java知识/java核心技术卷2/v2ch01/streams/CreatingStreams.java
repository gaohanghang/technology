package java知识.java核心技术卷2.v2ch01.streams;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description 1-2 流的创建
 * @Author Gao Hang Hang
 * @Date 2019-12-03 13:19
 **/
public class CreatingStreams {

    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream
                .limit(SIZE + 1)
                .collect(Collectors.toList());
        System.out.print(title + ": ");
        for (int i = 0; i < firstElements.size(); i++) {
            if (i > 0) System.out.print(", ");
            if (i < SIZE) System.out.print(firstElements.get(i));
            else System.out.print("...");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/gaohanghang/IdeaProjects/technology/src/java知识/java核心技术卷2/gutenberg/alice30.txt");
        String contents = new String(Files.readAllBytes(path),
                StandardCharsets.UTF_8);

        // split returns a String[] array
        Stream<String> words = Stream.of(contents.split("\\PL+"));
        show("words", words);
        /*
            static <T> Stream<T> of(T... values)
            产生一个元素为给定值得流
         */
        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        show("song", song);
        /*
            static <T> Stream<T> empty()
            产生一个不包含任何元素的流
         */
        Stream<String> silence = Stream.empty();
        show("silence", silence);

        /*
            static <T> Stream<T> generate(Supplier<T> s)
            产生一个无限量，它的值是通过反复调用函数 s 而构建的
         */
        Stream<String> echos = Stream.generate(() -> "Echo");
        show("echos", echos);

        Stream<Double> randoms = Stream.generate(Math::random);
        show("randoms", randoms);

        /*
            static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
            产生一个无限流，它的元素包含种子、在种子上调用f产生的值、在前一个元素上调用f产生的值，等等

            它会接受一个 "种子" 值，以及一个函数（从技术上将，是一个 UnaryOperation<T>），并且会反复将改函数应用到之前的结果上。
         */
        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE,
                n -> n.add(BigInteger.ONE));
        show("integers", integers);

        /*
            另一种方式
            Stream<String> splitAsStream(CharSequence input)
            产生一个流，它的元素是输入中由该模式界定的部分
         */
        Stream<String> wordsAnotherWay = Pattern.compile("\\PL+").splitAsStream(
                contents);
        show("wordsAnotherWay", wordsAnotherWay);

        /*
            static Stream<String> lines(Path path)
            static Stream<String> lines(Path path, Charset cs)
            产生一个流，它的元素是指定文件中的行，该文件的字符集为 UTF-8，或者为指定的字符集。
         */
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            show("lines", lines);
        }
    }
}
