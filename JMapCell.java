import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


/**
������������� ����� ������ �� 2D-�����
 */
public class JMapCell extends JComponent
{
    private static final Dimension CELL_SIZE = new Dimension(12, 12);
    
    /** True-���� �������� ����,����� ��������� **/
    boolean endpoint = false;
    
    
    /** True-���� ������ ��������� **/
    boolean passable = true;
    
    /**
     * True-���� � ������-path ����� ������� � ������� .
     **/
    boolean path = false;
    
    /**
     �������� ����� ������ � ��������� �������������
     **/
    public JMapCell(boolean pass)
    {
        // Set the preferred cell size, to drive the initial window size.
        setPreferredSize(CELL_SIZE);
        
        setPassable(pass);
    }
    
    /** �������� ������ �� ��������� ���������� **/
    public JMapCell()
    {
        // Call the other constructor, specifying true for "passable".
        this(true);
    }
    
    /** ������ �������� ����� **/
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
    
    /** ����������� ������������ ������ �� ������������� **/
    public void togglePassable()
    {
        setPassable(!isPassable());
    }
    
    /** �������� ������ ��� ����� ���� **/
    public void setPath(boolean path)
    {
        this.path = path;
        updateAppearance();
    }
    
    /**
 ������ ��������� ����� �� �����
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
     ���������� ������ paint
     **/
    protected void paintComponent(Graphics g)
    {
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
