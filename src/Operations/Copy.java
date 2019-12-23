package Operations;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import main.*;

public class Copy implements OperationStrategy{
    Notepad notepad;
    public Copy(Notepad notepad){
        this.notepad = notepad;
    }

    @Override
    public void makeOperation() {
        String copied = notepad.textArea.getSelectedText();
        Clipboard clipboard  = Toolkit.getDefaultToolkit()
         .getSystemClipboard();
        clipboard.setContents(new StringSelection(copied), null);               
    }    
}
