class Point {
  String id;
  String boja;
  double x,y;

  public Point(String id, String boja, double x, double y) {
    this.id = id;
    this.boja = boja;
    this.x = x;
    this.y = y;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBoja() {
    return boja;
  }

  public void setBoja(String boja) {
    this.boja = boja;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }
  //TODO add new variable

  //TODO constructor

  //TODO setters and getters

  public void move (char xDirection, char yDirection) {
    //TODO
    xDirection+=this.getX();
    yDirection+=this.getY();
  }

  public void draw () {
    //TODO
    System.out.println(this.getX());
    System.out.println(this.getY());
  }

}