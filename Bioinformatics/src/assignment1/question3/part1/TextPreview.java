package assignment1.question3.part1;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class TextPreview {
    private MyHighlighter highlighter;
    private JFrame frame;
    private JTextArea area;

    TextPreview() {
    	this.frame = new JFrame("DNA ORF finder");
    	this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.area = new JTextArea(40, 70);
    	this.highlighter = new MyHighlighter(area);
        this.area.setLineWrap(true);
        this.area.setWrapStyleWord(true);
        // show frame
        frame.getContentPane().add(new JScrollPane(area), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    public void setText(String text) {
    	this.area.setText(text);
    }
    
    public void highlight(String pattern) {
    	highlighter.highlight(pattern);
    }

    public void highlight(String pattern, Color color) {
    	highlighter.highlight(pattern, color);
    }
    
    public void removeHighlights() {
    	highlighter.removeHighlights();
    }
    
    private class MyHighlighter {
    	JTextComponent textComp;
    	// An instance of the private subclass of the default highlight painter
        Highlighter.HighlightPainter highlightPainter;

        MyHighlighter(JTextComponent textComp) {
    		this.textComp = textComp;
    		this.highlightPainter
        		= new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
    	}

        public void highlight(String pattern, Color color) {
        	this.highlightPainter
    			= new DefaultHighlighter.DefaultHighlightPainter(color);
        	highlight(pattern);
        	this.highlightPainter
				= new DefaultHighlighter.DefaultHighlightPainter(Color.yellow);
        }
        
        // Creates highlights around all occurrences of pattern in textComp
        public void highlight(String pattern) {
            try {
                Highlighter hilite = textComp.getHighlighter();
                Document doc = textComp.getDocument();
                String text = doc.getText(0, doc.getLength());
                
                int pos = 0;
                // Search for pattern
                while ((pos = text.indexOf(pattern, pos)) >= 0) {
                    // Create highlighter using private painter and apply around pattern
                    hilite.addHighlight(pos, pos + pattern.length(), highlightPainter);
                    pos += pattern.length();
                }
            } catch (BadLocationException e) {}
        }
        
        // Removes highlights
        public void removeHighlights() {
            Highlighter hilite = textComp.getHighlighter();
            Highlighter.Highlight[] hilites = hilite.getHighlights();
            for (int i = 0; i < hilites.length; i++)
            	hilite.removeHighlight(hilites[i]);
        }
    }

}
