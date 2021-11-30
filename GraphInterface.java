package GraphPackage;

public interface GraphInterface<T>
{
    /**
     * 
     * @param vertex
     * @return
     */
    public int[] neighbors(int vertex);
    
    /**
     * 
     * @param source
     * @param target
     */
    public void addEdge(int source, int target);

    /**
     * 
     * @param vertex
     * @return
     */
    public T getLabel(int vertex);

    /**
     * 
     * @param source
     * @param target
     * @return
     */
    public boolean isEdge(int source, int target);

    /**
     * 
     * @param source
     * @param target
     */
    public void removeEdge(int source, int target);

    /**
     * 
     * @param vertex
     * @param newLabel
     */
    public void setLabel(int vertex, T newLabel);

    /**
     * 
     * @return
     */
    public int size();

    /**
     * 
     * @param names
     */
    public void createGraph(T[] names);

    /**
     * 
     * @param origin
     * @return
     */
    
}
