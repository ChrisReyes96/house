
/**
 * Write a description of class myPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myPicture
{
    // instance variables - replace the example below with your own
    private Square hood;
    private Square trunk;
    private Square car;
    private Triangle roof;
    private Circle tire1, tire2;
    private boolean drawn;

    
    /**
     * Constructor for objects of class myPicture
     */
    public myPicture()
    {
        // initialise instance variables
        hood = new Square();
        trunk = new Square();
        car = new Square();
        roof = new Triangle();  
        tire1 = new Circle();
        tire2 = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            trunk.moveHorizontal(-140);
            trunk.moveVertical(30);
            trunk.changeSize(50);
            trunk.changeColor("blue");
            trunk.makeVisible();
            
            hood.moveHorizontal(-5);
            hood.moveVertical(30);
            hood.changeSize(50);
            hood.changeColor("blue");
            hood.makeVisible();
            
            car.changeColor("blue");
            car.moveHorizontal(-90);
            car.moveVertical(-20);
            car.changeSize(100);
            car.makeVisible();
    
            /*roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();*/
    
            tire1.changeColor("black");
            tire1.moveHorizontal(-50);
            tire1.moveVertical(+100);
            tire1.changeSize(50);
            tire1.makeVisible();
            drawn = true;
            
            tire2.changeColor("black");
            tire2.moveHorizontal(+40);
            tire2.moveVertical(+100);
            tire2.changeSize(50);
            tire2.makeVisible();
            drawn = true;
        }
    }
}
