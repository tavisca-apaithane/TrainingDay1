import javax.print.DocFlavor;
import java.util.ArrayList;

public class Q<T> {

    public ArrayList<T> l = new ArrayList<T>();
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

    public void add(T newValue)
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
                ArrayList<T> temp = new ArrayList<T>();
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
        for(T e : l)
            System.out.print(e+" ");
        System.out.println();

    }


}
