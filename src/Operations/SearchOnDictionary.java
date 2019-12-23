package Operations;
import java.awt.Desktop;
import java.net.URI;
import main.*;

public class SearchOnDictionary implements OperationStrategy {
    Notepad notepad;
    public SearchOnDictionary(Notepad notepad){
        this.notepad = notepad;
    }

    @Override
    public void makeOperation() {
        String word = notepad.textArea.getSelectedText();
        String url = "https://www.dictionary.com/browse/" +
                word + "?s=t";
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI(url));
            
        } catch (Exception e) {
            System.out.println("Error");
        }
       

      
    }
    
}
