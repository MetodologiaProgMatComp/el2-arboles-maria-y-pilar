package es.uah.listas;

public class ElementoLS {
    private Object data;
    public Object getData(){
        return this.data;
    }
    public void setData(Object data){
        this.data=data;
    }
    public String toString(){
        return String.valueOf(data);
    }
}
