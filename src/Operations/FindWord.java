package Operations;
import main.*;
import WordIterator.*;
public class FindWord implements OperationStrategy{
    WordRepository wordRep = new WordRepository();
    FindPopUpWindow popUpWindow;
    String text;
    public FindWord(FindPopUpWindow popUpWindow, String text){
        this.popUpWindow = popUpWindow;
        this.text = text;
        makeOperation();
    }
    @Override
    public void makeOperation(){
        String searchedWord = popUpWindow.searchField.getText();
        String s= "";
        int i = 0;
        while(true){
           while(Character.isLetter(text.charAt(i))){
                s += text.charAt(i++);
                
            }
           if(!(s.equals(""))){
                wordRep.addWordtoRepo(s);
                if(s.equals(searchedWord)) wordRep.addWordLocation(i);                 
           }
           s = "";
           i++;
        }        
    }
    public void findNext(){
        if(wordRep.getIterator().next() != null){
            
        }
        
    }
    
}
