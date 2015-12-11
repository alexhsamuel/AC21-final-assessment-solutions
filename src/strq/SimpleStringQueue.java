package strq;

public class SimpleStringQueue implements StringQueue {

    @Override
    public int length() {
        return contents.length();
    }

    @Override
    public void enqueue(String string) {
        contents += string;
    }

    @Override
    public String dequeue(int length) {
        final String result = contents.substring(0, length);
        contents = contents.substring(length);
        return result;
    }

    private String contents = "";

}
