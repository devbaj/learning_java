import java.util.ArrayList;

public class Portfolio
{
  private ArrayList<Project> projects;

  public ArrayList<Project> getProjects()
  {
    return projects;
  }
  public void addProject(Project proj)
  {
    projects.add(proj);
  }

  public Portfolio()
  {
    projects = new ArrayList<Project>();
  }

  public double getPortfolioCost()
  {
    double sum = 0;
    for (Project p : this.projects)
    {
      sum += p.getInitialCost();
    }
    return sum;
  }

  public void showPortfolio()
  {
    for (Project p : this.projects)
    {
      System.out.println(p.elevatorPitch());
    }
    System.out.printf("Total cost: %.2f", this.getPortfolioCost());
  }
}