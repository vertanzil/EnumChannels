package io.github.verrtanzil;

public class MessageHandler {
    private enumMessages text;

    enumMessages Message(final enumMessages text) {
        return this.text = text;
    }

    @Override
    public String toString() {
        return String.valueOf(text);
    }
}
