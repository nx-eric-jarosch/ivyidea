package org.clarent.ivyidea.intellij;

import com.intellij.util.messages.Topic;

public interface IvyIdeaListener {
    Topic<IvyIdeaListener> TOPIC = new Topic<>(IvyIdeaListener.class);

    void resolveStarted();

    void resolveFinished();
}
