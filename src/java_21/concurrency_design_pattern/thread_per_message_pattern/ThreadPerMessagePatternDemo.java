package java_21.concurrency_design_pattern.thread_per_message_pattern;

import java.util.Arrays;

public class ThreadPerMessagePatternDemo {
    public static void main(String[] args) {
        String[] messages = {
                "Message-1",
                "Message-2",
                "Message-3",
                "Message-4",
                "Message-5",
        };

        Arrays.stream(messages).forEach(message -> new Thread(new PrintRequestHandler(message)).start());
    }
}
