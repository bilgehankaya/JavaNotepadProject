package WordIterator;
import java.util.*;

public class WordRepository implements WordProcessors{
    ArrayList<String> wordRepo = new ArrayList();//ArrayList that contains all words in JTextArea
    ArrayList desiredWordLocation = new ArrayList();//ArrayList that contains found words locations
    
    @Override
    public Iterator getIterator(){//Returns inner Iterator class
        return new WordIterator();
    }
    
    @Override
    public boolean wordIsFound(){//Return true if word is found
        return desiredWordLocation.size() > 0;
    }

    @Override
    public void addWordLocation(int a) {//adds found world locations to ArrayList
        desiredWordLocation.add(a);
    }

    @Override
    public void addWordtoRepo(String word) {//adds all words in JTextArea to ArrayList
        wordRepo.add(word);
    }
    
    private class WordIterator implements Iterator{//Inner Iterator class
        int currentIndex;
    
        @Override
        public boolean hasNext(){
            return currentIndex < desiredWordLocation.size();
        }
        
        @Override
        public Object next(){
            if(this.hasNext()){
                return desiredWordLocation.get(currentIndex++);               
            }
            return null;
            }    
    }
}
