/**
*Представление класса сгенерированном в pathfinder.Состоит из location,предыдущей точки и некоторых других значений,используемых для опредеделения пути
 **/
public class Waypoint
{
    /** Location. **/
    Location loc;

  
    Waypoint prevWaypoint;

    /**
     Прыдущие значения полученные со старта
     **/
    private float prevCost;

    /**
     Последующие значения до конца файла
     **/
    private float remainingCost;


    /**
     * Построение waypoint
     **/
    public Waypoint(Location loc, Waypoint prevWaypoint)
    {
        this.loc = loc;
        this.prevWaypoint = prevWaypoint;
    }

    /** Возвращает location из waypoint**/
    public Location getLocation()
    {
        return loc;
    }
    
    /**
     Возвращает предыдущую точку пути,или если это начало пути-возвращает ноль
     **/
    public Waypoint getPrevious()
    {
        return prevWaypoint;
    }
    
    /**
   Вызываем в одном методе оба значения
     **/
    public void setCosts(float prevCost, float remainingCost)
    {
        this.prevCost = prevCost;
        this.remainingCost = remainingCost;
    }

   public float getPreviousCost()
    {
        return prevCost;
    }

    
    public float getRemainingCost()
    {
        return remainingCost;
    }

    /**
     Возвращаем все значения для этой точки
     **/
    public float getTotalCost()
    {
        return prevCost + remainingCost;
    }
}

