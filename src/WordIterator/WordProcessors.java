package WordIterator;

public interface WordProcessors {
    public Iterator getIterator();
    public boolean wordIsFound();
    public void addWordLocation(int a);
    public void addWordtoRepo(String word);
}
