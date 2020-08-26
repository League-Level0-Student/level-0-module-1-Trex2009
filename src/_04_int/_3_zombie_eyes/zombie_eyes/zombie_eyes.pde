PImage face ;
void setup() {
size(800,800);
  face = loadImage("face.png");
  ellipse(400,400,200,200);
fill(0);
}
void draw() {
face.resize(800,800);
background(face);


ellipse(550, 350, 200,200);
ellipse(260,350,200,200);

fill(0);
ellipse(550,350,100,100);


if( mouseX >= 160 && mouseX <= 360){
  fill(#FFFFFF);
}
else {
  fill(#FF0000);
}


println("X: " + mouseX);
println("Y: " + mouseY);
}
