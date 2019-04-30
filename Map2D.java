/**
 * Реализуем карту 
 **/
public class Map2D
{
    
    private int width;


    private int height;

    /**
     * Реализуем поле значений по которым будет находиться путь.
     **/
    private int[][] cells;


    private Location start;

   
    private Location finish;


    /** Создание карты **/
    public Map2D(int width, int height)
    {
        if (width <= 0 || height <= 0)
        {
            throw new IllegalArgumentException(
                    "width and height must be positive values; got " + width +
                    "x" + height);
        }
        
        this.width = width;
        this.height = height;
        
        cells = new int[width][height];
        
        // Make up some coordinates for start and finish.
        start = new Location(0, height / 2);
        finish = new Location(width - 1, height / 2);
    }


    /**
     * Проверка введенных координат
     **/
    private void checkCoords(int x, int y)
    {
        if (x < 0 || x > width)
        {
            throw new IllegalArgumentException("x must be in range [0, " + 
                    width + "), got " + x);
        }
        
        if (y < 0 || y > height)
        {
            throw new IllegalArgumentException("y must be in range [0, " + 
                    height + "), got " + y);
        }
    }    
    

    public int getWidth()
    {
        return width;
    }
    
    
    public int getHeight()
    {
        return height;
    }
    
    /**
     Возвращает true если указанные координаты находятся в границах
     **/
    public boolean contains(int x, int y)
    {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }
    
    
    public boolean contains(Location loc)
    {
        return contains(loc.xCoord, loc.yCoord);
    }
    
    /** Возвращает значение для указанной клетки **/
    public int getCellValue(int x, int y)
    {
        checkCoords(x, y);
        return cells[x][y];
    }
    
    public int getCellValue(Location loc)
    {
        return getCellValue(loc.xCoord, loc.yCoord);
    }
    
    /** Устанавливаем значения. **/
    public void setCellValue(int x, int y, int value)
    {
        checkCoords(x, y);
        cells[x][y] = value;
    }
    
    /**
  Возвращаем начальную location с которой начинается путь
     **/
    public Location getStart()
    {
        return start;
    }
    
    /**
     Начальное расположение
     **/
    public void setStart(Location loc)
    {
        if (loc == null)
            throw new NullPointerException("loc cannot be null");
        
        start = loc;
    }

    /**
    Конечное расположение
     **/
    public Location getFinish()
    {
        return finish;
    }
    
    /**
     * Задаем конечное положение где и закончится путь
     **/
    public void setFinish(Location loc)
    {
        if (loc == null)
            throw new NullPointerException("loc cannot be null");
        
        finish = loc;
    }
}
