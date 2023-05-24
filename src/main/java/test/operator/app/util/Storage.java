package test.operator.app.util;

import java.util.concurrent.ConcurrentLinkedQueue;
import test.operator.app.model.Conversation;

public class Storage {
    public static final ConcurrentLinkedQueue<Conversation> queue = new ConcurrentLinkedQueue<>();
}
