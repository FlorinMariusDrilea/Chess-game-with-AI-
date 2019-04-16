
import javax.swing.*;
import java.awt.*;

/**
 * GraphicalDisplay
 * Sets up and controls the layout of the main chess window.
 * @author Florin Drilea
 */

public class GraphicalDisplay extends JFrame implements Display {

    public void showPiecesOnBoard(Piece[][] piecesOnBoard){
        ChessBoard.showPiecesOnBoard(piecesOnBoard);
    }

    public GraphicalDisplay(){
        setTitle("Java Chess");
        setSize(550,550);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChessBoard board = new ChessBoard();
        InfoPanel info = new InfoPanel();
        info.setPreferredSize(new Dimension(100,100));
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        content.add(board,BorderLayout.CENTER);
        content.add(info,BorderLayout.SOUTH);
        setVisible(true);
    }

}
