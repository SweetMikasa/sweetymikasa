public class Point3d{

/** координата X **/
private double xCoord;

/** координата Y **/
private double yCoord;

/** координата Z **/
private double zCoord;


/** Конструктор для инициализации точки со значением (x, y, z) **/ 
public Point3d(double x, double y, double z) {
xCoord = x;
yCoord = y;
zCoord = z;
}

/** Конструктор без аргументов: по умолчанию используется точка в начале координат **/
public Point3d() {
this(0, 0, 0);
}

/** Возвращает координату X **/
public double getX() {
return xCoord;
}

/** Возвращает координату Y **/
public double getY() {
return yCoord;
}

/** Возвращает координату Z **/
public double getZ() {
return zCoord;
}

/** Устанавливает значение координаты X **/ 
public void setX(double val) {
xCoord = val;
}

/** Устанавливает значение координаты Y **/ 
public void setY(double val) {
yCoord = val;
}

/** Устанавливает значение координаты Z **/ 
public void setZ(double val) {
zCoord = val;
}

/** Растояние до точки SPoint **/
public double distanceTo(Point3d SPoint) {
return Math.sqrt(Math.pow(-this.xCoord + SPoint.xCoord, 2)
+ Math.pow(-this.yCoord + SPoint.yCoord, 2)
+ Math.pow(-this.zCoord + SPoint.zCoord, 2));
}

public boolean equals(Point3d SPoint) 
{ 
if(SPoint.xCoord == this.xCoord &&
SPoint.yCoord == this.yCoord &&
SPoint.zCoord == this.zCoord) return true;
else return false;
}
}