public class ProjectTesting
{
  public static void main(String[] args)
  {
    Project placeholder = new Project();
    Project CanIt = new Project("Can It");
    Project TypingRace = new Project("Typing Race", "Test your skills!");
    TypingRace.setInitialCost(2000.00);
    System.out.println(placeholder.elevatorPitch());
    System.out.println(CanIt.elevatorPitch());
    System.out.println(TypingRace.elevatorPitch());
    Portfolio myPort = new Portfolio();
    myPort.addProject(placeholder);
    myPort.addProject(CanIt);
    myPort.addProject(TypingRace);
    myPort.showPortfolio();
  }
}