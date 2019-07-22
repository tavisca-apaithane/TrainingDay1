import javax.print.DocFlavor;
import java.util.ArrayList;

public class Q {

    public ArrayList<Integer> l = new ArrayList<Integer>();

    public Integer capacity=0;
    public Integer counter=0;

    public Q()
    {
        capacity=10;
    }
    public Q(int x)
    {
        capacity=x;
    }

    public void Initialize(int newValue)
    {
        this.capacity=newValue;
    }

    public void add(Integer newValue)
    {
        try {
            if(counter<capacity) {
                l.add(newValue);
                counter++;
            }
            else throw new Exception();
        }
        catch (Exception e)
        {
            System.out.println("Capacity Exhausted...");
        }
    }
    public void remove()
    {
        try {
            if (counter != 0) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for (int i = 1; i < counter; i++) {
                    temp.add(l.get(i));
                }
                l = temp;
                counter--;
            }
            else throw new Exception();

        } catch (Exception e) {
            System.out.println("Queue is Empty...");
        }


    }
    public void displayQ()
    {
        for(Integer e : l)
            System.out.print(e+" ");
        System.out.println();

    }


}
