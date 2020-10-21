int firstEllipse = 250;
int secondEllipse = 700;
int speed = 1;
void setup() {
  
  size(1000,1000);
}

void draw() {
 
  // Go to the recipe to run the demonstration before starting this program
  
  
  //Use the code from your Bullseye program to draw the rings shown in this recipe.
  
  firstEllipse = firstEllipse + speed;
  secondEllipse = secondEllipse - speed;
  background(255, 255, 255);
  println(mouseX);
  println(mouseY);
    for( int j = 400; j > 50; j -= 10){
               noFill();
  ellipse(firstEllipse,250,j,j);}
    
  for( int k = 400; k > 50; k -= 10){
               noFill();
  ellipse(secondEllipse,250,k,k);
   if(firstEllipse == 1000){
   speed = speed * -1;}

 // You can use the noFill() command to make your ellipses transparent.
  //Make the rings move past each other.
  //When the rings hit the side of the sketch, make them reverse their direction.
  

}}
