object Q3 extends App
{
  def dis(n:Int):Double = n*24.95*0.4;
  def ship(n:Int):Double = if (n>50) {(50*3) + (n-50)*0.75} else {n*3};
  def tot(n:Int):Double = (n*24.95) + ship(n) - dis(n);
  print(tot(60));
}