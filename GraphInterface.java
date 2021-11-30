public interface GraphInterface<T>
{
    /**
     * get list of neighbors of a specific vertex.
     * @param vertex input by user to locate it's neighbors
     * @return all the neighbors of that vertex. 
     */
    public int[] neighbors(int vertex);
    
    /**
     * adds an edge
     * @param source row locaton to be added
     * @param target column location to be added 
     */
    public void addEdge(int source, int target);

    /**
     * used to get the label of a vertex of this graph
     * @param vertex location user wants to get label of. 
     * @return label at that vertex
     */
    public T getLabel(int vertex);

    /**
     * Test if edge exist.
     * @param source row vertex
     * @param target column vertex
     * @return true if there is an edge from vertex source to vertex target. 
     */
    public boolean isEdge(int source, int target);

    /**
     * removes an edge input by user.
     * @param source row vertex 
     * @param target column vertex
     */
    public void removeEdge(int source, int target);

    /**
     * change the label of a vertex of this Graph
     * @param vertex to be changed
     * @param newLabel to replace old label of selected vertex
     */
    public void setLabel(int vertex, T newLabel);

    /**
     * determines the number of vertices in graph.
     * @return the number of vertices.
     */
    public int size();

    /**
     * creates a graph using the array names.
     * @param names the array of vertexes. 
     */
    public void createGraph(T[] names);

    
}

