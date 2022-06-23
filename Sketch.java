import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 300 / 30;  
        intY = 3 + 300 + intColumn * 300 / 30; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){

   int intTwoX = 0;
   int intTwoY = 0;

     for (int intTwoRow = 0; intTwoRow < 30; intTwoRow++){
       for (int intTwoColumn = 0; intTwoColumn < 30; intTwoColumn++){

        intTwoX = 3 + 300 + intTwoRow * 300 / 30;
        intTwoY = 3 + 300 + intTwoColumn * 300 / 30;

        if(intTwoRow % 2 == 0){
          fill(255);
          noStroke();
          rect(intTwoX, intTwoY, 5, 5);
        
        }

         else{
           fill(0);
           noStroke();
           rect(intTwoX, intTwoY, 5, 5);
         }
      }
    }
    
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

   int intThreeX = 0;
   int intThreeY = 0;


    for (int intThreeRow = 0; intThreeRow < 30; intThreeRow++){
       for (int intThreeColumn = 0; intThreeColumn < 30; intThreeColumn++){

        intThreeX = 3 + 600 + intThreeRow * 300 / 30;
        intThreeY = 3 + 300 + intThreeColumn * 300 / 30;

        if(intThreeColumn % 2 == 0){
          fill(255);
          noStroke();
          rect(intThreeX, intThreeY, 5, 5);
        
        }

         else{
           fill(0);
           noStroke();
           rect(intThreeX, intThreeY, 5, 5);
         }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){

   int intFourX = 0;
   int intFourY = 0;


    for (int intFourRow = 0; intFourRow < 30; intFourRow++){
       for (int intFourColumn = 0; intFourColumn < 30; intFourColumn++){

        intFourX = 3 + 900 + intFourRow * 300 / 30;
        intFourY = 3 + 300 + intFourColumn * 300 / 30;

        if(intFourColumn % 2 <= 0 && intFourRow % 2 == 0){
          fill(255);
          noStroke();
          rect(intFourX, intFourY, 5, 5);
        
        }

         else{
           fill(0);
           noStroke();
           rect(intFourX, intFourY, 5, 5);
         }
      }
    }
    
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){

   int intFiveX = 0;
   int intFiveY = 0;
   int intFiveRows = 0;
   int intFiveColumns = 0;

   for (int intFiveColumn = 30; intFiveColumn > intFiveColumns; intFiveColumn--){
     for (int intFiveRow = 30; intFiveRow > intFiveRows; intFiveRow--){

       intFiveX = 3 - 10 + intFiveRow * 300 / 30;
       intFiveY = 3 + intFiveColumn * 300 / 30;

       fill(255);
       noStroke();
       rect(intFiveX, intFiveY, 5, 5);
     }

     intFiveRows += 1;
     
   }
    
  }

  public void draw_section6(){

   int intSixX = 0;
   int intSixY = 0;
   int intSixRows = 30;
   int intSixColumns = 0;

   for (int intSixColumn = 30; intSixColumn > intSixColumns; intSixColumn--){
     for (int intSixRow = 0; intSixRow < intSixRows; intSixRow++){

       intSixX = 3 + 300 + intSixRow * 300 / 30;
       intSixY = 3 - 10 + intSixColumn * 300 / 30;

       fill(255);
       noStroke();
       rect(intSixX, intSixY, 5, 5);
     }

     intSixRows -= 1;
    
  }

    }

  public void draw_section7(){

   int intSevenX = 0;
   int intSevenY = 0;
   int intSevenRows = 30;
   int intSevenColumns = 30;

   for (int intSevenColumn = 0; intSevenColumn < intSevenColumns; intSevenColumn++){
     for (int intSevenRow = 0; intSevenRow < intSevenRows; intSevenRow++){

       intSevenX = 3 + 600 + intSevenRow * 300 / 30;
       intSevenY = 3 + intSevenColumn * 300 / 30;

       fill(255);
       noStroke();
       rect(intSevenX, intSevenY, 5, 5);
     }

     intSevenRows -= 1;
    
  }
    
  }
  
  public void draw_section8(){

   int intEightX = 0;
   int intEightY = 0;
   int intEightRows = 0;
   int intEightColumns = 30;

   for (int intEightColumn = 0; intEightColumn < intEightColumns; intEightColumn++){
     for (int intEightRow = 30; intEightRow > intEightRows; intEightRow--){

       intEightX = 3 - 10 + 900 + intEightRow * 300 / 30;
       intEightY = 3 + intEightColumn * 300 / 30;

       fill(255);
       noStroke();
       rect(intEightX, intEightY, 5, 5);
     }

     intEightRows += 1;
    
  }
    
  }

  






}
