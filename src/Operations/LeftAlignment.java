package Operations;
import java.awt.ComponentOrientation;
import main.*;

public class LeftAlignment implements OperationStrategy{
    Notepad notepad;
    public LeftAlignment(Notepad notepad){
        this.notepad = notepad;       
    }  
    @Override
    public void makeOperation(){
        notepad.textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);       
    }
    
    
}
