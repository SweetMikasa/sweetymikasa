/**
 Местоположение на карте
 **/
public class Location
{
    
    public int xCoord;

  
    public int yCoord;


  
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    
    public Location()
    {
        this(0, 0);
    }
    
    /**Сравниваем два location **/
    public boolean equals(Object obj) {
        
        // Is obj a Location?
        if (obj instanceof Location) {
            
            // Cast another object to Location type,
            // then compare.  Return true if equal.
            Location other = (Location) obj;
            if (xCoord == other.xCoord && yCoord == other.yCoord) {
                return true;
            }
        }
        
        // If we got here then they're not equal.  Return false. 
        return false;
    }

    /** hashcode каждого location **/
    public int hashCode() {
        int result = 17; 
        
      
        result = 37 * result + xCoord;
        result = 37 * result + yCoord;
        return result;
    }
}
