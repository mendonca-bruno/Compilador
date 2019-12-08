/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import gram.*;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
/**
 *
 * @author Bruno
 */
public class Run {
    public static void main(String[] args) throws IOException {
        CharStream input = new ANTLRFileStream("input.txt");
        CompiladorLexer lex = new CompiladorLexer(input);
        TokenStream tokens = new BufferedTokenStream(lex);
        CompiladorParser parser = new CompiladorParser(tokens);
        CompiladorParser.ProgContext prog = parser.prog();
        showParseTreeFrame(prog,parser);
        
        Visitor visitor = new Visitor();
        
        visitor.visit(prog);
        
    }
    private static void showParseTreeFrame(ParseTree tree, CompiladorParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
