public class Project
{
  private String Name;
  private String Description;
  private double InitialCost;

  public String getName()
  {
    return this.Name;
  }
  public void setName(String name)
  {
    this.Name = name;
  }

  public String getDescription()
  {
    return this.Description;
  }
  public void setDescription(String description)
  {
    this.Description = description;
  }
  public double getInitialCost()
  {
    return this.InitialCost;
  }
  public void setInitialCost(double cost)
  {
    this.InitialCost = cost;
  }

  public Project()
  {
    this.Name = "";
    this.Description = "";
  }
  public Project(String name)
  {
    this.Name = name;
    this.Description = "";
  }
  public Project(String name, String description)
  {
    this.Name = name;
    this.Description = description;
  }

  public String elevatorPitch()
  {
    String pitch = String.format("%s ($%.2f): %s\n",
      this.Name, this.InitialCost, this.Description);
    return pitch;
  }

}