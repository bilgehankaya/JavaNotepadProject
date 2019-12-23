package Operations;
import main.*;
import java.awt.ComponentOrientation;

public class RightAligment implements OperationStrategy{
    Notepad notepad;
    public RightAligment(Notepad notepad){
        this.notepad = notepad;       
    }    
    @Override
    public void makeOperation(){
        notepad.textArea.setComponentOrientation
        (ComponentOrientation.RIGHT_TO_LEFT);
        notepad.textArea.setText(notepad.textArea.getText());
        
    }
    
}
