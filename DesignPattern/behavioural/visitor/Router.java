package visitor;

//open/closed
public interface Router
{
    public void sendData(char[] data);
    public void acceptData(char[] data);
     
    public void accept(RouterVisitor v);
}
