class ProjectTest {
    public static void main(String[] args) {
        Project zooKeeper = new Project("Zoo Keeper");
        Project objectMaster = new Project("Object Master","A demonstration of OOP technique mastery in Java.");
        Project hogwarts = new Project();
        Project magicalForest = new Project(25.00);
        Project gameOfThrones = new Project("Game of Thrones", "More fun with OOP, featuring elements from the television show.", 55.00);

        hogwarts.setName("Hogwarts");
        hogwarts.setDescription("A fun exercise in object classes and OOP interactions, for Halloween.");
        hogwarts.setInitialCost(100.00);

        zooKeeper.getName();
        zooKeeper.setInitialCost(10.00);
        zooKeeper.setDescription("Practice with object classes and constructors.");
        objectMaster.getDescription();
        objectMaster.setInitialCost(15.00);
        magicalForest.setName("Magical Forest");
        magicalForest.setDescription("Forest themed object classes and instances, including fantasy creatures.");
        magicalForest.getInitialCost();


        zooKeeper.elevatorPitch();
        objectMaster.elevatorPitch();
        hogwarts.elevatorPitch();
        magicalForest.elevatorPitch();
        gameOfThrones.elevatorPitch();
    }
}