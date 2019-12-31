int leftx=200;
int rightx=700;
int leftspeed=30;
int rightspeed=30;
void setup() {
  size(1000, 800);
  noFill();
}

void draw() {
  background(230);
  for (int i = 10; i>=0; i--) {
    ellipse(leftx,400, i*50, i*50);
    ellipse(rightx,400,i*50,i*50);
  }
  leftx+=leftspeed;
  rightx-=rightspeed;
  if (leftx>1000){
  leftspeed=-leftspeed;
  }
  if (rightx<0){
    rightspeed=-rightspeed;
  }
  if(leftx<0){
    leftspeed=-leftspeed;
  }
  if(rightx>1000){
    rightspeed=-rightspeed;
  }
  
 
}
