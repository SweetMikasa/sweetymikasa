import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


/**
Представление одной клетки на 2D-карте
 */
public class JMapCell extends JComponent
{
    private static final Dimension CELL_SIZE = new Dimension(12, 12);
    
    /** True-если конечная тока,иначе начальная **/
    boolean endpoint = false;
    
    
    /** True-если ячейка проходима **/
    boolean passable = true;
    
    /**
     * True-если я ячейка-path между стартом и финишем .
     **/
    boolean path = false;
    
    /**
     Создание новой клетки с возможной проходимостью
     **/
    public JMapCell(boolean pass)
    {
        // Set the preferred cell size, to drive the initial window size.
        setPreferredSize(CELL_SIZE);
        
        setPassable(pass);
    }
    
    /** Создание клетки по умолчанию проходимой **/
    public JMapCell()
    {
        // Call the other constructor, specifying true for "passable".
        this(true);
    }
    
    /** Задаем конечную точку **/
    public void setEndpoint(boolean end)
    {
        endpoint = end;
        updateAppearance();
    }
    

   public void setPassable(boolean pass)
    {
        passable = pass;
        updateAppearance();
    }

    public boolean isPassable()
    {
        return passable;
    }
    
    /** Переключаем проходимость ячейки на недоступность **/
    public void togglePassable()
    {
        setPassable(!isPassable());
    }
    
    /** Помечаем ячейку как часть пути **/
    public void setPath(boolean path)
    {
        this.path = path;
        updateAppearance();
    }
    
    /**
 Задаем различные цвета на карте
     **/
    private void updateAppearance()
    {
        if (passable)
        {
            // Passable cell.  Indicate its state with a border.
            setBackground(Color.BLUE);

            if (endpoint)
                setBackground(Color.BLACK);
            else if (path)
                setBackground(Color.YELLOW);
        }
        else
        {
            // Impassable cell.  Make it all red.
            setBackground(Color.RED);
        }
    }

    /**
     Реализцаия метода paint
     **/
    protected void paintComponent(Graphics g)
    {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
