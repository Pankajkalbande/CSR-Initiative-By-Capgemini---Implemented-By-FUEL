import javax.swing.Box;

/*6. Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three
fields(variables). This class also has a method “volume()” to calculate the volume of this room.*/

class MakeRoom{

    private int height,width,breadth;

    MakeRoom(){

    }

    MakeRoom(int h, int w, int b)
    {
            height = h;
            width = w;
            breadth = b;
    }
    int getVolume()
    {
            return height* width* breadth;
    }

public static void main(String args[])
    {
            MakeRoom b1 = new MakeRoom(1,2,3);
            System.out.println("Volume of first box is "+ b1.getVolume());
    }
      {
    
            MakeRoom b2 = new MakeRoom(4,5,6);
            System.out.println("Volume of second box is " + b2.getVolume());
  
       } 
       
    }