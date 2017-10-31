class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project(){
        
    }
    public Project(String name){
        this.name = name;
    }
    public Project(double cost){
       this.initialCost = cost; 
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Project(String name, String description, double cost){
        this.name = name;
        this.description = description;
        this.initialCost = cost;
    }

    public String elevatorPitch(){
        System.out.println(name + "(" + initialCost + "): " + description);
        return name + ": " + description;
    }

    // getter
    public String getName() {
        System.out.println(name);
        return name;
    }
    
    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getDescription() {
        System.out.println(description);
        return description;
    }
    
    // setter
    public void setDescription(String description) {
        this.description = description;
    }
    // getter
    public double getInitialCost() {
        System.out.println(initialCost);
        return initialCost;
    }
    
    // setter
    public void setInitialCost(double cost) {
        this.initialCost = cost;
    }

}