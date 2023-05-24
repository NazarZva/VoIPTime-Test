package test.operator.app.thread;

import test.operator.app.service.ConversationGenerator;

public class GeneratorThread implements Runnable {
    private static final int SECONDS = 20000;
    private final ConversationGenerator conversationGenerator;

    public GeneratorThread(ConversationGenerator conversationGenerator) {
        this.conversationGenerator = conversationGenerator;
    }

    @Override
    public void run() {
        while (true) {
            conversationGenerator.createConversation();
            try {
                Thread.sleep(SECONDS);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
